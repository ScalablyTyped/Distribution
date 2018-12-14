package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RESTDataSourceSettingsRestSettingsRemove
  extends /**
	 * Option for RESTDataSourceSettingsRestSettingsRemove
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies whether update requests will be sent in batches
  	 */
  var batch: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Specifies a remote URL template. Use ${id} in place of the resource id.
  	 */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies a remote URL to which remove requests will be sent. This will be used for both batch and non-batch, however if template is also set, this URL will only be used for batch requests.
  	 */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

