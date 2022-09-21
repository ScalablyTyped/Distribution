package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse extends StObject {
  
  /**
    * Imported taxonomies.
    */
  var taxonomies: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1Taxonomy]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ImportTaxonomiesResponse](x: Self) {
    
    inline def setTaxonomies(value: js.Array[SchemaGoogleCloudDatacatalogV1Taxonomy]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    inline def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    inline def setTaxonomiesVarargs(value: SchemaGoogleCloudDatacatalogV1Taxonomy*): Self = StObject.set(x, "taxonomies", js.Array(value*))
  }
}
