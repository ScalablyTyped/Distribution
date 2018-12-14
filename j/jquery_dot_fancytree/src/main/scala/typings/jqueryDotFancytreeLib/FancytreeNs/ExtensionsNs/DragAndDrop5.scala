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

