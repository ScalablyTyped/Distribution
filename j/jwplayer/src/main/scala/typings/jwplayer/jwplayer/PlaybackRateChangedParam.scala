package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackRateChangedParam extends StObject {
  
  var playbackRate: Double
  
  var position: Double
}
object PlaybackRateChangedParam {
  
  inline def apply(playbackRate: Double, position: Double): PlaybackRateChangedParam = {
    val __obj = js.Dynamic.literal(playbackRate = playbackRate.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRateChangedParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaybackRateChangedParam] (val x: Self) extends AnyVal {
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
