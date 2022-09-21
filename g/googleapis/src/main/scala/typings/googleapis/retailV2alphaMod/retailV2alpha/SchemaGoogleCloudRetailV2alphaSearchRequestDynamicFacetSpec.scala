package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaSearchRequestDynamicFacetSpec extends StObject {
  
  /**
    * Mode of the DynamicFacet feature. Defaults to Mode.DISABLED if it's unset.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaSearchRequestDynamicFacetSpec {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaSearchRequestDynamicFacetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaSearchRequestDynamicFacetSpec]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaSearchRequestDynamicFacetSpec](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
