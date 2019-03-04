package typings
package jstorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JStorageOptions extends js.Object {
  var TTL: scala.Double
}

object JStorageOptions {
  @scala.inline
  def apply(TTL: scala.Double): JStorageOptions = {
    val __obj = js.Dynamic.literal(TTL = TTL)
  
    __obj.asInstanceOf[JStorageOptions]
  }
}

