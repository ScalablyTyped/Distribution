package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgColorPickerSplitButton
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Event fired when the button is clicked.
    *
    *             Function takes arguments evt and ui.
    * Use ui.item to get a reference the igSplitButton element.
    */
  var click: js.UndefOr[ClickEvent] = js.undefined
  
  /**
    * Event fired after the button is collapsed.
    *
    *             Function takes arguments evt and ui.
    * Use ui.owner to get a reference the igSplitButton.
    */
  var collapsed: js.UndefOr[CollapsedEvent] = js.undefined
  
  /**
    * Event fired before a button item is collapsed.
    *
    *             Function takes arguments evt and ui.
    * Use ui.owner to get a reference the igSplitButton.
    */
  var collapsing: js.UndefOr[CollapsingEvent] = js.undefined
  
  /**
    * Gets/sets the button default color value.
    *
    */
  var defaultColor: js.UndefOr[String] = js.undefined
  
  /**
    * Default button item name.
    *
    */
  var defaultItemName: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after the button is expanded.
    *
    *             Function takes arguments evt and ui.
    * Use ui.owner to get a reference the igSplitButton.
    */
  var expanded: js.UndefOr[ExpandedEvent] = js.undefined
  
  /**
    * Event fired before a button item is expanded.
    *
    *             Function takes arguments evt and ui.
    * Use ui.owner to get a reference the igSplitButton.
    */
  var expanding: js.UndefOr[ExpandingEvent] = js.undefined
  
  /**
    * If this option is set to true, the igColorPickerSplitButton will be rendered with an icon.
    *
    */
  var hasDefaultIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Button items.
    *
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Specifies whether the default button will be switched when another button is selected.
    *
    */
  var swapDefaultEnabled: js.UndefOr[Boolean] = js.undefined
}
object IgColorPickerSplitButton {
  
  @scala.inline
  def apply(): IgColorPickerSplitButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgColorPickerSplitButton]
  }
  
  @scala.inline
  implicit class IgColorPickerSplitButtonMutableBuilder[Self <: IgColorPickerSplitButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: (/* event */ Event, /* ui */ ClickEventUIParam) => Unit): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setCollapsed(value: (/* event */ Event, /* ui */ CollapsedEventUIParam) => Unit): Self = StObject.set(x, "collapsed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setCollapsing(value: (/* event */ Event, /* ui */ CollapsingEventUIParam) => Unit): Self = StObject.set(x, "collapsing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollapsingUndefined: Self = StObject.set(x, "collapsing", js.undefined)
    
    @scala.inline
    def setDefaultColor(value: String): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
    
    @scala.inline
    def setDefaultItemName(value: String): Self = StObject.set(x, "defaultItemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultItemNameUndefined: Self = StObject.set(x, "defaultItemName", js.undefined)
    
    @scala.inline
    def setExpanded(value: (/* event */ Event, /* ui */ ExpandedEventUIParam) => Unit): Self = StObject.set(x, "expanded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setExpanding(value: (/* event */ Event, /* ui */ ExpandingEventUIParam) => Unit): Self = StObject.set(x, "expanding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExpandingUndefined: Self = StObject.set(x, "expanding", js.undefined)
    
    @scala.inline
    def setHasDefaultIcon(value: Boolean): Self = StObject.set(x, "hasDefaultIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDefaultIconUndefined: Self = StObject.set(x, "hasDefaultIcon", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setSwapDefaultEnabled(value: Boolean): Self = StObject.set(x, "swapDefaultEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapDefaultEnabledUndefined: Self = StObject.set(x, "swapDefaultEnabled", js.undefined)
  }
}
