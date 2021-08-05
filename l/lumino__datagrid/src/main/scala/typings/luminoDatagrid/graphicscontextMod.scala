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
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.std.TextMetrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphicscontextMod {
  
  @JSImport("@lumino/datagrid/lib/graphicscontext", "GraphicsContext")
  @js.native
  class GraphicsContext protected ()
    extends StObject
       with IDisposable {
    /**
      * Create a new graphics context object.
      *
      * @param context - The 2D canvas rendering context to wrap.
      */
    def this(context: CanvasRenderingContext2D) = this()
    
    /* private */ var _context: js.Any = js.native
    
    /* private */ var _disposed: js.Any = js.native
    
    /* private */ var _state: js.Any = js.native
    
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
    
    var fillStyle: String | CanvasGradient | CanvasPattern = js.native
    
    def fillText(text: String, x: Double, y: Double): Unit = js.native
    def fillText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    var font: String = js.native
    
    def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData = js.native
    
    def getLineDash(): js.Array[Double] = js.native
    
    var globalAlpha: Double = js.native
    
    var globalCompositeOperation: String = js.native
    
    var imageSmoothingEnabled: Boolean = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    
    def isPointInPath(x: Double, y: Double): Boolean = js.native
    def isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule): Boolean = js.native
    
    var lineCap: CanvasLineCap = js.native
    
    var lineDashOffset: Double = js.native
    
    var lineJoin: CanvasLineJoin = js.native
    
    def lineTo(x: Double, y: Double): Unit = js.native
    
    var lineWidth: Double = js.native
    
    def measureText(text: String): TextMetrics = js.native
    
    var miterLimit: Double = js.native
    
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
    
    var shadowBlur: Double = js.native
    
    var shadowColor: String = js.native
    
    var shadowOffsetX: Double = js.native
    
    var shadowOffsetY: Double = js.native
    
    def stroke(): Unit = js.native
    
    def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    var strokeStyle: String | CanvasGradient | CanvasPattern = js.native
    
    def strokeText(text: String, x: Double, y: Double): Unit = js.native
    def strokeText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    var textAlign: CanvasTextAlign = js.native
    
    var textBaseline: CanvasTextBaseline = js.native
    
    def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native
    
    def translate(x: Double, y: Double): Unit = js.native
  }
}
