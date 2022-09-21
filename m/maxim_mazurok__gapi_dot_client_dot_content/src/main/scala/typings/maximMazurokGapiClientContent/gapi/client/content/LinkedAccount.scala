package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedAccount extends StObject {
  
  /** The ID of the linked account. */
  var linkedAccountId: js.UndefOr[String] = js.undefined
  
  /** List of provided services. */
  var services: js.UndefOr[js.Array[LinkService]] = js.undefined
}
object LinkedAccount {
  
  inline def apply(): LinkedAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedAccount]
  }
  
  extension [Self <: LinkedAccount](x: Self) {
    
    inline def setLinkedAccountId(value: String): Self = StObject.set(x, "linkedAccountId", value.asInstanceOf[js.Any])
    
    inline def setLinkedAccountIdUndefined: Self = StObject.set(x, "linkedAccountId", js.undefined)
    
    inline def setServices(value: js.Array[LinkService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: LinkService*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
