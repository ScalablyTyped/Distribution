package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/GridListTile.GridListTileClassKey>> */
trait PartialStyleRulesGridListTileClassKey extends js.Object {
  var imgFullHeight: js.UndefOr[CSSProperties] = js.undefined
  var imgFullWidth: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var tile: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesGridListTileClassKey {
  @scala.inline
  def apply(
    imgFullHeight: CSSProperties = null,
    imgFullWidth: CSSProperties = null,
    root: CSSProperties = null,
    tile: CSSProperties = null
  ): PartialStyleRulesGridListTileClassKey = {
    val __obj = js.Dynamic.literal()
    if (imgFullHeight != null) __obj.updateDynamic("imgFullHeight")(imgFullHeight.asInstanceOf[js.Any])
    if (imgFullWidth != null) __obj.updateDynamic("imgFullWidth")(imgFullWidth.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (tile != null) __obj.updateDynamic("tile")(tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesGridListTileClassKey]
  }
}

