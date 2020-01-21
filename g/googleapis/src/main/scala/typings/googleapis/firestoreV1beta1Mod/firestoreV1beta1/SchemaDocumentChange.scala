package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Document has changed.  May be the result of multiple writes, including
  * deletes, that ultimately resulted in a new value for the Document. Multiple
  * DocumentChange messages may be returned for the same logical change, if
  * multiple targets are affected.
  */
@js.native
trait SchemaDocumentChange extends js.Object {
  /**
    * The new state of the Document.  If `mask` is set, contains only fields
    * that were updated or added.
    */
  var document: js.UndefOr[SchemaDocument] = js.native
  /**
    * A set of target IDs for targets that no longer match this document.
    */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A set of target IDs of targets that match this document.
    */
  var targetIds: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaDocumentChange {
  @scala.inline
  def apply(
    document: SchemaDocument = null,
    removedTargetIds: js.Array[Double] = null,
    targetIds: js.Array[Double] = null
  ): SchemaDocumentChange = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (removedTargetIds != null) __obj.updateDynamic("removedTargetIds")(removedTargetIds.asInstanceOf[js.Any])
    if (targetIds != null) __obj.updateDynamic("targetIds")(targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDocumentChange]
  }
}

