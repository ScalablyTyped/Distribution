package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
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
  implicit class IgRadialMenuItemOps[Self <: IgRadialMenuItem] (val x: Self) extends AnyVal {
    
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
    def setAutoRotateChildren(value: Boolean): Self = this.set("autoRotateChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRotateChildren: Self = this.set("autoRotateChildren", js.undefined)
    
    @scala.inline
    def setAutoUpdateRecentItem(value: Boolean): Self = this.set("autoUpdateRecentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdateRecentItem: Self = this.set("autoUpdateRecentItem", js.undefined)
    
    @scala.inline
    def setCheckBehavior(value: String): Self = this.set("checkBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckBehavior: Self = this.set("checkBehavior", js.undefined)
    
    @scala.inline
    def setChecked(value: js.Any): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setCheckedHighlightBrush(value: String): Self = this.set("checkedHighlightBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedHighlightBrush: Self = this.set("checkedHighlightBrush", js.undefined)
    
    @scala.inline
    def setChildItemPlacement(value: String): Self = this.set("childItemPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildItemPlacement: Self = this.set("childItemPlacement", js.undefined)
    
    @scala.inline
    def setClick(value: js.Any): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setClosed(value: js.Any): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    
    @scala.inline
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorChanged(value: js.Any): Self = this.set("colorChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorChanged: Self = this.set("colorChanged", js.undefined)
    
    @scala.inline
    def setColorWellClick(value: js.Any): Self = this.set("colorWellClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorWellClick: Self = this.set("colorWellClick", js.undefined)
    
    @scala.inline
    def setForeground(value: String): Self = this.set("foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeground: Self = this.set("foreground", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHighlightBrush(value: String): Self = this.set("highlightBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightBrush: Self = this.set("highlightBrush", js.undefined)
    
    @scala.inline
    def setIconUri(value: String): Self = this.set("iconUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUri: Self = this.set("iconUri", js.undefined)
    
    @scala.inline
    def setInnerAreaFill(value: String): Self = this.set("innerAreaFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerAreaFill: Self = this.set("innerAreaFill", js.undefined)
    
    @scala.inline
    def setInnerAreaHotTrackFill(value: String): Self = this.set("innerAreaHotTrackFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerAreaHotTrackFill: Self = this.set("innerAreaHotTrackFill", js.undefined)
    
    @scala.inline
    def setInnerAreaHotTrackStroke(value: String): Self = this.set("innerAreaHotTrackStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerAreaHotTrackStroke: Self = this.set("innerAreaHotTrackStroke", js.undefined)
    
    @scala.inline
    def setInnerAreaStroke(value: String): Self = this.set("innerAreaStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerAreaStroke: Self = this.set("innerAreaStroke", js.undefined)
    
    @scala.inline
    def setInnerAreaStrokeThickness(value: Double): Self = this.set("innerAreaStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerAreaStrokeThickness: Self = this.set("innerAreaStrokeThickness", js.undefined)
    
    @scala.inline
    def setIsChecked(value: Boolean): Self = this.set("isChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsChecked: Self = this.set("isChecked", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setIsToolTipEnabled(value: Boolean): Self = this.set("isToolTipEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsToolTipEnabled: Self = this.set("isToolTipEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpened(value: js.Any): Self = this.set("opened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpened: Self = this.set("opened", js.undefined)
    
    @scala.inline
    def setOuterRingButtonFill(value: String): Self = this.set("outerRingButtonFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterRingButtonFill: Self = this.set("outerRingButtonFill", js.undefined)
    
    @scala.inline
    def setOuterRingButtonForeground(value: String): Self = this.set("outerRingButtonForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterRingButtonForeground: Self = this.set("outerRingButtonForeground", js.undefined)
    
    @scala.inline
    def setOuterRingButtonHotTrackFill(value: String): Self = this.set("outerRingButtonHotTrackFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterRingButtonHotTrackFill: Self = this.set("outerRingButtonHotTrackFill", js.undefined)
    
    @scala.inline
    def setOuterRingButtonHotTrackForeground(value: String): Self = this.set("outerRingButtonHotTrackForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterRingButtonHotTrackForeground: Self = this.set("outerRingButtonHotTrackForeground", js.undefined)
    
    @scala.inline
    def setOuterRingButtonHotTrackStroke(value: String): Self = this.set("outerRingButtonHotTrackStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterRingButtonHotTrackStroke: Self = this.set("outerRingButtonHotTrackStroke", js.undefined)
    
    @scala.inline
    def setOuterRingButtonStroke(value: String): Self = this.set("outerRingButtonStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterRingButtonStroke: Self = this.set("outerRingButtonStroke", js.undefined)
    
    @scala.inline
    def setOuterRingButtonStrokeThickness(value: Double): Self = this.set("outerRingButtonStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterRingButtonStrokeThickness: Self = this.set("outerRingButtonStrokeThickness", js.undefined)
    
    @scala.inline
    def setPendingValue(value: js.Any): Self = this.set("pendingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingValue: Self = this.set("pendingValue", js.undefined)
    
    @scala.inline
    def setPendingValueChanged(value: js.Any): Self = this.set("pendingValueChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingValueChanged: Self = this.set("pendingValueChanged", js.undefined)
    
    @scala.inline
    def setPendingValueNeedleBrush(value: String): Self = this.set("pendingValueNeedleBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingValueNeedleBrush: Self = this.set("pendingValueNeedleBrush", js.undefined)
    
    @scala.inline
    def setRecentItemName(value: String): Self = this.set("recentItemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecentItemName: Self = this.set("recentItemName", js.undefined)
    
    @scala.inline
    def setReserveFirstSlice(value: Boolean): Self = this.set("reserveFirstSlice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReserveFirstSlice: Self = this.set("reserveFirstSlice", js.undefined)
    
    @scala.inline
    def setSmallIncrement(value: Double): Self = this.set("smallIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallIncrement: Self = this.set("smallIncrement", js.undefined)
    
    @scala.inline
    def setTickBrush(value: String): Self = this.set("tickBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickBrush: Self = this.set("tickBrush", js.undefined)
    
    @scala.inline
    def setTicks(value: js.Any): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setToolTip(value: js.Any): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolTip: Self = this.set("toolTip", js.undefined)
    
    @scala.inline
    def setTrackEndColor(value: js.Any): Self = this.set("trackEndColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackEndColor: Self = this.set("trackEndColor", js.undefined)
    
    @scala.inline
    def setTrackStartColor(value: js.Any): Self = this.set("trackStartColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackStartColor: Self = this.set("trackStartColor", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnchecked(value: js.Any): Self = this.set("unchecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnchecked: Self = this.set("unchecked", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueChanged(value: js.Any): Self = this.set("valueChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueChanged: Self = this.set("valueChanged", js.undefined)
    
    @scala.inline
    def setValueNeedleBrush(value: String): Self = this.set("valueNeedleBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueNeedleBrush: Self = this.set("valueNeedleBrush", js.undefined)
    
    @scala.inline
    def setWedgeIndex(value: Double): Self = this.set("wedgeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWedgeIndex: Self = this.set("wedgeIndex", js.undefined)
    
    @scala.inline
    def setWedgeSpan(value: Double): Self = this.set("wedgeSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWedgeSpan: Self = this.set("wedgeSpan", js.undefined)
  }
}
