package typings.makerDotJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection for items that share a common key.
  */
trait ICollection[K, T] extends js.Object {
  var items: js.Array[T]
  var key: K
}

object ICollection {
  @scala.inline
  def apply[K, T](items: js.Array[T], key: K): ICollection[K, T] = {
    val __obj = js.Dynamic.literal(items = items, key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICollection[K, T]]
  }
}

