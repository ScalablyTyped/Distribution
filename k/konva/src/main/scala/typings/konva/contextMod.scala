package typings.konva

import typings.konva.canvasMod.Canvas
import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.std.CanvasGradient
import typings.std.CanvasImageSource
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import typings.std.ImageData
import typings.std.TextMetrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("konva/types/Context", "Context")
  @js.native
  class Context protected () extends StObject {
    def this(canvas: Canvas) = this()
    
    def _applyGlobalCompositeOperation(node: js.Any): Unit = js.native
    
    def _applyLineCap(shape: js.Any): Unit = js.native
    
    def _applyLineJoin(shape: Shape[ShapeConfig]): Unit = js.native
    
    def _applyOpacity(shape: js.Any): Unit = js.native
    
    var _context: CanvasRenderingContext2D = js.native
    
    def _enableTrace(): Unit = js.native
    
    def _fill(shape: js.Any): Unit = js.native
    
    def _stroke(shape: js.Any): Unit = js.native
    
    def _trace(str: js.Any): Unit = js.native
    
    def arc(a0: js.Any, a1: js.Any, a2: js.Any, a3: js.Any, a4: js.Any, a5: js.Any): Unit = js.native
    
    def arcTo(a0: js.Any, a1: js.Any, a2: js.Any, a3: js.Any, a4: js.Any): Unit = js.native
    
    def beginPath(): Unit = js.native
    
    def bezierCurveTo(a0: js.Any, a1: js.Any, a2: js.Any, a3: js.Any, a4: js.Any, a5: js.Any): Unit = js.native
    
    var canvas: Canvas = js.native
    
    def clear(): Unit = js.native
    def clear(bounds: js.Any): Unit = js.native
    
    def clearRect(a0: js.Any, a1: js.Any, a2: js.Any, a3: js.Any): Unit = js.native
    
    def clearTrace(): Unit = js.native
    
    def clip(): Unit = js.native
    
    def closePath(): Unit = js.native
    
    def createImageData(a0: js.Any, a1: js.Any): ImageData = js.native
    
    def createLinearGradient(a0: js.Any, a1: js.Any, a2: js.Any, a3: js.Any): CanvasGradient = js.native
    
    def createPattern(a0: js.Any, a1: js.Any): CanvasPattern = js.native
    
    def createRadialGradient(a0: js.Any, a1: js.Any, a2: js.Any, a3: js.Any, a4: js.Any, a5: js.Any): CanvasGradient = js.native
    
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
    
    def fillRect(x: js.Any, y: js.Any, width: js.Any, height: js.Any): Unit = js.native
    
    def fillShape(shape: Shape[ShapeConfig]): Unit = js.native
    
    def fillStrokeShape(shape: Shape[ShapeConfig]): Unit = js.native
    
    def fillText(a0: js.Any, a1: js.Any, a2: js.Any): Unit = js.native
    
    def getCanvas(): Canvas = js.native
    
    def getImageData(a0: js.Any, a1: js.Any, a2: js.Any, a3: js.Any): ImageData = js.native
    
    def getLineDash(): js.Array[Double] = js.native
    
    def getTrace(relaxed: js.Any): String = js.native
    
    def isPointInPath(x: js.Any, y: js.Any): Boolean = js.native
    
    def lineTo(a0: js.Any, a1: js.Any): Unit = js.native
    
    def measureText(text: js.Any): TextMetrics = js.native
    
    def moveTo(a0: js.Any, a1: js.Any): Unit = js.native
    
    def putImageData(a0: js.Any, a1: js.Any, a2: js.Any): Unit = js.native
    
    def quadraticCurveTo(a0: js.Any, a1: js.Any, a2: js.Any, a3: js.Any): Unit = js.native
    
    def rect(a0: js.Any, a1: js.Any, a2: js.Any, a3: js.Any): Unit = js.native
    
    def reset(): Unit = js.native
    
    def restore(): Unit = js.native
    
    def rotate(a0: js.Any): Unit = js.native
    
    def save(): Unit = js.native
    
    def scale(a0: js.Any, a1: js.Any): Unit = js.native
    
    def setAttr(attr: js.Any, `val`: js.Any): Unit = js.native
    
    def setLineDash(a0: js.Any): Unit = js.native
    
    def setTransform(a0: js.Any, a1: js.Any, a2: js.Any, a3: js.Any, a4: js.Any, a5: js.Any): Unit = js.native
    
    def stroke(): Unit = js.native
    
    def strokeRect(x: js.Any, y: js.Any, width: js.Any, height: js.Any): Unit = js.native
    
    def strokeShape(shape: Shape[ShapeConfig]): Unit = js.native
    
    def strokeText(a0: js.Any, a1: js.Any, a2: js.Any, a3: js.Any): Unit = js.native
    
    var traceArr: js.Array[String] = js.native
    
    def transform(a0: js.Any, a1: js.Any, a2: js.Any, a3: js.Any, a4: js.Any, a5: js.Any): Unit = js.native
    
    def translate(a0: js.Any, a1: js.Any): Unit = js.native
  }
  
  @JSImport("konva/types/Context", "HitContext")
  @js.native
  class HitContext protected () extends Context {
    def this(canvas: Canvas) = this()
  }
  
  @JSImport("konva/types/Context", "SceneContext")
  @js.native
  class SceneContext protected () extends Context {
    def this(canvas: Canvas) = this()
    
    def _applyShadow(shape: js.Any): Unit = js.native
    
    def _fillColor(shape: js.Any): Unit = js.native
    
    def _fillLinearGradient(shape: js.Any): Unit = js.native
    
    def _fillPattern(shape: js.Any): Unit = js.native
    
    def _fillRadialGradient(shape: js.Any): Unit = js.native
    
    def _strokeLinearGradient(shape: js.Any): Unit = js.native
  }
}
