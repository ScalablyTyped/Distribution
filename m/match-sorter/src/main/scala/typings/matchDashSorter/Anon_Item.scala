package typings.matchDashSorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item[T] extends js.Object {
  var key: String | (js.Function1[/* item */ T, String])
}

object Anon_Item {
  @scala.inline
  def apply[T](key: String | (js.Function1[/* item */ T, String])): Anon_Item[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Item[T]]
  }
}

