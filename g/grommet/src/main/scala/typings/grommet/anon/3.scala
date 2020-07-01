package typings.grommet.anon

import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  var margin: js.UndefOr[MarginType] = js.undefined
}

object `3` {
  @scala.inline
  def apply(margin: MarginType = null): `3` = {
    val __obj = js.Dynamic.literal()
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
}

