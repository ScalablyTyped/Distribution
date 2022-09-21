package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesDocumentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * When set to `true`, the target document must exist. When set to `false`, the target document must not exist.
    */
  @JSName("currentDocument.exists")
  var currentDocumentDotexists: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set, the target document must exist and have been last updated at that time. Timestamp must be microsecond aligned.
    */
  @JSName("currentDocument.updateTime")
  var currentDocumentDotupdateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the Document to delete. In the format: `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatabasesDocumentsDelete {
  
  inline def apply(): ParamsResourceProjectsDatabasesDocumentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesDocumentsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsDatabasesDocumentsDelete](x: Self) {
    
    inline def setCurrentDocumentDotexists(value: Boolean): Self = StObject.set(x, "currentDocument.exists", value.asInstanceOf[js.Any])
    
    inline def setCurrentDocumentDotexistsUndefined: Self = StObject.set(x, "currentDocument.exists", js.undefined)
    
    inline def setCurrentDocumentDotupdateTime(value: String): Self = StObject.set(x, "currentDocument.updateTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentDocumentDotupdateTimeUndefined: Self = StObject.set(x, "currentDocument.updateTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
