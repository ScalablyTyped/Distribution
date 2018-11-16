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

