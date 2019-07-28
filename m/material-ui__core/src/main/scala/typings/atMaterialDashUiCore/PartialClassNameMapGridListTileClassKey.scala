package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/GridListTile/GridListTile.GridListTileClassKey>> */
trait PartialClassNameMapGridListTileClassKey extends js.Object {
  var imgFullHeight: js.UndefOr[String] = js.undefined
  var imgFullWidth: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var tile: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapGridListTileClassKey {
  @scala.inline
  def apply(
    imgFullHeight: String = null,
    imgFullWidth: String = null,
    root: String = null,
    tile: String = null
  ): PartialClassNameMapGridListTileClassKey = {
    val __obj = js.Dynamic.literal()
    if (imgFullHeight != null) __obj.updateDynamic("imgFullHeight")(imgFullHeight)
    if (imgFullWidth != null) __obj.updateDynamic("imgFullWidth")(imgFullWidth)
    if (root != null) __obj.updateDynamic("root")(root)
    if (tile != null) __obj.updateDynamic("tile")(tile)
    __obj.asInstanceOf[PartialClassNameMapGridListTileClassKey]
  }
}

