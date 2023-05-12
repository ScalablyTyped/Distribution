package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Selection and options of the preferred fallback renderer. */
trait ListrSecondaryRendererOptions[T /* <: ListrRendererValue */] extends StObject {
  
  /** Fallback renderer preferred. */
  var fallbackRenderer: js.UndefOr[T] = js.undefined
  
  /** Renderer options depending on the fallback renderer. */
  var fallbackRendererOptions: js.UndefOr[ListrGetRendererOptions[T]] = js.undefined
}
object ListrSecondaryRendererOptions {
  
  inline def apply[T /* <: ListrRendererValue */](): ListrSecondaryRendererOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrSecondaryRendererOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrSecondaryRendererOptions[?], T /* <: ListrRendererValue */] (val x: Self & ListrSecondaryRendererOptions[T]) extends AnyVal {
    
    inline def setFallbackRenderer(value: T): Self = StObject.set(x, "fallbackRenderer", value.asInstanceOf[js.Any])
    
    inline def setFallbackRendererOptions(value: ListrGetRendererOptions[T]): Self = StObject.set(x, "fallbackRendererOptions", value.asInstanceOf[js.Any])
    
    inline def setFallbackRendererOptionsUndefined: Self = StObject.set(x, "fallbackRendererOptions", js.undefined)
    
    inline def setFallbackRendererUndefined: Self = StObject.set(x, "fallbackRenderer", js.undefined)
  }
}
