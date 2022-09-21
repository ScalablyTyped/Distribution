package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ModifyEntryContactsRequest extends StObject {
  
  /** Required. The new value for the Contacts. */
  var contacts: js.UndefOr[GoogleCloudDatacatalogV1Contacts] = js.undefined
}
object GoogleCloudDatacatalogV1ModifyEntryContactsRequest {
  
  inline def apply(): GoogleCloudDatacatalogV1ModifyEntryContactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ModifyEntryContactsRequest]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1ModifyEntryContactsRequest](x: Self) {
    
    inline def setContacts(value: GoogleCloudDatacatalogV1Contacts): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
  }
}
