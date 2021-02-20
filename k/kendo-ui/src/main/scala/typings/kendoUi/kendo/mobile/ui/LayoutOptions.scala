package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutOptions extends StObject {
  
  var hide: js.UndefOr[js.Function1[/* e */ LayoutHideEvent, Unit]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var init: js.UndefOr[js.Function1[/* e */ LayoutInitEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var platform: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[js.Function1[/* e */ LayoutShowEvent, Unit]] = js.native
}
object LayoutOptions {
  
  @scala.inline
  def apply(): LayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutOptions]
  }
  
  @scala.inline
  implicit class LayoutOptionsMutableBuilder[Self <: LayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: /* e */ LayoutHideEvent => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInit(value: /* e */ LayoutInitEvent => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setShow(value: /* e */ LayoutShowEvent => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
