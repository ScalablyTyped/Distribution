package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.ScrollSpyOptions> */
@js.native
trait PartialScrollSpyOptions extends StObject {
  
  var activeClass: js.UndefOr[String] = js.native
  
  var getActiveElement: js.UndefOr[js.Function1[/* id */ String, String]] = js.native
  
  var scrollOffset: js.UndefOr[Double] = js.native
  
  var throttle: js.UndefOr[Double] = js.native
}
object PartialScrollSpyOptions {
  
  @scala.inline
  def apply(): PartialScrollSpyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollSpyOptions]
  }
  
  @scala.inline
  implicit class PartialScrollSpyOptionsMutableBuilder[Self <: PartialScrollSpyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
    
    @scala.inline
    def setGetActiveElement(value: /* id */ String => String): Self = StObject.set(x, "getActiveElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetActiveElementUndefined: Self = StObject.set(x, "getActiveElement", js.undefined)
    
    @scala.inline
    def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
    
    @scala.inline
    def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
  }
}
