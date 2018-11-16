package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListBoxOptions extends js.Object {
  var add: js.UndefOr[js.Function1[/* e */ ListBoxAddEvent, scala.Unit]] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ListBoxEvent, scala.Unit]] = js.undefined
  var connectWith: js.UndefOr[java.lang.String] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ ListBoxEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var dataTextField: js.UndefOr[java.lang.String] = js.undefined
  var dataValueField: js.UndefOr[java.lang.String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ ListBoxDragEvent, scala.Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ ListBoxDragendEvent, scala.Unit]] = js.undefined
  var draggable: js.UndefOr[scala.Boolean | ListBoxDraggable] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ ListBoxDragstartEvent, scala.Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ ListBoxDropEvent, scala.Unit]] = js.undefined
  var dropSources: js.UndefOr[js.Any] = js.undefined
  var messages: js.UndefOr[ListBoxMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigatable: js.UndefOr[scala.Boolean] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ ListBoxRemoveEvent, scala.Unit]] = js.undefined
  var reorder: js.UndefOr[js.Function1[/* e */ ListBoxReorderEvent, scala.Unit]] = js.undefined
  var selectable: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var toolbar: js.UndefOr[ListBoxToolbar] = js.undefined
}

