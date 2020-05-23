package typings.jqueryFancytree.Fancytree.Extensions

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryFancytree.Fancytree.FancytreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragAndDrop5
  extends /* extension */ StringDictionary[js.Any] {
  /**
    * Expand nodes after n milliseconds of hovering.
    */
  var autoExpandMS: js.UndefOr[Double] = js.undefined
  var dragDrag: js.UndefOr[js.Function2[/* sourceNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.undefined
  /**
    * Events (drag drop)
    */
  var dragDrop: js.UndefOr[js.Function2[/* node */ FancytreeNode, /* data */ js.Any, Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function2[/* sourceNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.undefined
  /**
    * Callback(targetNode, data), return true, to enable dnd drop
    */
  var dragEnter: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.undefined
  /**
    * Callback(targetNode, data), return false to prevent autoExpand
    */
  var dragExpand: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.undefined
  var dragLeave: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.undefined
  /**
    * Events (drag over)
    */
  var dragOver: js.UndefOr[js.Function2[/* targetNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.undefined
  /**
    * Callback(sourceNode, data), return true, to enable dnd drag
    */
  var dragStart: js.UndefOr[js.Function2[/* sourceNode */ FancytreeNode, /* data */ js.Any, Unit]] = js.undefined
  /**
    * Additional offset for drop-marker with hitMode = "before"/"after"
    */
  var dropMarkerInsertOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Absolute position offset for .fancytree-drop-marker
    */
  var dropMarkerOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * true: Drag multiple (i.e. selected) nodes.
    */
  var multiSource: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent dropping nodes from different Fancytrees
    */
  var preventForeignNodes: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent dropping items other than Fancytree nodes
    */
  var preventNonNodes: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent dropping nodes on own descendants
    */
  var preventRecursiveMoves: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent dropping nodes 'before self', etc.
    */
  var preventVoidMoves: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable auto-scrolling while dragging
    */
  var scroll: js.UndefOr[Boolean] = js.undefined
  /**
    * Active top/bottom margin in pixel
    */
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  /**
    * Pixel per event
    */
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  /**
    * Allow dragging of nodes to different IE windows, default: false
    */
  var setTextTypeJson: js.UndefOr[Boolean] = js.undefined
}

object DragAndDrop5 {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    autoExpandMS: js.UndefOr[Double] = js.undefined,
    dragDrag: (/* sourceNode */ FancytreeNode, /* data */ js.Any) => Unit = null,
    dragDrop: (/* node */ FancytreeNode, /* data */ js.Any) => Unit = null,
    dragEnd: (/* sourceNode */ FancytreeNode, /* data */ js.Any) => Unit = null,
    dragEnter: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit = null,
    dragExpand: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit = null,
    dragLeave: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit = null,
    dragOver: (/* targetNode */ FancytreeNode, /* data */ js.Any) => Unit = null,
    dragStart: (/* sourceNode */ FancytreeNode, /* data */ js.Any) => Unit = null,
    dropMarkerInsertOffsetX: js.UndefOr[Double] = js.undefined,
    dropMarkerOffsetX: js.UndefOr[Double] = js.undefined,
    multiSource: js.UndefOr[Boolean] = js.undefined,
    preventForeignNodes: js.UndefOr[Boolean] = js.undefined,
    preventNonNodes: js.UndefOr[Boolean] = js.undefined,
    preventRecursiveMoves: js.UndefOr[Boolean] = js.undefined,
    preventVoidMoves: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollSensitivity: js.UndefOr[Double] = js.undefined,
    scrollSpeed: js.UndefOr[Double] = js.undefined,
    setTextTypeJson: js.UndefOr[Boolean] = js.undefined
  ): DragAndDrop5 = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autoExpandMS)) __obj.updateDynamic("autoExpandMS")(autoExpandMS.get.asInstanceOf[js.Any])
    if (dragDrag != null) __obj.updateDynamic("dragDrag")(js.Any.fromFunction2(dragDrag))
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(js.Any.fromFunction2(dragDrop))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction2(dragEnd))
    if (dragEnter != null) __obj.updateDynamic("dragEnter")(js.Any.fromFunction2(dragEnter))
    if (dragExpand != null) __obj.updateDynamic("dragExpand")(js.Any.fromFunction2(dragExpand))
    if (dragLeave != null) __obj.updateDynamic("dragLeave")(js.Any.fromFunction2(dragLeave))
    if (dragOver != null) __obj.updateDynamic("dragOver")(js.Any.fromFunction2(dragOver))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction2(dragStart))
    if (!js.isUndefined(dropMarkerInsertOffsetX)) __obj.updateDynamic("dropMarkerInsertOffsetX")(dropMarkerInsertOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropMarkerOffsetX)) __obj.updateDynamic("dropMarkerOffsetX")(dropMarkerOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSource)) __obj.updateDynamic("multiSource")(multiSource.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventForeignNodes)) __obj.updateDynamic("preventForeignNodes")(preventForeignNodes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventNonNodes)) __obj.updateDynamic("preventNonNodes")(preventNonNodes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventRecursiveMoves)) __obj.updateDynamic("preventRecursiveMoves")(preventRecursiveMoves.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventVoidMoves)) __obj.updateDynamic("preventVoidMoves")(preventVoidMoves.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSensitivity)) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSpeed)) __obj.updateDynamic("scrollSpeed")(scrollSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(setTextTypeJson)) __obj.updateDynamic("setTextTypeJson")(setTextTypeJson.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragAndDrop5]
  }
}

