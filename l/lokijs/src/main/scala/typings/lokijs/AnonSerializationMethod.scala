package typings.lokijs

import typings.lokijs.lokijsStrings.normal
import typings.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSerializationMethod extends js.Object {
  var serializationMethod: js.UndefOr[normal | pretty] = js.undefined
}

object AnonSerializationMethod {
  @scala.inline
  def apply(serializationMethod: normal | pretty = null): AnonSerializationMethod = {
    val __obj = js.Dynamic.literal()
    if (serializationMethod != null) __obj.updateDynamic("serializationMethod")(serializationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSerializationMethod]
  }
}

