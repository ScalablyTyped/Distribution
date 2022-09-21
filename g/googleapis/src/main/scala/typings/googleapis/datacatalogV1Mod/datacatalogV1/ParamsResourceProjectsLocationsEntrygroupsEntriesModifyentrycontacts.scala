package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentrycontacts
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The full resource name of the entry.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatacatalogV1ModifyEntryContactsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentrycontacts {
  
  inline def apply(): ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentrycontacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentrycontacts]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEntrygroupsEntriesModifyentrycontacts](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDatacatalogV1ModifyEntryContactsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
