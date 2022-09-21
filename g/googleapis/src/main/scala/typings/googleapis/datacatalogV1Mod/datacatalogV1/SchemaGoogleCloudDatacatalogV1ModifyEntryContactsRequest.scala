package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ModifyEntryContactsRequest extends StObject {
  
  /**
    * Required. The new value for the Contacts.
    */
  var contacts: js.UndefOr[SchemaGoogleCloudDatacatalogV1Contacts] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ModifyEntryContactsRequest {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ModifyEntryContactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ModifyEntryContactsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ModifyEntryContactsRequest](x: Self) {
    
    inline def setContacts(value: SchemaGoogleCloudDatacatalogV1Contacts): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
  }
}
