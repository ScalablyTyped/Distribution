package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDocumentsResponse extends StObject {
  
  /**
    * The Documents found.
    */
  var documents: js.UndefOr[js.Array[SchemaDocument]] = js.undefined
  
  /**
    * The next page token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDocumentsResponse {
  
  inline def apply(): SchemaListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDocumentsResponse]
  }
  
  extension [Self <: SchemaListDocumentsResponse](x: Self) {
    
    inline def setDocuments(value: js.Array[SchemaDocument]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: SchemaDocument*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
