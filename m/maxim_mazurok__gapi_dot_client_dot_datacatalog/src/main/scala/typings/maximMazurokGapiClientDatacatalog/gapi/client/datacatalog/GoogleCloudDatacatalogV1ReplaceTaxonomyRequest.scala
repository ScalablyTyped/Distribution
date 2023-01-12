package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ReplaceTaxonomyRequest extends StObject {
  
  /** Required. Taxonomy to update along with its child policy tags. */
  var serializedTaxonomy: js.UndefOr[GoogleCloudDatacatalogV1SerializedTaxonomy] = js.undefined
}
object GoogleCloudDatacatalogV1ReplaceTaxonomyRequest {
  
  inline def apply(): GoogleCloudDatacatalogV1ReplaceTaxonomyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ReplaceTaxonomyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1ReplaceTaxonomyRequest] (val x: Self) extends AnyVal {
    
    inline def setSerializedTaxonomy(value: GoogleCloudDatacatalogV1SerializedTaxonomy): Self = StObject.set(x, "serializedTaxonomy", value.asInstanceOf[js.Any])
    
    inline def setSerializedTaxonomyUndefined: Self = StObject.set(x, "serializedTaxonomy", js.undefined)
  }
}
