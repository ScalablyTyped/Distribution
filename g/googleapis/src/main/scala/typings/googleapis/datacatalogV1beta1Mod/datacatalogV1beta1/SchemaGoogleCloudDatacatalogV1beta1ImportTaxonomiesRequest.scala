package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest extends StObject {
  
  /**
    * Inline source used for taxonomies to be imported.
    */
  var inlineSource: js.UndefOr[SchemaGoogleCloudDatacatalogV1beta1InlineSource] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest](x: Self) {
    
    inline def setInlineSource(value: SchemaGoogleCloudDatacatalogV1beta1InlineSource): Self = StObject.set(x, "inlineSource", value.asInstanceOf[js.Any])
    
    inline def setInlineSourceUndefined: Self = StObject.set(x, "inlineSource", js.undefined)
  }
}
