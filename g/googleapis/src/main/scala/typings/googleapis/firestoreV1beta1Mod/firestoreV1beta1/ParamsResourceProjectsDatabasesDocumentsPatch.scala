package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesDocumentsPatch
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
    * The list of field paths in the mask. See Document.fields for a field path syntax reference.
    */
  @JSName("mask.fieldPaths")
  var maskDotfieldPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The resource name of the document, for example `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDocument] = js.undefined
  
  /**
    * The list of field paths in the mask. See Document.fields for a field path syntax reference.
    */
  @JSName("updateMask.fieldPaths")
  var updateMaskDotfieldPaths: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceProjectsDatabasesDocumentsPatch {
  
  inline def apply(): ParamsResourceProjectsDatabasesDocumentsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesDocumentsPatch]
  }
  
  extension [Self <: ParamsResourceProjectsDatabasesDocumentsPatch](x: Self) {
    
    inline def setCurrentDocumentDotexists(value: Boolean): Self = StObject.set(x, "currentDocument.exists", value.asInstanceOf[js.Any])
    
    inline def setCurrentDocumentDotexistsUndefined: Self = StObject.set(x, "currentDocument.exists", js.undefined)
    
    inline def setCurrentDocumentDotupdateTime(value: String): Self = StObject.set(x, "currentDocument.updateTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentDocumentDotupdateTimeUndefined: Self = StObject.set(x, "currentDocument.updateTime", js.undefined)
    
    inline def setMaskDotfieldPaths(value: js.Array[String]): Self = StObject.set(x, "mask.fieldPaths", value.asInstanceOf[js.Any])
    
    inline def setMaskDotfieldPathsUndefined: Self = StObject.set(x, "mask.fieldPaths", js.undefined)
    
    inline def setMaskDotfieldPathsVarargs(value: String*): Self = StObject.set(x, "mask.fieldPaths", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaDocument): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMaskDotfieldPaths(value: js.Array[String]): Self = StObject.set(x, "updateMask.fieldPaths", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskDotfieldPathsUndefined: Self = StObject.set(x, "updateMask.fieldPaths", js.undefined)
    
    inline def setUpdateMaskDotfieldPathsVarargs(value: String*): Self = StObject.set(x, "updateMask.fieldPaths", js.Array(value*))
  }
}
