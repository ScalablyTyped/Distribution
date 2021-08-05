package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var message: js.UndefOr[String] = js.undefined
  
  var previewHeight: js.UndefOr[Double | String] = js.undefined
  
  var previewWidth: js.UndefOr[Double | String] = js.undefined
}
object Message {
  
  inline def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPreviewHeight(value: Double | String): Self = StObject.set(x, "previewHeight", value.asInstanceOf[js.Any])
    
    inline def setPreviewHeightUndefined: Self = StObject.set(x, "previewHeight", js.undefined)
    
    inline def setPreviewWidth(value: Double | String): Self = StObject.set(x, "previewWidth", value.asInstanceOf[js.Any])
    
    inline def setPreviewWidthUndefined: Self = StObject.set(x, "previewWidth", js.undefined)
  }
}
