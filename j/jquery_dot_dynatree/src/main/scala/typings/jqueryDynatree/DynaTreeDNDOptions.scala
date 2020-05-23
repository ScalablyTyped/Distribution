package typings.jqueryDynatree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynaTreeDNDOptions extends js.Object {
  var autoExpandMS: js.UndefOr[Double] = js.undefined
   // Callback(sourceNode)
  // Make tree nodes accept draggables
  var onDragEnter: js.UndefOr[js.Function2[/* targetNode */ js.Any, /* sourceNode */ js.Any, Unit]] = js.undefined
   // Callback(targetNode, sourceNode, hitMode)
  var onDragLeave: js.UndefOr[js.Function2[/* targetNode */ js.Any, /* sourceNode */ js.Any, Unit]] = js.undefined
   // Callback(targetNode, sourceNode)
  var onDragOver: js.UndefOr[
    js.Function3[/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String, Unit]
  ] = js.undefined
   // true: slide helper back to source if drop is rejected
  // Make tree nodes draggable:
  var onDragStart: js.UndefOr[js.Function1[/* sourceNode */ js.Any, Unit]] = js.undefined
   // Callback(sourceNode), return true, to enable dnd
  var onDragStop: js.UndefOr[js.Function1[/* sourceNode */ js.Any, Unit]] = js.undefined
    // Callback(targetNode, sourceNode, hitMode)
  var onDrop: js.UndefOr[
    js.Function3[/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String, Unit]
  ] = js.undefined
   // Expand nodes after n milliseconds of hovering.
  var preventVoidMoves: js.UndefOr[Boolean] = js.undefined
   // Prevent dropping nodes 'before self', etc.
  var revert: Boolean
}

object DynaTreeDNDOptions {
  @scala.inline
  def apply(
    revert: Boolean,
    autoExpandMS: js.UndefOr[Double] = js.undefined,
    onDragEnter: (/* targetNode */ js.Any, /* sourceNode */ js.Any) => Unit = null,
    onDragLeave: (/* targetNode */ js.Any, /* sourceNode */ js.Any) => Unit = null,
    onDragOver: (/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String) => Unit = null,
    onDragStart: /* sourceNode */ js.Any => Unit = null,
    onDragStop: /* sourceNode */ js.Any => Unit = null,
    onDrop: (/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String) => Unit = null,
    preventVoidMoves: js.UndefOr[Boolean] = js.undefined
  ): DynaTreeDNDOptions = {
    val __obj = js.Dynamic.literal(revert = revert.asInstanceOf[js.Any])
    if (!js.isUndefined(autoExpandMS)) __obj.updateDynamic("autoExpandMS")(autoExpandMS.get.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction2(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction2(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction3(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction1(onDragStop))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction3(onDrop))
    if (!js.isUndefined(preventVoidMoves)) __obj.updateDynamic("preventVoidMoves")(preventVoidMoves.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynaTreeDNDOptions]
  }
}

