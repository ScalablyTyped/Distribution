package typings
package jqueryDotFancytreeLib.FancytreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Context object passed to events and hook functions. */
trait EventData extends js.Object {
  /** The node that this call applies to (`null` for tree events) */
  var node: FancytreeNode
      // JQueryUI.Widget;
  /** Shortcut to tree.options */
  var options: FancytreeOptions
  /** The jQuery Event that initially triggered this call */
  var originalEvent: jqueryLib.JQueryEventObject
  /** (only for postProcess event) Original ajax response */
  var response: js.Any
  /** (output parameter) Event handlers can return values back to the
    * caller. Used by `lazyLoad`, `postProcess`, ... */
  var result: js.Any
  /** (only for click and dblclick events) 'title' | 'prefix' | 'expander' | 'checkbox' | 'icon' */
  var targetType: java.lang.String
  /** The tree instance */
  var tree: Fancytree
  /** The jQuery UI tree widget */
  var widget: js.Any
}

object EventData {
  @scala.inline
  def apply(
    node: FancytreeNode,
    options: FancytreeOptions,
    originalEvent: jqueryLib.JQueryEventObject,
    response: js.Any,
    result: js.Any,
    targetType: java.lang.String,
    tree: Fancytree,
    widget: js.Any
  ): EventData = {
    val __obj = js.Dynamic.literal(node = node, options = options, originalEvent = originalEvent, response = response, result = result, targetType = targetType, tree = tree, widget = widget)
  
    __obj.asInstanceOf[EventData]
  }
}

