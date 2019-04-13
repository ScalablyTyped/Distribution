package typings
package kmsDashJsonLib.kmsDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmsJsonOptions extends js.Object {
  var awsKmsSettings: js.UndefOr[js.Object] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var keyId: java.lang.String
}

object KmsJsonOptions {
  @scala.inline
  def apply(keyId: java.lang.String, awsKmsSettings: js.Object = null, encoding: java.lang.String = null): KmsJsonOptions = {
    val __obj = js.Dynamic.literal(keyId = keyId)
    if (awsKmsSettings != null) __obj.updateDynamic("awsKmsSettings")(awsKmsSettings)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[KmsJsonOptions]
  }
}

