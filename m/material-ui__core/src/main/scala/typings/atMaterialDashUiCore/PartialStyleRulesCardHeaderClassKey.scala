package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CardHeader.CardHeaderClassKey>> */
trait PartialStyleRulesCardHeaderClassKey extends js.Object {
  var action: js.UndefOr[CSSProperties] = js.undefined
  var avatar: js.UndefOr[CSSProperties] = js.undefined
  var content: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var subheader: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesCardHeaderClassKey {
  @scala.inline
  def apply(
    action: CSSProperties = null,
    avatar: CSSProperties = null,
    content: CSSProperties = null,
    root: CSSProperties = null,
    subheader: CSSProperties = null,
    title: CSSProperties = null
  ): PartialStyleRulesCardHeaderClassKey = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (subheader != null) __obj.updateDynamic("subheader")(subheader.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesCardHeaderClassKey]
  }
}

