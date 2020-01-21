package typings.grommet

import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMargin extends js.Object {
  var margin: js.UndefOr[MarginType] = js.undefined
}

object AnonMargin {
  @scala.inline
  def apply(margin: MarginType = null): AnonMargin = {
    val __obj = js.Dynamic.literal()
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMargin]
  }
}

