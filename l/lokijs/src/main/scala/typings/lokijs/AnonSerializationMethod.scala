package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSerializationMethod extends js.Object {
  var serializationMethod: js.UndefOr[String | Null] = js.undefined
}

object AnonSerializationMethod {
  @scala.inline
  def apply(serializationMethod: String = null): AnonSerializationMethod = {
    val __obj = js.Dynamic.literal()
    if (serializationMethod != null) __obj.updateDynamic("serializationMethod")(serializationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSerializationMethod]
  }
}

