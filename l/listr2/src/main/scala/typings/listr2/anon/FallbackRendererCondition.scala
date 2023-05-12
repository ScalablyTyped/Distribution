package typings.listr2.anon

import typings.listr2.mod.ListrGetRendererOptions
import typings.listr2.mod.ListrRendererValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FallbackRendererCondition[Renderer /* <: ListrRendererValue */, FallbackRenderer /* <: ListrRendererValue */] extends StObject {
  
  var fallbackRenderer: FallbackRenderer
  
  var fallbackRendererCondition: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  
  var fallbackRendererOptions: ListrGetRendererOptions[FallbackRenderer]
  
  var renderer: Renderer
  
  var rendererOptions: ListrGetRendererOptions[Renderer]
  
  var silentRendererCondition: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
}
object FallbackRendererCondition {
  
  inline def apply[Renderer /* <: ListrRendererValue */, FallbackRenderer /* <: ListrRendererValue */](
    fallbackRenderer: FallbackRenderer,
    fallbackRendererOptions: ListrGetRendererOptions[FallbackRenderer],
    renderer: Renderer,
    rendererOptions: ListrGetRendererOptions[Renderer]
  ): FallbackRendererCondition[Renderer, FallbackRenderer] = {
    val __obj = js.Dynamic.literal(fallbackRenderer = fallbackRenderer.asInstanceOf[js.Any], fallbackRendererOptions = fallbackRendererOptions.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], rendererOptions = rendererOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FallbackRendererCondition[Renderer, FallbackRenderer]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FallbackRendererCondition[?, ?], Renderer /* <: ListrRendererValue */, FallbackRenderer /* <: ListrRendererValue */] (val x: Self & (FallbackRendererCondition[Renderer, FallbackRenderer])) extends AnyVal {
    
    inline def setFallbackRenderer(value: FallbackRenderer): Self = StObject.set(x, "fallbackRenderer", value.asInstanceOf[js.Any])
    
    inline def setFallbackRendererCondition(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "fallbackRendererCondition", value.asInstanceOf[js.Any])
    
    inline def setFallbackRendererConditionFunction0(value: () => Boolean): Self = StObject.set(x, "fallbackRendererCondition", js.Any.fromFunction0(value))
    
    inline def setFallbackRendererConditionUndefined: Self = StObject.set(x, "fallbackRendererCondition", js.undefined)
    
    inline def setFallbackRendererOptions(value: ListrGetRendererOptions[FallbackRenderer]): Self = StObject.set(x, "fallbackRendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererOptions(value: ListrGetRendererOptions[Renderer]): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setSilentRendererCondition(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "silentRendererCondition", value.asInstanceOf[js.Any])
    
    inline def setSilentRendererConditionFunction0(value: () => Boolean): Self = StObject.set(x, "silentRendererCondition", js.Any.fromFunction0(value))
    
    inline def setSilentRendererConditionUndefined: Self = StObject.set(x, "silentRendererCondition", js.undefined)
  }
}
