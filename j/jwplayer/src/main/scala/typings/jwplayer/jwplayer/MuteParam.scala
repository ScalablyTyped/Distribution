package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MuteParam extends StObject {
  
  var mute: Boolean = js.native
}
object MuteParam {
  
  @scala.inline
  def apply(mute: Boolean): MuteParam = {
    val __obj = js.Dynamic.literal(mute = mute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuteParam]
  }
  
  @scala.inline
  implicit class MuteParamMutableBuilder[Self <: MuteParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
  }
}
