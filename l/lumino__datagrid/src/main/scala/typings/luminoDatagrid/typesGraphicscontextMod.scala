package typings.luminoDatagrid

import typings.luminoDisposable.mod.IDisposable
import typings.std.CanvasFillRule
import typings.std.CanvasGradient
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import typings.std.Element
import typings.std.GlobalCompositeOperation
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.std.TextMetrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGraphicscontextMod {
  
  @JSImport("@lumino/datagrid/types/graphicscontext", "GraphicsContext")
  @js.native
  open class GraphicsContext protected ()
    extends StObject
       with IDisposable {
    /**
      * Create a new graphics context object.
      *
      * @param context - The 2D canvas rendering context to wrap.
      */
    def this(context: CanvasRenderingContext2D) = this()
    
    /* private */ var _context: Any = js.native
    
    /* private */ var _disposed: Any = js.native
    
    /* private */ var _state: Any = js.native
    
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
    
    def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
    
    def beginPath(): Unit = js.native
    
    def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
    
    def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    def clip(): Unit = js.native
    def clip(fillRule: CanvasFillRule): Unit = js.native
    
    def closePath(): Unit = js.native
    
    def createImageData(imageData: ImageData): ImageData = js.native
    def createImageData(sw: Double, sh: Double): ImageData = js.native
    
    def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient = js.native
    
    def createPattern(image: HTMLCanvasElement, repetition: String): CanvasPattern | Null = js.native
    def createPattern(image: HTMLImageElement, repetition: String): CanvasPattern | Null = js.native
    def createPattern(image: HTMLVideoElement, repetition: String): CanvasPattern | Null = js.native
    
    def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    def drawFocusIfNeeded(element: Element): Unit = js.native
    
    def drawImage(image: HTMLCanvasElement, dstX: Double, dstY: Double): Unit = js.native
    def drawImage(image: HTMLCanvasElement, dstX: Double, dstY: Double, dstW: Double, dstH: Double): Unit = js.native
    def drawImage(
      image: HTMLCanvasElement,
      srcX: Double,
      srcY: Double,
      srcW: Double,
      srcH: Double,
      dstX: Double,
      dstY: Double,
      dstW: Double,
      dstH: Double
    ): Unit = js.native
    def drawImage(image: HTMLImageElement, dstX: Double, dstY: Double): Unit = js.native
    def drawImage(image: HTMLImageElement, dstX: Double, dstY: Double, dstW: Double, dstH: Double): Unit = js.native
    def drawImage(
      image: HTMLImageElement,
      srcX: Double,
      srcY: Double,
      srcW: Double,
      srcH: Double,
      dstX: Double,
      dstY: Double,
      dstW: Double,
      dstH: Double
    ): Unit = js.native
    def drawImage(image: HTMLVideoElement, dstX: Double, dstY: Double): Unit = js.native
    def drawImage(image: HTMLVideoElement, dstX: Double, dstY: Double, dstW: Double, dstH: Double): Unit = js.native
    def drawImage(
      image: HTMLVideoElement,
      srcX: Double,
      srcY: Double,
      srcW: Double,
      srcH: Double,
      dstX: Double,
      dstY: Double,
      dstW: Double,
      dstH: Double
    ): Unit = js.native
    def drawImage(image: ImageBitmap, dstX: Double, dstY: Double): Unit = js.native
    def drawImage(image: ImageBitmap, dstX: Double, dstY: Double, dstW: Double, dstH: Double): Unit = js.native
    def drawImage(
      image: ImageBitmap,
      srcX: Double,
      srcY: Double,
      srcW: Double,
      srcH: Double,
      dstX: Double,
      dstY: Double,
      dstW: Double,
      dstH: Double
    ): Unit = js.native
    
    def ellipse(
      x: Double,
      y: Double,
      radiusX: Double,
      radiusY: Double,
      rotation: Double,
      startAngle: Double,
      endAngle: Double
    ): Unit = js.native
    def ellipse(
      x: Double,
      y: Double,
      radiusX: Double,
      radiusY: Double,
      rotation: Double,
      startAngle: Double,
      endAngle: Double,
      anticlockwise: Boolean
    ): Unit = js.native
    
    def fill(): Unit = js.native
    def fill(fillRule: CanvasFillRule): Unit = js.native
    
    def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    def fillStyle: String | CanvasGradient | CanvasPattern = js.native
    def fillStyle_=(value: String | CanvasGradient | CanvasPattern): Unit = js.native
    
    def fillText(text: String, x: Double, y: Double): Unit = js.native
    def fillText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    def font: String = js.native
    def font_=(value: String): Unit = js.native
    
    def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData = js.native
    
    def getLineDash(): js.Array[Double] = js.native
    
    def globalAlpha: Double = js.native
    def globalAlpha_=(value: Double): Unit = js.native
    
    def globalCompositeOperation: GlobalCompositeOperation = js.native
    def globalCompositeOperation_=(value: GlobalCompositeOperation): Unit = js.native
    
    def imageSmoothingEnabled: Boolean = js.native
    def imageSmoothingEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    @JSName("isDisposed")
    def isDisposed_MGraphicsContext: Boolean = js.native
    
    def isPointInPath(x: Double, y: Double): Boolean = js.native
    def isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule): Boolean = js.native
    
    def lineCap: CanvasLineCap = js.native
    def lineCap_=(value: CanvasLineCap): Unit = js.native
    
    def lineDashOffset: Double = js.native
    def lineDashOffset_=(value: Double): Unit = js.native
    
    def lineJoin: CanvasLineJoin = js.native
    def lineJoin_=(value: CanvasLineJoin): Unit = js.native
    
    def lineTo(x: Double, y: Double): Unit = js.native
    
    def lineWidth: Double = js.native
    def lineWidth_=(value: Double): Unit = js.native
    
    def measureText(text: String): TextMetrics = js.native
    
    def miterLimit: Double = js.native
    def miterLimit_=(value: Double): Unit = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    def putImageData(imagedata: ImageData, dx: Double, dy: Double): Unit = js.native
    def putImageData(
      imagedata: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: Double,
      dirtyY: Double,
      dirtyWidth: Double,
      dirtyHeight: Double
    ): Unit = js.native
    
    def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
    
    def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    def restore(): Unit = js.native
    
    def rotate(angle: Double): Unit = js.native
    
    def save(): Unit = js.native
    
    def scale(x: Double, y: Double): Unit = js.native
    
    def setLineDash(segments: js.Array[Double]): Unit = js.native
    
    def setTransform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native
    
    def shadowBlur: Double = js.native
    def shadowBlur_=(value: Double): Unit = js.native
    
    def shadowColor: String = js.native
    def shadowColor_=(value: String): Unit = js.native
    
    def shadowOffsetX: Double = js.native
    def shadowOffsetX_=(value: Double): Unit = js.native
    
    def shadowOffsetY: Double = js.native
    def shadowOffsetY_=(value: Double): Unit = js.native
    
    def stroke(): Unit = js.native
    
    def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    def strokeStyle: String | CanvasGradient | CanvasPattern = js.native
    def strokeStyle_=(value: String | CanvasGradient | CanvasPattern): Unit = js.native
    
    def strokeText(text: String, x: Double, y: Double): Unit = js.native
    def strokeText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    def textAlign: CanvasTextAlign = js.native
    def textAlign_=(value: CanvasTextAlign): Unit = js.native
    
    def textBaseline: CanvasTextBaseline = js.native
    def textBaseline_=(value: CanvasTextBaseline): Unit = js.native
    
    def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native
    
    def translate(x: Double, y: Double): Unit = js.native
  }
}
