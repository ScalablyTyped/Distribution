package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayingEventUIParam extends StObject {
  
  /**
    * Get the current time in the video at which the event was fired.
    */
  var currentTime: js.UndefOr[Double] = js.native
  
  /**
    * Get the video duration in seconds.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Get the url of the playing video.
    */
  var source: js.UndefOr[String] = js.native
}
object PlayingEventUIParam {
  
  @scala.inline
  def apply(): PlayingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayingEventUIParam]
  }
  
  @scala.inline
  implicit class PlayingEventUIParamMutableBuilder[Self <: PlayingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
