package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotGridDataSourceOptionsFlatDataOptions
  extends /**
	 * Option for IgPivotGridDataSourceOptionsFlatDataOptions
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 */
  var dataSourceType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it.
  	 */
  var dataSourceUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Optional="false" An object containing processing instructions for the $.ig.DataSource data.
  	 */
  var metadata: js.UndefOr[IgPivotGridDataSourceOptionsFlatDataOptionsMetadata] = js.undefined
  /**
  	 * See $.ig.DataSource.
  	 * string Specifies the name of the property in which data records are held if the response is wrapped.
  	 * null Option is ignored.
  	 */
  var responseDataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * String Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 * null Option is ignored.
  	 */
  var responseDataType: js.UndefOr[java.lang.String] = js.undefined
}

object IgPivotGridDataSourceOptionsFlatDataOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotGridDataSourceOptionsFlatDataOptions
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dataSource: js.Any = null,
    dataSourceType: java.lang.String = null,
    dataSourceUrl: java.lang.String = null,
    metadata: IgPivotGridDataSourceOptionsFlatDataOptionsMetadata = null,
    responseDataKey: java.lang.String = null,
    responseDataType: java.lang.String = null
  ): IgPivotGridDataSourceOptionsFlatDataOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey)
    if (responseDataType != null) __obj.updateDynamic("responseDataType")(responseDataType)
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptions]
  }
}

