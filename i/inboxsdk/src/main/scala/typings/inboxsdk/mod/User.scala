package typings.inboxsdk.mod

import typings.inboxsdk.mod.Common.Contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object User {
  
  @js.native
  trait UserInstance extends StObject {
    
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
    implicit class UserInstanceMutableBuilder[Self <: UserInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAccountSwitcherContactList(value: () => js.Array[Contact]): Self = StObject.set(x, "getAccountSwitcherContactList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEmailAddress(value: () => String): Self = StObject.set(x, "getEmailAddress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLanguage(value: () => String): Self = StObject.set(x, "getLanguage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConversationViewDisabled(value: () => Boolean): Self = StObject.set(x, "isConversationViewDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsUsingGmailMaterialUI(value: () => Boolean): Self = StObject.set(x, "isUsingGmailMaterialUI", js.Any.fromFunction0(value))
    }
  }
}
