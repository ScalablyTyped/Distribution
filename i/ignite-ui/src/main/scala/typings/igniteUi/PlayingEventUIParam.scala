package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayingEventUIParam extends StObject {
  
  /**
    * Get the current time in the video at which the event was fired.
    */
  var currentTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Get the video duration in seconds.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Get the url of the playing video.
    */
  var source: js.UndefOr[String] = js.undefined
}
object PlayingEventUIParam {
  
  inline def apply(): PlayingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayingEventUIParam]
  }
  
  extension [Self <: PlayingEventUIParam](x: Self) {
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
