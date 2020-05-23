package typings.jestJasmine2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Now extends js.Object {
  var now: js.UndefOr[js.Function0[Double]] = js.undefined
}

object Now {
  @scala.inline
  def apply(now: () => Double = null): Now = {
    val __obj = js.Dynamic.literal()
    if (now != null) __obj.updateDynamic("now")(js.Any.fromFunction0(now))
    __obj.asInstanceOf[Now]
  }
}

