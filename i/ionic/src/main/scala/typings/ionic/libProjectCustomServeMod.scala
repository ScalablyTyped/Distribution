package typings.ionic

import typings.ionic.definitionsMod.CustomServeOptions
import typings.ionic.libServeMod.ServeRunner
import typings.ionic.libServeMod.ServeRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectCustomServeMod {
  
  @JSImport("ionic/lib/project/custom/serve", "CustomServeRunner")
  @js.native
  open class CustomServeRunner protected () extends ServeRunner[CustomServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
}
