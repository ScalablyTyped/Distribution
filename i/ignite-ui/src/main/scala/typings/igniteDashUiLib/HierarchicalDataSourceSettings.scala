package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HierarchicalDataSourceSettings
  extends /**
	 * Option for HierarchicalDataSourceSettings
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var autogenerate: js.UndefOr[scala.Boolean] = js.undefined
  var callback: js.UndefOr[js.Any] = js.undefined
  var callee: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var dataBinding: js.UndefOr[js.Any] = js.undefined
  var dataBound: js.UndefOr[js.Any] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var defaultChildrenDataProperty: js.UndefOr[java.lang.String] = js.undefined
  var filtering: js.UndefOr[HierarchicalDataSourceSettingsFiltering] = js.undefined
  var initialDataBindDepth: js.UndefOr[scala.Double] = js.undefined
  var localSchemaTransform: js.UndefOr[scala.Boolean] = js.undefined
  var maxDataBindDepth: js.UndefOr[scala.Double] = js.undefined
  var odata: js.UndefOr[scala.Boolean] = js.undefined
  var paging: js.UndefOr[HierarchicalDataSourceSettingsPaging] = js.undefined
  var requestType: js.UndefOr[java.lang.String] = js.undefined
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
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var urlParamsEncoded: js.UndefOr[js.Any] = js.undefined
  var urlParamsEncoding: js.UndefOr[js.Any] = js.undefined
}

