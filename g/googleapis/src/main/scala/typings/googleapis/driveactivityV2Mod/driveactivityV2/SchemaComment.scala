package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  @scala.inline
  implicit class SchemaCommentOps[Self <: SchemaComment] (val x: Self) extends AnyVal {
    
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
    def setAssignment(value: SchemaAssignment): Self = this.set("assignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignment: Self = this.set("assignment", js.undefined)
    
    @scala.inline
    def setMentionedUsersVarargs(value: SchemaUser*): Self = this.set("mentionedUsers", js.Array(value :_*))
    
    @scala.inline
    def setMentionedUsers(value: js.Array[SchemaUser]): Self = this.set("mentionedUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMentionedUsers: Self = this.set("mentionedUsers", js.undefined)
    
    @scala.inline
    def setPost(value: SchemaPost): Self = this.set("post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setSuggestion(value: SchemaSuggestion): Self = this.set("suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestion: Self = this.set("suggestion", js.undefined)
  }
}
