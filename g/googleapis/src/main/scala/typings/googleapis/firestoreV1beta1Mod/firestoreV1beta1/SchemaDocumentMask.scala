package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of field paths on a document. Used to restrict a get or update
  * operation on a document to a subset of its fields. This is different from
  * standard field masks, as this is always scoped to a Document, and takes in
  * account the dynamic nature of Value.
  */
@js.native
trait SchemaDocumentMask extends js.Object {
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
  implicit class SchemaDocumentMaskOps[Self <: SchemaDocumentMask] (val x: Self) extends AnyVal {
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
    def setFieldPathsVarargs(value: String*): Self = this.set("fieldPaths", js.Array(value :_*))
    @scala.inline
    def setFieldPaths(value: js.Array[String]): Self = this.set("fieldPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldPaths: Self = this.set("fieldPaths", js.undefined)
  }
  
}

