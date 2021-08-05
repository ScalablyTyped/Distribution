package typings.lyricist.mod

import typings.lyricist.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvatarConfig extends StObject {
  
  var bounding_box: Height
  
  var url: String
}
object AvatarConfig {
  
  inline def apply(bounding_box: Height, url: String): AvatarConfig = {
    val __obj = js.Dynamic.literal(bounding_box = bounding_box.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarConfig]
  }
  
  extension [Self <: AvatarConfig](x: Self) {
    
    inline def setBounding_box(value: Height): Self = StObject.set(x, "bounding_box", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
