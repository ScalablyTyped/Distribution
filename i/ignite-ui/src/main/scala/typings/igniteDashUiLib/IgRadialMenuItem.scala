package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgRadialMenuItem
  extends /**
	 * Option for IgRadialMenuItem
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Returns or sets a boolean indicating if the children should be rotated to align with the location of this element.
  	 */
  var autoRotateChildren: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating if the RecentItem property is updated when a child item is clicked.
  	 */
  var autoUpdateRecentItem: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets a value indicating how the IsChecked property may be changed.
  	 *
  	 * Valid values:
  	 * "none" The item is not checkable
  	 * "checkBox" The item is checkable and may be independantly checked or unchecked without affecting other items.
  	 * "radioButton" The item is checkable. Only 1 item from the items with the same GroupName may be checked at a time and the checked item may not be unchecked.
  	 * "radioButtonAllowAllUp" The item is checkable. Only 1 item from the items with the same GroupName may be checked at a time and the checked item may not be checked allowing all items to be unchecked.
  	 */
  var checkBehavior: js.UndefOr[java.lang.String] = js.undefined
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
  var checkedHighlightBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets an enumeration indicating where the child items are displayed.
  	 *
  	 * Valid values:
  	 * "asChildren" The Items are displayed within a separate level that is accessed by clicking on the button in the outer ring of the xamRadialMenu for the parent.
  	 * "asSiblingsWhenChecked" The items are displayed as siblings of the parent as long as the IsChecked is set to true.
  	 * "none" The child items are not displayed.
  	 */
  var childItemPlacement: js.UndefOr[java.lang.String] = js.undefined
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
  var foreground: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the name used to identify which RadioButton type items will be grouped together when determining the item to uncheck when the item is checked.
  	 */
  var groupName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the header of the menu item.
  	 */
  var header: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the brush used for the arc displayed within the tool when hot tracked.
  	 */
  var highlightBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the uri of the image for the item.
  	 */
  var iconUri: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the background of the inner area of the menu item.
  	 */
  var innerAreaFill: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the brush for the background of the inner area of the menu item that is under the pointer.
  	 */
  var innerAreaHotTrackFill: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the brush for the default border of the inner area for the menu item that is under the pointer.
  	 */
  var innerAreaHotTrackStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the brush for the default border of the inner area for the menu item.
  	 */
  var innerAreaStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the thickness of the border for the inner area for the menu item.
  	 */
  var innerAreaStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Returns or sets a boolean indicating if the item is displayed as checked.
  	 */
  var isChecked: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the item is enabled.
  	 */
  var isEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating if a tooltip may be displayed for the item.
  	 */
  var isToolTipEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the unique name of the item within the menu.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
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
  var outerRingButtonFill: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the brush for the foreground of the buttons in the outer ring of the menu.
  	 */
  var outerRingButtonForeground: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the brush for the background of the button within the outer ring for a menu item that is under the pointer.
  	 */
  var outerRingButtonHotTrackFill: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the foreground of the buttons in the outer ring of the menu that is under the pointer.
  	 */
  var outerRingButtonHotTrackForeground: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the brush for the default border of the button within the outer ring for a menu item that is under the pointer.
  	 */
  var outerRingButtonHotTrackStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the brush for the default border of the button within the outer ring for a menu item.
  	 */
  var outerRingButtonStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the width of the outline of a button in the outer ring of the menu.
  	 */
  var outerRingButtonStrokeThickness: js.UndefOr[scala.Double] = js.undefined
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
  var pendingValueNeedleBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the name of the child item that represents the most recently interacted with item. Note other item properties may be set to "{RecentItem}" to have them automatically set to values of the associated recent child item.
  	 */
  var recentItemName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether space should be left before the first tickmark.
  	 */
  var reserveFirstSlice: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets the amount that the PendingValue should be adjusted when incrementing or decrementing the value.
  	 */
  var smallIncrement: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Returns or sets the brush used to render the tick marks.
  	 */
  var tickBrush: js.UndefOr[java.lang.String] = js.undefined
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
  var `type`: js.UndefOr[java.lang.String] = js.undefined
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
  var value: js.UndefOr[scala.Double] = js.undefined
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
  var valueNeedleBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the wedge at which the item should be positioned.
  	 */
  var wedgeIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Returns or sets the number of wedges that the item should occupy.
  	 */
  var wedgeSpan: js.UndefOr[scala.Double] = js.undefined
}

