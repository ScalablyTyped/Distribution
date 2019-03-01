package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTDataSourceSettingsRestSettings
  extends /**
	 * Option for RESTDataSourceSettingsRestSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies a custom function to serialize content sent to the server. It should accept a single object or an array of objects and return a string. If not specified, JSON.stringify() will be used.
  	 */
  var contentSerializer: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Specifies the content type of the request
  	 */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Settings for create requests
  	 */
  var create: js.UndefOr[RESTDataSourceSettingsRestSettingsCreate] = js.undefined
  /**
  	 * Specifies whether the ids of the removed resources are send through the request URI
  	 */
  var encodeRemoveInRequestUri: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Settings for remove requests
  	 */
  var remove: js.UndefOr[RESTDataSourceSettingsRestSettingsRemove] = js.undefined
  /**
  	 * Settings for update requests
  	 */
  var update: js.UndefOr[RESTDataSourceSettingsRestSettingsUpdate] = js.undefined
}

object RESTDataSourceSettingsRestSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for RESTDataSourceSettingsRestSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    contentSerializer: js.Function = null,
    contentType: java.lang.String = null,
    create: RESTDataSourceSettingsRestSettingsCreate = null,
    encodeRemoveInRequestUri: js.UndefOr[scala.Boolean] = js.undefined,
    remove: RESTDataSourceSettingsRestSettingsRemove = null,
    update: RESTDataSourceSettingsRestSettingsUpdate = null
  ): RESTDataSourceSettingsRestSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (contentSerializer != null) __obj.updateDynamic("contentSerializer")(contentSerializer)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (create != null) __obj.updateDynamic("create")(create)
    if (!js.isUndefined(encodeRemoveInRequestUri)) __obj.updateDynamic("encodeRemoveInRequestUri")(encodeRemoveInRequestUri)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[RESTDataSourceSettingsRestSettings]
  }
}

