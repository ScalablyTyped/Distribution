package typings.imageQ

import typings.imageQ.anon.G
import typings.imageQ.distTypesSrcUtilsPointMod.PointRGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcDistanceDistanceCalculatorMod {
  
  /* note: abstract class */ @JSImport("image-q/dist/types/src/distance/distanceCalculator", "AbstractDistanceCalculator")
  @js.native
  open class AbstractDistanceCalculator () extends StObject {
    
    /* protected */ var _maxDistance: Double = js.native
    
    /* protected */ def _setDefaults(): Unit = js.native
    
    /* protected */ var _whitePoint: G = js.native
    
    def calculateNormalized(colorA: PointRGBA, colorB: PointRGBA): Double = js.native
    
    /**
      * Calculate raw distance (non-normalized)
      */
    def calculateRaw(r1: Double, g1: Double, b1: Double, a1: Double, r2: Double, g2: Double, b2: Double, a2: Double): Double = js.native
    
    def setWhitePoint(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  }
}
