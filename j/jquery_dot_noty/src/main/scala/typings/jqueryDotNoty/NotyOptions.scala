package typings.jqueryDotNoty

import typings.jqueryDotNoty.jqueryDotNotyStrings.backdrop
import typings.jqueryDotNoty.jqueryDotNotyStrings.button
import typings.jqueryDotNoty.jqueryDotNotyStrings.click
import typings.jqueryDotNoty.jqueryDotNotyStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotyOptions extends js.Object {
  var animation: js.UndefOr[NotyAnimationOptions] = js.undefined
  /** an array of buttons, for creating confirmation dialogs. */
  var buttons: js.UndefOr[js.Any] = js.undefined
  var callback: js.UndefOr[NotyCallbackOptions] = js.undefined
  /** backdrop click will close all notifications */
  var closeWith: js.UndefOr[js.Array[click | button | hover | backdrop]] = js.undefined
  /** If you want to use queue feature set this true. */
  var dismissQueue: js.UndefOr[Boolean] = js.undefined
  /** adds notification to the beginning of queue when set to true */
  var force: js.UndefOr[Boolean] = js.undefined
  /** if true closes all notifications and shows itself */
  var killer: js.UndefOr[Boolean] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  /** You can set max visible notification for dismissQueue true option */
  var maxVisible: js.UndefOr[Double] = js.undefined
  /** if true adds an overlay */
  var modal: js.UndefOr[Boolean] = js.undefined
  /** displays a progress bar */
  var progressBar: js.UndefOr[Boolean] = js.undefined
  /** The note`s optional template like '<div class="noty_message"><span class="noty_text"></span><div class="noty_close"></div></div>' */
  var template: js.UndefOr[String] = js.undefined
  /** Text to show. Can be html or string. */
  var text: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  /** Delay for closing event. Set false for sticky notifications */
  var timeout: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object NotyOptions {
  @scala.inline
  def apply(
    animation: NotyAnimationOptions = null,
    buttons: js.Any = null,
    callback: NotyCallbackOptions = null,
    closeWith: js.Array[click | button | hover | backdrop] = null,
    dismissQueue: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    killer: js.UndefOr[Boolean] = js.undefined,
    layout: String = null,
    maxVisible: Int | Double = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    text: String = null,
    theme: String = null,
    timeout: js.Any = null,
    `type`: String = null
  ): NotyOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (closeWith != null) __obj.updateDynamic("closeWith")(closeWith.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissQueue)) __obj.updateDynamic("dismissQueue")(dismissQueue.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(killer)) __obj.updateDynamic("killer")(killer.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxVisible != null) __obj.updateDynamic("maxVisible")(maxVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotyOptions]
  }
}

