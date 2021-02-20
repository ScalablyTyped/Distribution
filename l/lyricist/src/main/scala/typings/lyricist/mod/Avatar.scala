package typings.lyricist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Avatar extends StObject {
  
  var medium: AvatarConfig = js.native
  
  var small: AvatarConfig = js.native
  
  var thumb: AvatarConfig = js.native
  
  var tiny: AvatarConfig = js.native
}
object Avatar {
  
  @scala.inline
  def apply(medium: AvatarConfig, small: AvatarConfig, thumb: AvatarConfig, tiny: AvatarConfig): Avatar = {
    val __obj = js.Dynamic.literal(medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
  
  @scala.inline
  implicit class AvatarMutableBuilder[Self <: Avatar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedium(value: AvatarConfig): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall(value: AvatarConfig): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb(value: AvatarConfig): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiny(value: AvatarConfig): Self = StObject.set(x, "tiny", value.asInstanceOf[js.Any])
  }
}
