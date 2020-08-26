package typings.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bucket extends js.Object {
  var bucket: js.Any = js.native
  var key: js.Any = js.native
  var secret: js.Any = js.native
}

object Bucket {
  @scala.inline
  def apply(bucket: js.Any, key: js.Any, secret: js.Any): Bucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
  @scala.inline
  implicit class BucketOps[Self <: Bucket] (val x: Self) extends AnyVal {
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
    def setBucket(value: js.Any): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret(value: js.Any): Self = this.set("secret", value.asInstanceOf[js.Any])
  }
  
}

