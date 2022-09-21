package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ImportTaxonomiesResponse extends StObject {
  
  /** Imported taxonomies. */
  var taxonomies: js.UndefOr[js.Array[GoogleCloudDatacatalogV1Taxonomy]] = js.undefined
}
object GoogleCloudDatacatalogV1ImportTaxonomiesResponse {
  
  inline def apply(): GoogleCloudDatacatalogV1ImportTaxonomiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ImportTaxonomiesResponse]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1ImportTaxonomiesResponse](x: Self) {
    
    inline def setTaxonomies(value: js.Array[GoogleCloudDatacatalogV1Taxonomy]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    inline def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    inline def setTaxonomiesVarargs(value: GoogleCloudDatacatalogV1Taxonomy*): Self = StObject.set(x, "taxonomies", js.Array(value*))
  }
}
