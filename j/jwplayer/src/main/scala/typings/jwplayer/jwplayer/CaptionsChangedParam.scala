package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionsChangedParam extends StObject {
  
  var currentTrack: Double
}
object CaptionsChangedParam {
  
  inline def apply(currentTrack: Double): CaptionsChangedParam = {
    val __obj = js.Dynamic.literal(currentTrack = currentTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionsChangedParam]
  }
  
  extension [Self <: CaptionsChangedParam](x: Self) {
    
    inline def setCurrentTrack(value: Double): Self = StObject.set(x, "currentTrack", value.asInstanceOf[js.Any])
  }
}
