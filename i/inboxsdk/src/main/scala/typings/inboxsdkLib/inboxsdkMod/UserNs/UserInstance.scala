package typings
package inboxsdkLib.inboxsdkMod.UserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInstance extends js.Object {
  def getAccountSwitcherContactList(): js.Array[inboxsdkLib.inboxsdkMod.CommonNs.Contact]
  def getEmailAddress(): java.lang.String
  def getLanguage(): java.lang.String
  def isConversationViewDisabled(): scala.Boolean
  def isUsingGmailMaterialUI(): scala.Boolean
}

object UserInstance {
  @scala.inline
  def apply(
    getAccountSwitcherContactList: () => js.Array[inboxsdkLib.inboxsdkMod.CommonNs.Contact],
    getEmailAddress: () => java.lang.String,
    getLanguage: () => java.lang.String,
    isConversationViewDisabled: () => scala.Boolean,
    isUsingGmailMaterialUI: () => scala.Boolean
  ): UserInstance = {
    val __obj = js.Dynamic.literal(getAccountSwitcherContactList = js.Any.fromFunction0(getAccountSwitcherContactList), getEmailAddress = js.Any.fromFunction0(getEmailAddress), getLanguage = js.Any.fromFunction0(getLanguage), isConversationViewDisabled = js.Any.fromFunction0(isConversationViewDisabled), isUsingGmailMaterialUI = js.Any.fromFunction0(isUsingGmailMaterialUI))
  
    __obj.asInstanceOf[UserInstance]
  }
}

