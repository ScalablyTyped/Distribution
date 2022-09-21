package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ViewSpec extends StObject {
  
  /** Output only. The query that defines the table view. */
  var viewQuery: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1ViewSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1ViewSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ViewSpec]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1ViewSpec](x: Self) {
    
    inline def setViewQuery(value: String): Self = StObject.set(x, "viewQuery", value.asInstanceOf[js.Any])
    
    inline def setViewQueryUndefined: Self = StObject.set(x, "viewQuery", js.undefined)
  }
}
