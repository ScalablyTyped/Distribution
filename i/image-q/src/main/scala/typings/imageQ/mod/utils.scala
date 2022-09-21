package typings.imageQ.mod

import typings.node.bufferMod.global.Buffer
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("image-q", "utils.HueStatistics")
  @js.native
  open class HueStatistics protected ()
    extends typings.imageQ.utilsMod.HueStatistics {
    def this(numGroups: Double, minCols: Double) = this()
  }
  
  @JSImport("image-q", "utils.Palette")
  @js.native
  open class Palette ()
    extends typings.imageQ.utilsMod.Palette
  
  @JSImport("image-q", "utils.Point")
  @js.native
  open class Point ()
    extends typings.imageQ.utilsMod.Point
  /* static members */
  object Point {
    
    @JSImport("image-q", "utils.Point")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createByQuadruplet(quadruplet: js.Array[Double]): typings.imageQ.pointMod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("createByQuadruplet")(quadruplet.asInstanceOf[js.Any]).asInstanceOf[typings.imageQ.pointMod.Point]
    
    inline def createByRGBA(red: Double, green: Double, blue: Double, alpha: Double): typings.imageQ.pointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("createByRGBA")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[typings.imageQ.pointMod.Point]
    
    inline def createByUint32(uint32: Double): typings.imageQ.pointMod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("createByUint32")(uint32.asInstanceOf[js.Any]).asInstanceOf[typings.imageQ.pointMod.Point]
  }
  
  @JSImport("image-q", "utils.PointContainer")
  @js.native
  open class PointContainer ()
    extends typings.imageQ.utilsMod.PointContainer
  /* static members */
  object PointContainer {
    
    @JSImport("image-q", "utils.PointContainer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBuffer(buffer: Buffer, width: Double, height: Double): typings.imageQ.pointContainerMod.PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    
    inline def fromHTMLCanvasElement(canvas: HTMLCanvasElement): typings.imageQ.pointContainerMod.PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHTMLCanvasElement")(canvas.asInstanceOf[js.Any]).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    
    inline def fromHTMLImageElement(img: HTMLImageElement): typings.imageQ.pointContainerMod.PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHTMLImageElement")(img.asInstanceOf[js.Any]).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    
    inline def fromImageData(imageData: ImageData): typings.imageQ.pointContainerMod.PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromImageData")(imageData.asInstanceOf[js.Any]).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    
    inline def fromUint32Array(uint32Array: js.typedarray.Uint32Array, width: Double, height: Double): typings.imageQ.pointContainerMod.PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint32Array")(uint32Array.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    
    inline def fromUint8Array(uint8Array: js.Array[Double], width: Double, height: Double): typings.imageQ.pointContainerMod.PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(uint8Array.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    inline def fromUint8Array(uint8Array: js.typedarray.Uint8Array, width: Double, height: Double): typings.imageQ.pointContainerMod.PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(uint8Array.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
    inline def fromUint8Array(uint8Array: js.typedarray.Uint8ClampedArray, width: Double, height: Double): typings.imageQ.pointContainerMod.PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(uint8Array.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.imageQ.pointContainerMod.PointContainer]
  }
  
  @JSImport("image-q", "utils.ProgressTracker")
  @js.native
  open class ProgressTracker protected ()
    extends typings.imageQ.utilsMod.ProgressTracker {
    def this(valueRange: Double, progressRange: Double) = this()
  }
  /* static members */
  object ProgressTracker {
    
    @JSImport("image-q", "utils.ProgressTracker.steps")
    @js.native
    val steps: /* 100 */ Double = js.native
  }
  
  object arithmetic {
    
    @JSImport("image-q", "utils.arithmetic")
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
