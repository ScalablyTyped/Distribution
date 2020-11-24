package typings.jupyterlabOutputarea.widgetMod

import typings.jupyterlabNbformat.mod.ExecutionCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/outputarea/lib/widget", "OutputPrompt")
@js.native
class OutputPrompt () extends IOutputPrompt {
  
  var _executionCount: js.Any = js.native
  
  /**
    * The execution count for the prompt.
    */
  @JSName("executionCount")
  def executionCount_MOutputPrompt: ExecutionCount = js.native
}
