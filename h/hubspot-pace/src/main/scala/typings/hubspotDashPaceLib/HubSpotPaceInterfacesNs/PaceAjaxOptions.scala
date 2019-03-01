package typings
package hubspotDashPaceLib.HubSpotPaceInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaceAjaxOptions extends js.Object {
  /**
    * A list of regular expressions or substrings of URLS we should ignore (for both tracking and restarting)
    */
  var ignoreURLs: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  /**
    * Which HTTP methods should we track?
    */
  var trackMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Should we track web socket connections?
    */
  var trackWebSockets: js.UndefOr[scala.Boolean] = js.undefined
}

object PaceAjaxOptions {
  @scala.inline
  def apply(
    ignoreURLs: js.Array[java.lang.String | stdLib.RegExp] = null,
    trackMethods: js.Array[java.lang.String] = null,
    trackWebSockets: js.UndefOr[scala.Boolean] = js.undefined
  ): PaceAjaxOptions = {
    val __obj = js.Dynamic.literal()
    if (ignoreURLs != null) __obj.updateDynamic("ignoreURLs")(ignoreURLs)
    if (trackMethods != null) __obj.updateDynamic("trackMethods")(trackMethods)
    if (!js.isUndefined(trackWebSockets)) __obj.updateDynamic("trackWebSockets")(trackWebSockets)
    __obj.asInstanceOf[PaceAjaxOptions]
  }
}

