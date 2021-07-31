package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A change about comments on an object.
  */
trait SchemaComment extends StObject {
  
  /**
    * A change on an assignment.
    */
  var assignment: js.UndefOr[SchemaAssignment] = js.undefined
  
  /**
    * Users who are mentioned in this comment.
    */
  var mentionedUsers: js.UndefOr[js.Array[SchemaUser]] = js.undefined
  
  /**
    * A change on a regular posted comment.
    */
  var post: js.UndefOr[SchemaPost] = js.undefined
  
  /**
    * A change on a suggestion.
    */
  var suggestion: js.UndefOr[SchemaSuggestion] = js.undefined
}
object SchemaComment {
  
  @scala.inline
  def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  @scala.inline
  implicit class SchemaCommentMutableBuilder[Self <: SchemaComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignment(value: SchemaAssignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentUndefined: Self = StObject.set(x, "assignment", js.undefined)
    
    @scala.inline
    def setMentionedUsers(value: js.Array[SchemaUser]): Self = StObject.set(x, "mentionedUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionedUsersUndefined: Self = StObject.set(x, "mentionedUsers", js.undefined)
    
    @scala.inline
    def setMentionedUsersVarargs(value: SchemaUser*): Self = StObject.set(x, "mentionedUsers", js.Array(value :_*))
    
    @scala.inline
    def setPost(value: SchemaPost): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    @scala.inline
    def setSuggestion(value: SchemaSuggestion): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
  }
}
