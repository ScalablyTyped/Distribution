package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotDataSelectorDataSourceOptionsXmlaOptionsRequestOptions
  extends /**
	 * Option for IgPivotDataSelectorDataSourceOptionsXmlaOptionsRequestOptions
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A callback to be invoked right before the request is send to the server. Extends beforeSend callback of jQuery.ajax’s options object.
  	 */
  var beforeSend: js.UndefOr[js.Function] = js.undefined
  /**
  	 * The value is applied to XmlHttpRequest.withCredentials if supported by the user agent.
  	 * Setting this property to true will allow IE8/IE9 to make authenticated cross-origin requests to tusted domains through XmlHttpRequest instead of XDomainRequest
  	 * and will prompt the user for credentials.
  	 */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object IgPivotDataSelectorDataSourceOptionsXmlaOptionsRequestOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotDataSelectorDataSourceOptionsXmlaOptionsRequestOptions
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    beforeSend: js.Function = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): IgPivotDataSelectorDataSourceOptionsXmlaOptionsRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsXmlaOptionsRequestOptions]
  }
}

