package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterOptions extends js.Object {
  var collapse: js.UndefOr[js.Function1[/* e */ SplitterCollapseEvent, Unit]] = js.undefined
  var contentLoad: js.UndefOr[js.Function1[/* e */ SplitterContentLoadEvent, Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ SplitterErrorEvent, Unit]] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ SplitterExpandEvent, Unit]] = js.undefined
  var layoutChange: js.UndefOr[js.Function1[/* e */ SplitterEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var panes: js.UndefOr[js.Array[SplitterPane]] = js.undefined
  var resize: js.UndefOr[js.Function1[/* e */ SplitterEvent, Unit]] = js.undefined
}

object SplitterOptions {
  @scala.inline
  def apply(
    collapse: /* e */ SplitterCollapseEvent => Unit = null,
    contentLoad: /* e */ SplitterContentLoadEvent => Unit = null,
    error: /* e */ SplitterErrorEvent => Unit = null,
    expand: /* e */ SplitterExpandEvent => Unit = null,
    layoutChange: /* e */ SplitterEvent => Unit = null,
    name: String = null,
    orientation: String = null,
    panes: js.Array[SplitterPane] = null,
    resize: /* e */ SplitterEvent => Unit = null
  ): SplitterOptions = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction1(collapse))
    if (contentLoad != null) __obj.updateDynamic("contentLoad")(js.Any.fromFunction1(contentLoad))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1(expand))
    if (layoutChange != null) __obj.updateDynamic("layoutChange")(js.Any.fromFunction1(layoutChange))
    if (name != null) __obj.updateDynamic("name")(name)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (panes != null) __obj.updateDynamic("panes")(panes)
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    __obj.asInstanceOf[SplitterOptions]
  }
}

