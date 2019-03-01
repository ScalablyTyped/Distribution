package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotGridDataSourceOptions
  extends /**
	 * Option for IgPivotGridDataSourceOptions
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A list of hierarchy names separated by comma (,). These will be the hierarchies in the columns of the data source.
  	 */
  var columns: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A list of hierarchy names separated by comma (,). These will be hierarchies in the filters of the data source.
  	 */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Settings for creating an instance of $.ig.OlapFlatDataSource.
  	 */
  var flatDataOptions: js.UndefOr[IgPivotGridDataSourceOptionsFlatDataOptions] = js.undefined
  /**
  	 * A list of measure names separated by comma (,). These will be the measures of the data source.
  	 */
  var measures: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A list of hierarchy names separated by comma (,). These will be the hierarchies in the rows of the data source.
  	 */
  var rows: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Settings for creating an instance of $.ig.OlapXmlaDataSource.
  	 */
  var xmlaOptions: js.UndefOr[IgPivotGridDataSourceOptionsXmlaOptions] = js.undefined
}

object IgPivotGridDataSourceOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotGridDataSourceOptions
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    columns: java.lang.String = null,
    filters: java.lang.String = null,
    flatDataOptions: IgPivotGridDataSourceOptionsFlatDataOptions = null,
    measures: java.lang.String = null,
    rows: java.lang.String = null,
    xmlaOptions: IgPivotGridDataSourceOptionsXmlaOptions = null
  ): IgPivotGridDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (flatDataOptions != null) __obj.updateDynamic("flatDataOptions")(flatDataOptions)
    if (measures != null) __obj.updateDynamic("measures")(measures)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (xmlaOptions != null) __obj.updateDynamic("xmlaOptions")(xmlaOptions)
    __obj.asInstanceOf[IgPivotGridDataSourceOptions]
  }
}

