package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Tabs.TabsClassKey>> */
trait PartialStyleRulesTabsClassKey extends js.Object {
  var centered: js.UndefOr[CSSProperties] = js.undefined
  var fixed: js.UndefOr[CSSProperties] = js.undefined
  var flexContainer: js.UndefOr[CSSProperties] = js.undefined
  var indicator: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var scrollButtons: js.UndefOr[CSSProperties] = js.undefined
  var scrollButtonsAuto: js.UndefOr[CSSProperties] = js.undefined
  var scrollable: js.UndefOr[CSSProperties] = js.undefined
  var scroller: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesTabsClassKey {
  @scala.inline
  def apply(
    centered: CSSProperties = null,
    fixed: CSSProperties = null,
    flexContainer: CSSProperties = null,
    indicator: CSSProperties = null,
    root: CSSProperties = null,
    scrollButtons: CSSProperties = null,
    scrollButtonsAuto: CSSProperties = null,
    scrollable: CSSProperties = null,
    scroller: CSSProperties = null
  ): PartialStyleRulesTabsClassKey = {
    val __obj = js.Dynamic.literal()
    if (centered != null) __obj.updateDynamic("centered")(centered)
    if (fixed != null) __obj.updateDynamic("fixed")(fixed)
    if (flexContainer != null) __obj.updateDynamic("flexContainer")(flexContainer)
    if (indicator != null) __obj.updateDynamic("indicator")(indicator)
    if (root != null) __obj.updateDynamic("root")(root)
    if (scrollButtons != null) __obj.updateDynamic("scrollButtons")(scrollButtons)
    if (scrollButtonsAuto != null) __obj.updateDynamic("scrollButtonsAuto")(scrollButtonsAuto)
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable)
    if (scroller != null) __obj.updateDynamic("scroller")(scroller)
    __obj.asInstanceOf[PartialStyleRulesTabsClassKey]
  }
}

