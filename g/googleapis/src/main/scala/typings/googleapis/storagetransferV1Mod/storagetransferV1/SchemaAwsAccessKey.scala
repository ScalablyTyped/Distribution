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
  def apply(accessKeyId: String = null, secretAccessKey: String = null): SchemaAwsAccessKey = {
    val __obj = js.Dynamic.literal()
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (secretAccessKey != null) __obj.updateDynamic("secretAccessKey")(secretAccessKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAwsAccessKey]
  }
}

