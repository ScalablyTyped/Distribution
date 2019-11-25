package typings.gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bucket extends js.Object {
  var bucket: js.Any
  var key: js.Any
  var secret: js.Any
}

object Anon_Bucket {
  @scala.inline
  def apply(bucket: js.Any, key: js.Any, secret: js.Any): Anon_Bucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Bucket]
  }
}

