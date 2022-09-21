package typings.imageQ

import typings.imageQ.paletteQuantizerYieldValueMod.PaletteQuantizerYieldValue
import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.utilsMod.Palette
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paletteQuantizerMod {
  
  @JSImport("image-q/dist/types/src/palette/paletteQuantizer", "AbstractPaletteQuantizer")
  @js.native
  abstract class AbstractPaletteQuantizer () extends StObject {
    
    def quantize(): IterableIterator[PaletteQuantizerYieldValue] = js.native
    
    def quantizeSync(): Palette = js.native
    
    def sample(pointContainer: PointContainer): Unit = js.native
  }
}
