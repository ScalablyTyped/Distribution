package typings.atIonicCore.distTypesComponentsMod.Components

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
  var disabled: Boolean
  /**
    * When the split-pane should be shown. Can be a CSS media query expression, or a shortcut expression. Can also be a boolean expression.
    */
  var when: String | Boolean
}

object IonSplitPane {
  @scala.inline
  def apply(disabled: Boolean, when: String | Boolean, contentId: String = null): IonSplitPane = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSplitPane]
  }
}

