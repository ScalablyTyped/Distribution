package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Document has been deleted.  May be the result of multiple writes,
  * including updates, the last of which deleted the Document.  Multiple
  * DocumentDelete messages may be returned for the same logical delete, if
  * multiple targets are affected.
  */
@js.native
trait SchemaDocumentDelete extends js.Object {
  /**
    * The resource name of the Document that was deleted.
    */
  var document: js.UndefOr[String] = js.native
  /**
    * The read timestamp at which the delete was observed.  Greater or equal to
    * the `commit_time` of the delete.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * A set of target IDs for targets that previously matched this entity.
    */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaDocumentDelete {
  @scala.inline
  def apply(): SchemaDocumentDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentDelete]
  }
  @scala.inline
  implicit class SchemaDocumentDeleteOps[Self <: SchemaDocumentDelete] (val x: Self) extends AnyVal {
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

