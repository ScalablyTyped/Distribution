package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotDataSelectorDataSourceOptionsFlatDataOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
    */
  var dataSourceType: js.UndefOr[String] = js.undefined
  /**
    * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it.
    */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  /**
    * Optional="false" An object containing processing instructions for the $.ig.DataSource data.
    */
  var metadata: js.UndefOr[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata] = js.undefined
  /**
    * See $.ig.DataSource.
    * string Specifies the name of the property in which data records are held if the response is wrapped.
    * null Option is ignored.
    */
  var responseDataKey: js.UndefOr[String] = js.undefined
  /**
    * String Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
    * null Option is ignored.
    */
  var responseDataType: js.UndefOr[String] = js.undefined
}

object IgPivotDataSelectorDataSourceOptionsFlatDataOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    dataSource: js.Any = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    metadata: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata = null,
    responseDataKey: String = null,
    responseDataType: String = null
  ): IgPivotDataSelectorDataSourceOptionsFlatDataOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType.asInstanceOf[js.Any])
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey.asInstanceOf[js.Any])
    if (responseDataType != null) __obj.updateDynamic("responseDataType")(responseDataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptions]
  }
}

