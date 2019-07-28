package typings.jqueryDotClientsidelogging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientSideLoggingClientInfoObject extends js.Object {
  var location: js.UndefOr[Boolean] = js.undefined
  	//  The url to the page on which the error occurred.
  var screen_size: js.UndefOr[Boolean] = js.undefined
  	//  The size of the user's screen (different to the window size because the window might not be maximized)
  var user_agent: js.UndefOr[Boolean] = js.undefined
  	//  The user agent string.
  var window_size: js.UndefOr[Boolean] = js.undefined
}

object ClientSideLoggingClientInfoObject {
  @scala.inline
  def apply(
    location: js.UndefOr[Boolean] = js.undefined,
    screen_size: js.UndefOr[Boolean] = js.undefined,
    user_agent: js.UndefOr[Boolean] = js.undefined,
    window_size: js.UndefOr[Boolean] = js.undefined
  ): ClientSideLoggingClientInfoObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(screen_size)) __obj.updateDynamic("screen_size")(screen_size)
    if (!js.isUndefined(user_agent)) __obj.updateDynamic("user_agent")(user_agent)
    if (!js.isUndefined(window_size)) __obj.updateDynamic("window_size")(window_size)
    __obj.asInstanceOf[ClientSideLoggingClientInfoObject]
  }
}

