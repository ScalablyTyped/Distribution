package typings.ionic

import typings.ionic.definitionsMod.VueBuildOptions
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueBuildMod {
  
  @JSImport("ionic/lib/project/vue/build", "VueBuildRunner")
  @js.native
  class VueBuildRunner protected () extends BuildRunner[VueBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
  }
}
