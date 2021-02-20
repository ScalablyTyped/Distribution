package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for FirestoreAdmin.ListIndexes.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse extends StObject {
  
  /**
    * The indexes.
    */
  var indexes: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1beta1Index]] = js.native
  
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta1ListIndexesResponseMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexes(value: js.Array[SchemaGoogleFirestoreAdminV1beta1Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    @scala.inline
    def setIndexesVarargs(value: SchemaGoogleFirestoreAdminV1beta1Index*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
