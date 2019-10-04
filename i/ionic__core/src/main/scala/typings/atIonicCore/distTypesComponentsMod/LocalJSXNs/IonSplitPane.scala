package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.atIonicCore.Anon_Visible
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSplitPane extends js.Object {
  /**
    * The content `id` of the split-pane's main content. This property can be used instead of the `[main]` attribute to select the `main` content of the split-pane.
    */
  var contentId: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the split pane will be hidden.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Expression to be called when the split-pane visibility has changed
    */
  var onIonSplitPaneVisible: js.UndefOr[js.Function1[/* event */ CustomEvent[Anon_Visible], Unit]] = js.undefined
  /**
    * When the split-pane should be shown. Can be a CSS media query expression, or a shortcut expression. Can also be a boolean expression.
    */
  var when: js.UndefOr[String | Boolean] = js.undefined
}

object IonSplitPane {
  @scala.inline
  def apply(
    contentId: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onIonSplitPaneVisible: /* event */ CustomEvent[Anon_Visible] => Unit = null,
    when: String | Boolean = null
  ): IonSplitPane = {
    val __obj = js.Dynamic.literal()
    if (contentId != null) __obj.updateDynamic("contentId")(contentId)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onIonSplitPaneVisible != null) __obj.updateDynamic("onIonSplitPaneVisible")(js.Any.fromFunction1(onIonSplitPaneVisible))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSplitPane]
  }
}

