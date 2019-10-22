package typings.grommet

import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Margin extends js.Object {
  var margin: js.UndefOr[MarginType] = js.undefined
}

object Anon_Margin {
  @scala.inline
  def apply(margin: MarginType = null): Anon_Margin = {
    val __obj = js.Dynamic.literal()
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Margin]
  }
}

