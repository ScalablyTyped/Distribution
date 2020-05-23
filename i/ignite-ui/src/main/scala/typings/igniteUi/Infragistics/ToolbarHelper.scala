package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarHelper extends js.Object {
  def analyse(el: js.Object): Unit
}

object ToolbarHelper {
  @scala.inline
  def apply(analyse: js.Object => Unit): ToolbarHelper = {
    val __obj = js.Dynamic.literal(analyse = js.Any.fromFunction1(analyse))
    __obj.asInstanceOf[ToolbarHelper]
  }
}

