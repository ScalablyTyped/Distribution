package typings.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AWS access key (see [AWS Security
  * Credentials](http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html)).
  */
@js.native
trait SchemaAwsAccessKey extends js.Object {
  /**
    * AWS access key ID. Required.
    */
  var accessKeyId: js.UndefOr[String] = js.native
  /**
    * AWS secret access key. This field is not returned in RPC responses.
    * Required.
    */
  var secretAccessKey: js.UndefOr[String] = js.native
}

object SchemaAwsAccessKey {
  @scala.inline
  def apply(): SchemaAwsAccessKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAwsAccessKey]
  }
  @scala.inline
  implicit class SchemaAwsAccessKeyOps[Self <: SchemaAwsAccessKey] (val x: Self) extends AnyVal {
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
    def setAccessKeyId(value: String): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKeyId: Self = this.set("accessKeyId", js.undefined)
    @scala.inline
    def setSecretAccessKey(value: String): Self = this.set("secretAccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretAccessKey: Self = this.set("secretAccessKey", js.undefined)
  }
  
}

