package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaneOptions extends StObject {
  
  var collapsible: js.UndefOr[Boolean] = js.native
  
  var initial: js.UndefOr[String] = js.native
  
  var layout: js.UndefOr[String] = js.native
  
  var loading: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var navigate: js.UndefOr[js.Function1[/* e */ PaneNavigateEvent, Unit]] = js.native
  
  var portraitWidth: js.UndefOr[Double] = js.native
  
  var transition: js.UndefOr[String] = js.native
  
  var viewShow: js.UndefOr[js.Function1[/* e */ PaneViewShowEvent, Unit]] = js.native
}
object PaneOptions {
  
  @scala.inline
  def apply(): PaneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneOptions]
  }
  
  @scala.inline
  implicit class PaneOptionsMutableBuilder[Self <: PaneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    @scala.inline
    def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNavigate(value: /* e */ PaneNavigateEvent => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    @scala.inline
    def setPortraitWidth(value: Double): Self = StObject.set(x, "portraitWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortraitWidthUndefined: Self = StObject.set(x, "portraitWidth", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setViewShow(value: /* e */ PaneViewShowEvent => Unit): Self = StObject.set(x, "viewShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setViewShowUndefined: Self = StObject.set(x, "viewShow", js.undefined)
  }
}
