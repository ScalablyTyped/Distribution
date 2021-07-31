package typings.imageQ

import typings.imageQ.anon.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointMod {
  
  @JSImport("image-q/dist/utils/point", "Point")
  @js.native
  class Point () extends StObject {
    
    var Lab: A = js.native
    
    /* private */ def _loadQuadruplet(): js.Any = js.native
    
    /* private */ def _loadRGBA(): js.Any = js.native
    
    /* private */ def _loadUINT32(): js.Any = js.native
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    def from(point: Point): Unit = js.native
    
    var g: Double = js.native
    
    def getLuminosity(useAlphaChannel: Boolean): Double = js.native
    
    var r: Double = js.native
    
    var rgba: js.Array[Double] = js.native
    
    var uint32: Double = js.native
  }
  /* static members */
  object Point {
    
    @JSImport("image-q/dist/utils/point", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createByQuadruplet(quadruplet: js.Array[Double]): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("createByQuadruplet")(quadruplet.asInstanceOf[js.Any]).asInstanceOf[Point]
    
    @scala.inline
    def createByRGBA(red: Double, green: Double, blue: Double, alpha: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("createByRGBA")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    @scala.inline
    def createByUint32(uint32: Double): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("createByUint32")(uint32.asInstanceOf[js.Any]).asInstanceOf[Point]
  }
}
