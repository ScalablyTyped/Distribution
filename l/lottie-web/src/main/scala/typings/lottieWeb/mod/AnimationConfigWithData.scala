package typings.lottieWeb.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationConfigWithData[T /* <: RendererType */]
  extends StObject
     with AnimationConfig[T] {
  
  var animationData: js.UndefOr[Any] = js.undefined
}
object AnimationConfigWithData {
  
  inline def apply[T /* <: RendererType */](container: Element): AnimationConfigWithData[T] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationConfigWithData[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationConfigWithData[?], T /* <: RendererType */] (val x: Self & AnimationConfigWithData[T]) extends AnyVal {
    
    inline def setAnimationData(value: Any): Self = StObject.set(x, "animationData", value.asInstanceOf[js.Any])
    
    inline def setAnimationDataUndefined: Self = StObject.set(x, "animationData", js.undefined)
  }
}
