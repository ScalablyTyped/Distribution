package typings.jqueryDotFancytree.Fancytree

import typings.jquery.JQueryEventObject
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
  var originalEvent: JQueryEventObject
  /** (only for postProcess event) Original ajax response */
  var response: js.Any
  /** (output parameter) Event handlers can return values back to the
    * caller. Used by `lazyLoad`, `postProcess`, ... */
  var result: js.Any
  /** (only for click and dblclick events) 'title' | 'prefix' | 'expander' | 'checkbox' | 'icon' */
  var targetType: String
  /** The tree instance */
  var tree: typings.jqueryDotFancytree.Fancytree.Fancytree
  /** The jQuery UI tree widget */
  var widget: js.Any
}

object EventData {
  @scala.inline
  def apply(
    node: FancytreeNode,
    options: FancytreeOptions,
    originalEvent: JQueryEventObject,
    response: js.Any,
    result: js.Any,
    targetType: String,
    tree: typings.jqueryDotFancytree.Fancytree.Fancytree,
    widget: js.Any
  ): EventData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventData]
  }
}

