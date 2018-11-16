package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgTreeGridPagingLocale
  extends /**
	 * Option for IgTreeGridPagingLocale
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
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

