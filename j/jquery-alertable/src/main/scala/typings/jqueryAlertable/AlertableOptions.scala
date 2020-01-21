package typings.jqueryAlertable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertableOptions extends js.Object {
  var cancelButton: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var hide: js.UndefOr[js.Function] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var modal: js.UndefOr[String] = js.undefined
  var okButton: js.UndefOr[String] = js.undefined
  var overlay: js.UndefOr[String] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[js.Function] = js.undefined
}

object AlertableOptions {
  @scala.inline
  def apply(
    cancelButton: String = null,
    container: String = null,
    hide: js.Function = null,
    html: js.UndefOr[Boolean] = js.undefined,
    modal: String = null,
    okButton: String = null,
    overlay: String = null,
    prompt: String = null,
    show: js.Function = null
  ): AlertableOptions = {
    val __obj = js.Dynamic.literal()
    if (cancelButton != null) __obj.updateDynamic("cancelButton")(cancelButton.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (okButton != null) __obj.updateDynamic("okButton")(okButton.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertableOptions]
  }
}

