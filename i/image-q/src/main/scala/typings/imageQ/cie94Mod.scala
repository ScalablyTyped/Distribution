package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q/dist/distance/cie94", JSImport.Namespace)
@js.native
object cie94Mod extends js.Object {
  @js.native
  abstract class AbstractCIE94 () extends AbstractDistanceCalculator {
    var _K1: Double = js.native
    var _K2: Double = js.native
    var _Kl: Double = js.native
    /**
      * Weight in distance: 0.25
      * Max DeltaE: 100
      * Max DeltaA: 255
      */
    var _kA: Double = js.native
  }
  
  @js.native
  class CIE94GraphicArts () extends AbstractCIE94
  
  @js.native
  class CIE94Textiles () extends AbstractCIE94
  
}

