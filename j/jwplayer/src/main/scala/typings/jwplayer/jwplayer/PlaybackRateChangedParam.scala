package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackRateChangedParam extends StObject {
  
  var playbackRate: Double = js.native
  
  var position: Double = js.native
}
object PlaybackRateChangedParam {
  
  @scala.inline
  def apply(playbackRate: Double, position: Double): PlaybackRateChangedParam = {
    val __obj = js.Dynamic.literal(playbackRate = playbackRate.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRateChangedParam]
  }
  
  @scala.inline
  implicit class PlaybackRateChangedParamMutableBuilder[Self <: PlaybackRateChangedParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
