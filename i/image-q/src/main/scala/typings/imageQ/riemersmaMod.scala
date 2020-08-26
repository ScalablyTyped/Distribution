package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.commonMod.IImageDitherer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q/dist/image/riemersma", JSImport.Namespace)
@js.native
object riemersmaMod extends js.Object {
  @js.native
  class ErrorDiffusionRiemersma protected () extends IImageDitherer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, errorQueueSize: Double) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      errorQueueSize: js.UndefOr[scala.Nothing],
      errorPropagation: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      errorQueueSize: Double,
      errorPropagation: Double
    ) = this()
    var _distance: js.Any = js.native
    var _errorPropagation: js.Any = js.native
    var _errorQueueSize: js.Any = js.native
    var _max: js.Any = js.native
    var _weights: js.Any = js.native
    /* private */ def _createWeights(): js.Any = js.native
  }
  
}

