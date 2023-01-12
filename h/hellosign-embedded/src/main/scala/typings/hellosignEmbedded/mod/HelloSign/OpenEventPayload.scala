package typings.hellosignEmbedded.mod.HelloSign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenEventPayload extends StObject {
  
  var iFrameUrl: String
  
  var url: String
}
object OpenEventPayload {
  
  inline def apply(iFrameUrl: String, url: String): OpenEventPayload = {
    val __obj = js.Dynamic.literal(iFrameUrl = iFrameUrl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenEventPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenEventPayload] (val x: Self) extends AnyVal {
    
    inline def setIFrameUrl(value: String): Self = StObject.set(x, "iFrameUrl", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
