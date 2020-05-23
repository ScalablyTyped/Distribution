package typings.mapboxS3urls.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  var Bucket: js.UndefOr[String] = js.undefined
  var Key: js.UndefOr[String] = js.undefined
}

object Bucket {
  @scala.inline
  def apply(Bucket: String = null, Key: String = null): Bucket = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
}

