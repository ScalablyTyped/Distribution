package typings.html2canvas

import typings.html2canvas.distTypesDomElementContainerMod.ElementContainer
import typings.html2canvas.distTypesRenderBoundCurvesMod.BoundCurves
import typings.html2canvas.distTypesRenderEffectsMod.EffectTarget
import typings.html2canvas.distTypesRenderEffectsMod.IElementEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRenderStackingContextMod {
  
  @JSImport("html2canvas/dist/types/render/stacking-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/render/stacking-context", "ElementPaint")
  @js.native
  open class ElementPaint protected () extends StObject {
    def this(container: ElementContainer) = this()
    def this(container: ElementContainer, parent: ElementPaint) = this()
    
    val container: ElementContainer = js.native
    
    val curves: BoundCurves = js.native
    
    val effects: js.Array[IElementEffect] = js.native
    
    def getEffects(target: EffectTarget): js.Array[IElementEffect] = js.native
    
    var listValue: js.UndefOr[String] = js.native
    
    val parent: ElementPaint | Null = js.native
  }
  
  @JSImport("html2canvas/dist/types/render/stacking-context", "StackingContext")
  @js.native
  open class StackingContext protected () extends StObject {
    def this(container: ElementPaint) = this()
    
    var element: ElementPaint = js.native
    
    var inlineLevel: js.Array[ElementPaint] = js.native
    
    var negativeZIndex: js.Array[StackingContext] = js.native
    
    var nonInlineLevel: js.Array[ElementPaint] = js.native
    
    var nonPositionedFloats: js.Array[StackingContext] = js.native
    
    var nonPositionedInlineLevel: js.Array[StackingContext] = js.native
    
    var positiveZIndex: js.Array[StackingContext] = js.native
    
    var zeroOrAutoZIndexOrTransformedOrOpacity: js.Array[StackingContext] = js.native
  }
  
  inline def parseStackingContexts(container: ElementContainer): StackingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStackingContexts")(container.asInstanceOf[js.Any]).asInstanceOf[StackingContext]
}
