package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q/dist/distance/manhattan", JSImport.Namespace)
@js.native
object manhattanMod extends js.Object {
  @js.native
  abstract class AbstractManhattan () extends AbstractDistanceCalculator {
    var _kA: Double = js.native
    var _kB: Double = js.native
    var _kG: Double = js.native
    var _kR: Double = js.native
  }
  
  @js.native
  class Manhattan () extends AbstractManhattan
  
  @js.native
  class ManhattanNommyde () extends AbstractManhattan
  
  @js.native
  class ManhattanSRGB () extends AbstractManhattan
  
}

