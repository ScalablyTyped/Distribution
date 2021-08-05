package typings.lyricist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatar extends StObject {
  
  var medium: AvatarConfig
  
  var small: AvatarConfig
  
  var thumb: AvatarConfig
  
  var tiny: AvatarConfig
}
object Avatar {
  
  inline def apply(medium: AvatarConfig, small: AvatarConfig, thumb: AvatarConfig, tiny: AvatarConfig): Avatar = {
    val __obj = js.Dynamic.literal(medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
  
  extension [Self <: Avatar](x: Self) {
    
    inline def setMedium(value: AvatarConfig): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: AvatarConfig): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setThumb(value: AvatarConfig): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setTiny(value: AvatarConfig): Self = StObject.set(x, "tiny", value.asInstanceOf[js.Any])
  }
}
