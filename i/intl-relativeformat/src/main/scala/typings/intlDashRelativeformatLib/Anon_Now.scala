package typings
package intlDashRelativeformatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Now extends js.Object {
  var now: js.UndefOr[stdLib.Date | scala.Double | scala.Null] = js.undefined
}

object Anon_Now {
  @scala.inline
  def apply(now: stdLib.Date | scala.Double = null): Anon_Now = {
    val __obj = js.Dynamic.literal()
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Now]
  }
}

