package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSettingsSorting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * If the sorting type is local and applyToAllData is true, sorting will be performed on the whole data source that's present locally, otherwise only on the current dataView. If sorting type is remote, this setting doesn't have any effect.
    *
    */
  var applyToAllData: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies if sorting will be case sensitive or not. Works only for local sorting
    *
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom comparison sorting function. Accepts the following arguments: fields, schema, booleand value whether sorting is ascending , convert function(please check option for customConvertFunc) and returns a value 0 indicating that values are equal, 1 indicating that val1 > val2 and -1 indicating that val1 < val2
    *
    */
  var compareFunc: js.UndefOr[js.Any] = js.undefined
  /**
    * Custom data value conversion function(called from sorting function). Accepts a value of the data cell and column key and should return the converted value
    *
    */
  var customConvertFunc: js.UndefOr[js.Any] = js.undefined
  /**
    * Custom sorting function that can point to either a string or a function object. When the function is called, the following arguments are passed: data array, fields (array of field definitions) , direction ("asc" or "desc"). The function should return a sorted data array
    *
    */
  var customFunc: js.UndefOr[js.Any] = js.undefined
  /**
    * Sorting direction
    *
    *
    * Valid values:
    * "none"
    * "asc"
    * "desc"
    */
  var defaultDirection: js.UndefOr[String] = js.undefined
  /**
    * When defaultDirection is different than "none", and defaultFields is specified, data will be initially sorted accordingly, directly after dataBind()
    *
    */
  var defaultFields: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Takes precedence over experssions, an "SQL-like" encoded expressions string  : see sort(). Example col2 > 100 ORDER BY asc
    *
    */
  var exprString: js.UndefOr[String] = js.undefined
  /**
    * A list of sorting expressions , consisting of the following keys (and their respective values): fieldName, direction and compareFunc (optional)
    *
    */
  var expressions: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * URL param value for ascending type of sorting. Default is null and uses OData conventions
    *
    */
  var sortUrlAscValueKey: js.UndefOr[String] = js.undefined
  /**
    * URL param value for descending type of sorting. Default is null and uses OData conventions
    *
    */
  var sortUrlDescValueKey: js.UndefOr[String] = js.undefined
  /**
    * URL param name which specifies how sorting expressions will be encoded in the URL. Default is null and uses OData conventions
    *
    */
  var sortUrlKey: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether sorting will be applied locally or remotely (via a remote request)
    *
    *
    * Valid values:
    * "remote"
    * "local"
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DataSourceSettingsSorting {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    applyToAllData: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    compareFunc: js.Any = null,
    customConvertFunc: js.Any = null,
    customFunc: js.Any = null,
    defaultDirection: String = null,
    defaultFields: js.Array[_] = null,
    exprString: String = null,
    expressions: js.Array[_] = null,
    sortUrlAscValueKey: String = null,
    sortUrlDescValueKey: String = null,
    sortUrlKey: String = null,
    `type`: String = null
  ): DataSourceSettingsSorting = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(applyToAllData)) __obj.updateDynamic("applyToAllData")(applyToAllData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (compareFunc != null) __obj.updateDynamic("compareFunc")(compareFunc.asInstanceOf[js.Any])
    if (customConvertFunc != null) __obj.updateDynamic("customConvertFunc")(customConvertFunc.asInstanceOf[js.Any])
    if (customFunc != null) __obj.updateDynamic("customFunc")(customFunc.asInstanceOf[js.Any])
    if (defaultDirection != null) __obj.updateDynamic("defaultDirection")(defaultDirection.asInstanceOf[js.Any])
    if (defaultFields != null) __obj.updateDynamic("defaultFields")(defaultFields.asInstanceOf[js.Any])
    if (exprString != null) __obj.updateDynamic("exprString")(exprString.asInstanceOf[js.Any])
    if (expressions != null) __obj.updateDynamic("expressions")(expressions.asInstanceOf[js.Any])
    if (sortUrlAscValueKey != null) __obj.updateDynamic("sortUrlAscValueKey")(sortUrlAscValueKey.asInstanceOf[js.Any])
    if (sortUrlDescValueKey != null) __obj.updateDynamic("sortUrlDescValueKey")(sortUrlDescValueKey.asInstanceOf[js.Any])
    if (sortUrlKey != null) __obj.updateDynamic("sortUrlKey")(sortUrlKey.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSettingsSorting]
  }
}

