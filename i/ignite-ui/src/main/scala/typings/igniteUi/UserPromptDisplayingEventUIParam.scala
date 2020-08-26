package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPromptDisplayingEventUIParam extends js.Object {
  /**
    * Get a boolean indicating if the operation that triggered the prompt can be cancelled.
    */
  var canCancel: js.UndefOr[Boolean] = js.native
  /**
    * Get a boolean indicating if a message will be displayed to the end user.
    */
  var displayMessage: js.UndefOr[Boolean] = js.native
  /**
    * Gets the exception for the error, if there was one.
    */
  var exception: js.UndefOr[js.Any] = js.native
  /**
    * Get or set the message that will be displayed.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Get the [action](ig.spreadsheet.SpreadsheetUserPromptTrigger) that caused the prompt to be displayed.
    */
  var trigger: js.UndefOr[String] = js.native
}

object UserPromptDisplayingEventUIParam {
  @scala.inline
  def apply(): UserPromptDisplayingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPromptDisplayingEventUIParam]
  }
  @scala.inline
  implicit class UserPromptDisplayingEventUIParamOps[Self <: UserPromptDisplayingEventUIParam] (val x: Self) extends AnyVal {
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
    def setCanCancel(value: Boolean): Self = this.set("canCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanCancel: Self = this.set("canCancel", js.undefined)
    @scala.inline
    def setDisplayMessage(value: Boolean): Self = this.set("displayMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMessage: Self = this.set("displayMessage", js.undefined)
    @scala.inline
    def setException(value: js.Any): Self = this.set("exception", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteException: Self = this.set("exception", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
  
}

