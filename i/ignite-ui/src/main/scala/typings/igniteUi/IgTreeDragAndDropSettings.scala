package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeDragAndDropSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets whether the widget will accept drag and drop from other controls.
    *
    */
  var allowDrop: js.UndefOr[Boolean] = js.native
  
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
  var containment: js.UndefOr[Boolean | String | js.Object | js.Array[_]] = js.native
  
  /**
    * Gets the HTML markup for the "copy after" helper.
    *
    */
  var copyAfterMarkup: js.UndefOr[String] = js.native
  
  /**
    * Gets the HTML markup for the "copy before" helper.
    *
    */
  var copyBeforeMarkup: js.UndefOr[String] = js.native
  
  /**
    * Gets the HTML markup for the "copy between" helper.
    *
    */
  var copyBetweenMarkup: js.UndefOr[String] = js.native
  
  /**
    * Gets the HTML markup for the "copy to" helper.
    *
    */
  var copyToMarkup: js.UndefOr[String] = js.native
  
  /**
    * Gets the method for custom drop point validation. Returning true from this function would render the drop point valid, while false would make it invalid. The function has one parameter which is the current drop point and the context (this) of the function is the drag element.
    *
    *
    * Valid values:
    * "function" A function that will be used for validating drop points.
    * "null" Only built-in validation is applied.
    */
  var customDropValidation: js.UndefOr[js.Function] = js.native
  
  /**
    * Gets the drag and drop mode.
    *
    *
    * Valid values:
    * "default" Performs "copy" when holding the Ctrl key, otherwise "move" is performed.
    * "copy" Makes a copy of the dragged node at the drop location.
    * "move" Moves the dragged node at the drop location.
    */
  var dragAndDropMode: js.UndefOr[String] = js.native
  
  /**
    * Gets the opacity of the drag helper: 0 is fully transparent while 1 is fully opaque.
    *
    */
  var dragOpacity: js.UndefOr[Double] = js.native
  
  /**
    * Gets the delay between mousedown and the start of the actual drag. Smaller values make the nodes
    * more sensitive to drag and may interfere with selection.
    *
    */
  var dragStartDelay: js.UndefOr[Double] = js.native
  
  /**
    * Gets the delay after hovering a parent node before expanding that node during drag when [expandOnDragOver](ui.igtree#options:dragAndDropSettings.expandOnDragOver) is set to true.
    *
    */
  var expandDelay: js.UndefOr[Double] = js.native
  
  /**
    * Gets whether when dragging over a collapsed node with children will trigger the node to expand.
    *
    */
  var expandOnDragOver: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the type of helper to be rendered for the drag operation.
    *
    *
    * Valid values:
    * "function" A function that will return a DOMElement to use while dragging.
    * "default" would render the default igTree helper.
    */
  var helper: js.UndefOr[js.Function | String] = js.native
  
  /**
    * Gets the HTML markup for the invalid helper.
    *
    */
  var invalidMoveToMarkup: js.UndefOr[String] = js.native
  
  /**
    * Gets the HTML markup for the "move after" helper.
    *
    */
  var moveAfterMarkup: js.UndefOr[String] = js.native
  
  /**
    * Gets the HTML markup for the "move before" helper.
    *
    */
  var moveBeforeMarkup: js.UndefOr[String] = js.native
  
  /**
    * Gets the HTML markup for the "move between" helper.
    *
    */
  var moveBetweenMarkup: js.UndefOr[String] = js.native
  
  /**
    * Gets the HTML markup for the "move to" helper.
    *
    */
  var moveToMarkup: js.UndefOr[String] = js.native
  
  /**
    * Gets whether the helper would revert to its original position upon an invalid drop.
    *
    */
  var revert: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the duration of the revert animation.
    *
    */
  var revertDuration: js.UndefOr[Double] = js.native
  
  /**
    * Gets the z-index that would be set for the drag helper.
    *
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object IgTreeDragAndDropSettings {
  
  @scala.inline
  def apply(): IgTreeDragAndDropSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeDragAndDropSettings]
  }
  
  @scala.inline
  implicit class IgTreeDragAndDropSettingsOps[Self <: IgTreeDragAndDropSettings] (val x: Self) extends AnyVal {
    
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
    def setAllowDrop(value: Boolean): Self = this.set("allowDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDrop: Self = this.set("allowDrop", js.undefined)
    
    @scala.inline
    def setContainmentVarargs(value: js.Any*): Self = this.set("containment", js.Array(value :_*))
    
    @scala.inline
    def setContainment(value: Boolean | String | js.Object | js.Array[_]): Self = this.set("containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainment: Self = this.set("containment", js.undefined)
    
    @scala.inline
    def setCopyAfterMarkup(value: String): Self = this.set("copyAfterMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyAfterMarkup: Self = this.set("copyAfterMarkup", js.undefined)
    
    @scala.inline
    def setCopyBeforeMarkup(value: String): Self = this.set("copyBeforeMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyBeforeMarkup: Self = this.set("copyBeforeMarkup", js.undefined)
    
    @scala.inline
    def setCopyBetweenMarkup(value: String): Self = this.set("copyBetweenMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyBetweenMarkup: Self = this.set("copyBetweenMarkup", js.undefined)
    
    @scala.inline
    def setCopyToMarkup(value: String): Self = this.set("copyToMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyToMarkup: Self = this.set("copyToMarkup", js.undefined)
    
    @scala.inline
    def setCustomDropValidation(value: js.Function): Self = this.set("customDropValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDropValidation: Self = this.set("customDropValidation", js.undefined)
    
    @scala.inline
    def setDragAndDropMode(value: String): Self = this.set("dragAndDropMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragAndDropMode: Self = this.set("dragAndDropMode", js.undefined)
    
    @scala.inline
    def setDragOpacity(value: Double): Self = this.set("dragOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragOpacity: Self = this.set("dragOpacity", js.undefined)
    
    @scala.inline
    def setDragStartDelay(value: Double): Self = this.set("dragStartDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragStartDelay: Self = this.set("dragStartDelay", js.undefined)
    
    @scala.inline
    def setExpandDelay(value: Double): Self = this.set("expandDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandDelay: Self = this.set("expandDelay", js.undefined)
    
    @scala.inline
    def setExpandOnDragOver(value: Boolean): Self = this.set("expandOnDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandOnDragOver: Self = this.set("expandOnDragOver", js.undefined)
    
    @scala.inline
    def setHelper(value: js.Function | String): Self = this.set("helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelper: Self = this.set("helper", js.undefined)
    
    @scala.inline
    def setInvalidMoveToMarkup(value: String): Self = this.set("invalidMoveToMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidMoveToMarkup: Self = this.set("invalidMoveToMarkup", js.undefined)
    
    @scala.inline
    def setMoveAfterMarkup(value: String): Self = this.set("moveAfterMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveAfterMarkup: Self = this.set("moveAfterMarkup", js.undefined)
    
    @scala.inline
    def setMoveBeforeMarkup(value: String): Self = this.set("moveBeforeMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveBeforeMarkup: Self = this.set("moveBeforeMarkup", js.undefined)
    
    @scala.inline
    def setMoveBetweenMarkup(value: String): Self = this.set("moveBetweenMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveBetweenMarkup: Self = this.set("moveBetweenMarkup", js.undefined)
    
    @scala.inline
    def setMoveToMarkup(value: String): Self = this.set("moveToMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveToMarkup: Self = this.set("moveToMarkup", js.undefined)
    
    @scala.inline
    def setRevert(value: Boolean): Self = this.set("revert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevert: Self = this.set("revert", js.undefined)
    
    @scala.inline
    def setRevertDuration(value: Double): Self = this.set("revertDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevertDuration: Self = this.set("revertDuration", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
