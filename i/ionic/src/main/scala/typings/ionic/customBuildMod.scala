package typings.ionic

import typings.ionic.definitionsMod.CustomBuildOptions
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customBuildMod {
  
  @JSImport("ionic/lib/project/custom/build", "CustomBuildRunner")
  @js.native
  open class CustomBuildRunner protected () extends BuildRunner[CustomBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
  }
}
