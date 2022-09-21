package typings.googleapis.v1p4beta1Mod.cloudassetV1p4beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssetV1p4beta1Resource extends StObject {
  
  /**
    * The analysis state of this resource.
    */
  var analysisState: js.UndefOr[SchemaGoogleCloudAssetV1p4beta1AnalysisState] = js.undefined
  
  /**
    * The [full resource name](https://cloud.google.com/asset-inventory/docs/resource-name-format)
    */
  var fullResourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudAssetV1p4beta1Resource {
  
  inline def apply(): SchemaGoogleCloudAssetV1p4beta1Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssetV1p4beta1Resource]
  }
  
  extension [Self <: SchemaGoogleCloudAssetV1p4beta1Resource](x: Self) {
    
    inline def setAnalysisState(value: SchemaGoogleCloudAssetV1p4beta1AnalysisState): Self = StObject.set(x, "analysisState", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStateUndefined: Self = StObject.set(x, "analysisState", js.undefined)
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameNull: Self = StObject.set(x, "fullResourceName", null)
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
  }
}
