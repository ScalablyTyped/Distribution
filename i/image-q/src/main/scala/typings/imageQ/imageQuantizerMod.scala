package typings.imageQ

import typings.imageQ.imageQuantizerYieldValueMod.ImageQuantizerYieldValue
import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.utilsPaletteMod.Palette
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageQuantizerMod {
  
  @JSImport("image-q/dist/types/src/image/imageQuantizer", "AbstractImageQuantizer")
  @js.native
  abstract class AbstractImageQuantizer () extends StObject {
    
    def quantize(pointContainer: PointContainer, palette: Palette): IterableIterator[ImageQuantizerYieldValue] = js.native
    
    def quantizeSync(pointContainer: PointContainer, palette: Palette): PointContainer = js.native
  }
}
