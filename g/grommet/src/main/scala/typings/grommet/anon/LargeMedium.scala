package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LargeMedium extends js.Object {
  var large: js.UndefOr[BorderPad] = js.undefined
  var medium: js.UndefOr[BorderPad] = js.undefined
  var small: js.UndefOr[BorderPad] = js.undefined
}

object LargeMedium {
  @scala.inline
  def apply(large: BorderPad = null, medium: BorderPad = null, small: BorderPad = null): LargeMedium = {
    val __obj = js.Dynamic.literal()
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    __obj.asInstanceOf[LargeMedium]
  }
}

