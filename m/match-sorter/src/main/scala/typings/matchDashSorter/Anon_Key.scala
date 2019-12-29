package typings.matchDashSorter

import typings.matchDashSorter.matchDashSorterMod.KeyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key[T] extends js.Object {
  var key: KeyOptions[T]
}

object Anon_Key {
  @scala.inline
  def apply[T](key: KeyOptions[T]): Anon_Key[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Key[T]]
  }
}

