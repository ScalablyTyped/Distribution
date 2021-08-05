package typings.imageQ

import typings.imageQ.pointMod.Point
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointContainerMod {
  
  @JSImport("image-q/dist/utils/pointContainer", "PointContainer")
  @js.native
  class PointContainer () extends StObject {
    
    /* private */ var _height: js.Any = js.native
    
    /* private */ val _pointArray: js.Any = js.native
    
    /* private */ var _width: js.Any = js.native
    
    def getHeight(): Double = js.native
    
    def getPointArray(): js.Array[Point] = js.native
    
    def getWidth(): Double = js.native
    
    def setHeight(height: Double): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
    
    def toUint32Array(): Uint32Array = js.native
    
    def toUint8Array(): Uint8Array = js.native
  }
  /* static members */
  object PointContainer {
    
    @JSImport("image-q/dist/utils/pointContainer", "PointContainer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromArray(byteArray: js.Array[Double], width: Double, height: Double): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(byteArray.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
    
    inline def fromCanvasPixelArray(data: js.Any, width: Double, height: Double): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasPixelArray")(data.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
    
    inline def fromHTMLCanvasElement(canvas: HTMLCanvasElement): PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHTMLCanvasElement")(canvas.asInstanceOf[js.Any]).asInstanceOf[PointContainer]
    
    inline def fromHTMLImageElement(img: HTMLImageElement): PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHTMLImageElement")(img.asInstanceOf[js.Any]).asInstanceOf[PointContainer]
    
    inline def fromImageData(imageData: ImageData): PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromImageData")(imageData.asInstanceOf[js.Any]).asInstanceOf[PointContainer]
    
    inline def fromNodeCanvas(canvas: js.Any): PointContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[PointContainer]
    
    inline def fromUint32Array(uint32array: Uint32Array, width: Double, height: Double): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint32Array")(uint32array.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
    
    inline def fromUint8Array(uint8array: Uint8Array, width: Double, height: Double): PointContainer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(uint8array.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[PointContainer]
  }
}
