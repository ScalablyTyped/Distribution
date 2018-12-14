package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OlapXmlaDataSourceOptionsRequestOptions
  extends /**
	 * Option for OlapXmlaDataSourceOptionsRequestOptions
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A callback to be invoked right before the request is send to the server. Extends beforeSend callback of jQuery.ajax's options object.
  	 */
  var beforeSend: js.UndefOr[js.Function] = js.undefined
  /**
  	 * The value is applied to XmlHttpRequest.withCredentials if supported by the user agent.
  	 *                 Setting this property to true will allow IE8/IE9 to make authenticated cross-origin requests to tusted domains through XmlHttpRequest instead of XDomainRequest
  	 *                 and will prompt the user for credentials.
  	 */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

