package typings.inboxsdk.mod.User

import typings.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserInstance extends js.Object {
  def getAccountSwitcherContactList(): js.Array[Contact] = js.native
  def getEmailAddress(): String = js.native
  def getLanguage(): String = js.native
  def isConversationViewDisabled(): Boolean = js.native
  def isUsingGmailMaterialUI(): Boolean = js.native
}

object UserInstance {
  @scala.inline
  def apply(
    getAccountSwitcherContactList: () => js.Array[Contact],
    getEmailAddress: () => String,
    getLanguage: () => String,
    isConversationViewDisabled: () => Boolean,
    isUsingGmailMaterialUI: () => Boolean
  ): UserInstance = {
    val __obj = js.Dynamic.literal(getAccountSwitcherContactList = js.Any.fromFunction0(getAccountSwitcherContactList), getEmailAddress = js.Any.fromFunction0(getEmailAddress), getLanguage = js.Any.fromFunction0(getLanguage), isConversationViewDisabled = js.Any.fromFunction0(isConversationViewDisabled), isUsingGmailMaterialUI = js.Any.fromFunction0(isUsingGmailMaterialUI))
    __obj.asInstanceOf[UserInstance]
  }
  @scala.inline
  implicit class UserInstanceOps[Self <: UserInstance] (val x: Self) extends AnyVal {
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
    def setGetAccountSwitcherContactList(value: () => js.Array[Contact]): Self = this.set("getAccountSwitcherContactList", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEmailAddress(value: () => String): Self = this.set("getEmailAddress", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLanguage(value: () => String): Self = this.set("getLanguage", js.Any.fromFunction0(value))
    @scala.inline
    def setIsConversationViewDisabled(value: () => Boolean): Self = this.set("isConversationViewDisabled", js.Any.fromFunction0(value))
    @scala.inline
    def setIsUsingGmailMaterialUI(value: () => Boolean): Self = this.set("isUsingGmailMaterialUI", js.Any.fromFunction0(value))
  }
  
}

