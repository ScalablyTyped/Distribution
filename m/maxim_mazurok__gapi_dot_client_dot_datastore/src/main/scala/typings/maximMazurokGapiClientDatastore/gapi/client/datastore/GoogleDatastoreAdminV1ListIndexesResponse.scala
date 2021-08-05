package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDatastoreAdminV1ListIndexesResponse extends StObject {
  
  /** The indexes. */
  var indexes: js.UndefOr[js.Array[GoogleDatastoreAdminV1Index]] = js.undefined
  
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleDatastoreAdminV1ListIndexesResponse {
  
  inline def apply(): GoogleDatastoreAdminV1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1ListIndexesResponse]
  }
  
  extension [Self <: GoogleDatastoreAdminV1ListIndexesResponse](x: Self) {
    
    inline def setIndexes(value: js.Array[GoogleDatastoreAdminV1Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: GoogleDatastoreAdminV1Index*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
