package typings.kendoUi.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ RouterChangeEvent, Unit]] = js.native
  
  var hashBang: js.UndefOr[Boolean] = js.native
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  var init: js.UndefOr[js.Function1[/* e */ RouterEvent, Unit]] = js.native
  
  var pushState: js.UndefOr[Boolean] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var routeMissing: js.UndefOr[js.Function1[/* e */ RouterRouteMissingEvent, Unit]] = js.native
  
  var same: js.UndefOr[js.Function1[/* e */ RouterEvent, Unit]] = js.native
}
object RouterOptions {
  
  @scala.inline
  def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  
  @scala.inline
  implicit class RouterOptionsMutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ RouterChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setHashBang(value: Boolean): Self = StObject.set(x, "hashBang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashBangUndefined: Self = StObject.set(x, "hashBang", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    @scala.inline
    def setInit(value: /* e */ RouterEvent => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setPushState(value: Boolean): Self = StObject.set(x, "pushState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushStateUndefined: Self = StObject.set(x, "pushState", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setRouteMissing(value: /* e */ RouterRouteMissingEvent => Unit): Self = StObject.set(x, "routeMissing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRouteMissingUndefined: Self = StObject.set(x, "routeMissing", js.undefined)
    
    @scala.inline
    def setSame(value: /* e */ RouterEvent => Unit): Self = StObject.set(x, "same", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSameUndefined: Self = StObject.set(x, "same", js.undefined)
  }
}
