package typings.jqueryAjaxfile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interval extends StObject {
  
  /**
    * The rate (in milliseconds) at which animations fire.
    */
  var interval: Double
  
  /**
    * Globally disable all animations.
    */
  var off: Boolean
  
  var speeds: Fast
  
  var step: Any
  
  def stop(): Unit
  
  def tick(): Unit
}
object Interval {
  
  inline def apply(interval: Double, off: Boolean, speeds: Fast, step: Any, stop: () => Unit, tick: () => Unit): Interval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], speeds = speeds.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), tick = js.Any.fromFunction0(tick))
    __obj.asInstanceOf[Interval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setOff(value: Boolean): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
    
    inline def setSpeeds(value: Fast): Self = StObject.set(x, "speeds", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setTick(value: () => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction0(value))
  }
}
