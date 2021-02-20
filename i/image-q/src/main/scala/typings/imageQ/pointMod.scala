package typings.imageQ

import typings.imageQ.anon.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @JSImport("image-q/dist/utils/point", "Point.createByQuadruplet")
    @js.native
    def createByQuadruplet(quadruplet: js.Array[Double]): Point = js.native
    
    @JSImport("image-q/dist/utils/point", "Point.createByRGBA")
    @js.native
    def createByRGBA(red: Double, green: Double, blue: Double, alpha: Double): Point = js.native
    
    @JSImport("image-q/dist/utils/point", "Point.createByUint32")
    @js.native
    def createByUint32(uint32: Double): Point = js.native
  }
}
