package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgToolbar
  extends /**
	 * Option for igToolbar
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Get/Set whether the toolbar can be collapsed.
  	 *
  	 */
  var allowCollapsing: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The css class that will be applied to collapseButtonIcon.
  	 *
  	 */
  var collapseButtonIcon: js.UndefOr[java.lang.String] = js.undefined
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
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The css class that will be applied to the expand/collapse button icon.
  	 *
  	 */
  var expandButtonIcon: js.UndefOr[java.lang.String] = js.undefined
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
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
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
  var language: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[IgToolbarLocale] = js.undefined
  /**
  	 * Formal name of the widget.
  	 *
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
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
    StringDictionary: /**
  	 * Option for igToolbar
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    allowCollapsing: js.UndefOr[scala.Boolean] = js.undefined,
    collapseButtonIcon: java.lang.String = null,
    collapsed: CollapsedEvent = null,
    collapsing: CollapsingEvent = null,
    displayName: java.lang.String = null,
    expandButtonIcon: java.lang.String = null,
    expanded: ExpandedEvent = null,
    expanding: ExpandingEvent = null,
    height: js.Any = null,
    isExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    itemAdded: ItemAddedEvent = null,
    itemDisable: ItemDisableEvent = null,
    itemEnabled: ItemEnabledEvent = null,
    itemRemoved: ItemRemovedEvent = null,
    items: js.Array[_] = null,
    language: java.lang.String = null,
    locale: IgToolbarLocale = null,
    name: java.lang.String = null,
    regional: java.lang.String | js.Object = null,
    toolbarButtonClick: ToolbarButtonClickEvent = null,
    toolbarComboOpening: ToolbarComboOpeningEvent = null,
    toolbarComboSelected: ToolbarComboSelectedEvent = null,
    toolbarCustomItemClick: ToolbarCustomItemClickEvent = null,
    width: js.Any = null,
    windowResized: WindowResizedEvent = null
  ): IgToolbar = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowCollapsing)) __obj.updateDynamic("allowCollapsing")(allowCollapsing)
    if (collapseButtonIcon != null) __obj.updateDynamic("collapseButtonIcon")(collapseButtonIcon)
    if (collapsed != null) __obj.updateDynamic("collapsed")(collapsed)
    if (collapsing != null) __obj.updateDynamic("collapsing")(collapsing)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (expandButtonIcon != null) __obj.updateDynamic("expandButtonIcon")(expandButtonIcon)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded)
    if (expanding != null) __obj.updateDynamic("expanding")(expanding)
    if (height != null) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (itemAdded != null) __obj.updateDynamic("itemAdded")(itemAdded)
    if (itemDisable != null) __obj.updateDynamic("itemDisable")(itemDisable)
    if (itemEnabled != null) __obj.updateDynamic("itemEnabled")(itemEnabled)
    if (itemRemoved != null) __obj.updateDynamic("itemRemoved")(itemRemoved)
    if (items != null) __obj.updateDynamic("items")(items)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (name != null) __obj.updateDynamic("name")(name)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (toolbarButtonClick != null) __obj.updateDynamic("toolbarButtonClick")(toolbarButtonClick)
    if (toolbarComboOpening != null) __obj.updateDynamic("toolbarComboOpening")(toolbarComboOpening)
    if (toolbarComboSelected != null) __obj.updateDynamic("toolbarComboSelected")(toolbarComboSelected)
    if (toolbarCustomItemClick != null) __obj.updateDynamic("toolbarCustomItemClick")(toolbarCustomItemClick)
    if (width != null) __obj.updateDynamic("width")(width)
    if (windowResized != null) __obj.updateDynamic("windowResized")(windowResized)
    __obj.asInstanceOf[IgToolbar]
  }
}

