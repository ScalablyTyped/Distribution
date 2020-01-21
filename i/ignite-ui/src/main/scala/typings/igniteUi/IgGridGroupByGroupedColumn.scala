package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridGroupByGroupedColumn
  extends /**
	 * Option for IgGridGroupByGroupedColumn
	 */
/* optionName */ StringDictionary[js.Any] {
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
  var key: js.UndefOr[String] = js.undefined
  /**
  	 * Key of the columnLayout, if the grid is hierarchical
  	 *
  	 */
  var layout: js.UndefOr[String] = js.undefined
}

object IgGridGroupByGroupedColumn {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridGroupByGroupedColumn
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    col: js.Any = null,
    dir: js.Any = null,
    key: String = null,
    layout: String = null
  ): IgGridGroupByGroupedColumn = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridGroupByGroupedColumn]
  }
}

