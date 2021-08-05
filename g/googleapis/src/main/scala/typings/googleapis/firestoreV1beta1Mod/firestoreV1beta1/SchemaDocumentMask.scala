package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of field paths on a document. Used to restrict a get or update
  * operation on a document to a subset of its fields. This is different from
  * standard field masks, as this is always scoped to a Document, and takes in
  * account the dynamic nature of Value.
  */
trait SchemaDocumentMask extends StObject {
  
  /**
    * The list of field paths in the mask. See Document.fields for a field path
    * syntax reference.
    */
  var fieldPaths: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaDocumentMask {
  
  inline def apply(): SchemaDocumentMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentMask]
  }
  
  extension [Self <: SchemaDocumentMask](x: Self) {
    
    inline def setFieldPaths(value: js.Array[String]): Self = StObject.set(x, "fieldPaths", value.asInstanceOf[js.Any])
    
    inline def setFieldPathsUndefined: Self = StObject.set(x, "fieldPaths", js.undefined)
    
    inline def setFieldPathsVarargs(value: String*): Self = StObject.set(x, "fieldPaths", js.Array(value :_*))
  }
}
