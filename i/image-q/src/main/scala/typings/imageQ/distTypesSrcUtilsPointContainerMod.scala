package typings.imageQ

import typings.imageQ.distTypesSrcUtilsPointMod.Point
import typings.node.bufferMod.global.Buffer
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcUtilsPointContainerMod {
  
  @JSImport("image-q/dist/types/src/utils/pointContainer", "PointContainer")
  @js.native
  open class PointContainer () extends StObject {
    
    /* private */ var _height: Any = js.native
    
    /* private */ val _pointArray: Any = js.native
    
    /* private */ var _width: Any = js.native
    
    def getHeight(): Double = js.native
    
    def getPointArray(): js.Array[Point] = js.native
    
    def getWidth(): Double = js.native
    
    def setHeight(height: Double): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
    
    def toUint32Array(): js.typedarray.Uint32Array = js.native
    
    def toUint8Array(): js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object PointContainer {
    
    @JSImport("image-q/dist/types/src/utils/pointContainer", "PointContainer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBuffer(buffer: Buffer, width: Double, height: Double): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
    
    inline def fromHTMLCanvasElement(canvas: HTMLCanvasElement): PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHTMLCanvasElement")(canvas.asInstanceOf[js.Any]).asInstanceOf[PointContainer]
    
    inline def fromHTMLImageElement(img: HTMLImageElement): PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHTMLImageElement")(img.asInstanceOf[js.Any]).asInstanceOf[PointContainer]
    
    inline def fromImageData(imageData: ImageData): PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromImageData")(imageData.asInstanceOf[js.Any]).asInstanceOf[PointContainer]
    
    inline def fromUint32Array(uint32Array: js.typedarray.Uint32Array, width: Double, height: Double): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint32Array")(uint32Array.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
    
    inline def fromUint8Array(uint8Array: js.Array[Double], width: Double, height: Double): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(uint8Array.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
    inline def fromUint8Array(uint8Array: js.typedarray.Uint8Array, width: Double, height: Double): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(uint8Array.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
    inline def fromUint8Array(uint8Array: js.typedarray.Uint8ClampedArray, width: Double, height: Double): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(uint8Array.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
  }
}
