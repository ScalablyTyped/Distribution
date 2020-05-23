package typings.hubspotPace.HubSpotPaceInterfaces

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaceAjaxOptions extends js.Object {
  /**
    * A list of regular expressions or substrings of URLS we should ignore (for both tracking and restarting)
    */
  var ignoreURLs: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  /**
    * Which HTTP methods should we track?
    */
  var trackMethods: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Should we track web socket connections?
    */
  var trackWebSockets: js.UndefOr[Boolean] = js.undefined
}

object PaceAjaxOptions {
  @scala.inline
  def apply(
    ignoreURLs: js.Array[String | RegExp] = null,
    trackMethods: js.Array[String] = null,
    trackWebSockets: js.UndefOr[Boolean] = js.undefined
  ): PaceAjaxOptions = {
    val __obj = js.Dynamic.literal()
    if (ignoreURLs != null) __obj.updateDynamic("ignoreURLs")(ignoreURLs.asInstanceOf[js.Any])
    if (trackMethods != null) __obj.updateDynamic("trackMethods")(trackMethods.asInstanceOf[js.Any])
    if (!js.isUndefined(trackWebSockets)) __obj.updateDynamic("trackWebSockets")(trackWebSockets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaceAjaxOptions]
  }
}

