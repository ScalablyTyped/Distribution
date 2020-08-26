package typings.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyDefault extends js.Object {
                    // Image source string
  var closable: js.UndefOr[Boolean] = js.native
         // Show timer indicator
  var closeOnClick: js.UndefOr[Boolean] = js.native
    // Set this to true if you want notification not to be shown until previous notification is closed. This is useful for notification queues
  var continueDelayOnInactiveTab: js.UndefOr[Boolean] = js.native
               // Make notifications closable
  var delay: js.UndefOr[Double] = js.native
                  // Hide notification after this time (in miliseconds)
  var delayIndicator: js.UndefOr[Boolean] = js.native
          // Show animation class.
  var hideClass: js.UndefOr[String] = js.native
         // Hide animation class.
  var icon: js.UndefOr[Boolean] = js.native
                      // Message of notification
  var img: js.UndefOr[String] = js.native
                   // Icon of notification. Leave as is for default icon or set custom string
  var msg: js.UndefOr[String] = js.native
   // Continue delay when browser tab is inactive
  // Events
  var onClick: js.UndefOr[js.Function] = js.native
      // Place to show notification. Available options: "top left", "top right", "bottom left", "bottom right"
  var onClickUrl: js.UndefOr[String] = js.native
                  // Sound of notification. Set this false to disable sound. Leave as is for default sound or set custom soud path
  var position: js.UndefOr[String] = js.native
            // The url which will be opened when notification is clicked
  var showAfterPrevious: js.UndefOr[Boolean] = js.native
             // Default extension for all sounds
  var showClass: js.UndefOr[String] = js.native
                  // Title of notification. If you do not include the title in options it will automatically takes its value
  //from Lobibox.notify.OPTIONS object depending of the type of the notifications or set custom string. Set this false to disable title
  var size: js.UndefOr[String] = js.native
                   // Width of notification box
  var sound: js.UndefOr[Boolean] = js.native
     // The folder path where sounds are located
  var soundExt: js.UndefOr[String] = js.native
               // normal, mini, large
  var soundPath: js.UndefOr[String] = js.native
  var title: js.UndefOr[String | Boolean] = js.native
           // Close notifications by clicking on them
  var width: js.UndefOr[Double] = js.native
}

object NotifyDefault {
  @scala.inline
  def apply(): NotifyDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyDefault]
  }
  @scala.inline
  implicit class NotifyDefaultOps[Self <: NotifyDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    @scala.inline
    def setContinueDelayOnInactiveTab(value: Boolean): Self = this.set("continueDelayOnInactiveTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinueDelayOnInactiveTab: Self = this.set("continueDelayOnInactiveTab", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDelayIndicator(value: Boolean): Self = this.set("delayIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayIndicator: Self = this.set("delayIndicator", js.undefined)
    @scala.inline
    def setHideClass(value: String): Self = this.set("hideClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideClass: Self = this.set("hideClass", js.undefined)
    @scala.inline
    def setIcon(value: Boolean): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setImg(value: String): Self = this.set("img", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
    @scala.inline
    def setOnClick(value: js.Function): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnClickUrl(value: String): Self = this.set("onClickUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClickUrl: Self = this.set("onClickUrl", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowAfterPrevious(value: Boolean): Self = this.set("showAfterPrevious", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAfterPrevious: Self = this.set("showAfterPrevious", js.undefined)
    @scala.inline
    def setShowClass(value: String): Self = this.set("showClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowClass: Self = this.set("showClass", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSound(value: Boolean): Self = this.set("sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    @scala.inline
    def setSoundExt(value: String): Self = this.set("soundExt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoundExt: Self = this.set("soundExt", js.undefined)
    @scala.inline
    def setSoundPath(value: String): Self = this.set("soundPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoundPath: Self = this.set("soundPath", js.undefined)
    @scala.inline
    def setTitle(value: String | Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

