package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tabs/Tabs.TabsClassKey>> */
trait PartialClassNameMapTabsClassKey extends js.Object {
  var centered: js.UndefOr[String] = js.undefined
  var fixed: js.UndefOr[String] = js.undefined
  var flexContainer: js.UndefOr[String] = js.undefined
  var indicator: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var scrollButtons: js.UndefOr[String] = js.undefined
  var scrollButtonsAuto: js.UndefOr[String] = js.undefined
  var scrollable: js.UndefOr[String] = js.undefined
  var scroller: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapTabsClassKey {
  @scala.inline
  def apply(
    centered: String = null,
    fixed: String = null,
    flexContainer: String = null,
    indicator: String = null,
    root: String = null,
    scrollButtons: String = null,
    scrollButtonsAuto: String = null,
    scrollable: String = null,
    scroller: String = null
  ): PartialClassNameMapTabsClassKey = {
    val __obj = js.Dynamic.literal()
    if (centered != null) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (flexContainer != null) __obj.updateDynamic("flexContainer")(flexContainer.asInstanceOf[js.Any])
    if (indicator != null) __obj.updateDynamic("indicator")(indicator.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (scrollButtons != null) __obj.updateDynamic("scrollButtons")(scrollButtons.asInstanceOf[js.Any])
    if (scrollButtonsAuto != null) __obj.updateDynamic("scrollButtonsAuto")(scrollButtonsAuto.asInstanceOf[js.Any])
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (scroller != null) __obj.updateDynamic("scroller")(scroller.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapTabsClassKey]
  }
}

