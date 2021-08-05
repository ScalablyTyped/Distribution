package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest extends StObject {
  
  /** Inline source used for taxonomies to be imported. */
  var inlineSource: js.UndefOr[GoogleCloudDatacatalogV1beta1InlineSource] = js.undefined
}
object GoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest {
  
  inline def apply(): GoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest](x: Self) {
    
    inline def setInlineSource(value: GoogleCloudDatacatalogV1beta1InlineSource): Self = StObject.set(x, "inlineSource", value.asInstanceOf[js.Any])
    
    inline def setInlineSourceUndefined: Self = StObject.set(x, "inlineSource", js.undefined)
  }
}
