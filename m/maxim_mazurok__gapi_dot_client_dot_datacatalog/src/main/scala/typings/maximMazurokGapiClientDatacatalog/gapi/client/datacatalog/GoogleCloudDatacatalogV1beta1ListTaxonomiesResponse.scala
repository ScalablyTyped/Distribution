package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1ListTaxonomiesResponse extends StObject {
  
  /** Token used to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Taxonomies that the project contains. */
  var taxonomies: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1Taxonomy]] = js.undefined
}
object GoogleCloudDatacatalogV1beta1ListTaxonomiesResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1ListTaxonomiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ListTaxonomiesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1ListTaxonomiesResponseMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1ListTaxonomiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTaxonomies(value: js.Array[GoogleCloudDatacatalogV1beta1Taxonomy]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    @scala.inline
    def setTaxonomiesVarargs(value: GoogleCloudDatacatalogV1beta1Taxonomy*): Self = StObject.set(x, "taxonomies", js.Array(value :_*))
  }
}
