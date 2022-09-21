package typings.imageQ

import typings.imageQ.distanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsPaletteMod {
  
  @JSImport("image-q/dist/types/src/utils/palette", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("image-q/dist/types/src/utils/palette", "Palette")
  @js.native
  open class Palette () extends StObject {
    
    /* private */ var _getNearestIndex: Any = js.native
    
    /* private */ var _i32idx: Any = js.native
    
    /* private */ var _nearestPointFromCache: Any = js.native
    
    /* private */ val _pointArray: Any = js.native
    
    /* private */ val _pointContainer: Any = js.native
    
    def add(color: Point): Unit = js.native
    
    def getNearestColor(colorDistanceCalculator: AbstractDistanceCalculator, color: Point): Point = js.native
    
    def getPointContainer(): PointContainer = js.native
    
    def has(color: Point): Boolean = js.native
    
    def sort(): Unit = js.native
  }
  
  inline def hueGroup(hue: Double, segmentsNumber: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hueGroup")(hue.asInstanceOf[js.Any], segmentsNumber.asInstanceOf[js.Any])).asInstanceOf[Double]
}
