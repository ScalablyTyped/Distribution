package typings.ionicCliFramework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var value: js.UndefOr[String] = js.undefined
}

object Value {
  @scala.inline
  def apply(value: String = null): Value = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

