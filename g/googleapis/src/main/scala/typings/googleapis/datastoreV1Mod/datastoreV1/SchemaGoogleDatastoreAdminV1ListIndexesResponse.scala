package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for google.datastore.admin.v1.DatastoreAdmin.ListIndexes.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1ListIndexesResponse extends StObject {
  
  /**
    * The indexes.
    */
  var indexes: js.UndefOr[js.Array[SchemaGoogleDatastoreAdminV1Index]] = js.native
  
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGoogleDatastoreAdminV1ListIndexesResponse {
  
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1ListIndexesResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1ListIndexesResponseMutableBuilder[Self <: SchemaGoogleDatastoreAdminV1ListIndexesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexes(value: js.Array[SchemaGoogleDatastoreAdminV1Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    @scala.inline
    def setIndexesVarargs(value: SchemaGoogleDatastoreAdminV1Index*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
