package typings.imageQ

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("image-q/dist/utils", "HueStatistics")
  @js.native
  class HueStatistics protected ()
    extends typings.imageQ.hueStatisticsMod.HueStatistics {
    def this(numGroups: Double, minCols: Double) = this()
  }
  
  @JSImport("image-q/dist/utils", "Palette")
  @js.native
  class Palette ()
    extends typings.imageQ.utilsPaletteMod.Palette
  
  @JSImport("image-q/dist/utils", "Point")
  @js.native
  class Point ()
    extends typings.imageQ.pointMod.Point
  /* static members */
  object Point {
    
    @JSImport("image-q/dist/utils", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createByQuadruplet(quadruplet: js.Array[Double]): typings.imageQ.pointMod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("createByQuadruplet")(quadruplet.asInstanceOf[js.Any]).asInstanceOf[typings.imageQ.pointMod.Point]
    
    inline def createByRGBA(red: Double, green: Double, blue: Double, alpha: Double): typings.imageQ.pointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("createByRGBA")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[typings.imageQ.pointMod.Point]
    
    inline def createByUint32(uint32: Double): typings.imageQ.pointMod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("createByUint32")(uint32.asInstanceOf[js.Any]).asInstanceOf[typings.imageQ.pointMod.Point]
  }
  
  @JSImport("image-q/dist/utils", "PointContainer")
  @js.native
  class PointContainer ()
    extends typings.imageQ.pointContainerMod.PointContainer
  /* static members */
  object PointContainer {
    
    @JSImport("image-q/dist/utils", "PointContainer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromArray(byteArray: js.Array[Double], width: Double, height: Double): typings.imageQ.pointContainerMod.PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(byteArray.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    
    inline def fromCanvasPixelArray(data: js.Any, width: Double, height: Double): typings.imageQ.pointContainerMod.PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasPixelArray")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    
    inline def fromHTMLCanvasElement(canvas: HTMLCanvasElement): typings.imageQ.pointContainerMod.PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHTMLCanvasElement")(canvas.asInstanceOf[js.Any]).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    
    inline def fromHTMLImageElement(img: HTMLImageElement): typings.imageQ.pointContainerMod.PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHTMLImageElement")(img.asInstanceOf[js.Any]).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    
    inline def fromImageData(imageData: ImageData): typings.imageQ.pointContainerMod.PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromImageData")(imageData.asInstanceOf[js.Any]).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    
    inline def fromNodeCanvas(canvas: js.Any): typings.imageQ.pointContainerMod.PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    
    inline def fromUint32Array(uint32array: Uint32Array, width: Double, height: Double): typings.imageQ.pointContainerMod.PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint32Array")(uint32array.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    
    inline def fromUint8Array(uint8array: Uint8Array, width: Double, height: Double): typings.imageQ.pointContainerMod.PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(uint8array.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
  }
  
  object arithmetic {
    
    @JSImport("image-q/dist/utils", "arithmetic")
    @js.native
    val ^ : js.Any = js.native
    
    inline def degrees2radians(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degrees2radians")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def inRange0to255(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inRange0to255")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def inRange0to255Rounded(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inRange0to255Rounded")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def intInRange(value: Double, low: Double, high: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("intInRange")(value.asInstanceOf[js.Any], low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def max3(a: Double, b: Double, c: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("max3")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def min3(a: Double, b: Double, c: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("min3")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def stableSort[T](arrayToSort: js.Array[T], callback: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("stableSort")(arrayToSort.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  }
}
