package typings.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyDefault extends js.Object {
                    // Image source string
  var closable: js.UndefOr[Boolean] = js.undefined
         // Show timer indicator
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
    // Set this to true if you want notification not to be shown until previous notification is closed. This is useful for notification queues
  var continueDelayOnInactiveTab: js.UndefOr[Boolean] = js.undefined
               // Make notifications closable
  var delay: js.UndefOr[Double] = js.undefined
                  // Hide notification after this time (in miliseconds)
  var delayIndicator: js.UndefOr[Boolean] = js.undefined
          // Show animation class.
  var hideClass: js.UndefOr[String] = js.undefined
         // Hide animation class.
  var icon: js.UndefOr[Boolean] = js.undefined
                      // Message of notification
  var img: js.UndefOr[String] = js.undefined
                   // Icon of notification. Leave as is for default icon or set custom string
  var msg: js.UndefOr[String] = js.undefined
   // Continue delay when browser tab is inactive
  // Events
  var onClick: js.UndefOr[js.Function] = js.undefined
      // Place to show notification. Available options: "top left", "top right", "bottom left", "bottom right"
  var onClickUrl: js.UndefOr[String] = js.undefined
                  // Sound of notification. Set this false to disable sound. Leave as is for default sound or set custom soud path
  var position: js.UndefOr[String] = js.undefined
            // The url which will be opened when notification is clicked
  var showAfterPrevious: js.UndefOr[Boolean] = js.undefined
             // Default extension for all sounds
  var showClass: js.UndefOr[String] = js.undefined
                  // Title of notification. If you do not include the title in options it will automatically takes its value
  //from Lobibox.notify.OPTIONS object depending of the type of the notifications or set custom string. Set this false to disable title
  var size: js.UndefOr[String] = js.undefined
                   // Width of notification box
  var sound: js.UndefOr[Boolean] = js.undefined
     // The folder path where sounds are located
  var soundExt: js.UndefOr[String] = js.undefined
               // normal, mini, large
  var soundPath: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String | Boolean] = js.undefined
           // Close notifications by clicking on them
  var width: js.UndefOr[Double] = js.undefined
}

object NotifyDefault {
  @scala.inline
  def apply(
    closable: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    continueDelayOnInactiveTab: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    delayIndicator: js.UndefOr[Boolean] = js.undefined,
    hideClass: String = null,
    icon: js.UndefOr[Boolean] = js.undefined,
    img: String = null,
    msg: String = null,
    onClick: js.Function = null,
    onClickUrl: String = null,
    position: String = null,
    showAfterPrevious: js.UndefOr[Boolean] = js.undefined,
    showClass: String = null,
    size: String = null,
    sound: js.UndefOr[Boolean] = js.undefined,
    soundExt: String = null,
    soundPath: String = null,
    title: String | Boolean = null,
    width: js.UndefOr[Double] = js.undefined
  ): NotifyDefault = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(continueDelayOnInactiveTab)) __obj.updateDynamic("continueDelayOnInactiveTab")(continueDelayOnInactiveTab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayIndicator)) __obj.updateDynamic("delayIndicator")(delayIndicator.get.asInstanceOf[js.Any])
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.get.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onClickUrl != null) __obj.updateDynamic("onClickUrl")(onClickUrl.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showAfterPrevious)) __obj.updateDynamic("showAfterPrevious")(showAfterPrevious.get.asInstanceOf[js.Any])
    if (showClass != null) __obj.updateDynamic("showClass")(showClass.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound.get.asInstanceOf[js.Any])
    if (soundExt != null) __obj.updateDynamic("soundExt")(soundExt.asInstanceOf[js.Any])
    if (soundPath != null) __obj.updateDynamic("soundPath")(soundPath.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyDefault]
  }
}

