package typings
package juiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DragDragChild extends js.Object {
  /**
    * @cfg {Boolean} [drag=false]
    * It is possible to drag the movement of a node.
    */
  var drag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {Boolean} [dragChild=true]
    * It is possible to drag the node movement but the node is not changed to a child node of the target node.
    */
  var dragChild: js.UndefOr[scala.Boolean] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {NodeObject} [root=null]
    * Adds a root node (required).
    */
  var root: js.UndefOr[juiLib.juiMod.UITreeNode] = js.undefined
  /**
    * @cfg {Boolean} [rootFold=false]
    * Folds up a root node.
    */
  var rootFold: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {Boolean} [rootHide=false]
    * Hides a root node.
    */
  var rootHide: js.UndefOr[scala.Boolean] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object Anon_DragDragChild {
  @scala.inline
  def apply(
    drag: js.UndefOr[scala.Boolean] = js.undefined,
    dragChild: js.UndefOr[scala.Boolean] = js.undefined,
    event: js.Any = null,
    root: juiLib.juiMod.UITreeNode = null,
    rootFold: js.UndefOr[scala.Boolean] = js.undefined,
    rootHide: js.UndefOr[scala.Boolean] = js.undefined,
    tpl: js.Any = null
  ): Anon_DragDragChild = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag)
    if (!js.isUndefined(dragChild)) __obj.updateDynamic("dragChild")(dragChild)
    if (event != null) __obj.updateDynamic("event")(event)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(rootFold)) __obj.updateDynamic("rootFold")(rootFold)
    if (!js.isUndefined(rootHide)) __obj.updateDynamic("rootHide")(rootHide)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[Anon_DragDragChild]
  }
}

