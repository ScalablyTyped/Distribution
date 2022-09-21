package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesDocumentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The list of field paths in the mask. See Document.fields for a field path syntax reference.
    */
  @JSName("mask.fieldPaths")
  var maskDotfieldPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The resource name of the Document to get. In the format: `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Reads the version of the document at the given time. This may not be older than 270 seconds.
    */
  var readTime: js.UndefOr[String] = js.undefined
  
  /**
    * Reads the document in a transaction.
    */
  var transaction: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatabasesDocumentsGet {
  
  inline def apply(): ParamsResourceProjectsDatabasesDocumentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesDocumentsGet]
  }
  
  extension [Self <: ParamsResourceProjectsDatabasesDocumentsGet](x: Self) {
    
    inline def setMaskDotfieldPaths(value: js.Array[String]): Self = StObject.set(x, "mask.fieldPaths", value.asInstanceOf[js.Any])
    
    inline def setMaskDotfieldPathsUndefined: Self = StObject.set(x, "mask.fieldPaths", js.undefined)
    
    inline def setMaskDotfieldPathsVarargs(value: String*): Self = StObject.set(x, "mask.fieldPaths", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
