package typings.imageQ

import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.utilsPaletteMod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paletteCommonMod {
  
  @js.native
  trait IPaletteQuantizer extends StObject {
    
    def quantize(): Palette = js.native
    
    def sample(pointBuffer: PointContainer): Unit = js.native
  }
  object IPaletteQuantizer {
    
    @scala.inline
    def apply(quantize: () => Palette, sample: PointContainer => Unit): IPaletteQuantizer = {
      val __obj = js.Dynamic.literal(quantize = js.Any.fromFunction0(quantize), sample = js.Any.fromFunction1(sample))
      __obj.asInstanceOf[IPaletteQuantizer]
    }
    
    @scala.inline
    implicit class IPaletteQuantizerMutableBuilder[Self <: IPaletteQuantizer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuantize(value: () => Palette): Self = StObject.set(x, "quantize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSample(value: PointContainer => Unit): Self = StObject.set(x, "sample", js.Any.fromFunction1(value))
    }
  }
}
