package typings
package jqueryDotFancytreeLib.FancytreeNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragAndDrop5
  extends /**
  * Support misc options
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Expand nodes after n milliseconds of hovering.
    */
  var autoExpandMS: js.UndefOr[scala.Double] = js.undefined
  var dragDrag: js.UndefOr[
    js.Function2[
      /* sourceNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Events (drag drop)
    */
  var dragDrop: js.UndefOr[
    js.Function2[
      /* node */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var dragEnd: js.UndefOr[
    js.Function2[
      /* sourceNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback(targetNode, data), return true, to enable dnd drop
    */
  var dragEnter: js.UndefOr[
    js.Function2[
      /* targetNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback(targetNode, data), return false to prevent autoExpand
    */
  var dragExpand: js.UndefOr[
    js.Function2[
      /* targetNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var dragLeave: js.UndefOr[
    js.Function2[
      /* targetNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Events (drag over)
    */
  var dragOver: js.UndefOr[
    js.Function2[
      /* targetNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback(sourceNode, data), return true, to enable dnd drag
    */
  var dragStart: js.UndefOr[
    js.Function2[
      /* sourceNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, 
      /* data */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Additional offset for drop-marker with hitMode = "before"/"after"
    */
  var dropMarkerInsertOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Absolute position offset for .fancytree-drop-marker
    */
  var dropMarkerOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * true: Drag multiple (i.e. selected) nodes.
    */
  var multiSource: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevent dropping nodes from different Fancytrees
    */
  var preventForeignNodes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevent dropping items other than Fancytree nodes
    */
  var preventNonNodes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevent dropping nodes on own descendants
    */
  var preventRecursiveMoves: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevent dropping nodes 'before self', etc.
    */
  var preventVoidMoves: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable auto-scrolling while dragging
    */
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Active top/bottom margin in pixel
    */
  var scrollSensitivity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Pixel per event
    */
  var scrollSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
    * Allow dragging of nodes to different IE windows, default: false
    */
  var setTextTypeJson: js.UndefOr[scala.Boolean] = js.undefined
}

object DragAndDrop5 {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Support misc options
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    autoExpandMS: scala.Int | scala.Double = null,
    dragDrag: (/* sourceNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, /* data */ js.Any) => scala.Unit = null,
    dragDrop: (/* node */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, /* data */ js.Any) => scala.Unit = null,
    dragEnd: (/* sourceNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, /* data */ js.Any) => scala.Unit = null,
    dragEnter: (/* targetNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, /* data */ js.Any) => scala.Unit = null,
    dragExpand: (/* targetNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, /* data */ js.Any) => scala.Unit = null,
    dragLeave: (/* targetNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, /* data */ js.Any) => scala.Unit = null,
    dragOver: (/* targetNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, /* data */ js.Any) => scala.Unit = null,
    dragStart: (/* sourceNode */ jqueryDotFancytreeLib.FancytreeNs.FancytreeNode, /* data */ js.Any) => scala.Unit = null,
    dropMarkerInsertOffsetX: scala.Int | scala.Double = null,
    dropMarkerOffsetX: scala.Int | scala.Double = null,
    multiSource: js.UndefOr[scala.Boolean] = js.undefined,
    preventForeignNodes: js.UndefOr[scala.Boolean] = js.undefined,
    preventNonNodes: js.UndefOr[scala.Boolean] = js.undefined,
    preventRecursiveMoves: js.UndefOr[scala.Boolean] = js.undefined,
    preventVoidMoves: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    scrollSensitivity: scala.Int | scala.Double = null,
    scrollSpeed: scala.Int | scala.Double = null,
    setTextTypeJson: js.UndefOr[scala.Boolean] = js.undefined
  ): DragAndDrop5 = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (autoExpandMS != null) __obj.updateDynamic("autoExpandMS")(autoExpandMS.asInstanceOf[js.Any])
    if (dragDrag != null) __obj.updateDynamic("dragDrag")(js.Any.fromFunction2(dragDrag))
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(js.Any.fromFunction2(dragDrop))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction2(dragEnd))
    if (dragEnter != null) __obj.updateDynamic("dragEnter")(js.Any.fromFunction2(dragEnter))
    if (dragExpand != null) __obj.updateDynamic("dragExpand")(js.Any.fromFunction2(dragExpand))
    if (dragLeave != null) __obj.updateDynamic("dragLeave")(js.Any.fromFunction2(dragLeave))
    if (dragOver != null) __obj.updateDynamic("dragOver")(js.Any.fromFunction2(dragOver))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction2(dragStart))
    if (dropMarkerInsertOffsetX != null) __obj.updateDynamic("dropMarkerInsertOffsetX")(dropMarkerInsertOffsetX.asInstanceOf[js.Any])
    if (dropMarkerOffsetX != null) __obj.updateDynamic("dropMarkerOffsetX")(dropMarkerOffsetX.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSource)) __obj.updateDynamic("multiSource")(multiSource)
    if (!js.isUndefined(preventForeignNodes)) __obj.updateDynamic("preventForeignNodes")(preventForeignNodes)
    if (!js.isUndefined(preventNonNodes)) __obj.updateDynamic("preventNonNodes")(preventNonNodes)
    if (!js.isUndefined(preventRecursiveMoves)) __obj.updateDynamic("preventRecursiveMoves")(preventRecursiveMoves)
    if (!js.isUndefined(preventVoidMoves)) __obj.updateDynamic("preventVoidMoves")(preventVoidMoves)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(setTextTypeJson)) __obj.updateDynamic("setTextTypeJson")(setTextTypeJson)
    __obj.asInstanceOf[DragAndDrop5]
  }
}

