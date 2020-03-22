package typings.jqueryLoadingOverlay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  loadingClass  :string,   overlayClass  :string,   spinnerClass  :string,   iconClass  :string,   textClass  :string,   loadingText  :string}> */
trait Options extends js.Object {
  var iconClass: js.UndefOr[String] = js.undefined
  var loadingClass: js.UndefOr[String] = js.undefined
  var loadingText: js.UndefOr[String] = js.undefined
  var overlayClass: js.UndefOr[String] = js.undefined
  var spinnerClass: js.UndefOr[String] = js.undefined
  var textClass: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    iconClass: String = null,
    loadingClass: String = null,
    loadingText: String = null,
    overlayClass: String = null,
    spinnerClass: String = null,
    textClass: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (loadingClass != null) __obj.updateDynamic("loadingClass")(loadingClass.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (overlayClass != null) __obj.updateDynamic("overlayClass")(overlayClass.asInstanceOf[js.Any])
    if (spinnerClass != null) __obj.updateDynamic("spinnerClass")(spinnerClass.asInstanceOf[js.Any])
    if (textClass != null) __obj.updateDynamic("textClass")(textClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

