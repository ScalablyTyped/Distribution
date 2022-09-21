package typings.mapboxUnitbezier

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/unitbezier", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with UnitBezier {
    def this(p1x: Double, p1y: Double, p2x: Double, p2y: Double) = this()
  }
  
  @js.native
  trait UnitBezier extends StObject {
    
    def sampleCurveDerivativeX(t: Double): Double = js.native
    
    def sampleCurveX(t: Double): Double = js.native
    
    def sampleCurveY(t: Double): Double = js.native
    
    def solve(x: Double): Double = js.native
    def solve(x: Double, epsilon: Double): Double = js.native
    
    def solveCurveX(x: Double): Double = js.native
    def solveCurveX(x: Double, epsilon: Double): Double = js.native
  }
}
