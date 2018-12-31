package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogOptions extends js.Object {
  var actions: js.UndefOr[js.Array[DialogAction]] = js.undefined
  var animation: js.UndefOr[scala.Boolean | DialogAnimation] = js.undefined
  var buttonLayout: js.UndefOr[java.lang.String] = js.undefined
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ DialogCloseEvent, scala.Unit]] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ DialogEvent, scala.Unit]] = js.undefined
  var initOpen: js.UndefOr[js.Function1[/* e */ DialogEvent, scala.Unit]] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var messages: js.UndefOr[DialogMessages] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ DialogEvent, scala.Unit]] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ DialogEvent, scala.Unit]] = js.undefined
  var title: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

