package typings.javascriptDashObfuscator.srcInterfacesNodeDashTransformersObfuscatingDashTransformersObfuscatingDashReplacersLiteralDashObfuscatingDashReplacersIEncodedValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEncodedValue extends js.Object {
  var encodedValue: String
  var key: String | Null
}

object IEncodedValue {
  @scala.inline
  def apply(encodedValue: String, key: String = null): IEncodedValue = {
    val __obj = js.Dynamic.literal(encodedValue = encodedValue.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEncodedValue]
  }
}

