package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneOptions extends StObject {
  
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  var initial: js.UndefOr[String] = js.undefined
  
  var layout: js.UndefOr[String] = js.undefined
  
  var loading: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var navigate: js.UndefOr[js.Function1[/* e */ PaneNavigateEvent, Unit]] = js.undefined
  
  var portraitWidth: js.UndefOr[Double] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
  
  var viewShow: js.UndefOr[js.Function1[/* e */ PaneViewShowEvent, Unit]] = js.undefined
}
object PaneOptions {
  
  inline def apply(): PaneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneOptions]
  }
  
  extension [Self <: PaneOptions](x: Self) {
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNavigate(value: /* e */ PaneNavigateEvent => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
    
    inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    inline def setPortraitWidth(value: Double): Self = StObject.set(x, "portraitWidth", value.asInstanceOf[js.Any])
    
    inline def setPortraitWidthUndefined: Self = StObject.set(x, "portraitWidth", js.undefined)
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setViewShow(value: /* e */ PaneViewShowEvent => Unit): Self = StObject.set(x, "viewShow", js.Any.fromFunction1(value))
    
    inline def setViewShowUndefined: Self = StObject.set(x, "viewShow", js.undefined)
  }
}
