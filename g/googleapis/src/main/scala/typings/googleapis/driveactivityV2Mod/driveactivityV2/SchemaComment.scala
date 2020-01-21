package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A change about comments on an object.
  */
@js.native
trait SchemaComment extends js.Object {
  /**
    * A change on an assignment.
    */
  var assignment: js.UndefOr[SchemaAssignment] = js.native
  /**
    * Users who are mentioned in this comment.
    */
  var mentionedUsers: js.UndefOr[js.Array[SchemaUser]] = js.native
  /**
    * A change on a regular posted comment.
    */
  var post: js.UndefOr[SchemaPost] = js.native
  /**
    * A change on a suggestion.
    */
  var suggestion: js.UndefOr[SchemaSuggestion] = js.native
}

object SchemaComment {
  @scala.inline
  def apply(
    assignment: SchemaAssignment = null,
    mentionedUsers: js.Array[SchemaUser] = null,
    post: SchemaPost = null,
    suggestion: SchemaSuggestion = null
  ): SchemaComment = {
    val __obj = js.Dynamic.literal()
    if (assignment != null) __obj.updateDynamic("assignment")(assignment.asInstanceOf[js.Any])
    if (mentionedUsers != null) __obj.updateDynamic("mentionedUsers")(mentionedUsers.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (suggestion != null) __obj.updateDynamic("suggestion")(suggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaComment]
  }
}

