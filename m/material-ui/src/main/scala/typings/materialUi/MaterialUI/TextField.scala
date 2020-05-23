package typings.materialUi.MaterialUI

import typings.react.mod.Component
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextField
  extends Component[TextFieldProps, js.Object, js.Any] {
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getInputNode(): HTMLInputElement = js.native
  def getValue(): String = js.native
  def select(): Unit = js.native
}

