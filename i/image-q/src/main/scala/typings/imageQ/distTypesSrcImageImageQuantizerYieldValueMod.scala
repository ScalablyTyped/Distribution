package typings.imageQ

import typings.imageQ.distTypesSrcUtilsMod.PointContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcImageImageQuantizerYieldValueMod {
  
  trait ImageQuantizerYieldValue extends StObject {
    
    var pointContainer: js.UndefOr[PointContainer] = js.undefined
    
    var progress: Double
  }
  object ImageQuantizerYieldValue {
    
    inline def apply(progress: Double): ImageQuantizerYieldValue = {
      val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageQuantizerYieldValue]
    }
    
    extension [Self <: ImageQuantizerYieldValue](x: Self) {
      
      inline def setPointContainer(value: PointContainer): Self = StObject.set(x, "pointContainer", value.asInstanceOf[js.Any])
      
      inline def setPointContainerUndefined: Self = StObject.set(x, "pointContainer", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
}
