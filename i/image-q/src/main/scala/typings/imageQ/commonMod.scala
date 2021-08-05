package typings.imageQ

import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.utilsPaletteMod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  trait IImageDitherer extends StObject {
    
    def quantize(pointBuffer: PointContainer, palette: Palette): PointContainer
  }
  object IImageDitherer {
    
    inline def apply(quantize: (PointContainer, Palette) => PointContainer): IImageDitherer = {
      val __obj = js.Dynamic.literal(quantize = js.Any.fromFunction2(quantize))
      __obj.asInstanceOf[IImageDitherer]
    }
    
    extension [Self <: IImageDitherer](x: Self) {
      
      inline def setQuantize(value: (PointContainer, Palette) => PointContainer): Self = StObject.set(x, "quantize", js.Any.fromFunction2(value))
    }
  }
}
