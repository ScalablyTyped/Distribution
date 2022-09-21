package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse extends StObject {
  
  /**
    * The indexes.
    */
  var indexes: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1beta1Index]] = js.undefined
  
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1beta1ListIndexesResponse](x: Self) {
    
    inline def setIndexes(value: js.Array[SchemaGoogleFirestoreAdminV1beta1Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: SchemaGoogleFirestoreAdminV1beta1Index*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
