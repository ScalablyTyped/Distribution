package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDocumentsTarget extends StObject {
  
  /**
    * The names of the documents to retrieve. In the format: `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`. The request will fail if any of the document is not a child resource of the given `database`. Duplicate names will be elided.
    */
  var documents: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaDocumentsTarget {
  
  inline def apply(): SchemaDocumentsTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentsTarget]
  }
  
  extension [Self <: SchemaDocumentsTarget](x: Self) {
    
    inline def setDocuments(value: js.Array[String]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsNull: Self = StObject.set(x, "documents", null)
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: String*): Self = StObject.set(x, "documents", js.Array(value*))
  }
}
