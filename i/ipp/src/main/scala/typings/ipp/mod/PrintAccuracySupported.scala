package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintAccuracySupported extends StObject {
  
  var `accuracy-units`: js.UndefOr[AccuracyUnits] = js.undefined
  
  var `x-accuracy`: js.UndefOr[Double] = js.undefined
  
  var `y-accuracy`: js.UndefOr[Double] = js.undefined
  
  var `z-accuracy`: js.UndefOr[Double] = js.undefined
}
object PrintAccuracySupported {
  
  @scala.inline
  def apply(): PrintAccuracySupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintAccuracySupported]
  }
  
  @scala.inline
  implicit class PrintAccuracySupportedMutableBuilder[Self <: PrintAccuracySupported] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAccuracy-units`(value: AccuracyUnits): Self = StObject.set(x, "accuracy-units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAccuracy-unitsUndefined`: Self = StObject.set(x, "accuracy-units", js.undefined)
    
    @scala.inline
    def `setX-accuracy`(value: Double): Self = StObject.set(x, "x-accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-accuracyUndefined`: Self = StObject.set(x, "x-accuracy", js.undefined)
    
    @scala.inline
    def `setY-accuracy`(value: Double): Self = StObject.set(x, "y-accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setY-accuracyUndefined`: Self = StObject.set(x, "y-accuracy", js.undefined)
    
    @scala.inline
    def `setZ-accuracy`(value: Double): Self = StObject.set(x, "z-accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZ-accuracyUndefined`: Self = StObject.set(x, "z-accuracy", js.undefined)
  }
}
