package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse extends StObject {
  
  /**
    * Pagination token of the next results page. Empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Taxonomies that the project contains.
    */
  var taxonomies: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1Taxonomy]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ListTaxonomiesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTaxonomies(value: js.Array[SchemaGoogleCloudDatacatalogV1Taxonomy]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    inline def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    inline def setTaxonomiesVarargs(value: SchemaGoogleCloudDatacatalogV1Taxonomy*): Self = StObject.set(x, "taxonomies", js.Array(value*))
  }
}
