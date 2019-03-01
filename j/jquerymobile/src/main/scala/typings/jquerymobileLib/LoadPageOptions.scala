package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadPageOptions extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var loadMsgDelay: js.UndefOr[scala.Double] = js.undefined
  var pageContainer: js.UndefOr[JQuery] = js.undefined
  var reloadPage: js.UndefOr[scala.Boolean] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var showLoadMsg: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object LoadPageOptions {
  @scala.inline
  def apply(
    data: js.Any = null,
    loadMsgDelay: scala.Int | scala.Double = null,
    pageContainer: JQuery = null,
    reloadPage: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null,
    showLoadMsg: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): LoadPageOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (loadMsgDelay != null) __obj.updateDynamic("loadMsgDelay")(loadMsgDelay.asInstanceOf[js.Any])
    if (pageContainer != null) __obj.updateDynamic("pageContainer")(pageContainer)
    if (!js.isUndefined(reloadPage)) __obj.updateDynamic("reloadPage")(reloadPage)
    if (role != null) __obj.updateDynamic("role")(role)
    if (!js.isUndefined(showLoadMsg)) __obj.updateDynamic("showLoadMsg")(showLoadMsg)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LoadPageOptions]
  }
}

