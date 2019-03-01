package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  var next: js.UndefOr[js.Array[scala.Double | java.lang.String]] = js.undefined
  var prev: js.UndefOr[js.Array[scala.Double | java.lang.String]] = js.undefined
}

object Anon_Next {
  @scala.inline
  def apply(
    next: js.Array[scala.Double | java.lang.String] = null,
    prev: js.Array[scala.Double | java.lang.String] = null
  ): Anon_Next = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Anon_Next]
  }
}

