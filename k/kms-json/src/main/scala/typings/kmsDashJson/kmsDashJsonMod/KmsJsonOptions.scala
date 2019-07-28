package typings.kmsDashJson.kmsDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmsJsonOptions extends js.Object {
  var awsKmsSettings: js.UndefOr[js.Object] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var keyId: String
}

object KmsJsonOptions {
  @scala.inline
  def apply(keyId: String, awsKmsSettings: js.Object = null, encoding: String = null): KmsJsonOptions = {
    val __obj = js.Dynamic.literal(keyId = keyId)
    if (awsKmsSettings != null) __obj.updateDynamic("awsKmsSettings")(awsKmsSettings)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[KmsJsonOptions]
  }
}

