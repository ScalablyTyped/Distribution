package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheProvisionOptions extends js.Object {
  /**
    * number of items to store in the cache before the least used items are dropped.
    *
    * @default 1000
    */
  var max: Double
}

object CacheProvisionOptions {
  @scala.inline
  def apply(max: Double): CacheProvisionOptions = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CacheProvisionOptions]
  }
}

