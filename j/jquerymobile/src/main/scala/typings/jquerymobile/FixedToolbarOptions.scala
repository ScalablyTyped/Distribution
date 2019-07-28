package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedToolbarOptions extends js.Object {
  var disablePageZoom: js.UndefOr[Boolean] = js.undefined
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var hideDuringFocus: js.UndefOr[String] = js.undefined
  var initSelector: js.UndefOr[String] = js.undefined
  var supportBlacklist: js.UndefOr[js.Function] = js.undefined
  var tapToggle: js.UndefOr[Boolean] = js.undefined
  var tapToggleBlacklist: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var updatePagePadding: js.UndefOr[Boolean] = js.undefined
  var visibleOnPageShow: js.UndefOr[Boolean] = js.undefined
}

object FixedToolbarOptions {
  @scala.inline
  def apply(
    disablePageZoom: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    hideDuringFocus: String = null,
    initSelector: String = null,
    supportBlacklist: js.Function = null,
    tapToggle: js.UndefOr[Boolean] = js.undefined,
    tapToggleBlacklist: String = null,
    transition: String = null,
    updatePagePadding: js.UndefOr[Boolean] = js.undefined,
    visibleOnPageShow: js.UndefOr[Boolean] = js.undefined
  ): FixedToolbarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disablePageZoom)) __obj.updateDynamic("disablePageZoom")(disablePageZoom)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (hideDuringFocus != null) __obj.updateDynamic("hideDuringFocus")(hideDuringFocus)
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector)
    if (supportBlacklist != null) __obj.updateDynamic("supportBlacklist")(supportBlacklist)
    if (!js.isUndefined(tapToggle)) __obj.updateDynamic("tapToggle")(tapToggle)
    if (tapToggleBlacklist != null) __obj.updateDynamic("tapToggleBlacklist")(tapToggleBlacklist)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (!js.isUndefined(updatePagePadding)) __obj.updateDynamic("updatePagePadding")(updatePagePadding)
    if (!js.isUndefined(visibleOnPageShow)) __obj.updateDynamic("visibleOnPageShow")(visibleOnPageShow)
    __obj.asInstanceOf[FixedToolbarOptions]
  }
}

