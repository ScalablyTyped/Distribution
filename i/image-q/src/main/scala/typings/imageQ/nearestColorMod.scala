package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.commonMod.IImageDitherer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q/dist/image/nearestColor", JSImport.Namespace)
@js.native
object nearestColorMod extends js.Object {
  @js.native
  class NearestColor protected () extends IImageDitherer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    var _distance: js.Any = js.native
  }
  
}

