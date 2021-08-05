package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsPaletteMod {
  
  @JSImport("image-q/dist/utils/palette", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("image-q/dist/utils/palette", "Palette")
  @js.native
  class Palette () extends StObject {
    
    /* private */ var _i32idx: js.Any = js.native
    
    /* private */ def _nearestPointFromCache(key: js.Any): js.Any = js.native
    
    /* private */ val _pointArray: js.Any = js.native
    
    /* private */ val _pointContainer: js.Any = js.native
    
    def add(color: Point): Unit = js.native
    
    def getNearestColor(colorDistanceCalculator: AbstractDistanceCalculator, color: Point): Point = js.native
    
    /* private */ def getNearestIndex(colorDistanceCalculator: js.Any, point: js.Any): js.Any = js.native
    
    def getPointContainer(): PointContainer = js.native
    
    def has(color: Point): Boolean = js.native
    
    def sort(): Unit = js.native
  }
  
  inline def hueGroup(hue: Double, segmentsNumber: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hueGroup")(hue.asInstanceOf[js.Any], segmentsNumber.asInstanceOf[js.Any])).asInstanceOf[Double]
}
