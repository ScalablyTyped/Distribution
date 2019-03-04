package typings
package jqueryDotDynatreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynaTreeDNDOptions extends js.Object {
  var autoExpandMS: js.UndefOr[scala.Double] = js.undefined
   // Callback(sourceNode)
  // Make tree nodes accept draggables
  var onDragEnter: js.UndefOr[js.Function2[/* targetNode */ js.Any, /* sourceNode */ js.Any, scala.Unit]] = js.undefined
   // Callback(targetNode, sourceNode, hitMode)
  var onDragLeave: js.UndefOr[js.Function2[/* targetNode */ js.Any, /* sourceNode */ js.Any, scala.Unit]] = js.undefined
   // Callback(targetNode, sourceNode)
  var onDragOver: js.UndefOr[
    js.Function3[
      /* targetNode */ js.Any, 
      /* sourceNode */ js.Any, 
      /* hitMode */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
   // true: slide helper back to source if drop is rejected
  // Make tree nodes draggable:
  var onDragStart: js.UndefOr[js.Function1[/* sourceNode */ js.Any, scala.Unit]] = js.undefined
   // Callback(sourceNode), return true, to enable dnd
  var onDragStop: js.UndefOr[js.Function1[/* sourceNode */ js.Any, scala.Unit]] = js.undefined
    // Callback(targetNode, sourceNode, hitMode)
  var onDrop: js.UndefOr[
    js.Function3[
      /* targetNode */ js.Any, 
      /* sourceNode */ js.Any, 
      /* hitMode */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
   // Expand nodes after n milliseconds of hovering.
  var preventVoidMoves: js.UndefOr[scala.Boolean] = js.undefined
   // Prevent dropping nodes 'before self', etc.
  var revert: scala.Boolean
}

object DynaTreeDNDOptions {
  @scala.inline
  def apply(
    revert: scala.Boolean,
    autoExpandMS: scala.Int | scala.Double = null,
    onDragEnter: js.Function2[/* targetNode */ js.Any, /* sourceNode */ js.Any, scala.Unit] = null,
    onDragLeave: js.Function2[/* targetNode */ js.Any, /* sourceNode */ js.Any, scala.Unit] = null,
    onDragOver: js.Function3[
      /* targetNode */ js.Any, 
      /* sourceNode */ js.Any, 
      /* hitMode */ java.lang.String, 
      scala.Unit
    ] = null,
    onDragStart: js.Function1[/* sourceNode */ js.Any, scala.Unit] = null,
    onDragStop: js.Function1[/* sourceNode */ js.Any, scala.Unit] = null,
    onDrop: js.Function3[
      /* targetNode */ js.Any, 
      /* sourceNode */ js.Any, 
      /* hitMode */ java.lang.String, 
      scala.Unit
    ] = null,
    preventVoidMoves: js.UndefOr[scala.Boolean] = js.undefined
  ): DynaTreeDNDOptions = {
    val __obj = js.Dynamic.literal(revert = revert)
    if (autoExpandMS != null) __obj.updateDynamic("autoExpandMS")(autoExpandMS.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(onDragStop)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (!js.isUndefined(preventVoidMoves)) __obj.updateDynamic("preventVoidMoves")(preventVoidMoves)
    __obj.asInstanceOf[DynaTreeDNDOptions]
  }
}

