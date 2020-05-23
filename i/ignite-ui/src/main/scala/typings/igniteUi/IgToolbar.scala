package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgToolbar
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
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
  var height: js.UndefOr[js.Any] = js.undefined
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
  var items: js.UndefOr[js.Array[_]] = js.undefined
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
  var width: js.UndefOr[js.Any] = js.undefined
  /**
    * Fired after the window is resized
    */
  var windowResized: js.UndefOr[WindowResizedEvent] = js.undefined
}

object IgToolbar {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    allowCollapsing: js.UndefOr[Boolean] = js.undefined,
    collapseButtonIcon: String = null,
    collapsed: (/* event */ Event, /* ui */ CollapsedEventUIParam) => Unit = null,
    collapsing: (/* event */ Event, /* ui */ CollapsingEventUIParam) => Unit = null,
    displayName: String = null,
    expandButtonIcon: String = null,
    expanded: (/* event */ Event, /* ui */ ExpandedEventUIParam) => Unit = null,
    expanding: (/* event */ Event, /* ui */ ExpandingEventUIParam) => Unit = null,
    height: js.Any = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    itemAdded: (/* event */ Event, /* ui */ ItemAddedEventUIParam) => Unit = null,
    itemDisable: (/* event */ Event, /* ui */ ItemDisableEventUIParam) => Unit = null,
    itemEnabled: (/* event */ Event, /* ui */ ItemEnabledEventUIParam) => Unit = null,
    itemRemoved: (/* event */ Event, /* ui */ ItemRemovedEventUIParam) => Unit = null,
    items: js.Array[_] = null,
    language: String = null,
    locale: IgToolbarLocale = null,
    name: String = null,
    regional: String | js.Object = null,
    toolbarButtonClick: (/* event */ Event, /* ui */ ToolbarButtonClickEventUIParam) => Unit = null,
    toolbarComboOpening: (/* event */ Event, /* ui */ ToolbarComboOpeningEventUIParam) => Unit = null,
    toolbarComboSelected: (/* event */ Event, /* ui */ ToolbarComboSelectedEventUIParam) => Unit = null,
    toolbarCustomItemClick: (/* event */ Event, /* ui */ ToolbarCustomItemClickEventUIParam) => Unit = null,
    width: js.Any = null,
    windowResized: (/* event */ Event, /* ui */ WindowResizedEventUIParam) => Unit = null
  ): IgToolbar = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowCollapsing)) __obj.updateDynamic("allowCollapsing")(allowCollapsing.get.asInstanceOf[js.Any])
    if (collapseButtonIcon != null) __obj.updateDynamic("collapseButtonIcon")(collapseButtonIcon.asInstanceOf[js.Any])
    if (collapsed != null) __obj.updateDynamic("collapsed")(js.Any.fromFunction2(collapsed))
    if (collapsing != null) __obj.updateDynamic("collapsing")(js.Any.fromFunction2(collapsing))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (expandButtonIcon != null) __obj.updateDynamic("expandButtonIcon")(expandButtonIcon.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(js.Any.fromFunction2(expanded))
    if (expanding != null) __obj.updateDynamic("expanding")(js.Any.fromFunction2(expanding))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.get.asInstanceOf[js.Any])
    if (itemAdded != null) __obj.updateDynamic("itemAdded")(js.Any.fromFunction2(itemAdded))
    if (itemDisable != null) __obj.updateDynamic("itemDisable")(js.Any.fromFunction2(itemDisable))
    if (itemEnabled != null) __obj.updateDynamic("itemEnabled")(js.Any.fromFunction2(itemEnabled))
    if (itemRemoved != null) __obj.updateDynamic("itemRemoved")(js.Any.fromFunction2(itemRemoved))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (toolbarButtonClick != null) __obj.updateDynamic("toolbarButtonClick")(js.Any.fromFunction2(toolbarButtonClick))
    if (toolbarComboOpening != null) __obj.updateDynamic("toolbarComboOpening")(js.Any.fromFunction2(toolbarComboOpening))
    if (toolbarComboSelected != null) __obj.updateDynamic("toolbarComboSelected")(js.Any.fromFunction2(toolbarComboSelected))
    if (toolbarCustomItemClick != null) __obj.updateDynamic("toolbarCustomItemClick")(js.Any.fromFunction2(toolbarCustomItemClick))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowResized != null) __obj.updateDynamic("windowResized")(js.Any.fromFunction2(windowResized))
    __obj.asInstanceOf[IgToolbar]
  }
}

