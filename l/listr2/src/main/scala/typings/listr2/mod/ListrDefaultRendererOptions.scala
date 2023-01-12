package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Select renderer as default renderer */
trait ListrDefaultRendererOptions[T /* <: ListrRendererValue */] extends StObject {
  
  /** the default renderer */
  var renderer: js.UndefOr[T] = js.undefined
  
  /** Renderer options depending on the current renderer */
  var rendererOptions: js.UndefOr[ListrGetRendererOptions[T]] = js.undefined
}
object ListrDefaultRendererOptions {
  
  inline def apply[T /* <: ListrRendererValue */](): ListrDefaultRendererOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrDefaultRendererOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrDefaultRendererOptions[?], T /* <: ListrRendererValue */] (val x: Self & ListrDefaultRendererOptions[T]) extends AnyVal {
    
    inline def setRenderer(value: T): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererOptions(value: ListrGetRendererOptions[T]): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRendererOptionsUndefined: Self = StObject.set(x, "rendererOptions", js.undefined)
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
  }
}
