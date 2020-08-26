package typings.jqueryPnotify

import typings.jqueryPnotify.anon.Close
import typings.jqueryPnotify.anon.Closer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNotifyButtons extends js.Object {
  /**
    * The classes to use for button icons. Leave them null to use the classes from the styling you're using.
    */
  var classes: js.UndefOr[Closer] = js.native
  /**
    * Provide a button for the user to manually close the notice.
    */
  var closer: js.UndefOr[Boolean] = js.native
  /**
    * Only show the closer button on hover.
    */
  var closer_hover: js.UndefOr[Boolean] = js.native
  /**
    * The various displayed text, helps facilitating internationalization.
    */
  var labels: js.UndefOr[Close] = js.native
  /**
    * Show the buttons even when the nonblock module is in use.
    */
  var show_on_nonblock: js.UndefOr[Boolean] = js.native
  /**
    * Provide a button for the user to manually stick the notice.
    */
  var sticker: js.UndefOr[Boolean] = js.native
  /**
    * Only show the sticker button on hover.
    */
  var sticker_hover: js.UndefOr[Boolean] = js.native
}

object PNotifyButtons {
  @scala.inline
  def apply(): PNotifyButtons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyButtons]
  }
  @scala.inline
  implicit class PNotifyButtonsOps[Self <: PNotifyButtons] (val x: Self) extends AnyVal {
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
    def setClasses(value: Closer): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setCloser(value: Boolean): Self = this.set("closer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloser: Self = this.set("closer", js.undefined)
    @scala.inline
    def setCloser_hover(value: Boolean): Self = this.set("closer_hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloser_hover: Self = this.set("closer_hover", js.undefined)
    @scala.inline
    def setLabels(value: Close): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setShow_on_nonblock(value: Boolean): Self = this.set("show_on_nonblock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow_on_nonblock: Self = this.set("show_on_nonblock", js.undefined)
    @scala.inline
    def setSticker(value: Boolean): Self = this.set("sticker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSticker: Self = this.set("sticker", js.undefined)
    @scala.inline
    def setSticker_hover(value: Boolean): Self = this.set("sticker_hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSticker_hover: Self = this.set("sticker_hover", js.undefined)
  }
  
}

