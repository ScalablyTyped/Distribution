package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaultsContextMenu extends js.Object {
  /**
    * an object of actions, or a function that accepts a node and a callback function and calls the callback function
    * with an object of actions available for that node (you can also return the items too).
    *
    * Each action consists of a key (a unique name) and a value which is an object with the following properties
    * (only label and action are required). Once a menu item is activated the `action` function will be invoked
    * with an object containing the following keys: item - the contextmenu item definition as seen below,
    * reference - the DOM node that was used (the tree node), element - the contextmenu DOM element,
    * position - an object with x/y properties indicating the position of the menu.
    *
    * * `separator_before` - a boolean indicating if there should be a separator before this item
    * * `separator_after` - a boolean indicating if there should be a separator after this item
    * * `_disabled` - a boolean indicating if this action should be disabled
    * * `label` - a string - the name of the action (could be a function returning a string)
    * * `title` - a string - an optional tooltip for the item
    * * `action` - a function to be executed if this item is chosen, the function will receive
    * * `icon` - a string, can be a path to an icon or a className,
    *            if using an image that is in the current directory use a `./` prefix, otherwise it will be detected as a class
    * * `shortcut` - keyCode which will trigger the action if the menu is open (for example `113` for rename, which equals F2)
    * * `shortcut_label` - shortcut label (like for example `F2` for rename)
    * * `submenu` - an object with the same structure as $.jstree.defaults.contextmenu.items
    *               which can be used to create a submenu - each key will be rendered as a separate option in a submenu
    *               that will appear once the current item is hovered
    *
    * @name $.jstree.defaults.contextmenu.items
    * @plugin contextmenu
    */
  var items: js.Any
  /**
    * a boolean indicating if the node should be selected when the context menu is invoked on it. Defaults to `true`.
    * @name $.jstree.defaults.contextmenu.select_node
    * @plugin contextmenu
    */
  var select_node: Boolean
  /**
    * a boolean indicating if the menu should be shown aligned with the node. Defaults to `true`,
    * otherwise the mouse coordinates are used.
    * @name $.jstree.defaults.contextmenu.show_at_node
    * @plugin contextmenu
    */
  var show_at_node: Boolean
}

object JSTreeStaticDefaultsContextMenu {
  @scala.inline
  def apply(items: js.Any, select_node: Boolean, show_at_node: Boolean): JSTreeStaticDefaultsContextMenu = {
    val __obj = js.Dynamic.literal(items = items, select_node = select_node, show_at_node = show_at_node)
  
    __obj.asInstanceOf[JSTreeStaticDefaultsContextMenu]
  }
}

