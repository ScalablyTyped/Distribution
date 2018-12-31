package typings
package jqueryDashSortableLib.JQuerySortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  var afterMove: js.UndefOr[
    js.Function3[
      /* $placeholder */ jqueryDashSortableLib.JQuery, 
      /* container */ Container, 
      /* $closestItemOrContainer */ jqueryDashSortableLib.JQuery, 
      scala.Unit
    ]
  ] = js.undefined
  var containerPath: js.UndefOr[java.lang.String] = js.undefined
  var containerSelector: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var handle: js.UndefOr[java.lang.String] = js.undefined
  var isValidTarget: js.UndefOr[
    js.Function2[/* $item */ jqueryDashSortableLib.JQuery, /* container */ Container, scala.Boolean]
  ] = js.undefined
  var itemPath: js.UndefOr[java.lang.String] = js.undefined
  var itemSelector: js.UndefOr[java.lang.String] = js.undefined
  var onCancel: js.UndefOr[OnCancelHandler] = js.undefined
  var onDrag: js.UndefOr[OnDragEventHandler] = js.undefined
  var onDragStart: js.UndefOr[GenericEventHandler] = js.undefined
  var onDrop: js.UndefOr[GenericEventHandler] = js.undefined
  var onMousedown: js.UndefOr[OnMousedownHandler] = js.undefined
  var placeholder: js.UndefOr[jqueryDashSortableLib.JQuery | js.Array[_] | stdLib.Element | java.lang.String] = js.undefined
  var pullPlaceholder: js.UndefOr[scala.Boolean] = js.undefined
  var serialize: js.UndefOr[SerializeFunc] = js.undefined
  var tolerance: js.UndefOr[scala.Double] = js.undefined
}

