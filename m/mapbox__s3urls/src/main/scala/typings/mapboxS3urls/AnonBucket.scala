package typings.mapboxS3urls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBucket extends js.Object {
  var Bucket: js.UndefOr[String] = js.undefined
  var Key: js.UndefOr[String] = js.undefined
}

object AnonBucket {
  @scala.inline
  def apply(Bucket: String = null, Key: String = null): AnonBucket = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBucket]
  }
}

