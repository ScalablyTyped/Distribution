package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.commonMod.IImageDitherer
import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.utilsPaletteMod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nearestColorMod {
  
  @JSImport("image-q/dist/image/nearestColor", "NearestColor")
  @js.native
  class NearestColor protected ()
    extends StObject
       with IImageDitherer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    
    var _distance: js.Any = js.native
    
    /* CompleteClass */
    override def quantize(pointBuffer: PointContainer, palette: Palette): PointContainer = js.native
  }
}
