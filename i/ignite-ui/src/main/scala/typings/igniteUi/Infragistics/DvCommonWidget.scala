package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DvCommonWidget extends js.Object {
  def option(key: js.Object, value: js.Object): Unit
}

object DvCommonWidget {
  @scala.inline
  def apply(option: (js.Object, js.Object) => Unit): DvCommonWidget = {
    val __obj = js.Dynamic.literal(option = js.Any.fromFunction2(option))
    __obj.asInstanceOf[DvCommonWidget]
  }
}

