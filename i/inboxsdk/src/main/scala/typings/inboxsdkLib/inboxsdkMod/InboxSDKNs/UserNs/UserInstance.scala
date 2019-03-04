package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.UserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInstance extends js.Object {
  def getAccountSwitcherContactList(): js.Array[inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.Contact]
  def getEmailAddress(): java.lang.String
  def getLanguage(): java.lang.String
  def isConversationViewDisabled(): scala.Boolean
  def isUsingGmailMaterialUI(): scala.Boolean
}

object UserInstance {
  @scala.inline
  def apply(
    getAccountSwitcherContactList: js.Function0[js.Array[inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.Contact]],
    getEmailAddress: js.Function0[java.lang.String],
    getLanguage: js.Function0[java.lang.String],
    isConversationViewDisabled: js.Function0[scala.Boolean],
    isUsingGmailMaterialUI: js.Function0[scala.Boolean]
  ): UserInstance = {
    val __obj = js.Dynamic.literal(getAccountSwitcherContactList = getAccountSwitcherContactList, getEmailAddress = getEmailAddress, getLanguage = getLanguage, isConversationViewDisabled = isConversationViewDisabled, isUsingGmailMaterialUI = isUsingGmailMaterialUI)
  
    __obj.asInstanceOf[UserInstance]
  }
}

