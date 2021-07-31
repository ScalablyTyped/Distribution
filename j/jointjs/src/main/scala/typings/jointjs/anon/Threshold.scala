package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Threshold extends StObject {
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object Threshold {
  
  @scala.inline
  def apply(): Threshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Threshold]
  }
  
  @scala.inline
  implicit class ThresholdMutableBuilder[Self <: Threshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
