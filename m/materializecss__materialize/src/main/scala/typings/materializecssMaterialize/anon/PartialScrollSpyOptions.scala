package typings.materializecssMaterialize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.ScrollSpyOptions> */
trait PartialScrollSpyOptions extends StObject {
  
  var activeClass: js.UndefOr[String] = js.undefined
  
  var getActiveElement: js.UndefOr[js.Function1[/* id */ String, String]] = js.undefined
  
  var scrollOffset: js.UndefOr[Double] = js.undefined
  
  var throttle: js.UndefOr[Double] = js.undefined
}
object PartialScrollSpyOptions {
  
  inline def apply(): PartialScrollSpyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollSpyOptions]
  }
  
  extension [Self <: PartialScrollSpyOptions](x: Self) {
    
    inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
    
    inline def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
    
    inline def setGetActiveElement(value: /* id */ String => String): Self = StObject.set(x, "getActiveElement", js.Any.fromFunction1(value))
    
    inline def setGetActiveElementUndefined: Self = StObject.set(x, "getActiveElement", js.undefined)
    
    inline def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    inline def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
  }
}
