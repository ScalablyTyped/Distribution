package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1ListIndexesResponse extends StObject {
  
  /**
    * The requested indexes.
    */
  var indexes: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1Index]] = js.undefined
  
  /**
    * A page token that may be used to request another page of results. If blank, this is the last page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirestoreAdminV1ListIndexesResponse {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1ListIndexesResponse]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1ListIndexesResponse](x: Self) {
    
    inline def setIndexes(value: js.Array[SchemaGoogleFirestoreAdminV1Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: SchemaGoogleFirestoreAdminV1Index*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
