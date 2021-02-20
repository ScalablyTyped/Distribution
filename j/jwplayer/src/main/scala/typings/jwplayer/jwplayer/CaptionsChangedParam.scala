package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionsChangedParam extends StObject {
  
  var currentTrack: Double = js.native
}
object CaptionsChangedParam {
  
  @scala.inline
  def apply(currentTrack: Double): CaptionsChangedParam = {
    val __obj = js.Dynamic.literal(currentTrack = currentTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionsChangedParam]
  }
  
  @scala.inline
  implicit class CaptionsChangedParamMutableBuilder[Self <: CaptionsChangedParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTrack(value: Double): Self = StObject.set(x, "currentTrack", value.asInstanceOf[js.Any])
  }
}
