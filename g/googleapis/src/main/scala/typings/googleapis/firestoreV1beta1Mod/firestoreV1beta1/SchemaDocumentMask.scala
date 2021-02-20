package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of field paths on a document. Used to restrict a get or update
  * operation on a document to a subset of its fields. This is different from
  * standard field masks, as this is always scoped to a Document, and takes in
  * account the dynamic nature of Value.
  */
@js.native
trait SchemaDocumentMask extends StObject {
  
  /**
    * The list of field paths in the mask. See Document.fields for a field path
    * syntax reference.
    */
  var fieldPaths: js.UndefOr[js.Array[String]] = js.native
}
object SchemaDocumentMask {
  
  @scala.inline
  def apply(): SchemaDocumentMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentMask]
  }
  
  @scala.inline
  implicit class SchemaDocumentMaskMutableBuilder[Self <: SchemaDocumentMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldPaths(value: js.Array[String]): Self = StObject.set(x, "fieldPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldPathsUndefined: Self = StObject.set(x, "fieldPaths", js.undefined)
    
    @scala.inline
    def setFieldPathsVarargs(value: String*): Self = StObject.set(x, "fieldPaths", js.Array(value :_*))
  }
}
