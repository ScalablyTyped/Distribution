package typings.imageQ

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcUtilsPointMod {
  
  @JSImport("image-q/dist/types/src/utils/point", "Point")
  @js.native
  open class Point ()
    extends StObject
       with PointRGBA {
    
    /* private */ var _loadQuadruplet: Any = js.native
    
    /* private */ var _loadRGBA: Any = js.native
    
    /* private */ var _loadUINT32: Any = js.native
    
    /* CompleteClass */
    var a: Double = js.native
    
    /* CompleteClass */
    var b: Double = js.native
    
    def from(point: Point): Unit = js.native
    
    /* CompleteClass */
    var g: Double = js.native
    
    def getLuminosity(useAlphaChannel: Boolean): Double = js.native
    
    /* CompleteClass */
    var r: Double = js.native
    
    var rgba: js.Array[Double] = js.native
    
    var uint32: Double = js.native
  }
  /* static members */
  object Point {
    
    @JSImport("image-q/dist/types/src/utils/point", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createByQuadruplet(quadruplet: js.Array[Double]): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("createByQuadruplet")(quadruplet.asInstanceOf[js.Any]).asInstanceOf[Point]
    
    inline def createByRGBA(red: Double, green: Double, blue: Double, alpha: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("createByRGBA")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def createByUint32(uint32: Double): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("createByUint32")(uint32.asInstanceOf[js.Any]).asInstanceOf[Point]
  }
  
  trait PointRGBA extends StObject {
    
    var a: Double
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object PointRGBA {
    
    inline def apply(a: Double, b: Double, g: Double, r: Double): PointRGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointRGBA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointRGBA] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
