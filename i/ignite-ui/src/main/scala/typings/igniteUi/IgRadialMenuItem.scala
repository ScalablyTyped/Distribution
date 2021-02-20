package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgRadialMenuItem
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Returns or sets a boolean indicating if the children should be rotated to align with the location of this element.
    */
  var autoRotateChildren: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets a boolean indicating if the RecentItem property is updated when a child item is clicked.
    */
  var autoUpdateRecentItem: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets a value indicating how the IsChecked property may be changed.
    *
    * Valid values:
    * "none" The item is not checkable
    * "checkBox" The item is checkable and may be independantly checked or unchecked without affecting other items.
    * "radioButton" The item is checkable. Only 1 item from the items with the same GroupName may be checked at a time and the checked item may not be unchecked.
    * "radioButtonAllowAllUp" The item is checkable. Only 1 item from the items with the same GroupName may be checked at a time and the checked item may not be checked allowing all items to be unchecked.
    */
  var checkBehavior: js.UndefOr[String] = js.native
  
  /**
    * Cancel="false" Occurs when the IsChecked is changed to true.
    * Function takes a first argument ui.
    * Use ui.owner to obtain reference to menu widget.
    * Use ui.item to obtain reference to the item.
    */
  var checked: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns or sets the brush used for the arc displayed within the tool when checked.
    */
  var checkedHighlightBrush: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets an enumeration indicating where the child items are displayed.
    *
    * Valid values:
    * "asChildren" The Items are displayed within a separate level that is accessed by clicking on the button in the outer ring of the xamRadialMenu for the parent.
    * "asSiblingsWhenChecked" The items are displayed as siblings of the parent as long as the IsChecked is set to true.
    * "none" The child items are not displayed.
    */
  var childItemPlacement: js.UndefOr[String] = js.native
  
  /**
    * Cancel="false" Occurs when the item area is clicked.
    * Function takes a first argument ui.
    * Use ui.owner to obtain reference to menu widget.
    * Use ui.item to obtain reference to the item.
    */
  var click: js.UndefOr[js.Any] = js.native
  
  /**
    * Cancel="false" Invoked when one navigates back to the item after viewing the child items.
    * Function takes a first argument ui.
    * Use ui.owner to obtain reference to menu widget.
    * Use ui.item to obtain reference to the item.
    */
  var closed: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns or sets the color that the item represents.
    * Note: When the Color property is set, several of the brush properties are changed.
    */
  var color: js.UndefOr[js.Any] = js.native
  
  /**
    * Cancel="false" Event invoked when the Color property is changed.
    * Function takes a first argument ui.
    * Use ui.owner to obtain reference to menu widget.
    * Use ui.oldValue to obtain the previous value.
    * Use ui.newValue to obtain the new value.
    * Use ui.item to obtain reference to the item.
    */
  var colorChanged: js.UndefOr[js.Any] = js.native
  
  /**
    * Cancel="false" Occurs when the item area of a descendant color well is clicked.
    * Function takes a first argument ui.
    * Use ui.owner to obtain reference to menu widget.
    * Use ui.item to obtain reference to the item.
    */
  var colorWellClick: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns or sets the foreground for the inner area of the item.
    */
  var foreground: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the name used to identify which RadioButton type items will be grouped together when determining the item to uncheck when the item is checked.
    */
  var groupName: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the header of the menu item.
    */
  var header: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns or sets the brush used for the arc displayed within the tool when hot tracked.
    */
  var highlightBrush: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the uri of the image for the item.
    */
  var iconUri: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the background of the inner area of the menu item.
    */
  var innerAreaFill: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the brush for the background of the inner area of the menu item that is under the pointer.
    */
  var innerAreaHotTrackFill: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the brush for the default border of the inner area for the menu item that is under the pointer.
    */
  var innerAreaHotTrackStroke: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the brush for the default border of the inner area for the menu item.
    */
  var innerAreaStroke: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the thickness of the border for the inner area for the menu item.
    */
  var innerAreaStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Returns or sets a boolean indicating if the item is displayed as checked.
    */
  var isChecked: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets a boolean indicating whether the item is enabled.
    */
  var isEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets a boolean indicating if a tooltip may be displayed for the item.
    */
  var isToolTipEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the unique name of the item within the menu.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Cancel="false" Invoked when one navigates to the view the child items.
    * Function takes a first argument ui.
    * Use ui.owner to obtain reference to menu widget.
    * Use ui.item to obtain reference to the item.
    */
  var opened: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns or sets the default background of the button within the outer ring for a menu item.
    */
  var outerRingButtonFill: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the brush for the foreground of the buttons in the outer ring of the menu.
    */
  var outerRingButtonForeground: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the brush for the background of the button within the outer ring for a menu item that is under the pointer.
    */
  var outerRingButtonHotTrackFill: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the foreground of the buttons in the outer ring of the menu that is under the pointer.
    */
  var outerRingButtonHotTrackForeground: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the brush for the default border of the button within the outer ring for a menu item that is under the pointer.
    */
  var outerRingButtonHotTrackStroke: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the brush for the default border of the button within the outer ring for a menu item.
    */
  var outerRingButtonStroke: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the width of the outline of a button in the outer ring of the menu.
    */
  var outerRingButtonStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Returns or sets the value while the user is interacting with the element.
    */
  var pendingValue: js.UndefOr[js.Any] = js.native
  
  /**
    * Cancel="false" Event invoked when the PendingValue property is changed.
    * Function takes a first argument ui.
    * Use ui.owner to obtain reference to menu widget.
    * Use ui.oldValue to obtain the previous value.
    * Use ui.newValue to obtain the new value.
    * Use ui.item to obtain reference to the item.
    */
  var pendingValueChanged: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns or sets the brush used to render the line that represents the PendingValue
    */
  var pendingValueNeedleBrush: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the name of the child item that represents the most recently interacted with item. Note other item properties may be set to "{RecentItem}" to have them automatically set to values of the associated recent child item.
    */
  var recentItemName: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets a boolean indicating whether space should be left before the first tickmark.
    */
  var reserveFirstSlice: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets the amount that the PendingValue should be adjusted when incrementing or decrementing the value.
    */
  var smallIncrement: js.UndefOr[Double] = js.native
  
  /**
    * Returns or sets the brush used to render the tick marks.
    */
  var tickBrush: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the values of the ticks.
    */
  var ticks: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns or sets the tooltip to be displayed for the radial menu item.
    */
  var toolTip: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns or sets the ending color for the track.
    */
  var trackEndColor: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns or sets the starting color for the track.
    */
  var trackStartColor: js.UndefOr[js.Any] = js.native
  
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
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Cancel="false" Occurs when the IsChecked is changed to false.
    * Function takes a first argument ui.
    * Use ui.owner to obtain reference to menu widget.
    * Use ui.item to obtain reference to the item.
    */
  var unchecked: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns or sets the value of the numeric item.
    */
  var value: js.UndefOr[Double] = js.native
  
  /**
    * Cancel="false" Event invoked when the Value property is changed.
    * Function takes a first argument ui.
    * Use ui.owner to obtain reference to menu widget.
    * Use ui.oldValue to obtain the previous value.
    * Use ui.newValue to obtain the new value.
    * Use ui.item to obtain reference to the item.
    */
  var valueChanged: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns or sets the brush used to represent the Value
    */
  var valueNeedleBrush: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the wedge at which the item should be positioned.
    */
  var wedgeIndex: js.UndefOr[Double] = js.native
  
  /**
    * Returns or sets the number of wedges that the item should occupy.
    */
  var wedgeSpan: js.UndefOr[Double] = js.native
}
object IgRadialMenuItem {
  
  @scala.inline
  def apply(): IgRadialMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRadialMenuItem]
  }
  
  @scala.inline
  implicit class IgRadialMenuItemMutableBuilder[Self <: IgRadialMenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRotateChildren(value: Boolean): Self = StObject.set(x, "autoRotateChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotateChildrenUndefined: Self = StObject.set(x, "autoRotateChildren", js.undefined)
    
    @scala.inline
    def setAutoUpdateRecentItem(value: Boolean): Self = StObject.set(x, "autoUpdateRecentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdateRecentItemUndefined: Self = StObject.set(x, "autoUpdateRecentItem", js.undefined)
    
    @scala.inline
    def setCheckBehavior(value: String): Self = StObject.set(x, "checkBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckBehaviorUndefined: Self = StObject.set(x, "checkBehavior", js.undefined)
    
    @scala.inline
    def setChecked(value: js.Any): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedHighlightBrush(value: String): Self = StObject.set(x, "checkedHighlightBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedHighlightBrushUndefined: Self = StObject.set(x, "checkedHighlightBrush", js.undefined)
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setChildItemPlacement(value: String): Self = StObject.set(x, "childItemPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildItemPlacementUndefined: Self = StObject.set(x, "childItemPlacement", js.undefined)
    
    @scala.inline
    def setClick(value: js.Any): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setClosed(value: js.Any): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorChanged(value: js.Any): Self = StObject.set(x, "colorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorChangedUndefined: Self = StObject.set(x, "colorChanged", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorWellClick(value: js.Any): Self = StObject.set(x, "colorWellClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorWellClickUndefined: Self = StObject.set(x, "colorWellClick", js.undefined)
    
    @scala.inline
    def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHighlightBrush(value: String): Self = StObject.set(x, "highlightBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightBrushUndefined: Self = StObject.set(x, "highlightBrush", js.undefined)
    
    @scala.inline
    def setIconUri(value: String): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUriUndefined: Self = StObject.set(x, "iconUri", js.undefined)
    
    @scala.inline
    def setInnerAreaFill(value: String): Self = StObject.set(x, "innerAreaFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerAreaFillUndefined: Self = StObject.set(x, "innerAreaFill", js.undefined)
    
    @scala.inline
    def setInnerAreaHotTrackFill(value: String): Self = StObject.set(x, "innerAreaHotTrackFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerAreaHotTrackFillUndefined: Self = StObject.set(x, "innerAreaHotTrackFill", js.undefined)
    
    @scala.inline
    def setInnerAreaHotTrackStroke(value: String): Self = StObject.set(x, "innerAreaHotTrackStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerAreaHotTrackStrokeUndefined: Self = StObject.set(x, "innerAreaHotTrackStroke", js.undefined)
    
    @scala.inline
    def setInnerAreaStroke(value: String): Self = StObject.set(x, "innerAreaStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerAreaStrokeThickness(value: Double): Self = StObject.set(x, "innerAreaStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerAreaStrokeThicknessUndefined: Self = StObject.set(x, "innerAreaStrokeThickness", js.undefined)
    
    @scala.inline
    def setInnerAreaStrokeUndefined: Self = StObject.set(x, "innerAreaStroke", js.undefined)
    
    @scala.inline
    def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    @scala.inline
    def setIsToolTipEnabled(value: Boolean): Self = StObject.set(x, "isToolTipEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsToolTipEnabledUndefined: Self = StObject.set(x, "isToolTipEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpened(value: js.Any): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    @scala.inline
    def setOuterRingButtonFill(value: String): Self = StObject.set(x, "outerRingButtonFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRingButtonFillUndefined: Self = StObject.set(x, "outerRingButtonFill", js.undefined)
    
    @scala.inline
    def setOuterRingButtonForeground(value: String): Self = StObject.set(x, "outerRingButtonForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRingButtonForegroundUndefined: Self = StObject.set(x, "outerRingButtonForeground", js.undefined)
    
    @scala.inline
    def setOuterRingButtonHotTrackFill(value: String): Self = StObject.set(x, "outerRingButtonHotTrackFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRingButtonHotTrackFillUndefined: Self = StObject.set(x, "outerRingButtonHotTrackFill", js.undefined)
    
    @scala.inline
    def setOuterRingButtonHotTrackForeground(value: String): Self = StObject.set(x, "outerRingButtonHotTrackForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRingButtonHotTrackForegroundUndefined: Self = StObject.set(x, "outerRingButtonHotTrackForeground", js.undefined)
    
    @scala.inline
    def setOuterRingButtonHotTrackStroke(value: String): Self = StObject.set(x, "outerRingButtonHotTrackStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRingButtonHotTrackStrokeUndefined: Self = StObject.set(x, "outerRingButtonHotTrackStroke", js.undefined)
    
    @scala.inline
    def setOuterRingButtonStroke(value: String): Self = StObject.set(x, "outerRingButtonStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRingButtonStrokeThickness(value: Double): Self = StObject.set(x, "outerRingButtonStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRingButtonStrokeThicknessUndefined: Self = StObject.set(x, "outerRingButtonStrokeThickness", js.undefined)
    
    @scala.inline
    def setOuterRingButtonStrokeUndefined: Self = StObject.set(x, "outerRingButtonStroke", js.undefined)
    
    @scala.inline
    def setPendingValue(value: js.Any): Self = StObject.set(x, "pendingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingValueChanged(value: js.Any): Self = StObject.set(x, "pendingValueChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingValueChangedUndefined: Self = StObject.set(x, "pendingValueChanged", js.undefined)
    
    @scala.inline
    def setPendingValueNeedleBrush(value: String): Self = StObject.set(x, "pendingValueNeedleBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingValueNeedleBrushUndefined: Self = StObject.set(x, "pendingValueNeedleBrush", js.undefined)
    
    @scala.inline
    def setPendingValueUndefined: Self = StObject.set(x, "pendingValue", js.undefined)
    
    @scala.inline
    def setRecentItemName(value: String): Self = StObject.set(x, "recentItemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecentItemNameUndefined: Self = StObject.set(x, "recentItemName", js.undefined)
    
    @scala.inline
    def setReserveFirstSlice(value: Boolean): Self = StObject.set(x, "reserveFirstSlice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReserveFirstSliceUndefined: Self = StObject.set(x, "reserveFirstSlice", js.undefined)
    
    @scala.inline
    def setSmallIncrement(value: Double): Self = StObject.set(x, "smallIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallIncrementUndefined: Self = StObject.set(x, "smallIncrement", js.undefined)
    
    @scala.inline
    def setTickBrush(value: String): Self = StObject.set(x, "tickBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickBrushUndefined: Self = StObject.set(x, "tickBrush", js.undefined)
    
    @scala.inline
    def setTicks(value: js.Any): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setToolTip(value: js.Any): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    
    @scala.inline
    def setTrackEndColor(value: js.Any): Self = StObject.set(x, "trackEndColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackEndColorUndefined: Self = StObject.set(x, "trackEndColor", js.undefined)
    
    @scala.inline
    def setTrackStartColor(value: js.Any): Self = StObject.set(x, "trackStartColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackStartColorUndefined: Self = StObject.set(x, "trackStartColor", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnchecked(value: js.Any): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedUndefined: Self = StObject.set(x, "unchecked", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChanged(value: js.Any): Self = StObject.set(x, "valueChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChangedUndefined: Self = StObject.set(x, "valueChanged", js.undefined)
    
    @scala.inline
    def setValueNeedleBrush(value: String): Self = StObject.set(x, "valueNeedleBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNeedleBrushUndefined: Self = StObject.set(x, "valueNeedleBrush", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWedgeIndex(value: Double): Self = StObject.set(x, "wedgeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWedgeIndexUndefined: Self = StObject.set(x, "wedgeIndex", js.undefined)
    
    @scala.inline
    def setWedgeSpan(value: Double): Self = StObject.set(x, "wedgeSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWedgeSpanUndefined: Self = StObject.set(x, "wedgeSpan", js.undefined)
  }
}
