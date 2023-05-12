package typings.keychain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<keychain.keychain.keychainTypes.KeyChainBaseOptions, 'account' | 'service'> */
  trait PickKeyChainBaseOptionsac extends StObject {
    
    var account: String
    
    var service: String
  }
  object PickKeyChainBaseOptionsac {
    
    inline def apply(account: String, service: String): PickKeyChainBaseOptionsac = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickKeyChainBaseOptionsac]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickKeyChainBaseOptionsac] (val x: Self) extends AnyVal {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
}
