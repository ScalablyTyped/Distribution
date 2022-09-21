package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the consent store to create. The string must match the following regex: `[\p{L\}\p{N\}_\-\.]{1,256\}`. Cannot be changed after creation.
    */
  var consentStoreId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the dataset this consent store belongs to.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaConsentStore] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresCreate](x: Self) {
    
    inline def setConsentStoreId(value: String): Self = StObject.set(x, "consentStoreId", value.asInstanceOf[js.Any])
    
    inline def setConsentStoreIdUndefined: Self = StObject.set(x, "consentStoreId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaConsentStore): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
