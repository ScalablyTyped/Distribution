package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeDragAndDropSettings
  extends /**
	 * Option for IgTreeDragAndDropSettings
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
  var containment: js.UndefOr[Boolean | String | js.Object | js.Array[_]] = js.undefined
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
  def apply(
    StringDictionary: /**
  	 * Option for IgTreeDragAndDropSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowDrop: js.UndefOr[Boolean] = js.undefined,
    containment: Boolean | String | js.Object | js.Array[_] = null,
    copyAfterMarkup: String = null,
    copyBeforeMarkup: String = null,
    copyBetweenMarkup: String = null,
    copyToMarkup: String = null,
    customDropValidation: js.Function = null,
    dragAndDropMode: String = null,
    dragOpacity: Int | Double = null,
    dragStartDelay: Int | Double = null,
    expandDelay: Int | Double = null,
    expandOnDragOver: js.UndefOr[Boolean] = js.undefined,
    helper: js.Function | String = null,
    invalidMoveToMarkup: String = null,
    moveAfterMarkup: String = null,
    moveBeforeMarkup: String = null,
    moveBetweenMarkup: String = null,
    moveToMarkup: String = null,
    revert: js.UndefOr[Boolean] = js.undefined,
    revertDuration: Int | Double = null,
    zIndex: Int | Double = null
  ): IgTreeDragAndDropSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowDrop)) __obj.updateDynamic("allowDrop")(allowDrop.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (copyAfterMarkup != null) __obj.updateDynamic("copyAfterMarkup")(copyAfterMarkup.asInstanceOf[js.Any])
    if (copyBeforeMarkup != null) __obj.updateDynamic("copyBeforeMarkup")(copyBeforeMarkup.asInstanceOf[js.Any])
    if (copyBetweenMarkup != null) __obj.updateDynamic("copyBetweenMarkup")(copyBetweenMarkup.asInstanceOf[js.Any])
    if (copyToMarkup != null) __obj.updateDynamic("copyToMarkup")(copyToMarkup.asInstanceOf[js.Any])
    if (customDropValidation != null) __obj.updateDynamic("customDropValidation")(customDropValidation.asInstanceOf[js.Any])
    if (dragAndDropMode != null) __obj.updateDynamic("dragAndDropMode")(dragAndDropMode.asInstanceOf[js.Any])
    if (dragOpacity != null) __obj.updateDynamic("dragOpacity")(dragOpacity.asInstanceOf[js.Any])
    if (dragStartDelay != null) __obj.updateDynamic("dragStartDelay")(dragStartDelay.asInstanceOf[js.Any])
    if (expandDelay != null) __obj.updateDynamic("expandDelay")(expandDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(expandOnDragOver)) __obj.updateDynamic("expandOnDragOver")(expandOnDragOver.asInstanceOf[js.Any])
    if (helper != null) __obj.updateDynamic("helper")(helper.asInstanceOf[js.Any])
    if (invalidMoveToMarkup != null) __obj.updateDynamic("invalidMoveToMarkup")(invalidMoveToMarkup.asInstanceOf[js.Any])
    if (moveAfterMarkup != null) __obj.updateDynamic("moveAfterMarkup")(moveAfterMarkup.asInstanceOf[js.Any])
    if (moveBeforeMarkup != null) __obj.updateDynamic("moveBeforeMarkup")(moveBeforeMarkup.asInstanceOf[js.Any])
    if (moveBetweenMarkup != null) __obj.updateDynamic("moveBetweenMarkup")(moveBetweenMarkup.asInstanceOf[js.Any])
    if (moveToMarkup != null) __obj.updateDynamic("moveToMarkup")(moveToMarkup.asInstanceOf[js.Any])
    if (!js.isUndefined(revert)) __obj.updateDynamic("revert")(revert.asInstanceOf[js.Any])
    if (revertDuration != null) __obj.updateDynamic("revertDuration")(revertDuration.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeDragAndDropSettings]
  }
}

