package typings.hammerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecognizerOptions extends StObject {
  
  var direction: js.UndefOr[Double] = js.undefined
  
  var enable: js.UndefOr[
    Boolean | (js.Function2[/* recognizer */ Recognizer, /* inputData */ HammerInput, Boolean])
  ] = js.undefined
  
  var event: js.UndefOr[String] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var pointers: js.UndefOr[Double] = js.undefined
  
  var posThreshold: js.UndefOr[Double] = js.undefined
  
  var taps: js.UndefOr[Double] = js.undefined
  
  var threshold: js.UndefOr[Double] = js.undefined
  
  var time: js.UndefOr[Double] = js.undefined
  
  var velocity: js.UndefOr[Double] = js.undefined
}
object RecognizerOptions {
  
  @scala.inline
  def apply(): RecognizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecognizerOptions]
  }
  
  @scala.inline
  implicit class RecognizerOptionsMutableBuilder[Self <: RecognizerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean | (js.Function2[/* recognizer */ Recognizer, /* inputData */ HammerInput, Boolean])): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableFunction2(value: (/* recognizer */ Recognizer, /* inputData */ HammerInput) => Boolean): Self = StObject.set(x, "enable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setPointers(value: Double): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointersUndefined: Self = StObject.set(x, "pointers", js.undefined)
    
    @scala.inline
    def setPosThreshold(value: Double): Self = StObject.set(x, "posThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosThresholdUndefined: Self = StObject.set(x, "posThreshold", js.undefined)
    
    @scala.inline
    def setTaps(value: Double): Self = StObject.set(x, "taps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapsUndefined: Self = StObject.set(x, "taps", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
