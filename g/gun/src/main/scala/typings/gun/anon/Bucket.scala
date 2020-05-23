package typings.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  var bucket: js.Any
  var key: js.Any
  var secret: js.Any
}

object Bucket {
  @scala.inline
  def apply(bucket: js.Any, key: js.Any, secret: js.Any): Bucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
}

