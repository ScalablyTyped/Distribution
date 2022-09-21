package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFileComment extends StObject {
  
  /**
    * The comment in the discussion thread. This identifier is an opaque string compatible with the Drive API; see https://developers.google.com/drive/v3/reference/comments/get
    */
  var legacyCommentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The discussion thread to which the comment was added. This identifier is an opaque string compatible with the Drive API and references the first comment in a discussion; see https://developers.google.com/drive/v3/reference/comments/get
    */
  var legacyDiscussionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The link to the discussion thread containing this comment, for example, `https://docs.google.com/DOCUMENT_ID/edit?disco=THREAD_ID`.
    */
  var linkToDiscussion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Drive item containing this comment.
    */
  var parent: js.UndefOr[SchemaDriveItem] = js.undefined
}
object SchemaFileComment {
  
  inline def apply(): SchemaFileComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileComment]
  }
  
  extension [Self <: SchemaFileComment](x: Self) {
    
    inline def setLegacyCommentId(value: String): Self = StObject.set(x, "legacyCommentId", value.asInstanceOf[js.Any])
    
    inline def setLegacyCommentIdNull: Self = StObject.set(x, "legacyCommentId", null)
    
    inline def setLegacyCommentIdUndefined: Self = StObject.set(x, "legacyCommentId", js.undefined)
    
    inline def setLegacyDiscussionId(value: String): Self = StObject.set(x, "legacyDiscussionId", value.asInstanceOf[js.Any])
    
    inline def setLegacyDiscussionIdNull: Self = StObject.set(x, "legacyDiscussionId", null)
    
    inline def setLegacyDiscussionIdUndefined: Self = StObject.set(x, "legacyDiscussionId", js.undefined)
    
    inline def setLinkToDiscussion(value: String): Self = StObject.set(x, "linkToDiscussion", value.asInstanceOf[js.Any])
    
    inline def setLinkToDiscussionNull: Self = StObject.set(x, "linkToDiscussion", null)
    
    inline def setLinkToDiscussionUndefined: Self = StObject.set(x, "linkToDiscussion", js.undefined)
    
    inline def setParent(value: SchemaDriveItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
