package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgToolbar
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Get/Set whether the toolbar can be collapsed.
    *
    */
  var allowCollapsing: js.UndefOr[Boolean] = js.native
  
  /**
    * The css class that will be applied to collapseButtonIcon.
    *
    */
  var collapseButtonIcon: js.UndefOr[String] = js.native
  
  /**
    * Event fired after item is collapsed
    */
  var collapsed: js.UndefOr[CollapsedEvent] = js.native
  
  /**
    * Event is fired before item is collapsed.
    */
  var collapsing: js.UndefOr[CollapsingEvent] = js.native
  
  /**
    * Display Name of the widget.
    *
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The css class that will be applied to the expand/collapse button icon.
    *
    */
  var expandButtonIcon: js.UndefOr[String] = js.native
  
  /**
    * Event fired after item is expanded
    */
  var expanded: js.UndefOr[ExpandedEvent] = js.native
  
  /**
    * Event fired before item is expanded
    */
  var expanding: js.UndefOr[ExpandingEvent] = js.native
  
  /**
    * Set/Get the widget height.
    *
    */
  var height: js.UndefOr[js.Any] = js.native
  
  /**
    * Get/Set whether the widget is expanded initially.
    *
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
  
  /**
    * Event fired after item is added
    */
  var itemAdded: js.UndefOr[ItemAddedEvent] = js.native
  
  /**
    * Fired after item is dissabled
    */
  var itemDisable: js.UndefOr[ItemDisableEvent] = js.native
  
  /**
    * Fired after item is enabled
    */
  var itemEnabled: js.UndefOr[ItemEnabledEvent] = js.native
  
  /**
    * Event fired after item is removed
    */
  var itemRemoved: js.UndefOr[ItemRemovedEvent] = js.native
  
  /**
    * Get/Set Toolbar's items.
    *
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[IgToolbarLocale] = js.native
  
  /**
    * Formal name of the widget.
    *
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Event fired after a click on any toolbar button
    */
  var toolbarButtonClick: js.UndefOr[ToolbarButtonClickEvent] = js.native
  
  /**
    * Event is fired before the toolbar is opened.
    */
  var toolbarComboOpening: js.UndefOr[ToolbarComboOpeningEvent] = js.native
  
  /**
    * Event fired after toolbar combo is selected
    */
  var toolbarComboSelected: js.UndefOr[ToolbarComboSelectedEvent] = js.native
  
  /**
    * Event fired after a click on custom item
    */
  var toolbarCustomItemClick: js.UndefOr[ToolbarCustomItemClickEvent] = js.native
  
  /**
    * Set/Get the widget width.
    *
    */
  var width: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired after the window is resized
    */
  var windowResized: js.UndefOr[WindowResizedEvent] = js.native
}
object IgToolbar {
  
  @scala.inline
  def apply(): IgToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgToolbar]
  }
  
  @scala.inline
  implicit class IgToolbarMutableBuilder[Self <: IgToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCollapsing(value: Boolean): Self = StObject.set(x, "allowCollapsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCollapsingUndefined: Self = StObject.set(x, "allowCollapsing", js.undefined)
    
    @scala.inline
    def setCollapseButtonIcon(value: String): Self = StObject.set(x, "collapseButtonIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseButtonIconUndefined: Self = StObject.set(x, "collapseButtonIcon", js.undefined)
    
    @scala.inline
    def setCollapsed(value: (/* event */ Event, /* ui */ CollapsedEventUIParam) => Unit): Self = StObject.set(x, "collapsed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setCollapsing(value: (/* event */ Event, /* ui */ CollapsingEventUIParam) => Unit): Self = StObject.set(x, "collapsing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollapsingUndefined: Self = StObject.set(x, "collapsing", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExpandButtonIcon(value: String): Self = StObject.set(x, "expandButtonIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandButtonIconUndefined: Self = StObject.set(x, "expandButtonIcon", js.undefined)
    
    @scala.inline
    def setExpanded(value: (/* event */ Event, /* ui */ ExpandedEventUIParam) => Unit): Self = StObject.set(x, "expanded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setExpanding(value: (/* event */ Event, /* ui */ ExpandingEventUIParam) => Unit): Self = StObject.set(x, "expanding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExpandingUndefined: Self = StObject.set(x, "expanding", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    
    @scala.inline
    def setItemAdded(value: (/* event */ Event, /* ui */ ItemAddedEventUIParam) => Unit): Self = StObject.set(x, "itemAdded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemAddedUndefined: Self = StObject.set(x, "itemAdded", js.undefined)
    
    @scala.inline
    def setItemDisable(value: (/* event */ Event, /* ui */ ItemDisableEventUIParam) => Unit): Self = StObject.set(x, "itemDisable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemDisableUndefined: Self = StObject.set(x, "itemDisable", js.undefined)
    
    @scala.inline
    def setItemEnabled(value: (/* event */ Event, /* ui */ ItemEnabledEventUIParam) => Unit): Self = StObject.set(x, "itemEnabled", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemEnabledUndefined: Self = StObject.set(x, "itemEnabled", js.undefined)
    
    @scala.inline
    def setItemRemoved(value: (/* event */ Event, /* ui */ ItemRemovedEventUIParam) => Unit): Self = StObject.set(x, "itemRemoved", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemRemovedUndefined: Self = StObject.set(x, "itemRemoved", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: IgToolbarLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setToolbarButtonClick(value: (/* event */ Event, /* ui */ ToolbarButtonClickEventUIParam) => Unit): Self = StObject.set(x, "toolbarButtonClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToolbarButtonClickUndefined: Self = StObject.set(x, "toolbarButtonClick", js.undefined)
    
    @scala.inline
    def setToolbarComboOpening(value: (/* event */ Event, /* ui */ ToolbarComboOpeningEventUIParam) => Unit): Self = StObject.set(x, "toolbarComboOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToolbarComboOpeningUndefined: Self = StObject.set(x, "toolbarComboOpening", js.undefined)
    
    @scala.inline
    def setToolbarComboSelected(value: (/* event */ Event, /* ui */ ToolbarComboSelectedEventUIParam) => Unit): Self = StObject.set(x, "toolbarComboSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToolbarComboSelectedUndefined: Self = StObject.set(x, "toolbarComboSelected", js.undefined)
    
    @scala.inline
    def setToolbarCustomItemClick(value: (/* event */ Event, /* ui */ ToolbarCustomItemClickEventUIParam) => Unit): Self = StObject.set(x, "toolbarCustomItemClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToolbarCustomItemClickUndefined: Self = StObject.set(x, "toolbarCustomItemClick", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWindowResized(value: (/* event */ Event, /* ui */ WindowResizedEventUIParam) => Unit): Self = StObject.set(x, "windowResized", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWindowResizedUndefined: Self = StObject.set(x, "windowResized", js.undefined)
  }
}
