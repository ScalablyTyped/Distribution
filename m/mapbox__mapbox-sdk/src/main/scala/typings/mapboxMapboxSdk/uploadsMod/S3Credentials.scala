package typings.mapboxMapboxSdk.uploadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Credentials extends js.Object {
  var accessKeyId: String = js.native
  var bucket: String = js.native
  var key: String = js.native
  var secretAccessKey: String = js.native
  var sessionToken: String = js.native
  var url: String = js.native
}

object S3Credentials {
  @scala.inline
  def apply(
    accessKeyId: String,
    bucket: String,
    key: String,
    secretAccessKey: String,
    sessionToken: String,
    url: String
  ): S3Credentials = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Credentials]
  }
  @scala.inline
  implicit class S3CredentialsOps[Self <: S3Credentials] (val x: Self) extends AnyVal {
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretAccessKey(value: String): Self = this.set("secretAccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

