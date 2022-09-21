package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoForwarding extends StObject {
  
  /**
    * The state that a message should be left in after it has been forwarded.
    */
  var disposition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email address to which all incoming messages are forwarded. This email address must be a verified member of the forwarding addresses.
    */
  var emailAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether all incoming mail is automatically forwarded to another address.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAutoForwarding {
  
  inline def apply(): SchemaAutoForwarding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoForwarding]
  }
  
  extension [Self <: SchemaAutoForwarding](x: Self) {
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionNull: Self = StObject.set(x, "disposition", null)
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
