package typings.googleapis.firestoreV1Mod.firestoreV1

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
  def apply(): SchemaDocumentRemove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentRemove]
  }
  @scala.inline
  implicit class SchemaDocumentRemoveOps[Self <: SchemaDocumentRemove] (val x: Self) extends AnyVal {
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
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
    @scala.inline
    def setRemovedTargetIdsVarargs(value: Double*): Self = this.set("removedTargetIds", js.Array(value :_*))
    @scala.inline
    def setRemovedTargetIds(value: js.Array[Double]): Self = this.set("removedTargetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemovedTargetIds: Self = this.set("removedTargetIds", js.undefined)
  }
  
}

