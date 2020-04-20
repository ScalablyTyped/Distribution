package typings.inboxsdk.mod.User

import typings.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInstance extends js.Object {
  def getAccountSwitcherContactList(): js.Array[Contact]
  def getEmailAddress(): String
  def getLanguage(): String
  def isConversationViewDisabled(): Boolean
  def isUsingGmailMaterialUI(): Boolean
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
}

