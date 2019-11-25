package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHierarchicalGridRestSettings
  extends /**
	 * Option for IgHierarchicalGridRestSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies a custom function to serialize content sent to the server. It should accept a single object or an array of objects and return a string. If not specified, JSON.stringify() will be used.
  	 *
  	 */
  var contentSerializer: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Specifies the content type of the request. See http://api.jquery.com/jQuery.ajax/ => contentType
  	 *
  	 */
  var contentType: js.UndefOr[String] = js.undefined
  /**
  	 * Settings for create requests
  	 *
  	 */
  var create: js.UndefOr[IgHierarchicalGridRestSettingsCreate] = js.undefined
  /**
  	 * Specifies whether the ids of the removed resources are send through the request URI
  	 */
  var encodeRemoveInRequestUri: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Settings for remove requests
  	 */
  var remove: js.UndefOr[IgHierarchicalGridRestSettingsRemove] = js.undefined
  /**
  	 * Settings for update requests
  	 */
  var update: js.UndefOr[IgHierarchicalGridRestSettingsUpdate] = js.undefined
}

object IgHierarchicalGridRestSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgHierarchicalGridRestSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    contentSerializer: js.Function = null,
    contentType: String = null,
    create: IgHierarchicalGridRestSettingsCreate = null,
    encodeRemoveInRequestUri: js.UndefOr[Boolean] = js.undefined,
    remove: IgHierarchicalGridRestSettingsRemove = null,
    update: IgHierarchicalGridRestSettingsUpdate = null
  ): IgHierarchicalGridRestSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (contentSerializer != null) __obj.updateDynamic("contentSerializer")(contentSerializer.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeRemoveInRequestUri)) __obj.updateDynamic("encodeRemoveInRequestUri")(encodeRemoveInRequestUri.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgHierarchicalGridRestSettings]
  }
}

