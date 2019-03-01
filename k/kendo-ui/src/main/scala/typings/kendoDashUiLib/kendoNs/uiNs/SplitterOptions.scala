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

object SplitterOptions {
  @scala.inline
  def apply(
    collapse: js.Function1[/* e */ SplitterCollapseEvent, scala.Unit] = null,
    contentLoad: js.Function1[/* e */ SplitterContentLoadEvent, scala.Unit] = null,
    error: js.Function1[/* e */ SplitterErrorEvent, scala.Unit] = null,
    expand: js.Function1[/* e */ SplitterExpandEvent, scala.Unit] = null,
    layoutChange: js.Function1[/* e */ SplitterEvent, scala.Unit] = null,
    name: java.lang.String = null,
    orientation: java.lang.String = null,
    panes: js.Array[SplitterPane] = null,
    resize: js.Function1[/* e */ SplitterEvent, scala.Unit] = null
  ): SplitterOptions = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(collapse)
    if (contentLoad != null) __obj.updateDynamic("contentLoad")(contentLoad)
    if (error != null) __obj.updateDynamic("error")(error)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (layoutChange != null) __obj.updateDynamic("layoutChange")(layoutChange)
    if (name != null) __obj.updateDynamic("name")(name)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (panes != null) __obj.updateDynamic("panes")(panes)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    __obj.asInstanceOf[SplitterOptions]
  }
}

