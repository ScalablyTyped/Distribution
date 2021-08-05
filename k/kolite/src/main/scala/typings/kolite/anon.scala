package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Opacity extends StObject {
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var segments: js.UndefOr[Double] = js.undefined
    
    var steps: js.UndefOr[Double] = js.undefined
  }
  object Opacity {
    
    inline def apply(): Opacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opacity]
    }
    
    extension [Self <: Opacity](x: Self) {
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    }
  }
}
