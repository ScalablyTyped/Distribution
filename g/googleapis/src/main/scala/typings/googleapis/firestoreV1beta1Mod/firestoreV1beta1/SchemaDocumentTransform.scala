package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(document: String = null, fieldTransforms: js.Array[SchemaFieldTransform] = null): SchemaDocumentTransform = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (fieldTransforms != null) __obj.updateDynamic("fieldTransforms")(fieldTransforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDocumentTransform]
  }
}

