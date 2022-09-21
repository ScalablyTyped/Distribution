package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ReplaceTaxonomyRequest extends StObject {
  
  /**
    * Required. Taxonomy to update along with its child policy tags.
    */
  var serializedTaxonomy: js.UndefOr[SchemaGoogleCloudDatacatalogV1SerializedTaxonomy] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ReplaceTaxonomyRequest {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ReplaceTaxonomyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ReplaceTaxonomyRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ReplaceTaxonomyRequest](x: Self) {
    
    inline def setSerializedTaxonomy(value: SchemaGoogleCloudDatacatalogV1SerializedTaxonomy): Self = StObject.set(x, "serializedTaxonomy", value.asInstanceOf[js.Any])
    
    inline def setSerializedTaxonomyUndefined: Self = StObject.set(x, "serializedTaxonomy", js.undefined)
  }
}
