package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/AppBar.AppBarClassKey>> */
trait PartialStyleRulesAppBarClassKey extends js.Object {
  var colorDefault: js.UndefOr[CSSProperties] = js.undefined
  var colorPrimary: js.UndefOr[CSSProperties] = js.undefined
  var colorSecondary: js.UndefOr[CSSProperties] = js.undefined
  var positionAbsolute: js.UndefOr[CSSProperties] = js.undefined
  var positionFixed: js.UndefOr[CSSProperties] = js.undefined
  var positionRelative: js.UndefOr[CSSProperties] = js.undefined
  var positionStatic: js.UndefOr[CSSProperties] = js.undefined
  var positionSticky: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesAppBarClassKey {
  @scala.inline
  def apply(
    colorDefault: CSSProperties = null,
    colorPrimary: CSSProperties = null,
    colorSecondary: CSSProperties = null,
    positionAbsolute: CSSProperties = null,
    positionFixed: CSSProperties = null,
    positionRelative: CSSProperties = null,
    positionStatic: CSSProperties = null,
    positionSticky: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesAppBarClassKey = {
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
    __obj.asInstanceOf[PartialStyleRulesAppBarClassKey]
  }
}

