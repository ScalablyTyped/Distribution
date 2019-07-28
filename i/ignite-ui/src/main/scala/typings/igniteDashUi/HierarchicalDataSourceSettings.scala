package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchicalDataSourceSettings
  extends /**
	 * Option for HierarchicalDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  var autogenerate: js.UndefOr[Boolean] = js.undefined
  var callback: js.UndefOr[js.Any] = js.undefined
  var callee: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var dataBinding: js.UndefOr[js.Any] = js.undefined
  var dataBound: js.UndefOr[js.Any] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var defaultChildrenDataProperty: js.UndefOr[String] = js.undefined
  var filtering: js.UndefOr[HierarchicalDataSourceSettingsFiltering] = js.undefined
  var initialDataBindDepth: js.UndefOr[Double] = js.undefined
  var localSchemaTransform: js.UndefOr[Boolean] = js.undefined
  var maxDataBindDepth: js.UndefOr[Double] = js.undefined
  var odata: js.UndefOr[Boolean] = js.undefined
  var paging: js.UndefOr[HierarchicalDataSourceSettingsPaging] = js.undefined
  var requestType: js.UndefOr[String] = js.undefined
  var responseContentType: js.UndefOr[js.Any] = js.undefined
  var responseDataType: js.UndefOr[js.Any] = js.undefined
  /**
  	 * All of the rest - paging, sorting, filtering, can be defined in the layouts definition, which will "override" the parent defs
  	 * IMPORTANT:  if there is no paging, sorting or filtering, an instance of $.ig.DataSource won't be created for child row islands
  	 */
  var schema: js.UndefOr[HierarchicalDataSourceSettingsSchema] = js.undefined
  var sorting: js.UndefOr[HierarchicalDataSourceSettingsSorting] = js.undefined
  /**
  	 * Other options
  	 */
  var `type`: js.UndefOr[String] = js.undefined
  var urlParamsEncoded: js.UndefOr[js.Any] = js.undefined
  var urlParamsEncoding: js.UndefOr[js.Any] = js.undefined
}

object HierarchicalDataSourceSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for HierarchicalDataSourceSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    autogenerate: js.UndefOr[Boolean] = js.undefined,
    callback: js.Any = null,
    callee: js.Any = null,
    data: js.Array[_] = null,
    dataBinding: js.Any = null,
    dataBound: js.Any = null,
    dataSource: js.Any = null,
    defaultChildrenDataProperty: String = null,
    filtering: HierarchicalDataSourceSettingsFiltering = null,
    initialDataBindDepth: Int | Double = null,
    localSchemaTransform: js.UndefOr[Boolean] = js.undefined,
    maxDataBindDepth: Int | Double = null,
    odata: js.UndefOr[Boolean] = js.undefined,
    paging: HierarchicalDataSourceSettingsPaging = null,
    requestType: String = null,
    responseContentType: js.Any = null,
    responseDataType: js.Any = null,
    schema: HierarchicalDataSourceSettingsSchema = null,
    sorting: HierarchicalDataSourceSettingsSorting = null,
    `type`: String = null,
    urlParamsEncoded: js.Any = null,
    urlParamsEncoding: js.Any = null
  ): HierarchicalDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autogenerate)) __obj.updateDynamic("autogenerate")(autogenerate)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (callee != null) __obj.updateDynamic("callee")(callee)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (defaultChildrenDataProperty != null) __obj.updateDynamic("defaultChildrenDataProperty")(defaultChildrenDataProperty)
    if (filtering != null) __obj.updateDynamic("filtering")(filtering)
    if (initialDataBindDepth != null) __obj.updateDynamic("initialDataBindDepth")(initialDataBindDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(localSchemaTransform)) __obj.updateDynamic("localSchemaTransform")(localSchemaTransform)
    if (maxDataBindDepth != null) __obj.updateDynamic("maxDataBindDepth")(maxDataBindDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(odata)) __obj.updateDynamic("odata")(odata)
    if (paging != null) __obj.updateDynamic("paging")(paging)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (responseContentType != null) __obj.updateDynamic("responseContentType")(responseContentType)
    if (responseDataType != null) __obj.updateDynamic("responseDataType")(responseDataType)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (sorting != null) __obj.updateDynamic("sorting")(sorting)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (urlParamsEncoded != null) __obj.updateDynamic("urlParamsEncoded")(urlParamsEncoded)
    if (urlParamsEncoding != null) __obj.updateDynamic("urlParamsEncoding")(urlParamsEncoding)
    __obj.asInstanceOf[HierarchicalDataSourceSettings]
  }
}

