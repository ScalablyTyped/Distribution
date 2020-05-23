package typings.intlRelativeformat.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Now extends js.Object {
  var now: js.UndefOr[Date | Double | Null] = js.undefined
}

object Now {
  @scala.inline
  def apply(now: js.UndefOr[Null | Date | Double] = js.undefined): Now = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(now)) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    __obj.asInstanceOf[Now]
  }
}

