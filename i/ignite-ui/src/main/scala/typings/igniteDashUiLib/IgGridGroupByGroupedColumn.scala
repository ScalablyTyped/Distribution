package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridGroupByGroupedColumn
  extends /**
	 * Option for IgGridGroupByGroupedColumn
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * [column](ui.iggrid#options:columns) object for the column that is grouped
  	 *
  	 */
  var col: js.UndefOr[js.Any] = js.undefined
  /**
  	 * sort order - ascending or descending
  	 *
  	 */
  var dir: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Key of the column that's grouped
  	 */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Key of the columnLayout, if the grid is hierarchical
  	 *
  	 */
  var layout: js.UndefOr[java.lang.String] = js.undefined
}

object IgGridGroupByGroupedColumn {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridGroupByGroupedColumn
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    col: js.Any = null,
    dir: js.Any = null,
    key: java.lang.String = null,
    layout: java.lang.String = null
  ): IgGridGroupByGroupedColumn = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (col != null) __obj.updateDynamic("col")(col)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (key != null) __obj.updateDynamic("key")(key)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    __obj.asInstanceOf[IgGridGroupByGroupedColumn]
  }
}

