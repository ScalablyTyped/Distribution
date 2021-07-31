package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioTrackChangedParam extends StObject {
  
  var currentTrack: Double
}
object AudioTrackChangedParam {
  
  @scala.inline
  def apply(currentTrack: Double): AudioTrackChangedParam = {
    val __obj = js.Dynamic.literal(currentTrack = currentTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrackChangedParam]
  }
  
  @scala.inline
  implicit class AudioTrackChangedParamMutableBuilder[Self <: AudioTrackChangedParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTrack(value: Double): Self = StObject.set(x, "currentTrack", value.asInstanceOf[js.Any])
  }
}
