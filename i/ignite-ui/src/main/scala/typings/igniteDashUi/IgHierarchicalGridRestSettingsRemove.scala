package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHierarchicalGridRestSettingsRemove
  extends /**
	 * Option for IgHierarchicalGridRestSettingsRemove
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies whether update requests will be sent in batches
  	 */
  var batch: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specifies a remote URL template. Use ${id} in place of the resource id.
  	 */
  var template: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies a remote URL to which remove requests will be sent. This will be used for both batch and non-batch, however if template is also set, this URL will only be used for batch requests.
  	 */
  var url: js.UndefOr[String] = js.undefined
}

object IgHierarchicalGridRestSettingsRemove {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgHierarchicalGridRestSettingsRemove
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    batch: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    url: String = null
  ): IgHierarchicalGridRestSettingsRemove = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgHierarchicalGridRestSettingsRemove]
  }
}

