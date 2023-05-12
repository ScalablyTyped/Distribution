package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Selection and options of the primary preferred renderer. */
trait ListrPrimaryRendererOptions[T /* <: ListrRendererValue */] extends StObject {
  
  /** Default renderer preferred. */
  var renderer: js.UndefOr[T] = js.undefined
  
  /** Renderer options depending on the current renderer. */
  var rendererOptions: js.UndefOr[ListrGetRendererOptions[T]] = js.undefined
}
object ListrPrimaryRendererOptions {
  
  inline def apply[T /* <: ListrRendererValue */](): ListrPrimaryRendererOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrPrimaryRendererOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrPrimaryRendererOptions[?], T /* <: ListrRendererValue */] (val x: Self & ListrPrimaryRendererOptions[T]) extends AnyVal {
    
    inline def setRenderer(value: T): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererOptions(value: ListrGetRendererOptions[T]): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRendererOptionsUndefined: Self = StObject.set(x, "rendererOptions", js.undefined)
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
  }
}
