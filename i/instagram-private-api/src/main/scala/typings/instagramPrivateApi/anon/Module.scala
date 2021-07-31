package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module extends StObject {
  
  var mediaId: String
  
  var module: js.UndefOr[String] = js.undefined
  
  var replyToCommentId: js.UndefOr[String] = js.undefined
  
  var text: String
}
object Module {
  
  @scala.inline
  def apply(mediaId: String, text: String): Module = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  @scala.inline
  implicit class ModuleMutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    @scala.inline
    def setReplyToCommentId(value: String): Self = StObject.set(x, "replyToCommentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToCommentIdUndefined: Self = StObject.set(x, "replyToCommentId", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
