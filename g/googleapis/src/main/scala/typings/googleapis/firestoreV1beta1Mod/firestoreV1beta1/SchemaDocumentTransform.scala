package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A transformation of a document.
  */
@js.native
trait SchemaDocumentTransform extends StObject {
  
  /**
    * The name of the document to transform.
    */
  var document: js.UndefOr[String] = js.native
  
  /**
    * The list of transformations to apply to the fields of the document, in
    * order. This must not be empty.
    */
  var fieldTransforms: js.UndefOr[js.Array[SchemaFieldTransform]] = js.native
}
object SchemaDocumentTransform {
  
  @scala.inline
  def apply(): SchemaDocumentTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentTransform]
  }
  
  @scala.inline
  implicit class SchemaDocumentTransformMutableBuilder[Self <: SchemaDocumentTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setFieldTransforms(value: js.Array[SchemaFieldTransform]): Self = StObject.set(x, "fieldTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTransformsUndefined: Self = StObject.set(x, "fieldTransforms", js.undefined)
    
    @scala.inline
    def setFieldTransformsVarargs(value: SchemaFieldTransform*): Self = StObject.set(x, "fieldTransforms", js.Array(value :_*))
  }
}
