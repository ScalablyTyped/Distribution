package typings.jestDashJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Now extends js.Object {
  var now: js.UndefOr[js.Function0[Double]] = js.undefined
}

object Anon_Now {
  @scala.inline
  def apply(now: () => Double = null): Anon_Now = {
    val __obj = js.Dynamic.literal()
    if (now != null) __obj.updateDynamic("now")(js.Any.fromFunction0(now))
    __obj.asInstanceOf[Anon_Now]
  }
}

