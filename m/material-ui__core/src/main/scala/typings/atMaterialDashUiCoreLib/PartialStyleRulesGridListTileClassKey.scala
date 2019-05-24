package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/GridListTile.GridListTileClassKey>> */
trait PartialStyleRulesGridListTileClassKey extends js.Object {
  var imgFullHeight: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var imgFullWidth: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var root: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
  var tile: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object PartialStyleRulesGridListTileClassKey {
  @scala.inline
  def apply(
    imgFullHeight: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    imgFullWidth: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    root: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null,
    tile: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null
  ): PartialStyleRulesGridListTileClassKey = {
    val __obj = js.Dynamic.literal()
    if (imgFullHeight != null) __obj.updateDynamic("imgFullHeight")(imgFullHeight)
    if (imgFullWidth != null) __obj.updateDynamic("imgFullWidth")(imgFullWidth)
    if (root != null) __obj.updateDynamic("root")(root)
    if (tile != null) __obj.updateDynamic("tile")(tile)
    __obj.asInstanceOf[PartialStyleRulesGridListTileClassKey]
  }
}

