package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1ListTaxonomiesResponse extends StObject {
  
  /**
    * Token used to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Taxonomies that the project contains.
    */
  var taxonomies: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1beta1Taxonomy]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1ListTaxonomiesResponse {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1ListTaxonomiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1ListTaxonomiesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1ListTaxonomiesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTaxonomies(value: js.Array[SchemaGoogleCloudDatacatalogV1beta1Taxonomy]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    inline def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    inline def setTaxonomiesVarargs(value: SchemaGoogleCloudDatacatalogV1beta1Taxonomy*): Self = StObject.set(x, "taxonomies", js.Array(value*))
  }
}
