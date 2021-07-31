package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a resource that received a comment.
  */
trait SchemaActivityContentDetailsComment extends StObject {
  
  /**
    * The resourceId object contains information that identifies the resource
    * associated with the comment.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.undefined
}
object SchemaActivityContentDetailsComment {
  
  @scala.inline
  def apply(): SchemaActivityContentDetailsComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsComment]
  }
  
  @scala.inline
  implicit class SchemaActivityContentDetailsCommentMutableBuilder[Self <: SchemaActivityContentDetailsComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: SchemaResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
