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

object OlapTableViewOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapTableViewOptions
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    hasColumns: js.UndefOr[scala.Boolean] = js.undefined,
    hasRows: js.UndefOr[scala.Boolean] = js.undefined,
    result: js.Any = null,
    viewSettings: OlapTableViewOptionsViewSettings = null
  ): OlapTableViewOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(hasColumns)) __obj.updateDynamic("hasColumns")(hasColumns)
    if (!js.isUndefined(hasRows)) __obj.updateDynamic("hasRows")(hasRows)
    if (result != null) __obj.updateDynamic("result")(result)
    if (viewSettings != null) __obj.updateDynamic("viewSettings")(viewSettings)
    __obj.asInstanceOf[OlapTableViewOptions]
  }
}

