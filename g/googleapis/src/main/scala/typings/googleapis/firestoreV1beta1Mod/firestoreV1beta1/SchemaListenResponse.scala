package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.Listen.
  */
@js.native
trait SchemaListenResponse extends js.Object {
  /**
    * A Document has changed.
    */
  var documentChange: js.UndefOr[SchemaDocumentChange] = js.native
  /**
    * A Document has been deleted.
    */
  var documentDelete: js.UndefOr[SchemaDocumentDelete] = js.native
  /**
    * A Document has been removed from a target (because it is no longer
    * relevant to that target).
    */
  var documentRemove: js.UndefOr[SchemaDocumentRemove] = js.native
  /**
    * A filter to apply to the set of documents previously returned for the
    * given target.  Returned when documents may have been removed from the
    * given target, but the exact documents are unknown.
    */
  var filter: js.UndefOr[SchemaExistenceFilter] = js.native
  /**
    * Targets have changed.
    */
  var targetChange: js.UndefOr[SchemaTargetChange] = js.native
}

object SchemaListenResponse {
  @scala.inline
  def apply(
    documentChange: SchemaDocumentChange = null,
    documentDelete: SchemaDocumentDelete = null,
    documentRemove: SchemaDocumentRemove = null,
    filter: SchemaExistenceFilter = null,
    targetChange: SchemaTargetChange = null
  ): SchemaListenResponse = {
    val __obj = js.Dynamic.literal()
    if (documentChange != null) __obj.updateDynamic("documentChange")(documentChange.asInstanceOf[js.Any])
    if (documentDelete != null) __obj.updateDynamic("documentDelete")(documentDelete.asInstanceOf[js.Any])
    if (documentRemove != null) __obj.updateDynamic("documentRemove")(documentRemove.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (targetChange != null) __obj.updateDynamic("targetChange")(targetChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListenResponse]
  }
}

