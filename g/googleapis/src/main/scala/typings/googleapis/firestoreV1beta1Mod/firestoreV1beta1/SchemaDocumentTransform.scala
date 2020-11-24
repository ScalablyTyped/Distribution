package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A transformation of a document.
  */
@js.native
trait SchemaDocumentTransform extends js.Object {
  
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
  implicit class SchemaDocumentTransformOps[Self <: SchemaDocumentTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocument(value: String): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    
    @scala.inline
    def setFieldTransformsVarargs(value: SchemaFieldTransform*): Self = this.set("fieldTransforms", js.Array(value :_*))
    
    @scala.inline
    def setFieldTransforms(value: js.Array[SchemaFieldTransform]): Self = this.set("fieldTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldTransforms: Self = this.set("fieldTransforms", js.undefined)
  }
}
