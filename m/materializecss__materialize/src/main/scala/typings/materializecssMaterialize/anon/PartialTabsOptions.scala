package typings.materializecssMaterialize.anon

import typings.materializecssMaterialize.M.Tabs
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.TabsOptions> */
trait PartialTabsOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ Tabs, /* newContent */ Element, Unit]] = js.undefined
  
  var responsiveThreshold: js.UndefOr[Double] = js.undefined
  
  var swipeable: js.UndefOr[Boolean] = js.undefined
}
object PartialTabsOptions {
  
  inline def apply(): PartialTabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTabsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTabsOptions] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setOnShow(value: js.ThisFunction1[/* this */ Tabs, /* newContent */ Element, Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setResponsiveThreshold(value: Double): Self = StObject.set(x, "responsiveThreshold", value.asInstanceOf[js.Any])
    
    inline def setResponsiveThresholdUndefined: Self = StObject.set(x, "responsiveThreshold", js.undefined)
    
    inline def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    inline def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
  }
}
