package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1DataplexFilesetSpec extends StObject {
  
  /**
    * Common Dataplex fields.
    */
  var dataplexSpec: js.UndefOr[SchemaGoogleCloudDatacatalogV1DataplexSpec] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1DataplexFilesetSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1DataplexFilesetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1DataplexFilesetSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1DataplexFilesetSpec](x: Self) {
    
    inline def setDataplexSpec(value: SchemaGoogleCloudDatacatalogV1DataplexSpec): Self = StObject.set(x, "dataplexSpec", value.asInstanceOf[js.Any])
    
    inline def setDataplexSpecUndefined: Self = StObject.set(x, "dataplexSpec", js.undefined)
  }
}
