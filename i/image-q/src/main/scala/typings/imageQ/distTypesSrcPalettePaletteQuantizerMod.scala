package typings.imageQ

import typings.imageQ.distTypesSrcPalettePaletteQuantizerYieldValueMod.PaletteQuantizerYieldValue
import typings.imageQ.distTypesSrcUtilsMod.Palette
import typings.imageQ.distTypesSrcUtilsPointContainerMod.PointContainer
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcPalettePaletteQuantizerMod {
  
  /* note: abstract class */ @JSImport("image-q/dist/types/src/palette/paletteQuantizer", "AbstractPaletteQuantizer")
  @js.native
  open class AbstractPaletteQuantizer () extends StObject {
    
    def quantize(): IterableIterator[PaletteQuantizerYieldValue] = js.native
    
    def quantizeSync(): Palette = js.native
    
    def sample(pointContainer: PointContainer): Unit = js.native
  }
}
