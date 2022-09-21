package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ModifyEntryOverviewRequest extends StObject {
  
  /**
    * Required. The new value for the Entry Overview.
    */
  var entryOverview: js.UndefOr[SchemaGoogleCloudDatacatalogV1EntryOverview] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ModifyEntryOverviewRequest {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ModifyEntryOverviewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ModifyEntryOverviewRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ModifyEntryOverviewRequest](x: Self) {
    
    inline def setEntryOverview(value: SchemaGoogleCloudDatacatalogV1EntryOverview): Self = StObject.set(x, "entryOverview", value.asInstanceOf[js.Any])
    
    inline def setEntryOverviewUndefined: Self = StObject.set(x, "entryOverview", js.undefined)
  }
}
