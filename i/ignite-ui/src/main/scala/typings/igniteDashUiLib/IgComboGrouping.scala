package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgComboGrouping
  extends /**
	 * Option for IgComboGrouping
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies the sort order - ascending or descending.
  	 *
  	 *
  	 * Valid values:
  	 * "asc"
  	 * "desc"
  	 */
  var dir: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets name of column by which the records will be grouped. Setting this option enables the grouping.
  	 *
  	 */
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object IgComboGrouping {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgComboGrouping
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dir: java.lang.String = null,
    key: java.lang.String = null
  ): IgComboGrouping = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[IgComboGrouping]
  }
}

