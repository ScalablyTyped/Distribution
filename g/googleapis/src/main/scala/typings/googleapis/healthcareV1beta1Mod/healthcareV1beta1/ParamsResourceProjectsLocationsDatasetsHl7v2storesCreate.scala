package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the HL7v2 store that is being created. The string must match the following regex: `[\p{L\}\p{N\}_\-\.]{1,256\}`.
    */
  var hl7V2StoreId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the dataset this HL7v2 store belongs to.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaHl7V2Store] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate](x: Self) {
    
    inline def setHl7V2StoreId(value: String): Self = StObject.set(x, "hl7V2StoreId", value.asInstanceOf[js.Any])
    
    inline def setHl7V2StoreIdUndefined: Self = StObject.set(x, "hl7V2StoreId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaHl7V2Store): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
