package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1FilesetSpec extends StObject {
  
  /**
    * Fields specific to a Dataplex fileset and present only in the Dataplex fileset entries.
    */
  var dataplexFileset: js.UndefOr[SchemaGoogleCloudDatacatalogV1DataplexFilesetSpec] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1FilesetSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1FilesetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1FilesetSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1FilesetSpec](x: Self) {
    
    inline def setDataplexFileset(value: SchemaGoogleCloudDatacatalogV1DataplexFilesetSpec): Self = StObject.set(x, "dataplexFileset", value.asInstanceOf[js.Any])
    
    inline def setDataplexFilesetUndefined: Self = StObject.set(x, "dataplexFileset", js.undefined)
  }
}
