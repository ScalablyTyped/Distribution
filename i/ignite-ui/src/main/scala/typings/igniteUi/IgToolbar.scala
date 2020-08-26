package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IgToolbarOps[Self <: IgToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowCollapsing(value: Boolean): Self = this.set("allowCollapsing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCollapsing: Self = this.set("allowCollapsing", js.undefined)
    @scala.inline
    def setCollapseButtonIcon(value: String): Self = this.set("collapseButtonIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseButtonIcon: Self = this.set("collapseButtonIcon", js.undefined)
    @scala.inline
    def setCollapsed(value: (/* event */ Event, /* ui */ CollapsedEventUIParam) => Unit): Self = this.set("collapsed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setCollapsing(value: (/* event */ Event, /* ui */ CollapsingEventUIParam) => Unit): Self = this.set("collapsing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCollapsing: Self = this.set("collapsing", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setExpandButtonIcon(value: String): Self = this.set("expandButtonIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandButtonIcon: Self = this.set("expandButtonIcon", js.undefined)
    @scala.inline
    def setExpanded(value: (/* event */ Event, /* ui */ ExpandedEventUIParam) => Unit): Self = this.set("expanded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setExpanding(value: (/* event */ Event, /* ui */ ExpandingEventUIParam) => Unit): Self = this.set("expanding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExpanding: Self = this.set("expanding", js.undefined)
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    @scala.inline
    def setItemAdded(value: (/* event */ Event, /* ui */ ItemAddedEventUIParam) => Unit): Self = this.set("itemAdded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteItemAdded: Self = this.set("itemAdded", js.undefined)
    @scala.inline
    def setItemDisable(value: (/* event */ Event, /* ui */ ItemDisableEventUIParam) => Unit): Self = this.set("itemDisable", js.Any.fromFunction2(value))
    @scala.inline
    def deleteItemDisable: Self = this.set("itemDisable", js.undefined)
    @scala.inline
    def setItemEnabled(value: (/* event */ Event, /* ui */ ItemEnabledEventUIParam) => Unit): Self = this.set("itemEnabled", js.Any.fromFunction2(value))
    @scala.inline
    def deleteItemEnabled: Self = this.set("itemEnabled", js.undefined)
    @scala.inline
    def setItemRemoved(value: (/* event */ Event, /* ui */ ItemRemovedEventUIParam) => Unit): Self = this.set("itemRemoved", js.Any.fromFunction2(value))
    @scala.inline
    def deleteItemRemoved: Self = this.set("itemRemoved", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: IgToolbarLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setToolbarButtonClick(value: (/* event */ Event, /* ui */ ToolbarButtonClickEventUIParam) => Unit): Self = this.set("toolbarButtonClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteToolbarButtonClick: Self = this.set("toolbarButtonClick", js.undefined)
    @scala.inline
    def setToolbarComboOpening(value: (/* event */ Event, /* ui */ ToolbarComboOpeningEventUIParam) => Unit): Self = this.set("toolbarComboOpening", js.Any.fromFunction2(value))
    @scala.inline
    def deleteToolbarComboOpening: Self = this.set("toolbarComboOpening", js.undefined)
    @scala.inline
    def setToolbarComboSelected(value: (/* event */ Event, /* ui */ ToolbarComboSelectedEventUIParam) => Unit): Self = this.set("toolbarComboSelected", js.Any.fromFunction2(value))
    @scala.inline
    def deleteToolbarComboSelected: Self = this.set("toolbarComboSelected", js.undefined)
    @scala.inline
    def setToolbarCustomItemClick(value: (/* event */ Event, /* ui */ ToolbarCustomItemClickEventUIParam) => Unit): Self = this.set("toolbarCustomItemClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteToolbarCustomItemClick: Self = this.set("toolbarCustomItemClick", js.undefined)
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWindowResized(value: (/* event */ Event, /* ui */ WindowResizedEventUIParam) => Unit): Self = this.set("windowResized", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWindowResized: Self = this.set("windowResized", js.undefined)
  }
  
}

