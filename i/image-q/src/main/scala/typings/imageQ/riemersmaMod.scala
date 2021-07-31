package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.commonMod.IImageDitherer
import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.utilsPaletteMod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object riemersmaMod {
  
  @JSImport("image-q/dist/image/riemersma", "ErrorDiffusionRiemersma")
  @js.native
  class ErrorDiffusionRiemersma protected ()
    extends StObject
       with IImageDitherer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, errorQueueSize: Double) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      errorQueueSize: Double,
      errorPropagation: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      errorQueueSize: Unit,
      errorPropagation: Double
    ) = this()
    
    /* private */ def _createWeights(): js.Any = js.native
    
    var _distance: js.Any = js.native
    
    var _errorPropagation: js.Any = js.native
    
    var _errorQueueSize: js.Any = js.native
    
    var _max: js.Any = js.native
    
    var _weights: js.Any = js.native
    
    /* CompleteClass */
    override def quantize(pointBuffer: PointContainer, palette: Palette): PointContainer = js.native
  }
}
