package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/GridListTile/GridListTile.GridListTileClassKey>> */
@js.native
trait PartialClassNameMapGridLiImgFullHeight extends js.Object {
  var imgFullHeight: js.UndefOr[String] = js.native
  var imgFullWidth: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var tile: js.UndefOr[String] = js.native
}

object PartialClassNameMapGridLiImgFullHeight {
  @scala.inline
  def apply(
    imgFullHeight: String = null,
    imgFullWidth: String = null,
    root: String = null,
    tile: String = null
  ): PartialClassNameMapGridLiImgFullHeight = {
    val __obj = js.Dynamic.literal()
    if (imgFullHeight != null) __obj.updateDynamic("imgFullHeight")(imgFullHeight.asInstanceOf[js.Any])
    if (imgFullWidth != null) __obj.updateDynamic("imgFullWidth")(imgFullWidth.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (tile != null) __obj.updateDynamic("tile")(tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapGridLiImgFullHeight]
  }
}

