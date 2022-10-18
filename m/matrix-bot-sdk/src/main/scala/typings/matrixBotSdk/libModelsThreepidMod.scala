package typings.matrixBotSdk

import typings.matrixBotSdk.matrixBotSdkStrings.email
import typings.matrixBotSdk.matrixBotSdkStrings.msisdn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsThreepidMod {
  
  trait Threepid extends StObject {
    
    var address: String
    
    var kind: email | msisdn | String
  }
  object Threepid {
    
    inline def apply(address: String, kind: email | msisdn | String): Threepid = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Threepid]
    }
    
    extension [Self <: Threepid](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setKind(value: email | msisdn | String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
}
