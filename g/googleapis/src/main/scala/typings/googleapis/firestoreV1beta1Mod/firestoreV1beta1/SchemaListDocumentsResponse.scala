package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for Firestore.ListDocuments.
  */
@js.native
trait SchemaListDocumentsResponse extends StObject {
  
  /**
    * The Documents found.
    */
  var documents: js.UndefOr[js.Array[SchemaDocument]] = js.native
  
  /**
    * The next page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListDocumentsResponse {
  
  @scala.inline
  def apply(): SchemaListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDocumentsResponse]
  }
  
  @scala.inline
  implicit class SchemaListDocumentsResponseMutableBuilder[Self <: SchemaListDocumentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocuments(value: js.Array[SchemaDocument]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    @scala.inline
    def setDocumentsVarargs(value: SchemaDocument*): Self = StObject.set(x, "documents", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
