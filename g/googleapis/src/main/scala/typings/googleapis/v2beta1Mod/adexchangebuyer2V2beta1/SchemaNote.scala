package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A proposal may be associated to several notes.
  */
@js.native
trait SchemaNote extends js.Object {
  /**
    * The timestamp for when this note was created. @OutputOnly
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The role of the person (buyer/seller) creating the note. @OutputOnly
    */
  var creatorRole: js.UndefOr[String] = js.native
  /**
    * The actual note to attach. (max-length: 1024 unicode code units)  Note:
    * This field may be set only when creating the resource. Modifying this
    * field while updating the resource will result in an error.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * The unique ID for the note. @OutputOnly
    */
  var noteId: js.UndefOr[String] = js.native
  /**
    * The revision number of the proposal when the note is created. @OutputOnly
    */
  var proposalRevision: js.UndefOr[String] = js.native
}

object SchemaNote {
  @scala.inline
  def apply(
    createTime: String = null,
    creatorRole: String = null,
    note: String = null,
    noteId: String = null,
    proposalRevision: String = null
  ): SchemaNote = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (creatorRole != null) __obj.updateDynamic("creatorRole")(creatorRole.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (noteId != null) __obj.updateDynamic("noteId")(noteId.asInstanceOf[js.Any])
    if (proposalRevision != null) __obj.updateDynamic("proposalRevision")(proposalRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNote]
  }
}

