package typings.jqueryToastmessagePlugin.JQueryToastmessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions extends js.Object {
  /** callback function when the toastmessage is closed @default null */
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * text which will be shown as close button,
    * set to '' when you want to introduce an image via css
    * @default ''
    */
  var closeText: js.UndefOr[String] = js.undefined
  /** in effect duration in miliseconds @default 600 */
  var inEffectDuration: js.UndefOr[Double] = js.undefined
  /**
    * Position of the toast container holding different toast.
    * Position can be set only once at the very first call,
    * changing the position after the first call does nothing
    * @default 'top-right'
    */
  var position: js.UndefOr[ToastPosition] = js.undefined
  /**
    * time in miliseconds before the item has to disappear @default 3000
    */
  var stayTime: js.UndefOr[Double] = js.undefined
  /** should the toast item sticky or not? @default false */
  var sticky: js.UndefOr[Boolean] = js.undefined
  /** content of the item @default '' */
  var text: js.UndefOr[String] = js.undefined
  /** the type of toast @default 'notice' */
  var `type`: js.UndefOr[ToastType] = js.undefined
}

object ToastOptions {
  @scala.inline
  def apply(
    close: () => Unit = null,
    closeText: String = null,
    inEffectDuration: js.UndefOr[Double] = js.undefined,
    position: ToastPosition = null,
    stayTime: js.UndefOr[Double] = js.undefined,
    sticky: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    `type`: ToastType = null
  ): ToastOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (!js.isUndefined(inEffectDuration)) __obj.updateDynamic("inEffectDuration")(inEffectDuration.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(stayTime)) __obj.updateDynamic("stayTime")(stayTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
}

