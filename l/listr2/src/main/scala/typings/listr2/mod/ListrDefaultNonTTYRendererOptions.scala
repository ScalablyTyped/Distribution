package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Select a fallback renderer to fallback to in non-tty conditions */
trait ListrDefaultNonTTYRendererOptions[T /* <: ListrRendererValue */] extends StObject {
  
  /** the fallback renderer to fallback to on non-tty conditions */
  var nonTTYRenderer: js.UndefOr[T] = js.undefined
  
  /** Renderer options depending on the current renderer */
  var nonTTYRendererOptions: js.UndefOr[ListrGetRendererOptions[T]] = js.undefined
}
object ListrDefaultNonTTYRendererOptions {
  
  inline def apply[T /* <: ListrRendererValue */](): ListrDefaultNonTTYRendererOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrDefaultNonTTYRendererOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrDefaultNonTTYRendererOptions[?], T /* <: ListrRendererValue */] (val x: Self & ListrDefaultNonTTYRendererOptions[T]) extends AnyVal {
    
    inline def setNonTTYRenderer(value: T): Self = StObject.set(x, "nonTTYRenderer", value.asInstanceOf[js.Any])
    
    inline def setNonTTYRendererOptions(value: ListrGetRendererOptions[T]): Self = StObject.set(x, "nonTTYRendererOptions", value.asInstanceOf[js.Any])
    
    inline def setNonTTYRendererOptionsUndefined: Self = StObject.set(x, "nonTTYRendererOptions", js.undefined)
    
    inline def setNonTTYRendererUndefined: Self = StObject.set(x, "nonTTYRenderer", js.undefined)
  }
}
