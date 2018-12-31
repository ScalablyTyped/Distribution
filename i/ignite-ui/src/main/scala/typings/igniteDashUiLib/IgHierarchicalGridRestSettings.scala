package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHierarchicalGridRestSettings
  extends /**
	 * Option for IgHierarchicalGridRestSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies a custom function to serialize content sent to the server. It should accept a single object or an array of objects and return a string. If not specified, JSON.stringify() will be used.
  	 *
  	 */
  var contentSerializer: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Specifies the content type of the request. See http://api.jquery.com/jQuery.ajax/ => contentType
  	 *
  	 */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Settings for create requests
  	 *
  	 */
  var create: js.UndefOr[IgHierarchicalGridRestSettingsCreate] = js.undefined
  /**
  	 * Specifies whether the ids of the removed resources are send through the request URI
  	 */
  var encodeRemoveInRequestUri: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Settings for remove requests
  	 */
  var remove: js.UndefOr[IgHierarchicalGridRestSettingsRemove] = js.undefined
  /**
  	 * Settings for update requests
  	 */
  var update: js.UndefOr[IgHierarchicalGridRestSettingsUpdate] = js.undefined
}

