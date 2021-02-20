package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeveloperComment extends StObject {
  
  /** The last time at which this comment was updated. */
  var lastModified: js.UndefOr[Timestamp] = js.native
  
  /** The content of the comment, i.e. reply body. */
  var text: js.UndefOr[String] = js.native
}
object DeveloperComment {
  
  @scala.inline
  def apply(): DeveloperComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperComment]
  }
  
  @scala.inline
  implicit class DeveloperCommentMutableBuilder[Self <: DeveloperComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastModified(value: Timestamp): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
