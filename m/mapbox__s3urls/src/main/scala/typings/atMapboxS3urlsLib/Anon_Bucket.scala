package typings
package atMapboxS3urlsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bucket extends js.Object {
  var Bucket: js.UndefOr[java.lang.String]
  var Key: js.UndefOr[java.lang.String]
}

object Anon_Bucket {
  @scala.inline
  def apply(Bucket: java.lang.String = null, Key: java.lang.String = null): Anon_Bucket = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    __obj.asInstanceOf[Anon_Bucket]
  }
}

