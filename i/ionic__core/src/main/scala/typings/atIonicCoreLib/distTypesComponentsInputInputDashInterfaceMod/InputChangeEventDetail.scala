package typings
package atIonicCoreLib.distTypesComponentsInputInputDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputChangeEventDetail extends js.Object {
  var value: js.UndefOr[java.lang.String | scala.Null]
}

object InputChangeEventDetail {
  @scala.inline
  def apply(value: java.lang.String = null): InputChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[InputChangeEventDetail]
  }
}

