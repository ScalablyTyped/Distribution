package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1InlineSource extends StObject {
  
  /**
    * Required. Taxonomies to import.
    */
  var taxonomies: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1SerializedTaxonomy]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1InlineSource {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1InlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1InlineSource]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1InlineSource](x: Self) {
    
    inline def setTaxonomies(value: js.Array[SchemaGoogleCloudDatacatalogV1SerializedTaxonomy]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    inline def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    inline def setTaxonomiesVarargs(value: SchemaGoogleCloudDatacatalogV1SerializedTaxonomy*): Self = StObject.set(x, "taxonomies", js.Array(value*))
  }
}
