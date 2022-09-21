package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContactDetails extends StObject {
  
  /**
    * A list of contacts
    */
  var contacts: js.UndefOr[js.Array[SchemaContact]] = js.undefined
}
object SchemaContactDetails {
  
  inline def apply(): SchemaContactDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactDetails]
  }
  
  extension [Self <: SchemaContactDetails](x: Self) {
    
    inline def setContacts(value: js.Array[SchemaContact]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setContactsVarargs(value: SchemaContact*): Self = StObject.set(x, "contacts", js.Array(value*))
  }
}
