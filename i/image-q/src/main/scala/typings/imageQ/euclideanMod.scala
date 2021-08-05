package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object euclideanMod {
  
  @JSImport("image-q/dist/distance/euclidean", "AbstractEuclidean")
  @js.native
  class AbstractEuclidean () extends AbstractDistanceCalculator {
    
    /* protected */ var _kA: Double = js.native
    
    /* protected */ var _kB: Double = js.native
    
    /* protected */ var _kG: Double = js.native
    
    /* protected */ var _kR: Double = js.native
  }
  
  @JSImport("image-q/dist/distance/euclidean", "Euclidean")
  @js.native
  class Euclidean () extends AbstractEuclidean
  
  @JSImport("image-q/dist/distance/euclidean", "EuclideanRgbQuantWOAlpha")
  @js.native
  class EuclideanRgbQuantWOAlpha () extends AbstractEuclidean
  
  @JSImport("image-q/dist/distance/euclidean", "EuclideanRgbQuantWithAlpha")
  @js.native
  class EuclideanRgbQuantWithAlpha () extends AbstractEuclidean
}
