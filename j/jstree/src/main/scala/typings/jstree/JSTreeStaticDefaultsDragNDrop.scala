package typings.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSTreeStaticDefaultsDragNDrop extends StObject {
  
  /**
    * a boolean indicating if nodes from this tree should only be copied with dnd (as opposed to moved), default is `false`
    * @name $.jstree.defaults.dnd.always_copy
    * @plugin dnd
    */
  var always_copy: Boolean = js.native
  
  /**
    * a boolean indicating if checks should constantly be made while the user is dragging the node
    * (as opposed to checking only on drop), default is `true`
    * @name $.jstree.defaults.dnd.check_while_dragging
    * @plugin dnd
    */
  var check_while_dragging: Boolean = js.native
  
  /**
    * a boolean indicating if a copy should be possible while dragging (by pressint the meta key or Ctrl). Defaults to `true`.
    * @name $.jstree.defaults.dnd.copy
    * @plugin dnd
    */
  var copy: Boolean = js.native
  
  /**
    * when starting the drag on a node that is selected this setting controls if all selected nodes are dragged
    * or only the single node, default is `true`, which means all selected nodes are dragged when the drag is started on a selected node
    * @name $.jstree.defaults.dnd.drag_selection
    * @plugin dnd
    */
  var drag_selection: Boolean = js.native
  
  /**
    * when dropping a node "inside", this setting indicates the position the node should go to
    * - it can be an integer or a string: "first" (same as 0) or "last", default is `0`
    * @name $.jstree.defaults.dnd.inside_pos
    * @plugin dnd
    */
  var inside_pos: js.Any = js.native
  
  /**
    * a function invoked each time a node is about to be dragged, invoked in the tree's scope and receives the nodes
    * about to be dragged as an argument (array) - return `false` to prevent dragging
    * @name $.jstree.defaults.dnd.is_draggable
    * @plugin dnd
    */
  var is_draggable: Boolean = js.native
  
  /**
    * controls whether a drag can be initiated from any part of the node and not just the text/icon part,
    * works best with the wholerow plugin. Keep in mind it can cause problems with tree scrolling on mobile
    * depending on the interface - in that case set the touch option to "selected".
    * @name $.jstree.defaults.dnd.large_drag_target
    * @plugin dnd
    */
  var large_drag_target: Boolean = js.native
  
  /**
    * controls whether items can be dropped anywhere on the node, not just on the anchor,
    * by default only the node anchor is a valid drop target. Works best with the wholerow plugin.
    * If enabled on mobile depending on the interface it might be hard for the user to cancel the drop,
    * since the whole tree container will be a valid drop target.
    * @name $.jstree.defaults.dnd.large_drop_target
    * @plugin dnd
    */
  var large_drop_target: Boolean = js.native
  
  /**
    * a number indicating how long a node should remain hovered while dragging to be opened. Defaults to `500`.
    * @name $.jstree.defaults.dnd.open_timeout
    * @plugin dnd
    */
  var open_timeout: Double = js.native
  
  /**
    * controls whether dnd works on touch devices. If left as boolean true dnd will work the same as in desktop browsers,
    * which in some cases may impair scrolling. If set to boolean false dnd will not work on touch devices.
    * There is a special third option - string "selected" which means only selected nodes can be dragged on touch devices.
    * @name $.jstree.defaults.dnd.touch
    * @plugin dnd
    */
  var touch: Boolean = js.native
  
  /**
    * controls whether use HTML5 dnd api instead of classical.
    * That will allow better integration of dnd events with other HTML5 controls.
    * @reference http://caniuse.com/#feat=dragndrop
    * @name $.jstree.defaults.dnd.use_html5
    * @plugin dnd
    */
  var use_html5: Boolean = js.native
}
object JSTreeStaticDefaultsDragNDrop {
  
  @scala.inline
  def apply(
    always_copy: Boolean,
    check_while_dragging: Boolean,
    copy: Boolean,
    drag_selection: Boolean,
    inside_pos: js.Any,
    is_draggable: Boolean,
    large_drag_target: Boolean,
    large_drop_target: Boolean,
    open_timeout: Double,
    touch: Boolean,
    use_html5: Boolean
  ): JSTreeStaticDefaultsDragNDrop = {
    val __obj = js.Dynamic.literal(always_copy = always_copy.asInstanceOf[js.Any], check_while_dragging = check_while_dragging.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], drag_selection = drag_selection.asInstanceOf[js.Any], inside_pos = inside_pos.asInstanceOf[js.Any], is_draggable = is_draggable.asInstanceOf[js.Any], large_drag_target = large_drag_target.asInstanceOf[js.Any], large_drop_target = large_drop_target.asInstanceOf[js.Any], open_timeout = open_timeout.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], use_html5 = use_html5.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeStaticDefaultsDragNDrop]
  }
  
  @scala.inline
  implicit class JSTreeStaticDefaultsDragNDropMutableBuilder[Self <: JSTreeStaticDefaultsDragNDrop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlways_copy(value: Boolean): Self = StObject.set(x, "always_copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck_while_dragging(value: Boolean): Self = StObject.set(x, "check_while_dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrag_selection(value: Boolean): Self = StObject.set(x, "drag_selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInside_pos(value: js.Any): Self = StObject.set(x, "inside_pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_draggable(value: Boolean): Self = StObject.set(x, "is_draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge_drag_target(value: Boolean): Self = StObject.set(x, "large_drag_target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge_drop_target(value: Boolean): Self = StObject.set(x, "large_drop_target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen_timeout(value: Double): Self = StObject.set(x, "open_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_html5(value: Boolean): Self = StObject.set(x, "use_html5", value.asInstanceOf[js.Any])
  }
}
