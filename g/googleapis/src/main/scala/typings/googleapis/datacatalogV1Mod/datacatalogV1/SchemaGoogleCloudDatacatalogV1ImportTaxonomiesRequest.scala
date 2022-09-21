package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ImportTaxonomiesRequest extends StObject {
  
  /**
    * Cross-regional source taxonomy to import.
    */
  var crossRegionalSource: js.UndefOr[SchemaGoogleCloudDatacatalogV1CrossRegionalSource] = js.undefined
  
  /**
    * Inline source taxonomy to import.
    */
  var inlineSource: js.UndefOr[SchemaGoogleCloudDatacatalogV1InlineSource] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ImportTaxonomiesRequest {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ImportTaxonomiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ImportTaxonomiesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ImportTaxonomiesRequest](x: Self) {
    
    inline def setCrossRegionalSource(value: SchemaGoogleCloudDatacatalogV1CrossRegionalSource): Self = StObject.set(x, "crossRegionalSource", value.asInstanceOf[js.Any])
    
    inline def setCrossRegionalSourceUndefined: Self = StObject.set(x, "crossRegionalSource", js.undefined)
    
    inline def setInlineSource(value: SchemaGoogleCloudDatacatalogV1InlineSource): Self = StObject.set(x, "inlineSource", value.asInstanceOf[js.Any])
    
    inline def setInlineSourceUndefined: Self = StObject.set(x, "inlineSource", js.undefined)
  }
}
