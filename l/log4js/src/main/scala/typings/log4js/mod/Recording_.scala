package typings.log4js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recording_ extends StObject {
  
  def configure(): AppenderFunction
  
  def erase(): Unit
  
  def playback(): js.Array[LoggingEvent]
  
  def replay(): js.Array[LoggingEvent]
  
  def reset(): Unit
}
object Recording_ {
  
  inline def apply(
    configure: () => AppenderFunction,
    erase: () => Unit,
    playback: () => js.Array[LoggingEvent],
    replay: () => js.Array[LoggingEvent],
    reset: () => Unit
  ): Recording_ = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction0(configure), erase = js.Any.fromFunction0(erase), playback = js.Any.fromFunction0(playback), replay = js.Any.fromFunction0(replay), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Recording_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recording_] (val x: Self) extends AnyVal {
    
    inline def setConfigure(value: () => AppenderFunction): Self = StObject.set(x, "configure", js.Any.fromFunction0(value))
    
    inline def setErase(value: () => Unit): Self = StObject.set(x, "erase", js.Any.fromFunction0(value))
    
    inline def setPlayback(value: () => js.Array[LoggingEvent]): Self = StObject.set(x, "playback", js.Any.fromFunction0(value))
    
    inline def setReplay(value: () => js.Array[LoggingEvent]): Self = StObject.set(x, "replay", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
