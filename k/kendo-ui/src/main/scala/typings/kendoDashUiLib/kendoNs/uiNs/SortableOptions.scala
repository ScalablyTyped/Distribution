package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableOptions extends js.Object {
  var autoScroll: js.UndefOr[scala.Boolean] = js.undefined
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ SortableCancelEvent, scala.Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ SortableChangeEvent, scala.Unit]] = js.undefined
  var connectWith: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[java.lang.String | kendoDashUiLib.JQuery] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var cursorOffset: js.UndefOr[SortableCursorOffset] = js.undefined
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[js.Function1[/* e */ SortableEndEvent, scala.Unit]] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var handler: js.UndefOr[java.lang.String] = js.undefined
  var hint: js.UndefOr[js.Function | java.lang.String | kendoDashUiLib.JQuery] = js.undefined
  var holdToDrag: js.UndefOr[scala.Boolean] = js.undefined
  var ignore: js.UndefOr[java.lang.String] = js.undefined
  var move: js.UndefOr[js.Function1[/* e */ SortableMoveEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[js.Function | java.lang.String | kendoDashUiLib.JQuery] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ SortableStartEvent, scala.Unit]] = js.undefined
}

