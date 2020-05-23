package typings.grommet.anon

import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends js.Object {
  var margin: js.UndefOr[MarginType] = js.undefined
}

object `2` {
  @scala.inline
  def apply(margin: MarginType = null): `2` = {
    val __obj = js.Dynamic.literal()
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

