package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Document has been removed from the view of the targets.  Sent if the
  * document is no longer relevant to a target and is out of view. Can be sent
  * instead of a DocumentDelete or a DocumentChange if the server can not send
  * the new value of the document.  Multiple DocumentRemove messages may be
  * returned for the same logical write or delete, if multiple targets are
  * affected.
  */
@js.native
trait SchemaDocumentRemove extends js.Object {
  /**
    * The resource name of the Document that has gone out of view.
    */
  var document: js.UndefOr[String] = js.native
  /**
    * The read timestamp at which the remove was observed.  Greater or equal to
    * the `commit_time` of the change/delete/remove.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * A set of target IDs for targets that previously matched this document.
    */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaDocumentRemove {
  @scala.inline
  def apply(document: String = null, readTime: String = null, removedTargetIds: js.Array[Double] = null): SchemaDocumentRemove = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (removedTargetIds != null) __obj.updateDynamic("removedTargetIds")(removedTargetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDocumentRemove]
  }
}

