package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1DataplexFilesetSpec extends StObject {
  
  /** Common Dataplex fields. */
  var dataplexSpec: js.UndefOr[GoogleCloudDatacatalogV1DataplexSpec] = js.undefined
}
object GoogleCloudDatacatalogV1DataplexFilesetSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1DataplexFilesetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1DataplexFilesetSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1DataplexFilesetSpec] (val x: Self) extends AnyVal {
    
    inline def setDataplexSpec(value: GoogleCloudDatacatalogV1DataplexSpec): Self = StObject.set(x, "dataplexSpec", value.asInstanceOf[js.Any])
    
    inline def setDataplexSpecUndefined: Self = StObject.set(x, "dataplexSpec", js.undefined)
  }
}
