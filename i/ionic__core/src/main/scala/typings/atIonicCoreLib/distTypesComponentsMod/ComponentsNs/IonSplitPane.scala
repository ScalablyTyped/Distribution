package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSplitPane extends js.Object {
  /**
    * The content `id` of the split-pane's main content. This property can be used instead of the `[main]` attribute to select the `main` content of the split-pane.  ```html    * <ion-split-pane content-id="my-content">    *   <ion-menu></ion-menu>    *   <div id="my-content">    * </ion-split-pane>    * ```
    */
  var contentId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If `true`, the split pane will be hidden.
    */
  var disabled: scala.Boolean
  /**
    * When the split-pane should be shown. Can be a CSS media query expression, or a shortcut expression. Can also be a boolean expression.
    */
  var when: java.lang.String | scala.Boolean
}

object IonSplitPane {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    when: java.lang.String | scala.Boolean,
    contentId: java.lang.String = null
  ): IonSplitPane = {
    val __obj = js.Dynamic.literal(disabled = disabled, when = when.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId)
    __obj.asInstanceOf[IonSplitPane]
  }
}

