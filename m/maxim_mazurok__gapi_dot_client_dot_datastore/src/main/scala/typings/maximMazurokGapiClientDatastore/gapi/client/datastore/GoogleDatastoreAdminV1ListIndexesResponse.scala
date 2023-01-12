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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleDatastoreAdminV1ListIndexesResponse] (val x: Self) extends AnyVal {
    
    inline def setIndexes(value: js.Array[GoogleDatastoreAdminV1Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: GoogleDatastoreAdminV1Index*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
