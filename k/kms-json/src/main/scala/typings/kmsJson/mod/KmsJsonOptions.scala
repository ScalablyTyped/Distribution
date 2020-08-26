package typings.kmsJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmsJsonOptions extends js.Object {
  var awsKmsSettings: js.UndefOr[js.Object] = js.native
  var encoding: js.UndefOr[String] = js.native
  var keyId: String = js.native
}

object KmsJsonOptions {
  @scala.inline
  def apply(keyId: String): KmsJsonOptions = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmsJsonOptions]
  }
  @scala.inline
  implicit class KmsJsonOptionsOps[Self <: KmsJsonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwsKmsSettings(value: js.Object): Self = this.set("awsKmsSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsKmsSettings: Self = this.set("awsKmsSettings", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
  }
  
}

