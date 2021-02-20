package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
  var message: js.UndefOr[String] = js.native
  
  var previewHeight: js.UndefOr[Double | String] = js.native
  
  var previewWidth: js.UndefOr[Double | String] = js.native
}
object Message {
  
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setPreviewHeight(value: Double | String): Self = StObject.set(x, "previewHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewHeightUndefined: Self = StObject.set(x, "previewHeight", js.undefined)
    
    @scala.inline
    def setPreviewWidth(value: Double | String): Self = StObject.set(x, "previewWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewWidthUndefined: Self = StObject.set(x, "previewWidth", js.undefined)
  }
}
