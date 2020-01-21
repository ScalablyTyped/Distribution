package typings.matchSorter

import typings.matchSorter.mod.KeyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey[T] extends js.Object {
  var key: KeyOptions[T]
}

object AnonKey {
  @scala.inline
  def apply[T](key: KeyOptions[T]): AnonKey[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey[T]]
  }
}

