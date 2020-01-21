package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/GridListTileBar.GridListTileBarClassKey>> */
@js.native
trait PartialStyleRulesGridListTileBarClassKey extends js.Object {
  var actionIcon: js.UndefOr[CSSProperties] = js.native
  var actionIconActionPosLeft: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var rootSubtitle: js.UndefOr[CSSProperties] = js.native
  var subtitle: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[CSSProperties] = js.native
  var titlePositionBottom: js.UndefOr[CSSProperties] = js.native
  var titlePositionTop: js.UndefOr[CSSProperties] = js.native
  var titleWrap: js.UndefOr[CSSProperties] = js.native
  var titleWrapActionPosLeft: js.UndefOr[CSSProperties] = js.native
  var titleWrapActionPosRight: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesGridListTileBarClassKey {
  @scala.inline
  def apply(
    actionIcon: CSSProperties = null,
    actionIconActionPosLeft: CSSProperties = null,
    root: CSSProperties = null,
    rootSubtitle: CSSProperties = null,
    subtitle: CSSProperties = null,
    title: CSSProperties = null,
    titlePositionBottom: CSSProperties = null,
    titlePositionTop: CSSProperties = null,
    titleWrap: CSSProperties = null,
    titleWrapActionPosLeft: CSSProperties = null,
    titleWrapActionPosRight: CSSProperties = null
  ): PartialStyleRulesGridListTileBarClassKey = {
    val __obj = js.Dynamic.literal()
    if (actionIcon != null) __obj.updateDynamic("actionIcon")(actionIcon.asInstanceOf[js.Any])
    if (actionIconActionPosLeft != null) __obj.updateDynamic("actionIconActionPosLeft")(actionIconActionPosLeft.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rootSubtitle != null) __obj.updateDynamic("rootSubtitle")(rootSubtitle.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titlePositionBottom != null) __obj.updateDynamic("titlePositionBottom")(titlePositionBottom.asInstanceOf[js.Any])
    if (titlePositionTop != null) __obj.updateDynamic("titlePositionTop")(titlePositionTop.asInstanceOf[js.Any])
    if (titleWrap != null) __obj.updateDynamic("titleWrap")(titleWrap.asInstanceOf[js.Any])
    if (titleWrapActionPosLeft != null) __obj.updateDynamic("titleWrapActionPosLeft")(titleWrapActionPosLeft.asInstanceOf[js.Any])
    if (titleWrapActionPosRight != null) __obj.updateDynamic("titleWrapActionPosRight")(titleWrapActionPosRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesGridListTileBarClassKey]
  }
}

