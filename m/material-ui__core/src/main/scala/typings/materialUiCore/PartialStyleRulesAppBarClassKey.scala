package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/AppBar.AppBarClassKey>> */
@js.native
trait PartialStyleRulesAppBarClassKey extends js.Object {
  var colorDefault: js.UndefOr[CSSProperties] = js.native
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  var colorSecondary: js.UndefOr[CSSProperties] = js.native
  var positionAbsolute: js.UndefOr[CSSProperties] = js.native
  var positionFixed: js.UndefOr[CSSProperties] = js.native
  var positionRelative: js.UndefOr[CSSProperties] = js.native
  var positionStatic: js.UndefOr[CSSProperties] = js.native
  var positionSticky: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
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
    if (colorDefault != null) __obj.updateDynamic("colorDefault")(colorDefault.asInstanceOf[js.Any])
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary.asInstanceOf[js.Any])
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary.asInstanceOf[js.Any])
    if (positionAbsolute != null) __obj.updateDynamic("positionAbsolute")(positionAbsolute.asInstanceOf[js.Any])
    if (positionFixed != null) __obj.updateDynamic("positionFixed")(positionFixed.asInstanceOf[js.Any])
    if (positionRelative != null) __obj.updateDynamic("positionRelative")(positionRelative.asInstanceOf[js.Any])
    if (positionStatic != null) __obj.updateDynamic("positionStatic")(positionStatic.asInstanceOf[js.Any])
    if (positionSticky != null) __obj.updateDynamic("positionSticky")(positionSticky.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesAppBarClassKey]
  }
}

