package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDocumentMask extends StObject {
  
  /**
    * The list of field paths in the mask. See Document.fields for a field path syntax reference.
    */
  var fieldPaths: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaDocumentMask {
  
  inline def apply(): SchemaDocumentMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentMask]
  }
  
  extension [Self <: SchemaDocumentMask](x: Self) {
    
    inline def setFieldPaths(value: js.Array[String]): Self = StObject.set(x, "fieldPaths", value.asInstanceOf[js.Any])
    
    inline def setFieldPathsNull: Self = StObject.set(x, "fieldPaths", null)
    
    inline def setFieldPathsUndefined: Self = StObject.set(x, "fieldPaths", js.undefined)
    
    inline def setFieldPathsVarargs(value: String*): Self = StObject.set(x, "fieldPaths", js.Array(value*))
  }
}
