package typings.gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBucket extends js.Object {
  var bucket: js.Any
  var key: js.Any
  var secret: js.Any
}

object AnonBucket {
  @scala.inline
  def apply(bucket: js.Any, key: js.Any, secret: js.Any): AnonBucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBucket]
  }
}

