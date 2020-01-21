package typings.mapboxMapboxSdk.uploadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Credentials extends js.Object {
  var accessKeyId: String
  var bucket: String
  var key: String
  var secretAccessKey: String
  var sessionToken: String
  var url: String
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
}

