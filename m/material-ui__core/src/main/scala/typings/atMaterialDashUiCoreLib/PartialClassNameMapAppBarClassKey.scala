package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/AppBar/AppBar.AppBarClassKey>> */
trait PartialClassNameMapAppBarClassKey extends js.Object {
  var colorDefault: js.UndefOr[java.lang.String] = js.undefined
  var colorPrimary: js.UndefOr[java.lang.String] = js.undefined
  var colorSecondary: js.UndefOr[java.lang.String] = js.undefined
  var positionAbsolute: js.UndefOr[java.lang.String] = js.undefined
  var positionFixed: js.UndefOr[java.lang.String] = js.undefined
  var positionRelative: js.UndefOr[java.lang.String] = js.undefined
  var positionStatic: js.UndefOr[java.lang.String] = js.undefined
  var positionSticky: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapAppBarClassKey {
  @scala.inline
  def apply(
    colorDefault: java.lang.String = null,
    colorPrimary: java.lang.String = null,
    colorSecondary: java.lang.String = null,
    positionAbsolute: java.lang.String = null,
    positionFixed: java.lang.String = null,
    positionRelative: java.lang.String = null,
    positionStatic: java.lang.String = null,
    positionSticky: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapAppBarClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorDefault != null) __obj.updateDynamic("colorDefault")(colorDefault)
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary)
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary)
    if (positionAbsolute != null) __obj.updateDynamic("positionAbsolute")(positionAbsolute)
    if (positionFixed != null) __obj.updateDynamic("positionFixed")(positionFixed)
    if (positionRelative != null) __obj.updateDynamic("positionRelative")(positionRelative)
    if (positionStatic != null) __obj.updateDynamic("positionStatic")(positionStatic)
    if (positionSticky != null) __obj.updateDynamic("positionSticky")(positionSticky)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapAppBarClassKey]
  }
}

