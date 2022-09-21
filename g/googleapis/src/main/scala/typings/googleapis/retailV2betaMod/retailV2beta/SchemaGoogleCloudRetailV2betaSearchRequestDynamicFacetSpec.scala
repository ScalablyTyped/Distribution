package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaSearchRequestDynamicFacetSpec extends StObject {
  
  /**
    * Mode of the DynamicFacet feature. Defaults to Mode.DISABLED if it's unset.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaSearchRequestDynamicFacetSpec {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaSearchRequestDynamicFacetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaSearchRequestDynamicFacetSpec]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaSearchRequestDynamicFacetSpec](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
