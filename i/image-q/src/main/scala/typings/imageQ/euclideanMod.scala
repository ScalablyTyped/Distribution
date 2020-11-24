package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("image-q/dist/distance/euclidean", JSImport.Namespace)
@js.native
object euclideanMod extends js.Object {
  
  @js.native
  class AbstractEuclidean () extends AbstractDistanceCalculator {
    
    var _kA: Double = js.native
    
    var _kB: Double = js.native
    
    var _kG: Double = js.native
    
    var _kR: Double = js.native
  }
  
  @js.native
  class Euclidean () extends AbstractEuclidean
  
  @js.native
  class EuclideanRgbQuantWOAlpha () extends AbstractEuclidean
  
  @js.native
  class EuclideanRgbQuantWithAlpha () extends AbstractEuclidean
}
