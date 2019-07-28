package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRadialMenuItem
  extends /**
	 * Option for IgRadialMenuItem
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Returns or sets a boolean indicating if the children should be rotated to align with the location of this element.
  	 */
  var autoRotateChildren: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating if the RecentItem property is updated when a child item is clicked.
  	 */
  var autoUpdateRecentItem: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets a value indicating how the IsChecked property may be changed.
  	 *
  	 * Valid values:
  	 * "none" The item is not checkable
  	 * "checkBox" The item is checkable and may be independantly checked or unchecked without affecting other items.
  	 * "radioButton" The item is checkable. Only 1 item from the items with the same GroupName may be checked at a time and the checked item may not be unchecked.
  	 * "radioButtonAllowAllUp" The item is checkable. Only 1 item from the items with the same GroupName may be checked at a time and the checked item may not be checked allowing all items to be unchecked.
  	 */
  var checkBehavior: js.UndefOr[String] = js.undefined
  /**
  	 * Cancel="false" Occurs when the IsChecked is changed to true.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var checked: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the brush used for the arc displayed within the tool when checked.
  	 */
  var checkedHighlightBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets an enumeration indicating where the child items are displayed.
  	 *
  	 * Valid values:
  	 * "asChildren" The Items are displayed within a separate level that is accessed by clicking on the button in the outer ring of the xamRadialMenu for the parent.
  	 * "asSiblingsWhenChecked" The items are displayed as siblings of the parent as long as the IsChecked is set to true.
  	 * "none" The child items are not displayed.
  	 */
  var childItemPlacement: js.UndefOr[String] = js.undefined
  /**
  	 * Cancel="false" Occurs when the item area is clicked.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var click: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Cancel="false" Invoked when one navigates back to the item after viewing the child items.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var closed: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the color that the item represents.
  	 * Note: When the Color property is set, several of the brush properties are changed.
  	 */
  var color: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Cancel="false" Event invoked when the Color property is changed.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.oldValue to obtain the previous value.
  	 * Use ui.newValue to obtain the new value.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var colorChanged: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Cancel="false" Occurs when the item area of a descendant color well is clicked.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var colorWellClick: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the foreground for the inner area of the item.
  	 */
  var foreground: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the name used to identify which RadioButton type items will be grouped together when determining the item to uncheck when the item is checked.
  	 */
  var groupName: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the header of the menu item.
  	 */
  var header: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the brush used for the arc displayed within the tool when hot tracked.
  	 */
  var highlightBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the uri of the image for the item.
  	 */
  var iconUri: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the background of the inner area of the menu item.
  	 */
  var innerAreaFill: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the brush for the background of the inner area of the menu item that is under the pointer.
  	 */
  var innerAreaHotTrackFill: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the brush for the default border of the inner area for the menu item that is under the pointer.
  	 */
  var innerAreaHotTrackStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the brush for the default border of the inner area for the menu item.
  	 */
  var innerAreaStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the thickness of the border for the inner area for the menu item.
  	 */
  var innerAreaStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Returns or sets a boolean indicating if the item is displayed as checked.
  	 */
  var isChecked: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the item is enabled.
  	 */
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating if a tooltip may be displayed for the item.
  	 */
  var isToolTipEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the unique name of the item within the menu.
  	 */
  var name: js.UndefOr[String] = js.undefined
  /**
  	 * Cancel="false" Invoked when one navigates to the view the child items.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var opened: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the default background of the button within the outer ring for a menu item.
  	 */
  var outerRingButtonFill: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the brush for the foreground of the buttons in the outer ring of the menu.
  	 */
  var outerRingButtonForeground: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the brush for the background of the button within the outer ring for a menu item that is under the pointer.
  	 */
  var outerRingButtonHotTrackFill: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the foreground of the buttons in the outer ring of the menu that is under the pointer.
  	 */
  var outerRingButtonHotTrackForeground: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the brush for the default border of the button within the outer ring for a menu item that is under the pointer.
  	 */
  var outerRingButtonHotTrackStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the brush for the default border of the button within the outer ring for a menu item.
  	 */
  var outerRingButtonStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the width of the outline of a button in the outer ring of the menu.
  	 */
  var outerRingButtonStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Returns or sets the value while the user is interacting with the element.
  	 */
  var pendingValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Cancel="false" Event invoked when the PendingValue property is changed.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.oldValue to obtain the previous value.
  	 * Use ui.newValue to obtain the new value.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var pendingValueChanged: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the brush used to render the line that represents the PendingValue
  	 */
  var pendingValueNeedleBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the name of the child item that represents the most recently interacted with item. Note other item properties may be set to "{RecentItem}" to have them automatically set to values of the associated recent child item.
  	 */
  var recentItemName: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether space should be left before the first tickmark.
  	 */
  var reserveFirstSlice: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets the amount that the PendingValue should be adjusted when incrementing or decrementing the value.
  	 */
  var smallIncrement: js.UndefOr[Double] = js.undefined
  /**
  	 * Returns or sets the brush used to render the tick marks.
  	 */
  var tickBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the values of the ticks.
  	 */
  var ticks: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the tooltip to be displayed for the radial menu item.
  	 */
  var toolTip: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the ending color for the track.
  	 */
  var trackEndColor: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the starting color for the track.
  	 */
  var trackStartColor: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets a value indicating what type of item is being provided.
  	 *
  	 *
  	 * Valid values:
  	 * "button"
  	 * "coloritem"
  	 * "colorwell"
  	 * "list"
  	 * "numericitem"
  	 * "numericgauge"
  	 */
  var `type`: js.UndefOr[String] = js.undefined
  /**
  	 * Cancel="false" Occurs when the IsChecked is changed to false.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var unchecked: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the value of the numeric item.
  	 */
  var value: js.UndefOr[Double] = js.undefined
  /**
  	 * Cancel="false" Event invoked when the Value property is changed.
  	 * Function takes a first argument ui.
  	 * Use ui.owner to obtain reference to menu widget.
  	 * Use ui.oldValue to obtain the previous value.
  	 * Use ui.newValue to obtain the new value.
  	 * Use ui.item to obtain reference to the item.
  	 */
  var valueChanged: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the brush used to represent the Value
  	 */
  var valueNeedleBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the wedge at which the item should be positioned.
  	 */
  var wedgeIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Returns or sets the number of wedges that the item should occupy.
  	 */
  var wedgeSpan: js.UndefOr[Double] = js.undefined
}

object IgRadialMenuItem {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgRadialMenuItem
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    autoRotateChildren: js.UndefOr[Boolean] = js.undefined,
    autoUpdateRecentItem: js.UndefOr[Boolean] = js.undefined,
    checkBehavior: String = null,
    checked: js.Any = null,
    checkedHighlightBrush: String = null,
    childItemPlacement: String = null,
    click: js.Any = null,
    closed: js.Any = null,
    color: js.Any = null,
    colorChanged: js.Any = null,
    colorWellClick: js.Any = null,
    foreground: String = null,
    groupName: String = null,
    header: js.Any = null,
    highlightBrush: String = null,
    iconUri: String = null,
    innerAreaFill: String = null,
    innerAreaHotTrackFill: String = null,
    innerAreaHotTrackStroke: String = null,
    innerAreaStroke: String = null,
    innerAreaStrokeThickness: Int | Double = null,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    isEnabled: js.UndefOr[Boolean] = js.undefined,
    isToolTipEnabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    opened: js.Any = null,
    outerRingButtonFill: String = null,
    outerRingButtonForeground: String = null,
    outerRingButtonHotTrackFill: String = null,
    outerRingButtonHotTrackForeground: String = null,
    outerRingButtonHotTrackStroke: String = null,
    outerRingButtonStroke: String = null,
    outerRingButtonStrokeThickness: Int | Double = null,
    pendingValue: js.Any = null,
    pendingValueChanged: js.Any = null,
    pendingValueNeedleBrush: String = null,
    recentItemName: String = null,
    reserveFirstSlice: js.UndefOr[Boolean] = js.undefined,
    smallIncrement: Int | Double = null,
    tickBrush: String = null,
    ticks: js.Any = null,
    toolTip: js.Any = null,
    trackEndColor: js.Any = null,
    trackStartColor: js.Any = null,
    `type`: String = null,
    unchecked: js.Any = null,
    value: Int | Double = null,
    valueChanged: js.Any = null,
    valueNeedleBrush: String = null,
    wedgeIndex: Int | Double = null,
    wedgeSpan: Int | Double = null
  ): IgRadialMenuItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autoRotateChildren)) __obj.updateDynamic("autoRotateChildren")(autoRotateChildren)
    if (!js.isUndefined(autoUpdateRecentItem)) __obj.updateDynamic("autoUpdateRecentItem")(autoUpdateRecentItem)
    if (checkBehavior != null) __obj.updateDynamic("checkBehavior")(checkBehavior)
    if (checked != null) __obj.updateDynamic("checked")(checked)
    if (checkedHighlightBrush != null) __obj.updateDynamic("checkedHighlightBrush")(checkedHighlightBrush)
    if (childItemPlacement != null) __obj.updateDynamic("childItemPlacement")(childItemPlacement)
    if (click != null) __obj.updateDynamic("click")(click)
    if (closed != null) __obj.updateDynamic("closed")(closed)
    if (color != null) __obj.updateDynamic("color")(color)
    if (colorChanged != null) __obj.updateDynamic("colorChanged")(colorChanged)
    if (colorWellClick != null) __obj.updateDynamic("colorWellClick")(colorWellClick)
    if (foreground != null) __obj.updateDynamic("foreground")(foreground)
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (header != null) __obj.updateDynamic("header")(header)
    if (highlightBrush != null) __obj.updateDynamic("highlightBrush")(highlightBrush)
    if (iconUri != null) __obj.updateDynamic("iconUri")(iconUri)
    if (innerAreaFill != null) __obj.updateDynamic("innerAreaFill")(innerAreaFill)
    if (innerAreaHotTrackFill != null) __obj.updateDynamic("innerAreaHotTrackFill")(innerAreaHotTrackFill)
    if (innerAreaHotTrackStroke != null) __obj.updateDynamic("innerAreaHotTrackStroke")(innerAreaHotTrackStroke)
    if (innerAreaStroke != null) __obj.updateDynamic("innerAreaStroke")(innerAreaStroke)
    if (innerAreaStrokeThickness != null) __obj.updateDynamic("innerAreaStrokeThickness")(innerAreaStrokeThickness.asInstanceOf[js.Any])
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked)
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled)
    if (!js.isUndefined(isToolTipEnabled)) __obj.updateDynamic("isToolTipEnabled")(isToolTipEnabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (opened != null) __obj.updateDynamic("opened")(opened)
    if (outerRingButtonFill != null) __obj.updateDynamic("outerRingButtonFill")(outerRingButtonFill)
    if (outerRingButtonForeground != null) __obj.updateDynamic("outerRingButtonForeground")(outerRingButtonForeground)
    if (outerRingButtonHotTrackFill != null) __obj.updateDynamic("outerRingButtonHotTrackFill")(outerRingButtonHotTrackFill)
    if (outerRingButtonHotTrackForeground != null) __obj.updateDynamic("outerRingButtonHotTrackForeground")(outerRingButtonHotTrackForeground)
    if (outerRingButtonHotTrackStroke != null) __obj.updateDynamic("outerRingButtonHotTrackStroke")(outerRingButtonHotTrackStroke)
    if (outerRingButtonStroke != null) __obj.updateDynamic("outerRingButtonStroke")(outerRingButtonStroke)
    if (outerRingButtonStrokeThickness != null) __obj.updateDynamic("outerRingButtonStrokeThickness")(outerRingButtonStrokeThickness.asInstanceOf[js.Any])
    if (pendingValue != null) __obj.updateDynamic("pendingValue")(pendingValue)
    if (pendingValueChanged != null) __obj.updateDynamic("pendingValueChanged")(pendingValueChanged)
    if (pendingValueNeedleBrush != null) __obj.updateDynamic("pendingValueNeedleBrush")(pendingValueNeedleBrush)
    if (recentItemName != null) __obj.updateDynamic("recentItemName")(recentItemName)
    if (!js.isUndefined(reserveFirstSlice)) __obj.updateDynamic("reserveFirstSlice")(reserveFirstSlice)
    if (smallIncrement != null) __obj.updateDynamic("smallIncrement")(smallIncrement.asInstanceOf[js.Any])
    if (tickBrush != null) __obj.updateDynamic("tickBrush")(tickBrush)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip)
    if (trackEndColor != null) __obj.updateDynamic("trackEndColor")(trackEndColor)
    if (trackStartColor != null) __obj.updateDynamic("trackStartColor")(trackStartColor)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unchecked != null) __obj.updateDynamic("unchecked")(unchecked)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChanged != null) __obj.updateDynamic("valueChanged")(valueChanged)
    if (valueNeedleBrush != null) __obj.updateDynamic("valueNeedleBrush")(valueNeedleBrush)
    if (wedgeIndex != null) __obj.updateDynamic("wedgeIndex")(wedgeIndex.asInstanceOf[js.Any])
    if (wedgeSpan != null) __obj.updateDynamic("wedgeSpan")(wedgeSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgRadialMenuItem]
  }
}

