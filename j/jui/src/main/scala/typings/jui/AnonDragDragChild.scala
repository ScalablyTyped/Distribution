package typings.jui

import typings.jui.mod.UITreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragDragChild extends js.Object {
  /**
    * @cfg {Boolean} [drag=false]
    * It is possible to drag the movement of a node.
    */
  var drag: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Boolean} [dragChild=true]
    * It is possible to drag the node movement but the node is not changed to a child node of the target node.
    */
  var dragChild: js.UndefOr[Boolean] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {NodeObject} [root=null]
    * Adds a root node (required).
    */
  var root: js.UndefOr[UITreeNode] = js.undefined
  /**
    * @cfg {Boolean} [rootFold=false]
    * Folds up a root node.
    */
  var rootFold: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Boolean} [rootHide=false]
    * Hides a root node.
    */
  var rootHide: js.UndefOr[Boolean] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object AnonDragDragChild {
  @scala.inline
  def apply(
    drag: js.UndefOr[Boolean] = js.undefined,
    dragChild: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    root: UITreeNode = null,
    rootFold: js.UndefOr[Boolean] = js.undefined,
    rootHide: js.UndefOr[Boolean] = js.undefined,
    tpl: js.Any = null
  ): AnonDragDragChild = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag.asInstanceOf[js.Any])
    if (!js.isUndefined(dragChild)) __obj.updateDynamic("dragChild")(dragChild.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(rootFold)) __obj.updateDynamic("rootFold")(rootFold.asInstanceOf[js.Any])
    if (!js.isUndefined(rootHide)) __obj.updateDynamic("rootHide")(rootHide.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDragDragChild]
  }
}

