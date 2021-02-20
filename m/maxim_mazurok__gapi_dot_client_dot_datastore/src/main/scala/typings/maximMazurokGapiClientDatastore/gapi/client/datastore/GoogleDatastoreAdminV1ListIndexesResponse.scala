package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDatastoreAdminV1ListIndexesResponse extends StObject {
  
  /** The indexes. */
  var indexes: js.UndefOr[js.Array[GoogleDatastoreAdminV1Index]] = js.native
  
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleDatastoreAdminV1ListIndexesResponse {
  
  @scala.inline
  def apply(): GoogleDatastoreAdminV1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1ListIndexesResponse]
  }
  
  @scala.inline
  implicit class GoogleDatastoreAdminV1ListIndexesResponseMutableBuilder[Self <: GoogleDatastoreAdminV1ListIndexesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexes(value: js.Array[GoogleDatastoreAdminV1Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    @scala.inline
    def setIndexesVarargs(value: GoogleDatastoreAdminV1Index*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
