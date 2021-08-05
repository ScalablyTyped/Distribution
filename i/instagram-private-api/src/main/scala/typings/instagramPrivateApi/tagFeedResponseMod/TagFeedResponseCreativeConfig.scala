package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFeedResponseCreativeConfig extends StObject {
  
  var camera_facing: String
  
  var capture_type: String
  
  var should_render_try_it_on: Boolean
}
object TagFeedResponseCreativeConfig {
  
  inline def apply(camera_facing: String, capture_type: String, should_render_try_it_on: Boolean): TagFeedResponseCreativeConfig = {
    val __obj = js.Dynamic.literal(camera_facing = camera_facing.asInstanceOf[js.Any], capture_type = capture_type.asInstanceOf[js.Any], should_render_try_it_on = should_render_try_it_on.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseCreativeConfig]
  }
  
  extension [Self <: TagFeedResponseCreativeConfig](x: Self) {
    
    inline def setCamera_facing(value: String): Self = StObject.set(x, "camera_facing", value.asInstanceOf[js.Any])
    
    inline def setCapture_type(value: String): Self = StObject.set(x, "capture_type", value.asInstanceOf[js.Any])
    
    inline def setShould_render_try_it_on(value: Boolean): Self = StObject.set(x, "should_render_try_it_on", value.asInstanceOf[js.Any])
  }
}
