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
    if (!js.isUndefined(disablePageZoom)) __obj.updateDynamic("disablePageZoom")(disablePageZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (hideDuringFocus != null) __obj.updateDynamic("hideDuringFocus")(hideDuringFocus.asInstanceOf[js.Any])
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector.asInstanceOf[js.Any])
    if (supportBlacklist != null) __obj.updateDynamic("supportBlacklist")(supportBlacklist.asInstanceOf[js.Any])
    if (!js.isUndefined(tapToggle)) __obj.updateDynamic("tapToggle")(tapToggle.asInstanceOf[js.Any])
    if (tapToggleBlacklist != null) __obj.updateDynamic("tapToggleBlacklist")(tapToggleBlacklist.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(updatePagePadding)) __obj.updateDynamic("updatePagePadding")(updatePagePadding.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleOnPageShow)) __obj.updateDynamic("visibleOnPageShow")(visibleOnPageShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedToolbarOptions]
  }
}

