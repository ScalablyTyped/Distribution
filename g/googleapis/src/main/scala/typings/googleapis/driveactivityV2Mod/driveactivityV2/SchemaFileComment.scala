package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A comment on a file.
  */
trait SchemaFileComment extends StObject {
  
  /**
    * The comment in the discussion thread. This identifier is an opaque string
    * compatible with the Drive API; see
    * https://developers.google.com/drive/v3/reference/comments/get
    */
  var legacyCommentId: js.UndefOr[String] = js.undefined
  
  /**
    * The discussion thread to which the comment was added. This identifier is
    * an opaque string compatible with the Drive API and references the first
    * comment in a discussion; see
    * https://developers.google.com/drive/v3/reference/comments/get
    */
  var legacyDiscussionId: js.UndefOr[String] = js.undefined
  
  /**
    * The link to the discussion thread containing this comment, for example,
    * &quot;https://docs.google.com/DOCUMENT_ID/edit?disco=THREAD_ID&quot;.
    */
  var linkToDiscussion: js.UndefOr[String] = js.undefined
  
  /**
    * The Drive item containing this comment.
    */
  var parent: js.UndefOr[SchemaDriveItem] = js.undefined
}
object SchemaFileComment {
  
  @scala.inline
  def apply(): SchemaFileComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileComment]
  }
  
  @scala.inline
  implicit class SchemaFileCommentMutableBuilder[Self <: SchemaFileComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegacyCommentId(value: String): Self = StObject.set(x, "legacyCommentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyCommentIdUndefined: Self = StObject.set(x, "legacyCommentId", js.undefined)
    
    @scala.inline
    def setLegacyDiscussionId(value: String): Self = StObject.set(x, "legacyDiscussionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyDiscussionIdUndefined: Self = StObject.set(x, "legacyDiscussionId", js.undefined)
    
    @scala.inline
    def setLinkToDiscussion(value: String): Self = StObject.set(x, "linkToDiscussion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkToDiscussionUndefined: Self = StObject.set(x, "linkToDiscussion", js.undefined)
    
    @scala.inline
    def setParent(value: SchemaDriveItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
