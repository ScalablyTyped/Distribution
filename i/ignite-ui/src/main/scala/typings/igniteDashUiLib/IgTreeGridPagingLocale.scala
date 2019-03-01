package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridPagingLocale
  extends /**
	 * Option for IgTreeGridPagingLocale
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Sets/gets the text message shown while loading content of the context row(while processing breadcrumb/immediate parent row). It is set via $.html(). If set to null loading message is not shown.
  	 *
  	 */
  var contextRowLoadingText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets/gets the content of the context row when the first record in the page is root(hasn't ancestors) record. It is set via $.html()
  	 *
  	 */
  var contextRowRootText: js.UndefOr[java.lang.String] = js.undefined
}

object IgTreeGridPagingLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgTreeGridPagingLocale
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    contextRowLoadingText: java.lang.String = null,
    contextRowRootText: java.lang.String = null
  ): IgTreeGridPagingLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (contextRowLoadingText != null) __obj.updateDynamic("contextRowLoadingText")(contextRowLoadingText)
    if (contextRowRootText != null) __obj.updateDynamic("contextRowRootText")(contextRowRootText)
    __obj.asInstanceOf[IgTreeGridPagingLocale]
  }
}

