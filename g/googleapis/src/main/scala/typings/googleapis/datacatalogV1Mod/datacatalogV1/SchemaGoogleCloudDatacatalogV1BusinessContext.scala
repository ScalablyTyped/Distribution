package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1BusinessContext extends StObject {
  
  /**
    * Contact people for the entry.
    */
  var contacts: js.UndefOr[SchemaGoogleCloudDatacatalogV1Contacts] = js.undefined
  
  /**
    * Entry overview fields for rich text descriptions of entries.
    */
  var entryOverview: js.UndefOr[SchemaGoogleCloudDatacatalogV1EntryOverview] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1BusinessContext {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1BusinessContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1BusinessContext]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1BusinessContext](x: Self) {
    
    inline def setContacts(value: SchemaGoogleCloudDatacatalogV1Contacts): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setEntryOverview(value: SchemaGoogleCloudDatacatalogV1EntryOverview): Self = StObject.set(x, "entryOverview", value.asInstanceOf[js.Any])
    
    inline def setEntryOverviewUndefined: Self = StObject.set(x, "entryOverview", js.undefined)
  }
}
