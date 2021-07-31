package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTreeDragAndDropSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets whether the widget will accept drag and drop from other controls.
    *
    */
  var allowDrop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the containment for the drag helper. The area inside of which thehelper is contained would be scrollable while dragging.
    *
    *
    * Valid values:
    * "boolean" If set to false, then the draggable elements will be contained in their window.
    * "selector" The draggable element will be contained to the bounding box of the first element found by the selector. If no element is found, no containment will be set.
    * "element" The draggable element will be contained to the bounding box of this element.
    * "string" Possible values: "parent", "document", "window".
    * "array" An array defining a bounding box in the form [ x1, y1, x2, y2 ].
    */
  var containment: js.UndefOr[Boolean | String | js.Object | js.Array[js.Any]] = js.undefined
  
  /**
    * Gets the HTML markup for the "copy after" helper.
    *
    */
  var copyAfterMarkup: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the HTML markup for the "copy before" helper.
    *
    */
  var copyBeforeMarkup: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the HTML markup for the "copy between" helper.
    *
    */
  var copyBetweenMarkup: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the HTML markup for the "copy to" helper.
    *
    */
  var copyToMarkup: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the method for custom drop point validation. Returning true from this function would render the drop point valid, while false would make it invalid. The function has one parameter which is the current drop point and the context (this) of the function is the drag element.
    *
    *
    * Valid values:
    * "function" A function that will be used for validating drop points.
    * "null" Only built-in validation is applied.
    */
  var customDropValidation: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Gets the drag and drop mode.
    *
    *
    * Valid values:
    * "default" Performs "copy" when holding the Ctrl key, otherwise "move" is performed.
    * "copy" Makes a copy of the dragged node at the drop location.
    * "move" Moves the dragged node at the drop location.
    */
  var dragAndDropMode: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the opacity of the drag helper: 0 is fully transparent while 1 is fully opaque.
    *
    */
  var dragOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the delay between mousedown and the start of the actual drag. Smaller values make the nodes
    * more sensitive to drag and may interfere with selection.
    *
    */
  var dragStartDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the delay after hovering a parent node before expanding that node during drag when [expandOnDragOver](ui.igtree#options:dragAndDropSettings.expandOnDragOver) is set to true.
    *
    */
  var expandDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets whether when dragging over a collapsed node with children will trigger the node to expand.
    *
    */
  var expandOnDragOver: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the type of helper to be rendered for the drag operation.
    *
    *
    * Valid values:
    * "function" A function that will return a DOMElement to use while dragging.
    * "default" would render the default igTree helper.
    */
  var helper: js.UndefOr[js.Function | String] = js.undefined
  
  /**
    * Gets the HTML markup for the invalid helper.
    *
    */
  var invalidMoveToMarkup: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the HTML markup for the "move after" helper.
    *
    */
  var moveAfterMarkup: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the HTML markup for the "move before" helper.
    *
    */
  var moveBeforeMarkup: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the HTML markup for the "move between" helper.
    *
    */
  var moveBetweenMarkup: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the HTML markup for the "move to" helper.
    *
    */
  var moveToMarkup: js.UndefOr[String] = js.undefined
  
  /**
    * Gets whether the helper would revert to its original position upon an invalid drop.
    *
    */
  var revert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the duration of the revert animation.
    *
    */
  var revertDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the z-index that would be set for the drag helper.
    *
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object IgTreeDragAndDropSettings {
  
  @scala.inline
  def apply(): IgTreeDragAndDropSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeDragAndDropSettings]
  }
  
  @scala.inline
  implicit class IgTreeDragAndDropSettingsMutableBuilder[Self <: IgTreeDragAndDropSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDrop(value: Boolean): Self = StObject.set(x, "allowDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
    
    @scala.inline
    def setContainment(value: Boolean | String | js.Object | js.Array[js.Any]): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
    
    @scala.inline
    def setContainmentVarargs(value: js.Any*): Self = StObject.set(x, "containment", js.Array(value :_*))
    
    @scala.inline
    def setCopyAfterMarkup(value: String): Self = StObject.set(x, "copyAfterMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyAfterMarkupUndefined: Self = StObject.set(x, "copyAfterMarkup", js.undefined)
    
    @scala.inline
    def setCopyBeforeMarkup(value: String): Self = StObject.set(x, "copyBeforeMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyBeforeMarkupUndefined: Self = StObject.set(x, "copyBeforeMarkup", js.undefined)
    
    @scala.inline
    def setCopyBetweenMarkup(value: String): Self = StObject.set(x, "copyBetweenMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyBetweenMarkupUndefined: Self = StObject.set(x, "copyBetweenMarkup", js.undefined)
    
    @scala.inline
    def setCopyToMarkup(value: String): Self = StObject.set(x, "copyToMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyToMarkupUndefined: Self = StObject.set(x, "copyToMarkup", js.undefined)
    
    @scala.inline
    def setCustomDropValidation(value: js.Function): Self = StObject.set(x, "customDropValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDropValidationUndefined: Self = StObject.set(x, "customDropValidation", js.undefined)
    
    @scala.inline
    def setDragAndDropMode(value: String): Self = StObject.set(x, "dragAndDropMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragAndDropModeUndefined: Self = StObject.set(x, "dragAndDropMode", js.undefined)
    
    @scala.inline
    def setDragOpacity(value: Double): Self = StObject.set(x, "dragOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOpacityUndefined: Self = StObject.set(x, "dragOpacity", js.undefined)
    
    @scala.inline
    def setDragStartDelay(value: Double): Self = StObject.set(x, "dragStartDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragStartDelayUndefined: Self = StObject.set(x, "dragStartDelay", js.undefined)
    
    @scala.inline
    def setExpandDelay(value: Double): Self = StObject.set(x, "expandDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandDelayUndefined: Self = StObject.set(x, "expandDelay", js.undefined)
    
    @scala.inline
    def setExpandOnDragOver(value: Boolean): Self = StObject.set(x, "expandOnDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandOnDragOverUndefined: Self = StObject.set(x, "expandOnDragOver", js.undefined)
    
    @scala.inline
    def setHelper(value: js.Function | String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    @scala.inline
    def setInvalidMoveToMarkup(value: String): Self = StObject.set(x, "invalidMoveToMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMoveToMarkupUndefined: Self = StObject.set(x, "invalidMoveToMarkup", js.undefined)
    
    @scala.inline
    def setMoveAfterMarkup(value: String): Self = StObject.set(x, "moveAfterMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveAfterMarkupUndefined: Self = StObject.set(x, "moveAfterMarkup", js.undefined)
    
    @scala.inline
    def setMoveBeforeMarkup(value: String): Self = StObject.set(x, "moveBeforeMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveBeforeMarkupUndefined: Self = StObject.set(x, "moveBeforeMarkup", js.undefined)
    
    @scala.inline
    def setMoveBetweenMarkup(value: String): Self = StObject.set(x, "moveBetweenMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveBetweenMarkupUndefined: Self = StObject.set(x, "moveBetweenMarkup", js.undefined)
    
    @scala.inline
    def setMoveToMarkup(value: String): Self = StObject.set(x, "moveToMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveToMarkupUndefined: Self = StObject.set(x, "moveToMarkup", js.undefined)
    
    @scala.inline
    def setRevert(value: Boolean): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevertDuration(value: Double): Self = StObject.set(x, "revertDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevertDurationUndefined: Self = StObject.set(x, "revertDuration", js.undefined)
    
    @scala.inline
    def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
