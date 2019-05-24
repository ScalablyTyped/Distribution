package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/GridListTile/GridListTile.GridListTileClassKey>> */
trait PartialClassNameMapGridListTileClassKey extends js.Object {
  var imgFullHeight: js.UndefOr[java.lang.String] = js.undefined
  var imgFullWidth: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var tile: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapGridListTileClassKey {
  @scala.inline
  def apply(
    imgFullHeight: java.lang.String = null,
    imgFullWidth: java.lang.String = null,
    root: java.lang.String = null,
    tile: java.lang.String = null
  ): PartialClassNameMapGridListTileClassKey = {
    val __obj = js.Dynamic.literal()
    if (imgFullHeight != null) __obj.updateDynamic("imgFullHeight")(imgFullHeight)
    if (imgFullWidth != null) __obj.updateDynamic("imgFullWidth")(imgFullWidth)
    if (root != null) __obj.updateDynamic("root")(root)
    if (tile != null) __obj.updateDynamic("tile")(tile)
    __obj.asInstanceOf[PartialClassNameMapGridListTileClassKey]
  }
}

