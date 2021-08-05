package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse extends StObject {
  
  /** Taxonomies that were imported. */
  var taxonomies: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1Taxonomy]] = js.undefined
}
object GoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse {
  
  inline def apply(): GoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1beta1ImportTaxonomiesResponse](x: Self) {
    
    inline def setTaxonomies(value: js.Array[GoogleCloudDatacatalogV1beta1Taxonomy]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    inline def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    inline def setTaxonomiesVarargs(value: GoogleCloudDatacatalogV1beta1Taxonomy*): Self = StObject.set(x, "taxonomies", js.Array(value :_*))
  }
}
