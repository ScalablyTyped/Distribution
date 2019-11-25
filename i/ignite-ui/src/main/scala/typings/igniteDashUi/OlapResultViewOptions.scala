package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapResultViewOptions
  extends /**
	 * Option for OlapResultViewOptions
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Optional="false" a value indicating whether the result has one or more hierarchies in the columns.
  	 */
  var hasColumns: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Optional="false" a value indicating whether the result has one or more hierarchies in the rows.
  	 */
  var hasRows: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Optional="false" an object of type $.ig.OlapResult which represents the full cached result.
  	 */
  var result: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Optional="false" an object of type $.ig.OlapResult which represents the visible part of the result.
  	 */
  var visibleResult: js.UndefOr[js.Any] = js.undefined
}

object OlapResultViewOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapResultViewOptions
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    hasColumns: js.UndefOr[Boolean] = js.undefined,
    hasRows: js.UndefOr[Boolean] = js.undefined,
    result: js.Any = null,
    visibleResult: js.Any = null
  ): OlapResultViewOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(hasColumns)) __obj.updateDynamic("hasColumns")(hasColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(hasRows)) __obj.updateDynamic("hasRows")(hasRows.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (visibleResult != null) __obj.updateDynamic("visibleResult")(visibleResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlapResultViewOptions]
  }
}

