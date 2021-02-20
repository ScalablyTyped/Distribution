package typings.imageQ

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.commonMod.IImageDitherer
import typings.imageQ.paletteCommonMod.IPaletteQuantizer
import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.utilsPaletteMod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("image-q/dist/helper", "IQ")
  @js.native
  class IQ protected () extends StObject {
    def this(
      colors: Double,
      DistanceCalculator: Instantiable0[AbstractDistanceCalculator],
      Quantizer: Instantiable2[
            /* distanceCalculator */ AbstractDistanceCalculator, 
            /* color */ Double, 
            IPaletteQuantizer
          ],
      ditherer: IImageDitherer
    ) = this()
    
    def buildImage(image: PointContainer, palette: Palette): PointContainer = js.native
    
    def buildPalette(): Palette = js.native
    
    def compare(image1: PointContainer, image2: PointContainer): Double = js.native
    
    var distanceCalculator: js.Any = js.native
    
    var ditherer: js.Any = js.native
    
    var paletteQuantizer: js.Any = js.native
    
    def sample(image: PointContainer): Unit = js.native
  }
}
