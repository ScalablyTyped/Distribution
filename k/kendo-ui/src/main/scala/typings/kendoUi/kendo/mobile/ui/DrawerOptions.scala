package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawerOptions extends StObject {
  
  var afterHide: js.UndefOr[js.Function1[/* e */ DrawerAfterHideEvent, Unit]] = js.undefined
  
  var beforeShow: js.UndefOr[js.Function1[/* e */ DrawerEvent, Unit]] = js.undefined
  
  var container: js.UndefOr[JQuery] = js.undefined
  
  var hide: js.UndefOr[js.Function1[/* e */ DrawerHideEvent, Unit]] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* e */ DrawerInitEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[js.Function1[/* e */ DrawerShowEvent, Unit]] = js.undefined
  
  var swipeToOpen: js.UndefOr[Boolean] = js.undefined
  
  var swipeToOpenViews: js.UndefOr[js.Any] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var views: js.UndefOr[js.Any] = js.undefined
}
object DrawerOptions {
  
  @scala.inline
  def apply(): DrawerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerOptions]
  }
  
  @scala.inline
  implicit class DrawerOptionsMutableBuilder[Self <: DrawerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterHide(value: /* e */ DrawerAfterHideEvent => Unit): Self = StObject.set(x, "afterHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterHideUndefined: Self = StObject.set(x, "afterHide", js.undefined)
    
    @scala.inline
    def setBeforeShow(value: /* e */ DrawerEvent => Unit): Self = StObject.set(x, "beforeShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    @scala.inline
    def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setHide(value: /* e */ DrawerHideEvent => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setInit(value: /* e */ DrawerInitEvent => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShow(value: /* e */ DrawerShowEvent => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSwipeToOpen(value: Boolean): Self = StObject.set(x, "swipeToOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeToOpenUndefined: Self = StObject.set(x, "swipeToOpen", js.undefined)
    
    @scala.inline
    def setSwipeToOpenViews(value: js.Any): Self = StObject.set(x, "swipeToOpenViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeToOpenViewsUndefined: Self = StObject.set(x, "swipeToOpenViews", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setViews(value: js.Any): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
  }
}
