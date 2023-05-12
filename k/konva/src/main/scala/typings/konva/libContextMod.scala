package typings.konva

import typings.konva.anon.WillReadFrequently
import typings.konva.konvaStrings.fillStyle
import typings.konva.konvaStrings.font
import typings.konva.konvaStrings.globalAlpha
import typings.konva.konvaStrings.globalCompositeOperation
import typings.konva.konvaStrings.imageSmoothingEnabled
import typings.konva.konvaStrings.lineCap
import typings.konva.konvaStrings.lineDashOffset
import typings.konva.konvaStrings.lineJoin
import typings.konva.konvaStrings.lineWidth
import typings.konva.konvaStrings.miterLimit
import typings.konva.konvaStrings.shadowBlur
import typings.konva.konvaStrings.shadowColor
import typings.konva.konvaStrings.shadowOffsetX
import typings.konva.konvaStrings.shadowOffsetY
import typings.konva.konvaStrings.strokeStyle
import typings.konva.konvaStrings.textAlign
import typings.konva.konvaStrings.textBaseline
import typings.konva.libCanvasMod.Canvas
import typings.konva.libNodeMod.Node
import typings.konva.libNodeMod.NodeConfig
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.IRect
import typings.std.CanvasFillRule
import typings.std.CanvasGradient
import typings.std.CanvasImageSource
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import typings.std.ImageData
import typings.std.Path2D
import typings.std.Pick
import typings.std.TextMetrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in 'fillStyle' | 'strokeStyle' | 'shadowColor' | 'shadowBlur' | 'shadowOffsetX' | 'shadowOffsetY' | 'lineCap' | 'lineDashOffset' | 'lineJoin' | 'lineWidth' | 'miterLimit' | 'font' | 'textAlign' | 'textBaseline' | 'globalAlpha' | 'globalCompositeOperation' | 'imageSmoothingEnabled' ]: std.CanvasRenderingContext2D[P]} */ @JSImport("konva/lib/Context", "Context")
  @js.native
  open class Context protected () extends StObject {
    def this(canvas: Canvas) = this()
    
    def _applyGlobalCompositeOperation(node: Any): Unit = js.native
    
    def _applyLineCap(shape: Shape[ShapeConfig]): Unit = js.native
    
    def _applyLineJoin(shape: Shape[ShapeConfig]): Unit = js.native
    
    def _applyOpacity(shape: Node[NodeConfig]): Unit = js.native
    
    var _context: CanvasRenderingContext2D = js.native
    
    def _enableTrace(): Unit = js.native
    
    def _fill(shape: Shape[ShapeConfig]): Unit = js.native
    
    def _stroke(shape: Shape[ShapeConfig]): Unit = js.native
    
    def _trace(str: Any): Unit = js.native
    
    def arc(a0: Double, a1: Double, a2: Double, a3: Double, a4: Double): Unit = js.native
    def arc(a0: Double, a1: Double, a2: Double, a3: Double, a4: Double, a5: Boolean): Unit = js.native
    
    def arcTo(a0: Double, a1: Double, a2: Double, a3: Double, a4: Double): Unit = js.native
    
    def beginPath(): Unit = js.native
    
    def bezierCurveTo(a0: Double, a1: Double, a2: Double, a3: Double, a4: Double, a5: Double): Unit = js.native
    
    var canvas: Canvas = js.native
    
    def clear(): Unit = js.native
    def clear(bounds: IRect): Unit = js.native
    
    def clearRect(a0: Double, a1: Double, a2: Double, a3: Double): Unit = js.native
    
    def clearTrace(): Unit = js.native
    
    def clip(): Unit = js.native
    
    def closePath(): Unit = js.native
    
    def createImageData(a0: Any, a1: Any): ImageData = js.native
    
    def createLinearGradient(a0: Double, a1: Double, a2: Double, a3: Double): CanvasGradient = js.native
    
    def createPattern(a0: CanvasImageSource): CanvasPattern = js.native
    def createPattern(a0: CanvasImageSource, a1: String): CanvasPattern = js.native
    
    def createRadialGradient(a0: Double, a1: Double, a2: Double, a3: Double, a4: Double, a5: Double): CanvasGradient = js.native
    
    def drawImage(
      a0: CanvasImageSource,
      a1: Double,
      a2: Double,
      a3: js.UndefOr[Double],
      a4: js.UndefOr[Double],
      a5: js.UndefOr[Double],
      a6: js.UndefOr[Double],
      a7: js.UndefOr[Double],
      a8: js.UndefOr[Double]
    ): Unit = js.native
    
    def ellipse(a0: Double, a1: Double, a2: Double, a3: Double, a4: Double, a5: Double, a6: Double): Unit = js.native
    def ellipse(a0: Double, a1: Double, a2: Double, a3: Double, a4: Double, a5: Double, a6: Double, a7: Boolean): Unit = js.native
    
    def fill(): Unit = js.native
    def fill(path2d: Path2D): Unit = js.native
    
    def fillRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    def fillShape(shape: Shape[ShapeConfig]): Unit = js.native
    
    def fillStrokeShape(shape: Shape[ShapeConfig]): Unit = js.native
    
    def fillText(text: String, x: Double, y: Double): Unit = js.native
    def fillText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    def getCanvas(): Canvas = js.native
    
    def getImageData(a0: Double, a1: Double, a2: Double, a3: Double): ImageData = js.native
    
    def getLineDash(): js.Array[Double] = js.native
    
    def getTrace(): String = js.native
    def getTrace(relaxed: Boolean): String = js.native
    def getTrace(relaxed: Boolean, rounded: Boolean): String = js.native
    def getTrace(relaxed: Unit, rounded: Boolean): String = js.native
    
    def isPointInPath(x: Double, y: Double): Boolean = js.native
    def isPointInPath(x: Double, y: Double, path: Unit, fillRule: CanvasFillRule): Boolean = js.native
    def isPointInPath(x: Double, y: Double, path: Path2D): Boolean = js.native
    def isPointInPath(x: Double, y: Double, path: Path2D, fillRule: CanvasFillRule): Boolean = js.native
    
    def lineTo(a0: Double, a1: Double): Unit = js.native
    
    def measureText(text: String): TextMetrics = js.native
    
    def moveTo(a0: Double, a1: Double): Unit = js.native
    
    def putImageData(a0: ImageData, a1: Double, a2: Double): Unit = js.native
    
    def quadraticCurveTo(a0: Double, a1: Double, a2: Double, a3: Double): Unit = js.native
    
    def rect(a0: Double, a1: Double, a2: Double, a3: Double): Unit = js.native
    
    def reset(): Unit = js.native
    
    def restore(): Unit = js.native
    
    def rotate(a0: Double): Unit = js.native
    
    def save(): Unit = js.native
    
    def scale(a0: Double, a1: Double): Unit = js.native
    
    def setAttr(attr: String, `val`: Any): Unit = js.native
    
    def setLineDash(a0: js.Array[Double]): Unit = js.native
    
    def setTransform(a0: Double, a1: Double, a2: Double, a3: Double, a4: Double, a5: Double): Unit = js.native
    
    def stroke(): Unit = js.native
    def stroke(path2d: Path2D): Unit = js.native
    
    def strokeRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    def strokeShape(shape: Shape[ShapeConfig]): Unit = js.native
    
    def strokeText(a0: String, a1: Double, a2: Double): Unit = js.native
    def strokeText(a0: String, a1: Double, a2: Double, a3: Double): Unit = js.native
    
    var traceArr: js.Array[String] = js.native
    
    def transform(a0: Double, a1: Double, a2: Double, a3: Double, a4: Double, a5: Double): Unit = js.native
    
    def translate(a0: Double, a1: Double): Unit = js.native
  }
  
  @JSImport("konva/lib/Context", "HitContext")
  @js.native
  open class HitContext protected () extends Context {
    def this(canvas: Canvas) = this()
    
    def _stroke(shape: Any): Unit = js.native
  }
  
  @JSImport("konva/lib/Context", "SceneContext")
  @js.native
  open class SceneContext protected () extends Context {
    def this(canvas: Canvas) = this()
    def this(canvas: Canvas, param1: WillReadFrequently) = this()
    
    def _applyShadow(shape: Any): Unit = js.native
    
    def _fill(shape: Any): Unit = js.native
    
    def _fillColor(shape: Shape[ShapeConfig]): Unit = js.native
    
    def _fillLinearGradient(shape: Shape[ShapeConfig]): Unit = js.native
    
    def _fillPattern(shape: Shape[ShapeConfig]): Unit = js.native
    
    def _fillRadialGradient(shape: Shape[ShapeConfig]): Unit = js.native
    
    def _stroke(shape: Any): Unit = js.native
    
    def _strokeLinearGradient(shape: Any): Unit = js.native
  }
  
  type CanvasContextProps = Pick[
    CanvasRenderingContext2D, 
    fillStyle | strokeStyle | shadowColor | shadowBlur | shadowOffsetX | shadowOffsetY | lineCap | lineDashOffset | lineJoin | lineWidth | miterLimit | font | textAlign | textBaseline | globalAlpha | globalCompositeOperation | imageSmoothingEnabled
  ]
}
