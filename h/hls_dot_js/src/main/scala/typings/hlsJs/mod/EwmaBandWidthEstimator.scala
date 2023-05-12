package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EwmaBandWidthEstimator extends StObject {
  
  def canEstimate(): Boolean
  
  /* private */ var defaultEstimate_ : Any
  
  /* private */ var defaultTTFB_ : Any
  
  def destroy(): Unit
  
  /* private */ var fast_ : Any
  
  def getEstimate(): Double
  
  def getEstimateTTFB(): Double
  
  /* private */ var minDelayMs_ : Any
  
  /* private */ var minWeight_ : Any
  
  def sample(durationMs: Double, numBytes: Double): Unit
  
  def sampleTTFB(ttfb: Double): Unit
  
  /* private */ var slow_ : Any
  
  /* private */ var ttfb_ : Any
  
  def update(slow: Double, fast: Double): Unit
}
object EwmaBandWidthEstimator {
  
  inline def apply(
    canEstimate: () => Boolean,
    defaultEstimate_ : Any,
    defaultTTFB_ : Any,
    destroy: () => Unit,
    fast_ : Any,
    getEstimate: () => Double,
    getEstimateTTFB: () => Double,
    minDelayMs_ : Any,
    minWeight_ : Any,
    sample: (Double, Double) => Unit,
    sampleTTFB: Double => Unit,
    slow_ : Any,
    ttfb_ : Any,
    update: (Double, Double) => Unit
  ): EwmaBandWidthEstimator = {
    val __obj = js.Dynamic.literal(canEstimate = js.Any.fromFunction0(canEstimate), defaultEstimate_ = defaultEstimate_.asInstanceOf[js.Any], defaultTTFB_ = defaultTTFB_.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), fast_ = fast_.asInstanceOf[js.Any], getEstimate = js.Any.fromFunction0(getEstimate), getEstimateTTFB = js.Any.fromFunction0(getEstimateTTFB), minDelayMs_ = minDelayMs_.asInstanceOf[js.Any], minWeight_ = minWeight_.asInstanceOf[js.Any], sample = js.Any.fromFunction2(sample), sampleTTFB = js.Any.fromFunction1(sampleTTFB), slow_ = slow_.asInstanceOf[js.Any], ttfb_ = ttfb_.asInstanceOf[js.Any], update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[EwmaBandWidthEstimator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EwmaBandWidthEstimator] (val x: Self) extends AnyVal {
    
    inline def setCanEstimate(value: () => Boolean): Self = StObject.set(x, "canEstimate", js.Any.fromFunction0(value))
    
    inline def setDefaultEstimate_(value: Any): Self = StObject.set(x, "defaultEstimate_", value.asInstanceOf[js.Any])
    
    inline def setDefaultTTFB_(value: Any): Self = StObject.set(x, "defaultTTFB_", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setFast_(value: Any): Self = StObject.set(x, "fast_", value.asInstanceOf[js.Any])
    
    inline def setGetEstimate(value: () => Double): Self = StObject.set(x, "getEstimate", js.Any.fromFunction0(value))
    
    inline def setGetEstimateTTFB(value: () => Double): Self = StObject.set(x, "getEstimateTTFB", js.Any.fromFunction0(value))
    
    inline def setMinDelayMs_(value: Any): Self = StObject.set(x, "minDelayMs_", value.asInstanceOf[js.Any])
    
    inline def setMinWeight_(value: Any): Self = StObject.set(x, "minWeight_", value.asInstanceOf[js.Any])
    
    inline def setSample(value: (Double, Double) => Unit): Self = StObject.set(x, "sample", js.Any.fromFunction2(value))
    
    inline def setSampleTTFB(value: Double => Unit): Self = StObject.set(x, "sampleTTFB", js.Any.fromFunction1(value))
    
    inline def setSlow_(value: Any): Self = StObject.set(x, "slow_", value.asInstanceOf[js.Any])
    
    inline def setTtfb_(value: Any): Self = StObject.set(x, "ttfb_", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
