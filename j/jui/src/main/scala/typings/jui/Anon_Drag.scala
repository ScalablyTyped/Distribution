package typings.jui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Drag extends js.Object {
  /**
    * @cfg {Boolean} [drag=false]
    * Changes the tab location through dragging
    */
  var drag: js.UndefOr[Boolean] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [index=0]
    * Sets an enabled tab
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Array} nodes
    * Sets a tab list to data rather than markup
    */
  var nodes: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @cfg {String/DOMElement} [target=""]
    * Determines a selector in the area to become the content of a tab
    */
  var target: js.UndefOr[String | js.Any] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object Anon_Drag {
  @scala.inline
  def apply(
    drag: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    index: Int | Double = null,
    nodes: js.Array[_] = null,
    target: String | js.Any = null,
    tpl: js.Any = null
  ): Anon_Drag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Drag]
  }
}

