package typings.imageQ

import typings.imageQ.distTypesSrcDistanceDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.distTypesSrcImageImageQuantizerMod.AbstractImageQuantizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcImageRiemersmaMod {
  
  @JSImport("image-q/dist/types/src/image/riemersma", "ErrorDiffusionRiemersma")
  @js.native
  open class ErrorDiffusionRiemersma protected () extends AbstractImageQuantizer {
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
    
    /* private */ var _distance: Any = js.native
    
    /* private */ var _errorQueueSize: Any = js.native
    
    /* private */ var _weights: Any = js.native
  }
  /* static members */
  object ErrorDiffusionRiemersma {
    
    @JSImport("image-q/dist/types/src/image/riemersma", "ErrorDiffusionRiemersma")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("image-q/dist/types/src/image/riemersma", "ErrorDiffusionRiemersma._createWeights")
    @js.native
    def _createWeights: Any = js.native
    inline def _createWeights_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_createWeights")(x.asInstanceOf[js.Any])
  }
}
