package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgToolbar
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Get/Set whether the toolbar can be collapsed.
    *
    */
  var allowCollapsing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The css class that will be applied to collapseButtonIcon.
    *
    */
  var collapseButtonIcon: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after item is collapsed
    */
  var collapsed: js.UndefOr[CollapsedEvent] = js.undefined
  
  /**
    * Event is fired before item is collapsed.
    */
  var collapsing: js.UndefOr[CollapsingEvent] = js.undefined
  
  /**
    * Display Name of the widget.
    *
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The css class that will be applied to the expand/collapse button icon.
    *
    */
  var expandButtonIcon: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after item is expanded
    */
  var expanded: js.UndefOr[ExpandedEvent] = js.undefined
  
  /**
    * Event fired before item is expanded
    */
  var expanding: js.UndefOr[ExpandingEvent] = js.undefined
  
  /**
    * Set/Get the widget height.
    *
    */
  var height: js.UndefOr[Any] = js.undefined
  
  /**
    * Get/Set whether the widget is expanded initially.
    *
    */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Event fired after item is added
    */
  var itemAdded: js.UndefOr[ItemAddedEvent] = js.undefined
  
  /**
    * Fired after item is dissabled
    */
  var itemDisable: js.UndefOr[ItemDisableEvent] = js.undefined
  
  /**
    * Fired after item is enabled
    */
  var itemEnabled: js.UndefOr[ItemEnabledEvent] = js.undefined
  
  /**
    * Event fired after item is removed
    */
  var itemRemoved: js.UndefOr[ItemRemovedEvent] = js.undefined
  
  /**
    * Get/Set Toolbar's items.
    *
    */
  var items: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[IgToolbarLocale] = js.undefined
  
  /**
    * Formal name of the widget.
    *
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Event fired after a click on any toolbar button
    */
  var toolbarButtonClick: js.UndefOr[ToolbarButtonClickEvent] = js.undefined
  
  /**
    * Event is fired before the toolbar is opened.
    */
  var toolbarComboOpening: js.UndefOr[ToolbarComboOpeningEvent] = js.undefined
  
  /**
    * Event fired after toolbar combo is selected
    */
  var toolbarComboSelected: js.UndefOr[ToolbarComboSelectedEvent] = js.undefined
  
  /**
    * Event fired after a click on custom item
    */
  var toolbarCustomItemClick: js.UndefOr[ToolbarCustomItemClickEvent] = js.undefined
  
  /**
    * Set/Get the widget width.
    *
    */
  var width: js.UndefOr[Any] = js.undefined
  
  /**
    * Fired after the window is resized
    */
  var windowResized: js.UndefOr[WindowResizedEvent] = js.undefined
}
object IgToolbar {
  
  inline def apply(): IgToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgToolbar]
  }
  
  extension [Self <: IgToolbar](x: Self) {
    
    inline def setAllowCollapsing(value: Boolean): Self = StObject.set(x, "allowCollapsing", value.asInstanceOf[js.Any])
    
    inline def setAllowCollapsingUndefined: Self = StObject.set(x, "allowCollapsing", js.undefined)
    
    inline def setCollapseButtonIcon(value: String): Self = StObject.set(x, "collapseButtonIcon", value.asInstanceOf[js.Any])
    
    inline def setCollapseButtonIconUndefined: Self = StObject.set(x, "collapseButtonIcon", js.undefined)
    
    inline def setCollapsed(value: (/* event */ Event, /* ui */ CollapsedEventUIParam) => Unit): Self = StObject.set(x, "collapsed", js.Any.fromFunction2(value))
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setCollapsing(value: (/* event */ Event, /* ui */ CollapsingEventUIParam) => Unit): Self = StObject.set(x, "collapsing", js.Any.fromFunction2(value))
    
    inline def setCollapsingUndefined: Self = StObject.set(x, "collapsing", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExpandButtonIcon(value: String): Self = StObject.set(x, "expandButtonIcon", value.asInstanceOf[js.Any])
    
    inline def setExpandButtonIconUndefined: Self = StObject.set(x, "expandButtonIcon", js.undefined)
    
    inline def setExpanded(value: (/* event */ Event, /* ui */ ExpandedEventUIParam) => Unit): Self = StObject.set(x, "expanded", js.Any.fromFunction2(value))
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setExpanding(value: (/* event */ Event, /* ui */ ExpandingEventUIParam) => Unit): Self = StObject.set(x, "expanding", js.Any.fromFunction2(value))
    
    inline def setExpandingUndefined: Self = StObject.set(x, "expanding", js.undefined)
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    
    inline def setItemAdded(value: (/* event */ Event, /* ui */ ItemAddedEventUIParam) => Unit): Self = StObject.set(x, "itemAdded", js.Any.fromFunction2(value))
    
    inline def setItemAddedUndefined: Self = StObject.set(x, "itemAdded", js.undefined)
    
    inline def setItemDisable(value: (/* event */ Event, /* ui */ ItemDisableEventUIParam) => Unit): Self = StObject.set(x, "itemDisable", js.Any.fromFunction2(value))
    
    inline def setItemDisableUndefined: Self = StObject.set(x, "itemDisable", js.undefined)
    
    inline def setItemEnabled(value: (/* event */ Event, /* ui */ ItemEnabledEventUIParam) => Unit): Self = StObject.set(x, "itemEnabled", js.Any.fromFunction2(value))
    
    inline def setItemEnabledUndefined: Self = StObject.set(x, "itemEnabled", js.undefined)
    
    inline def setItemRemoved(value: (/* event */ Event, /* ui */ ItemRemovedEventUIParam) => Unit): Self = StObject.set(x, "itemRemoved", js.Any.fromFunction2(value))
    
    inline def setItemRemovedUndefined: Self = StObject.set(x, "itemRemoved", js.undefined)
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: IgToolbarLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setToolbarButtonClick(value: (/* event */ Event, /* ui */ ToolbarButtonClickEventUIParam) => Unit): Self = StObject.set(x, "toolbarButtonClick", js.Any.fromFunction2(value))
    
    inline def setToolbarButtonClickUndefined: Self = StObject.set(x, "toolbarButtonClick", js.undefined)
    
    inline def setToolbarComboOpening(value: (/* event */ Event, /* ui */ ToolbarComboOpeningEventUIParam) => Unit): Self = StObject.set(x, "toolbarComboOpening", js.Any.fromFunction2(value))
    
    inline def setToolbarComboOpeningUndefined: Self = StObject.set(x, "toolbarComboOpening", js.undefined)
    
    inline def setToolbarComboSelected(value: (/* event */ Event, /* ui */ ToolbarComboSelectedEventUIParam) => Unit): Self = StObject.set(x, "toolbarComboSelected", js.Any.fromFunction2(value))
    
    inline def setToolbarComboSelectedUndefined: Self = StObject.set(x, "toolbarComboSelected", js.undefined)
    
    inline def setToolbarCustomItemClick(value: (/* event */ Event, /* ui */ ToolbarCustomItemClickEventUIParam) => Unit): Self = StObject.set(x, "toolbarCustomItemClick", js.Any.fromFunction2(value))
    
    inline def setToolbarCustomItemClickUndefined: Self = StObject.set(x, "toolbarCustomItemClick", js.undefined)
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWindowResized(value: (/* event */ Event, /* ui */ WindowResizedEventUIParam) => Unit): Self = StObject.set(x, "windowResized", js.Any.fromFunction2(value))
    
    inline def setWindowResizedUndefined: Self = StObject.set(x, "windowResized", js.undefined)
  }
}
