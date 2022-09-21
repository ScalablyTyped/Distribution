package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ModifyEntryOverviewRequest extends StObject {
  
  /** Required. The new value for the Entry Overview. */
  var entryOverview: js.UndefOr[GoogleCloudDatacatalogV1EntryOverview] = js.undefined
}
object GoogleCloudDatacatalogV1ModifyEntryOverviewRequest {
  
  inline def apply(): GoogleCloudDatacatalogV1ModifyEntryOverviewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ModifyEntryOverviewRequest]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1ModifyEntryOverviewRequest](x: Self) {
    
    inline def setEntryOverview(value: GoogleCloudDatacatalogV1EntryOverview): Self = StObject.set(x, "entryOverview", value.asInstanceOf[js.Any])
    
    inline def setEntryOverviewUndefined: Self = StObject.set(x, "entryOverview", js.undefined)
  }
}
