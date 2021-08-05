package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A target specified by a query.
  */
trait SchemaQueryTarget extends StObject {
  
  /**
    * The parent resource name. In the format:
    * `projects/{project_id}/databases/{database_id}/documents` or
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * For example: `projects/my-project/databases/my-database/documents` or
    * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * A structured query.
    */
  var structuredQuery: js.UndefOr[SchemaStructuredQuery] = js.undefined
}
object SchemaQueryTarget {
  
  inline def apply(): SchemaQueryTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryTarget]
  }
  
  extension [Self <: SchemaQueryTarget](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setStructuredQuery(value: SchemaStructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
    
    inline def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
  }
}
