package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleOptions extends js.Object {
  var collapseCueText: js.UndefOr[String] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var collapsedIcon: js.UndefOr[String] = js.undefined
  var contentTheme: js.UndefOr[String] = js.undefined
  var expandCueText: js.UndefOr[String] = js.undefined
  var expandedIcon: js.UndefOr[String] = js.undefined
  var heading: js.UndefOr[String] = js.undefined
  var iconpos: js.UndefOr[String] = js.undefined
  var initSelector: js.UndefOr[String] = js.undefined
  var inset: js.UndefOr[Boolean] = js.undefined
  var mini: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object CollapsibleOptions {
  @scala.inline
  def apply(
    collapseCueText: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedIcon: String = null,
    contentTheme: String = null,
    expandCueText: String = null,
    expandedIcon: String = null,
    heading: String = null,
    iconpos: String = null,
    initSelector: String = null,
    inset: js.UndefOr[Boolean] = js.undefined,
    mini: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
  ): CollapsibleOptions = {
    val __obj = js.Dynamic.literal()
    if (collapseCueText != null) __obj.updateDynamic("collapseCueText")(collapseCueText.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (collapsedIcon != null) __obj.updateDynamic("collapsedIcon")(collapsedIcon.asInstanceOf[js.Any])
    if (contentTheme != null) __obj.updateDynamic("contentTheme")(contentTheme.asInstanceOf[js.Any])
    if (expandCueText != null) __obj.updateDynamic("expandCueText")(expandCueText.asInstanceOf[js.Any])
    if (expandedIcon != null) __obj.updateDynamic("expandedIcon")(expandedIcon.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (iconpos != null) __obj.updateDynamic("iconpos")(iconpos.asInstanceOf[js.Any])
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsibleOptions]
  }
}

