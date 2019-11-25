package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadPageOptions extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var loadMsgDelay: js.UndefOr[Double] = js.undefined
  var pageContainer: js.UndefOr[JQuery] = js.undefined
  var reloadPage: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var showLoadMsg: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object LoadPageOptions {
  @scala.inline
  def apply(
    data: js.Any = null,
    loadMsgDelay: Int | Double = null,
    pageContainer: JQuery = null,
    reloadPage: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    showLoadMsg: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): LoadPageOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (loadMsgDelay != null) __obj.updateDynamic("loadMsgDelay")(loadMsgDelay.asInstanceOf[js.Any])
    if (pageContainer != null) __obj.updateDynamic("pageContainer")(pageContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadPage)) __obj.updateDynamic("reloadPage")(reloadPage.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoadMsg)) __obj.updateDynamic("showLoadMsg")(showLoadMsg.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadPageOptions]
  }
}

