package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpansionPanelOptions extends StObject {
  
  var animation: js.UndefOr[Boolean | ExpansionPanelAnimation] = js.undefined
  
  var collapse: js.UndefOr[js.Function1[/* e */ ExpansionPanelEvent, Unit]] = js.undefined
  
  var collapseIconClass: js.UndefOr[String] = js.undefined
  
  var complete: js.UndefOr[js.Function1[/* e */ ExpansionPanelEvent, Unit]] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var expand: js.UndefOr[js.Function1[/* e */ ExpansionPanelEvent, Unit]] = js.undefined
  
  var expandIconClass: js.UndefOr[String] = js.undefined
  
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var subTitle: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var toggleable: js.UndefOr[Boolean] = js.undefined
}
object ExpansionPanelOptions {
  
  inline def apply(): ExpansionPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionPanelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpansionPanelOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Boolean | ExpansionPanelAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCollapse(value: /* e */ ExpansionPanelEvent => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    inline def setCollapseIconClass(value: String): Self = StObject.set(x, "collapseIconClass", value.asInstanceOf[js.Any])
    
    inline def setCollapseIconClassUndefined: Self = StObject.set(x, "collapseIconClass", js.undefined)
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setComplete(value: /* e */ ExpansionPanelEvent => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExpand(value: /* e */ ExpansionPanelEvent => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    inline def setExpandIconClass(value: String): Self = StObject.set(x, "expandIconClass", value.asInstanceOf[js.Any])
    
    inline def setExpandIconClassUndefined: Self = StObject.set(x, "expandIconClass", js.undefined)
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToggleable(value: Boolean): Self = StObject.set(x, "toggleable", value.asInstanceOf[js.Any])
    
    inline def setToggleableUndefined: Self = StObject.set(x, "toggleable", js.undefined)
  }
}
