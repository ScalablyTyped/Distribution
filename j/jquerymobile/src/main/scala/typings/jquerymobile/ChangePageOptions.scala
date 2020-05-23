package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangePageOptions extends js.Object {
  var allowSamePageTransition: js.UndefOr[Boolean] = js.undefined
  var changeHash: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataUrl: js.UndefOr[String] = js.undefined
  var pageContainer: js.UndefOr[JQuery] = js.undefined
  var reloadPage: js.UndefOr[Boolean] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var showLoadMsg: js.UndefOr[Boolean] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ChangePageOptions {
  @scala.inline
  def apply(
    allowSamePageTransition: js.UndefOr[Boolean] = js.undefined,
    changeHash: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    dataUrl: String = null,
    pageContainer: JQuery = null,
    reloadPage: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    showLoadMsg: js.UndefOr[Boolean] = js.undefined,
    transition: String = null,
    `type`: String = null
  ): ChangePageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSamePageTransition)) __obj.updateDynamic("allowSamePageTransition")(allowSamePageTransition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(changeHash)) __obj.updateDynamic("changeHash")(changeHash.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataUrl != null) __obj.updateDynamic("dataUrl")(dataUrl.asInstanceOf[js.Any])
    if (pageContainer != null) __obj.updateDynamic("pageContainer")(pageContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadPage)) __obj.updateDynamic("reloadPage")(reloadPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoadMsg)) __obj.updateDynamic("showLoadMsg")(showLoadMsg.get.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangePageOptions]
  }
}

