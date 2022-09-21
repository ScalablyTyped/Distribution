package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse extends StObject {
  
  /**
    * Taxonomies that were imported.
    */
  var taxonomies: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1beta1Taxonomy]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse](x: Self) {
    
    inline def setTaxonomies(value: js.Array[SchemaGoogleCloudDatacatalogV1beta1Taxonomy]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    inline def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    inline def setTaxonomiesVarargs(value: SchemaGoogleCloudDatacatalogV1beta1Taxonomy*): Self = StObject.set(x, "taxonomies", js.Array(value*))
  }
}
