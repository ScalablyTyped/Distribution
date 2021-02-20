package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse extends StObject {
  
  /** Taxonomies that were imported. */
  var taxonomies: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1Taxonomy]] = js.native
}
object GoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1ImportTaxonomiesResponseMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaxonomies(value: js.Array[GoogleCloudDatacatalogV1beta1Taxonomy]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    @scala.inline
    def setTaxonomiesVarargs(value: GoogleCloudDatacatalogV1beta1Taxonomy*): Self = StObject.set(x, "taxonomies", js.Array(value :_*))
  }
}
