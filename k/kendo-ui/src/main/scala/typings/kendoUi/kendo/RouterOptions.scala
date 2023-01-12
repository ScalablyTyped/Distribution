package typings.kendoUi.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ RouterChangeEvent, Unit]] = js.undefined
  
  var hashBang: js.UndefOr[Boolean] = js.undefined
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* e */ RouterEvent, Unit]] = js.undefined
  
  var pushState: js.UndefOr[Boolean] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var routeMissing: js.UndefOr[js.Function1[/* e */ RouterRouteMissingEvent, Unit]] = js.undefined
  
  var same: js.UndefOr[js.Function1[/* e */ RouterEvent, Unit]] = js.undefined
}
object RouterOptions {
  
  inline def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
    
    inline def setChange(value: /* e */ RouterChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setHashBang(value: Boolean): Self = StObject.set(x, "hashBang", value.asInstanceOf[js.Any])
    
    inline def setHashBangUndefined: Self = StObject.set(x, "hashBang", js.undefined)
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setInit(value: /* e */ RouterEvent => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setPushState(value: Boolean): Self = StObject.set(x, "pushState", value.asInstanceOf[js.Any])
    
    inline def setPushStateUndefined: Self = StObject.set(x, "pushState", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setRouteMissing(value: /* e */ RouterRouteMissingEvent => Unit): Self = StObject.set(x, "routeMissing", js.Any.fromFunction1(value))
    
    inline def setRouteMissingUndefined: Self = StObject.set(x, "routeMissing", js.undefined)
    
    inline def setSame(value: /* e */ RouterEvent => Unit): Self = StObject.set(x, "same", js.Any.fromFunction1(value))
    
    inline def setSameUndefined: Self = StObject.set(x, "same", js.undefined)
  }
}
