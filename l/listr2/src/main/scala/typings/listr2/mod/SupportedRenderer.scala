package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Renderer selection for current Listr. */
trait SupportedRenderer[Renderer /* <: ListrRendererFactory */] extends StObject {
  
  var options: js.UndefOr[ListrGetRendererOptions[Renderer]] = js.undefined
  
  var renderer: Renderer
}
object SupportedRenderer {
  
  inline def apply[Renderer /* <: ListrRendererFactory */](renderer: Renderer): SupportedRenderer[Renderer] = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedRenderer[Renderer]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportedRenderer[?], Renderer /* <: ListrRendererFactory */] (val x: Self & SupportedRenderer[Renderer]) extends AnyVal {
    
    inline def setOptions(value: ListrGetRendererOptions[Renderer]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
