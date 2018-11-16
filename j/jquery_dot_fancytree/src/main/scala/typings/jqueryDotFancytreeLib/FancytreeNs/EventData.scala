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

