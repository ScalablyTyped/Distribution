package typings.jstorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JStorageOptions extends js.Object {
  var TTL: Double
}

object JStorageOptions {
  @scala.inline
  def apply(TTL: Double): JStorageOptions = {
    val __obj = js.Dynamic.literal(TTL = TTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[JStorageOptions]
  }
}

