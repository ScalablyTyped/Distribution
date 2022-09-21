package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1CrossRegionalSource extends StObject {
  
  /**
    * Required. The resource name of the source taxonomy to import.
    */
  var taxonomy: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1CrossRegionalSource {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1CrossRegionalSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1CrossRegionalSource]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1CrossRegionalSource](x: Self) {
    
    inline def setTaxonomy(value: String): Self = StObject.set(x, "taxonomy", value.asInstanceOf[js.Any])
    
    inline def setTaxonomyNull: Self = StObject.set(x, "taxonomy", null)
    
    inline def setTaxonomyUndefined: Self = StObject.set(x, "taxonomy", js.undefined)
  }
}
