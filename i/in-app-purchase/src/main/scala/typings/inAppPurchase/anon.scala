package typings.inAppPurchase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClientEmail extends StObject {
    
    // client email from Google API service account JSON key file
    var clientEmail: String
    
    // private key string from Google API service account JSON key file
    var privateKey: String
  }
  object ClientEmail {
    
    inline def apply(clientEmail: String, privateKey: String): ClientEmail = {
      val __obj = js.Dynamic.literal(clientEmail = clientEmail.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientEmail]
    }
    
    extension [Self <: ClientEmail](x: Self) {
      
      inline def setClientEmail(value: String): Self = StObject.set(x, "clientEmail", value.asInstanceOf[js.Any])
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: String
    
    var signature: String
  }
  object Data {
    
    inline def apply(data: String, signature: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgnoreCanceled extends StObject {
    
    var ignoreCanceled: Boolean
    
    var ignoreExpired: Boolean
  }
  object IgnoreCanceled {
    
    inline def apply(ignoreCanceled: Boolean, ignoreExpired: Boolean): IgnoreCanceled = {
      val __obj = js.Dynamic.literal(ignoreCanceled = ignoreCanceled.asInstanceOf[js.Any], ignoreExpired = ignoreExpired.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgnoreCanceled]
    }
    
    extension [Self <: IgnoreCanceled](x: Self) {
      
      inline def setIgnoreCanceled(value: Boolean): Self = StObject.set(x, "ignoreCanceled", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpired(value: Boolean): Self = StObject.set(x, "ignoreExpired", value.asInstanceOf[js.Any])
    }
  }
}
