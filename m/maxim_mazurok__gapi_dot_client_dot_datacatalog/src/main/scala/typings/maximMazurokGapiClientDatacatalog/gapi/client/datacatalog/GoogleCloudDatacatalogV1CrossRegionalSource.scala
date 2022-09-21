package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1CrossRegionalSource extends StObject {
  
  /** Required. The resource name of the source taxonomy to import. */
  var taxonomy: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1CrossRegionalSource {
  
  inline def apply(): GoogleCloudDatacatalogV1CrossRegionalSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1CrossRegionalSource]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1CrossRegionalSource](x: Self) {
    
    inline def setTaxonomy(value: String): Self = StObject.set(x, "taxonomy", value.asInstanceOf[js.Any])
    
    inline def setTaxonomyUndefined: Self = StObject.set(x, "taxonomy", js.undefined)
  }
}
