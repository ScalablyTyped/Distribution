package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SplitterOptions extends js.Object {
  var collapse: js.UndefOr[js.Function1[/* e */ SplitterCollapseEvent, scala.Unit]] = js.undefined
  var contentLoad: js.UndefOr[js.Function1[/* e */ SplitterContentLoadEvent, scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ SplitterErrorEvent, scala.Unit]] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ SplitterExpandEvent, scala.Unit]] = js.undefined
  var layoutChange: js.UndefOr[js.Function1[/* e */ SplitterEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var panes: js.UndefOr[js.Array[SplitterPane]] = js.undefined
  var resize: js.UndefOr[js.Function1[/* e */ SplitterEvent, scala.Unit]] = js.undefined
}

