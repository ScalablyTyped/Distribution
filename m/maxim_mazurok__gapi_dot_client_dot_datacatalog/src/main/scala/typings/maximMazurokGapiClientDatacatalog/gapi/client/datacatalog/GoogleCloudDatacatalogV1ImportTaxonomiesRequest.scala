package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ImportTaxonomiesRequest extends StObject {
  
  /** Cross-regional source taxonomy to import. */
  var crossRegionalSource: js.UndefOr[GoogleCloudDatacatalogV1CrossRegionalSource] = js.undefined
  
  /** Inline source taxonomy to import. */
  var inlineSource: js.UndefOr[GoogleCloudDatacatalogV1InlineSource] = js.undefined
}
object GoogleCloudDatacatalogV1ImportTaxonomiesRequest {
  
  inline def apply(): GoogleCloudDatacatalogV1ImportTaxonomiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ImportTaxonomiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1ImportTaxonomiesRequest] (val x: Self) extends AnyVal {
    
    inline def setCrossRegionalSource(value: GoogleCloudDatacatalogV1CrossRegionalSource): Self = StObject.set(x, "crossRegionalSource", value.asInstanceOf[js.Any])
    
    inline def setCrossRegionalSourceUndefined: Self = StObject.set(x, "crossRegionalSource", js.undefined)
    
    inline def setInlineSource(value: GoogleCloudDatacatalogV1InlineSource): Self = StObject.set(x, "inlineSource", value.asInstanceOf[js.Any])
    
    inline def setInlineSourceUndefined: Self = StObject.set(x, "inlineSource", js.undefined)
  }
}
