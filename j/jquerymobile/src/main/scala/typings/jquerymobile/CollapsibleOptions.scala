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
    if (collapseCueText != null) __obj.updateDynamic("collapseCueText")(collapseCueText)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (collapsedIcon != null) __obj.updateDynamic("collapsedIcon")(collapsedIcon)
    if (contentTheme != null) __obj.updateDynamic("contentTheme")(contentTheme)
    if (expandCueText != null) __obj.updateDynamic("expandCueText")(expandCueText)
    if (expandedIcon != null) __obj.updateDynamic("expandedIcon")(expandedIcon)
    if (heading != null) __obj.updateDynamic("heading")(heading)
    if (iconpos != null) __obj.updateDynamic("iconpos")(iconpos)
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector)
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CollapsibleOptions]
  }
}

