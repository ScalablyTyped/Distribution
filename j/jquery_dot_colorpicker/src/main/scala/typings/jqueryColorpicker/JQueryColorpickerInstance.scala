package typings.jqueryColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryColorpickerInstance extends js.Object {
  def close(): Unit
  def destroy(): Unit
  def open(): Unit
  def setColor(color: js.Any): Unit
}

object JQueryColorpickerInstance {
  @scala.inline
  def apply(close: () => Unit, destroy: () => Unit, open: () => Unit, setColor: js.Any => Unit): JQueryColorpickerInstance = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), open = js.Any.fromFunction0(open), setColor = js.Any.fromFunction1(setColor))
    __obj.asInstanceOf[JQueryColorpickerInstance]
  }
}

