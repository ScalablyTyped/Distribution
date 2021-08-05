package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoTaxonomy extends StObject {
  
  /** The list of regions associated with a sku. Empty for Global skus, which are associated with all Google Cloud regions. */
  var regions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The type of Geo Taxonomy: GLOBAL, REGIONAL, or MULTI_REGIONAL. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GeoTaxonomy {
  
  inline def apply(): GeoTaxonomy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoTaxonomy]
  }
  
  extension [Self <: GeoTaxonomy](x: Self) {
    
    inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
