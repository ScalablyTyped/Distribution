package typings.atMapboxS3urls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bucket extends js.Object {
  var Bucket: js.UndefOr[String] = js.undefined
  var Key: js.UndefOr[String] = js.undefined
}

object Anon_Bucket {
  @scala.inline
  def apply(Bucket: String = null, Key: String = null): Anon_Bucket = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    __obj.asInstanceOf[Anon_Bucket]
  }
}

