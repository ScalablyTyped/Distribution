package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangePageOptions extends js.Object {
  var allowSamePageTransition: js.UndefOr[scala.Boolean] = js.undefined
  var changeHash: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataUrl: js.UndefOr[java.lang.String] = js.undefined
  var pageContainer: js.UndefOr[JQuery] = js.undefined
  var reloadPage: js.UndefOr[scala.Boolean] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var showLoadMsg: js.UndefOr[scala.Boolean] = js.undefined
  var transition: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ChangePageOptions {
  @scala.inline
  def apply(
    allowSamePageTransition: js.UndefOr[scala.Boolean] = js.undefined,
    changeHash: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    dataUrl: java.lang.String = null,
    pageContainer: JQuery = null,
    reloadPage: js.UndefOr[scala.Boolean] = js.undefined,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null,
    showLoadMsg: js.UndefOr[scala.Boolean] = js.undefined,
    transition: java.lang.String = null,
    `type`: java.lang.String = null
  ): ChangePageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSamePageTransition)) __obj.updateDynamic("allowSamePageTransition")(allowSamePageTransition)
    if (!js.isUndefined(changeHash)) __obj.updateDynamic("changeHash")(changeHash)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataUrl != null) __obj.updateDynamic("dataUrl")(dataUrl)
    if (pageContainer != null) __obj.updateDynamic("pageContainer")(pageContainer)
    if (!js.isUndefined(reloadPage)) __obj.updateDynamic("reloadPage")(reloadPage)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (role != null) __obj.updateDynamic("role")(role)
    if (!js.isUndefined(showLoadMsg)) __obj.updateDynamic("showLoadMsg")(showLoadMsg)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChangePageOptions]
  }
}

