package typings
package jstreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaultsDragNDrop extends js.Object {
  /**
    * a boolean indicating if nodes from this tree should only be copied with dnd (as opposed to moved), default is `false`
    * @name $.jstree.defaults.dnd.always_copy
    * @plugin dnd
    */
  var always_copy: scala.Boolean
  /**
    * a boolean indicating if checks should constantly be made while the user is dragging the node (as opposed to checking only on drop), default is `true`
    * @name $.jstree.defaults.dnd.check_while_dragging
    * @plugin dnd
    */
  var check_while_dragging: scala.Boolean
  /**
    * a boolean indicating if a copy should be possible while dragging (by pressint the meta key or Ctrl). Defaults to `true`.
    * @name $.jstree.defaults.dnd.copy
    * @plugin dnd
    */
  var copy: scala.Boolean
  /**
    * when starting the drag on a node that is selected this setting controls if all selected nodes are dragged or only the single node, default is `true`, which means all selected nodes are dragged when the drag is started on a selected node
    * @name $.jstree.defaults.dnd.drag_selection
    * @plugin dnd
    */
  var drag_selection: scala.Boolean
  /**
    * when dropping a node "inside", this setting indicates the position the node should go to - it can be an integer or a string: "first" (same as 0) or "last", default is `0`
    * @name $.jstree.defaults.dnd.inside_pos
    * @plugin dnd
    */
  var inside_pos: js.Any
  /**
    * a function invoked each time a node is about to be dragged, invoked in the tree's scope and receives the nodes about to be dragged as an argument (array) - return `false` to prevent dragging
    * @name $.jstree.defaults.dnd.is_draggable
    * @plugin dnd
    */
  var is_draggable: scala.Boolean
  /**
    * controls whether a drag can be initiated from any part of the node and not just the text/icon part, works best with the wholerow plugin. Keep in mind it can cause problems with tree scrolling on mobile depending on the interface - in that case set the touch option to "selected".
    * @name $.jstree.defaults.dnd.large_drag_target
    * @plugin dnd
    */
  var large_drag_target: scala.Boolean
  /**
    * controls whether items can be dropped anywhere on the node, not just on the anchor, by default only the node anchor is a valid drop target. Works best with the wholerow plugin. If enabled on mobile depending on the interface it might be hard for the user to cancel the drop, since the whole tree container will be a valid drop target.
    * @name $.jstree.defaults.dnd.large_drop_target
    * @plugin dnd
    */
  var large_drop_target: scala.Boolean
  /**
    * a number indicating how long a node should remain hovered while dragging to be opened. Defaults to `500`.
    * @name $.jstree.defaults.dnd.open_timeout
    * @plugin dnd
    */
  var open_timeout: scala.Double
  /**
    * controls whether dnd works on touch devices. If left as boolean true dnd will work the same as in desktop browsers, which in some cases may impair scrolling. If set to boolean false dnd will not work on touch devices. There is a special third option - string "selected" which means only selected nodes can be dragged on touch devices.
    * @name $.jstree.defaults.dnd.touch
    * @plugin dnd
    */
  var touch: scala.Boolean
  /**
    * controls whether use HTML5 dnd api instead of classical. That will allow better integration of dnd events with other HTML5 controls.
    * @reference http://caniuse.com/#feat=dragndrop
    * @name $.jstree.defaults.dnd.use_html5
    * @plugin dnd
    */
  var use_html5: scala.Boolean
}

object JSTreeStaticDefaultsDragNDrop {
  @scala.inline
  def apply(
    always_copy: scala.Boolean,
    check_while_dragging: scala.Boolean,
    copy: scala.Boolean,
    drag_selection: scala.Boolean,
    inside_pos: js.Any,
    is_draggable: scala.Boolean,
    large_drag_target: scala.Boolean,
    large_drop_target: scala.Boolean,
    open_timeout: scala.Double,
    touch: scala.Boolean,
    use_html5: scala.Boolean
  ): JSTreeStaticDefaultsDragNDrop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("always_copy")(always_copy)
    __obj.updateDynamic("check_while_dragging")(check_while_dragging)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("drag_selection")(drag_selection)
    __obj.updateDynamic("inside_pos")(inside_pos)
    __obj.updateDynamic("is_draggable")(is_draggable)
    __obj.updateDynamic("large_drag_target")(large_drag_target)
    __obj.updateDynamic("large_drop_target")(large_drop_target)
    __obj.updateDynamic("open_timeout")(open_timeout)
    __obj.updateDynamic("touch")(touch)
    __obj.updateDynamic("use_html5")(use_html5)
    __obj.asInstanceOf[JSTreeStaticDefaultsDragNDrop]
  }
}

