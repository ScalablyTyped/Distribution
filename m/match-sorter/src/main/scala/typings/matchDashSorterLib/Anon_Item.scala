package typings
package matchDashSorterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item[T] extends js.Object {
  var key: java.lang.String | (js.Function1[/* item */ T, java.lang.String])
}

object Anon_Item {
  @scala.inline
  def apply[T](key: java.lang.String | (js.Function1[/* item */ T, java.lang.String])): Anon_Item[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Item[T]]
  }
}

