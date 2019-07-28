package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTDataSourceSettingsRestSettingsCreate
  extends /**
	 * Option for RESTDataSourceSettingsRestSettingsCreate
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies whether create requests will be sent in batches
  	 */
  var batch: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specifies a remote URL template. Use ${id} in place of the resource id.
  	 */
  var template: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies a remote URL to which create requests will be sent. This will be used for both batch and non-batch, however if template is also set, this URL will only be used for batch requests.
  	 */
  var url: js.UndefOr[String] = js.undefined
}

object RESTDataSourceSettingsRestSettingsCreate {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for RESTDataSourceSettingsRestSettingsCreate
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    batch: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    url: String = null
  ): RESTDataSourceSettingsRestSettingsCreate = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch)
    if (template != null) __obj.updateDynamic("template")(template)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RESTDataSourceSettingsRestSettingsCreate]
  }
}

