package typings.inboxsdk.mod

import typings.inboxsdk.mod.Common.Contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object User {
  
  trait UserInstance extends StObject {
    
    def getAccountSwitcherContactList(): js.Array[Contact]
    
    def getEmailAddress(): String
    
    def getLanguage(): String
    
    def isConversationViewDisabled(): Boolean
    
    def isUsingGmailMaterialUI(): Boolean
  }
  object UserInstance {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: UserInstance] (val x: Self) extends AnyVal {
      
      inline def setGetAccountSwitcherContactList(value: () => js.Array[Contact]): Self = StObject.set(x, "getAccountSwitcherContactList", js.Any.fromFunction0(value))
      
      inline def setGetEmailAddress(value: () => String): Self = StObject.set(x, "getEmailAddress", js.Any.fromFunction0(value))
      
      inline def setGetLanguage(value: () => String): Self = StObject.set(x, "getLanguage", js.Any.fromFunction0(value))
      
      inline def setIsConversationViewDisabled(value: () => Boolean): Self = StObject.set(x, "isConversationViewDisabled", js.Any.fromFunction0(value))
      
      inline def setIsUsingGmailMaterialUI(value: () => Boolean): Self = StObject.set(x, "isUsingGmailMaterialUI", js.Any.fromFunction0(value))
    }
  }
}
