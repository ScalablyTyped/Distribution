package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse extends StObject {
  
  /**
    * List of taxonomies and policy tags as nested protocol buffers.
    */
  var taxonomies: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1SerializedTaxonomy]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ExportTaxonomiesResponse](x: Self) {
    
    inline def setTaxonomies(value: js.Array[SchemaGoogleCloudDatacatalogV1SerializedTaxonomy]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    inline def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    inline def setTaxonomiesVarargs(value: SchemaGoogleCloudDatacatalogV1SerializedTaxonomy*): Self = StObject.set(x, "taxonomies", js.Array(value*))
  }
}
