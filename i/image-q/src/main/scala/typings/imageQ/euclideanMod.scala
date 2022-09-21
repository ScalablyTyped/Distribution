package typings.imageQ

import typings.imageQ.distanceCalculatorMod.AbstractDistanceCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object euclideanMod {
  
  @JSImport("image-q/dist/types/src/distance/euclidean", "AbstractEuclidean")
  @js.native
  abstract class AbstractEuclidean () extends AbstractDistanceCalculator {
    
    /* protected */ var _kA: Double = js.native
    
    /* protected */ var _kB: Double = js.native
    
    /* protected */ var _kG: Double = js.native
    
    /* protected */ var _kR: Double = js.native
  }
  
  @JSImport("image-q/dist/types/src/distance/euclidean", "Euclidean")
  @js.native
  open class Euclidean () extends AbstractEuclidean
  
  @JSImport("image-q/dist/types/src/distance/euclidean", "EuclideanBT709")
  @js.native
  open class EuclideanBT709 () extends AbstractEuclidean
  
  @JSImport("image-q/dist/types/src/distance/euclidean", "EuclideanBT709NoAlpha")
  @js.native
  open class EuclideanBT709NoAlpha () extends AbstractEuclidean
}
