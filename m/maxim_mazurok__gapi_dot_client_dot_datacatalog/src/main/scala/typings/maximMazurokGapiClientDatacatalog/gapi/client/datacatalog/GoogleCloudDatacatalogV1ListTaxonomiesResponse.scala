package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ListTaxonomiesResponse extends StObject {
  
  /** Pagination token of the next results page. Empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Taxonomies that the project contains. */
  var taxonomies: js.UndefOr[js.Array[GoogleCloudDatacatalogV1Taxonomy]] = js.undefined
}
object GoogleCloudDatacatalogV1ListTaxonomiesResponse {
  
  inline def apply(): GoogleCloudDatacatalogV1ListTaxonomiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ListTaxonomiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1ListTaxonomiesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTaxonomies(value: js.Array[GoogleCloudDatacatalogV1Taxonomy]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    inline def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    inline def setTaxonomiesVarargs(value: GoogleCloudDatacatalogV1Taxonomy*): Self = StObject.set(x, "taxonomies", js.Array(value*))
  }
}
