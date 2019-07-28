package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridAppendRowsOnDemandLocale
  extends /**
	 * Option for IgGridAppendRowsOnDemandLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies caption text for the "load more data" button.
  	 *
  	 */
  var loadMoreDataButtonText: js.UndefOr[String] = js.undefined
}

object IgGridAppendRowsOnDemandLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridAppendRowsOnDemandLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    loadMoreDataButtonText: String = null
  ): IgGridAppendRowsOnDemandLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (loadMoreDataButtonText != null) __obj.updateDynamic("loadMoreDataButtonText")(loadMoreDataButtonText)
    __obj.asInstanceOf[IgGridAppendRowsOnDemandLocale]
  }
}

