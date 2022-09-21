package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2SearchRequestDynamicFacetSpec extends StObject {
  
  /**
    * Mode of the DynamicFacet feature. Defaults to Mode.DISABLED if it's unset.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2SearchRequestDynamicFacetSpec {
  
  inline def apply(): SchemaGoogleCloudRetailV2SearchRequestDynamicFacetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2SearchRequestDynamicFacetSpec]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2SearchRequestDynamicFacetSpec](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
