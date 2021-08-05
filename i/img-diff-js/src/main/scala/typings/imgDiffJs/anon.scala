package typings.imgDiffJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IncludeAA extends StObject {
    
    /** {default:false} */
    var includeAA: js.UndefOr[Boolean] = js.undefined
    
    /** {default: 0.1} */
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object IncludeAA {
    
    inline def apply(): IncludeAA = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeAA]
    }
    
    extension [Self <: IncludeAA](x: Self) {
      
      inline def setIncludeAA(value: Boolean): Self = StObject.set(x, "includeAA", value.asInstanceOf[js.Any])
      
      inline def setIncludeAAUndefined: Self = StObject.set(x, "includeAA", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
