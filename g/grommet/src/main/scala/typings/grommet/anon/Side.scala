package typings.grommet.anon

import typings.grommet.listMod.SideType
import typings.grommet.listMod.SizeType
import typings.grommet.listMod._BorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Side extends _BorderType {
  var color: js.UndefOr[String | Dark] = js.undefined
  var side: js.UndefOr[SideType] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
}

object Side {
  @scala.inline
  def apply(color: String | Dark = null, side: SideType = null, size: SizeType = null): Side = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Side]
  }
}

