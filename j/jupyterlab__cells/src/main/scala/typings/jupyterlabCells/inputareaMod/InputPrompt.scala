package typings.jupyterlabCells.inputareaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/inputarea", "InputPrompt")
@js.native
class InputPrompt () extends IInputPrompt {
  var _executionCount: js.Any = js.native
  @JSName("executionCount")
  def executionCount_MInputPrompt(): js.Any = js.native
  @JSName("executionCount")
  def executionCount_MInputPrompt(value: String): js.Any = js.native
  /**
    * The execution count for the prompt.
    */
  @JSName("executionCount")
  def executionCount_Union(): String | Null = js.native
}

