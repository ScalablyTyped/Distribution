package typings.matchSorter.anon

import typings.matchSorter.mod.KeyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key[T] extends js.Object {
  var key: KeyOptions[T]
}

object Key {
  @scala.inline
  def apply[T](key: KeyOptions[T]): Key[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[T]]
  }
}

