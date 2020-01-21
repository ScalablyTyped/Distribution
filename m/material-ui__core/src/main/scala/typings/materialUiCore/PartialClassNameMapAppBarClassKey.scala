package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/AppBar/AppBar.AppBarClassKey>> */
@js.native
trait PartialClassNameMapAppBarClassKey extends js.Object {
  var colorDefault: js.UndefOr[String] = js.native
  var colorPrimary: js.UndefOr[String] = js.native
  var colorSecondary: js.UndefOr[String] = js.native
  var positionAbsolute: js.UndefOr[String] = js.native
  var positionFixed: js.UndefOr[String] = js.native
  var positionRelative: js.UndefOr[String] = js.native
  var positionStatic: js.UndefOr[String] = js.native
  var positionSticky: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapAppBarClassKey {
  @scala.inline
  def apply(
    colorDefault: String = null,
    colorPrimary: String = null,
    colorSecondary: String = null,
    positionAbsolute: String = null,
    positionFixed: String = null,
    positionRelative: String = null,
    positionStatic: String = null,
    positionSticky: String = null,
    root: String = null
  ): PartialClassNameMapAppBarClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorDefault != null) __obj.updateDynamic("colorDefault")(colorDefault.asInstanceOf[js.Any])
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary.asInstanceOf[js.Any])
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary.asInstanceOf[js.Any])
    if (positionAbsolute != null) __obj.updateDynamic("positionAbsolute")(positionAbsolute.asInstanceOf[js.Any])
    if (positionFixed != null) __obj.updateDynamic("positionFixed")(positionFixed.asInstanceOf[js.Any])
    if (positionRelative != null) __obj.updateDynamic("positionRelative")(positionRelative.asInstanceOf[js.Any])
    if (positionStatic != null) __obj.updateDynamic("positionStatic")(positionStatic.asInstanceOf[js.Any])
    if (positionSticky != null) __obj.updateDynamic("positionSticky")(positionSticky.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapAppBarClassKey]
  }
}

