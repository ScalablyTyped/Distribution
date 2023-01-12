package typings.html2canvas

import typings.html2canvas.distTypesCoreContextMod.Context
import typings.html2canvas.distTypesCssLayoutTextMod.TextBounds
import typings.html2canvas.distTypesCssMod.CSSParsedDeclaration
import typings.html2canvas.distTypesCssPropertyDescriptorsBorderStyleMod.BORDER_STYLE
import typings.html2canvas.distTypesCssTypesColorMod.Color_
import typings.html2canvas.distTypesDomElementContainerMod.ElementContainer
import typings.html2canvas.distTypesDomReplacedElementsMod.ReplacedElementContainer
import typings.html2canvas.distTypesDomTextContainerMod.TextContainer
import typings.html2canvas.distTypesRenderBoundCurvesMod.BoundCurves
import typings.html2canvas.distTypesRenderEffectsMod.IElementEffect
import typings.html2canvas.distTypesRenderPathMod.Path
import typings.html2canvas.distTypesRenderRendererMod.Renderer
import typings.html2canvas.distTypesRenderStackingContextMod.ElementPaint
import typings.html2canvas.distTypesRenderStackingContextMod.StackingContext
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRenderCanvasCanvasRendererMod {
  
  @JSImport("html2canvas/dist/types/render/canvas/canvas-renderer", "CanvasRenderer")
  @js.native
  open class CanvasRenderer protected () extends Renderer {
    def this(context: Context, options: RenderConfigurations) = this()
    
    /* private */ val _activeEffects: Any = js.native
    
    def applyEffect(effect: IElementEffect): Unit = js.native
    
    def applyEffects(effects: js.Array[IElementEffect]): Unit = js.native
    
    var canvas: HTMLCanvasElement = js.native
    
    /* private */ var createFontStyle: Any = js.native
    
    var ctx: CanvasRenderingContext2D = js.native
    
    /* private */ val fontMetrics: Any = js.native
    
    def formatPath(paths: js.Array[Path]): Unit = js.native
    
    def mask(paths: js.Array[Path]): Unit = js.native
    
    def path(paths: js.Array[Path]): Unit = js.native
    
    def popEffect(): Unit = js.native
    
    def render(element: ElementContainer): js.Promise[HTMLCanvasElement] = js.native
    
    def renderBackgroundImage(container: ElementContainer): js.Promise[Unit] = js.native
    
    def renderDashedDottedBorder(color: Color_, width: Double, side: Double, curvePoints: BoundCurves, style: BORDER_STYLE): js.Promise[Unit] = js.native
    
    def renderDoubleBorder(color: Color_, width: Double, side: Double, curvePoints: BoundCurves): js.Promise[Unit] = js.native
    
    def renderNode(paint: ElementPaint): js.Promise[Unit] = js.native
    
    def renderNodeBackgroundAndBorders(paint: ElementPaint): js.Promise[Unit] = js.native
    
    def renderNodeContent(paint: ElementPaint): js.Promise[Unit] = js.native
    
    def renderRepeat(path: js.Array[Path], pattern: CanvasGradient, offsetX: Double, offsetY: Double): Unit = js.native
    def renderRepeat(path: js.Array[Path], pattern: CanvasPattern, offsetX: Double, offsetY: Double): Unit = js.native
    
    def renderReplacedElement(container: ReplacedElementContainer, curves: BoundCurves, image: HTMLCanvasElement): Unit = js.native
    def renderReplacedElement(container: ReplacedElementContainer, curves: BoundCurves, image: HTMLImageElement): Unit = js.native
    
    def renderSolidBorder(color: Color_, side: Double, curvePoints: BoundCurves): js.Promise[Unit] = js.native
    
    def renderStack(stack: StackingContext): js.Promise[Unit] = js.native
    
    def renderStackContent(stack: StackingContext): js.Promise[Unit] = js.native
    
    def renderTextNode(text: TextContainer, styles: CSSParsedDeclaration): js.Promise[Unit] = js.native
    
    def renderTextWithLetterSpacing(text: TextBounds, letterSpacing: Double, baseline: Double): Unit = js.native
    
    def resizeImage(image: HTMLImageElement, width: Double, height: Double): HTMLCanvasElement | HTMLImageElement = js.native
  }
  
  trait RenderConfigurations
    extends StObject
       with RenderOptions {
    
    var backgroundColor: Color_ | Null
  }
  object RenderConfigurations {
    
    inline def apply(height: Double, scale: Double, width: Double, x: Double, y: Double): RenderConfigurations = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], backgroundColor = null)
      __obj.asInstanceOf[RenderConfigurations]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderConfigurations] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: Color_): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    }
  }
  
  trait RenderOptions extends StObject {
    
    var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
    
    var height: Double
    
    var scale: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object RenderOptions {
    
    inline def apply(height: Double, scale: Double, width: Double, x: Double, y: Double): RenderOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
