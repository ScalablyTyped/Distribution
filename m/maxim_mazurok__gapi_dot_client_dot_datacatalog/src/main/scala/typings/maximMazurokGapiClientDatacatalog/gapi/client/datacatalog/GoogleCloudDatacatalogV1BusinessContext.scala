package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1BusinessContext extends StObject {
  
  /** Contact people for the entry. */
  var contacts: js.UndefOr[GoogleCloudDatacatalogV1Contacts] = js.undefined
  
  /** Entry overview fields for rich text descriptions of entries. */
  var entryOverview: js.UndefOr[GoogleCloudDatacatalogV1EntryOverview] = js.undefined
}
object GoogleCloudDatacatalogV1BusinessContext {
  
  inline def apply(): GoogleCloudDatacatalogV1BusinessContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1BusinessContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1BusinessContext] (val x: Self) extends AnyVal {
    
    inline def setContacts(value: GoogleCloudDatacatalogV1Contacts): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setEntryOverview(value: GoogleCloudDatacatalogV1EntryOverview): Self = StObject.set(x, "entryOverview", value.asInstanceOf[js.Any])
    
    inline def setEntryOverviewUndefined: Self = StObject.set(x, "entryOverview", js.undefined)
  }
}
