package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDroppingEventUIParam extends js.Object {
  /**
    * Gets a reference to the binding object for the level at which the target node is located.
    */
  var binding: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the target node data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the draggable element (the node).
    */
  var draggable: js.UndefOr[String] = js.undefined
  /**
    * Gets a reference to the jQuery element of the node.
    */
  var element: js.UndefOr[String] = js.undefined
  /**
    * Gets a reference to the helper.
    */
  var helper: js.UndefOr[String] = js.undefined
  /**
    * Gets a reference to the offset.
    */
  var offset: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets the target node data-path attribute.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Gets a reference to the current position of the draggable element.
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the source node object about to be dropped.
    */
  var sourceNode: js.UndefOr[js.Any] = js.undefined
}

object NodeDroppingEventUIParam {
  @scala.inline
  def apply(
    binding: js.Any = null,
    data: js.Any = null,
    draggable: String = null,
    element: String = null,
    helper: String = null,
    offset: js.Any = null,
    owner: js.Any = null,
    path: String = null,
    position: js.Any = null,
    sourceNode: js.Any = null
  ): NodeDroppingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (binding != null) __obj.updateDynamic("binding")(binding.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (helper != null) __obj.updateDynamic("helper")(helper.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sourceNode != null) __obj.updateDynamic("sourceNode")(sourceNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDroppingEventUIParam]
  }
}

