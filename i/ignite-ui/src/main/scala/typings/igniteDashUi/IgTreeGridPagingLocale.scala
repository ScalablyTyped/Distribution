package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridPagingLocale
  extends /**
	 * Option for IgTreeGridPagingLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Sets/gets the text message shown while loading content of the context row(while processing breadcrumb/immediate parent row). It is set via $.html(). If set to null loading message is not shown.
  	 *
  	 */
  var contextRowLoadingText: js.UndefOr[String] = js.undefined
  /**
  	 * Sets/gets the content of the context row when the first record in the page is root(hasn't ancestors) record. It is set via $.html()
  	 *
  	 */
  var contextRowRootText: js.UndefOr[String] = js.undefined
}

object IgTreeGridPagingLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgTreeGridPagingLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    contextRowLoadingText: String = null,
    contextRowRootText: String = null
  ): IgTreeGridPagingLocale = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (contextRowLoadingText != null) __obj.updateDynamic("contextRowLoadingText")(contextRowLoadingText.asInstanceOf[js.Any])
    if (contextRowRootText != null) __obj.updateDynamic("contextRowRootText")(contextRowRootText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeGridPagingLocale]
  }
}

