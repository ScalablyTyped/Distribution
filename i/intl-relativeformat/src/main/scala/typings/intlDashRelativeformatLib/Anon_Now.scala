package typings
package intlDashRelativeformatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Now extends js.Object {
  var now: js.UndefOr[stdLib.Date] = js.undefined
}

object Anon_Now {
  @scala.inline
  def apply(now: stdLib.Date = null): Anon_Now = {
    val __obj = js.Dynamic.literal()
    if (now != null) __obj.updateDynamic("now")(now)
    __obj.asInstanceOf[Anon_Now]
  }
}

