package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapFlatDataSourceOptions
  extends /**
	 * Option for OlapFlatDataSourceOptions
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A list of hierarchy names separated by comma (,). These will be the hierarchies in the columns of the data source.
  	 */
  var columns: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Optional="true" Specifies any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Optional="true" Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 */
  var dataSourceType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Optional="true" Specifies a remote URL accepted by $.ig.DataSource in order to request data from it.
  	 */
  var dataSourceUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A list of hierarchy names separated by comma (,). These will be hierarchies in the filters of the data source.
  	 */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A list of measure names separated by comma (,). These will be the measures of the data source.
  	 */
  var measures: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Optional="false" An object containing processing instructions for the $.ig.DataSource data.
  	 */
  var metadata: js.UndefOr[OlapFlatDataSourceOptionsMetadata] = js.undefined
  /**
  	 * Optional="true" Specifies the name of the property in which data records are held if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Optional="true" Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 */
  var responseDataType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A list of hierarchy names separated by comma (,). These will be the hierarchies in the rows of the data source.
  	 */
  var rows: js.UndefOr[java.lang.String] = js.undefined
}

object OlapFlatDataSourceOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapFlatDataSourceOptions
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    columns: java.lang.String = null,
    dataSource: js.Any = null,
    dataSourceType: java.lang.String = null,
    dataSourceUrl: java.lang.String = null,
    filters: java.lang.String = null,
    measures: java.lang.String = null,
    metadata: OlapFlatDataSourceOptionsMetadata = null,
    responseDataKey: java.lang.String = null,
    responseDataType: java.lang.String = null,
    rows: java.lang.String = null
  ): OlapFlatDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (measures != null) __obj.updateDynamic("measures")(measures)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey)
    if (responseDataType != null) __obj.updateDynamic("responseDataType")(responseDataType)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[OlapFlatDataSourceOptions]
  }
}

