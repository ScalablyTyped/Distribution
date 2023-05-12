package typings.lottieWeb.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationConfigWithPath[T /* <: RendererType */]
  extends StObject
     with AnimationConfig[T] {
  
  var path: js.UndefOr[String] = js.undefined
}
object AnimationConfigWithPath {
  
  inline def apply[T /* <: RendererType */](container: Element): AnimationConfigWithPath[T] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationConfigWithPath[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationConfigWithPath[?], T /* <: RendererType */] (val x: Self & AnimationConfigWithPath[T]) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
