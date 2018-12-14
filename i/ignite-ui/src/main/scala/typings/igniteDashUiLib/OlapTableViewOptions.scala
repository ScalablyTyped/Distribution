package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OlapTableViewOptions
  extends /**
	 * Option for OlapTableViewOptions
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Optional="false" a value indicating whether the result has one or more hierarchies in the columns.
  	 */
  var hasColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Optional="false" a value indicating whether the result has one or more hierarchies in the rows.
  	 */
  var hasRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Optional="false" an object of type $.ig.OlapResult.
  	 */
  var result: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Optional="false" an object containing the table view configuration options as properties.
  	 */
  var viewSettings: js.UndefOr[OlapTableViewOptionsViewSettings] = js.undefined
}

