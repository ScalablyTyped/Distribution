package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSettingsFiltering
  extends /**
	 * Option for DataSourceSettingsFiltering
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * If the type of paging/sorting/filtering is local and applyToAllData is true, filtering will be performed on the whole data source that's present locally, otherwise only on the current dataView. if type is remote, this setting doesn't have any effect.
  	 *
  	 */
  var applyToAllData: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enables or disables case sensitive filtering on the data. Works only for local filtering
  	 *
  	 */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
  	 * An object containing custom defined filtering conditions as objects.
  	 *
  	 */
  var customConditions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Can point to either a string or a function object. The parameters that are passed are 1) the data array to be filtered, 2) the filtering expression definitions. Should return an array of the filtered data
  	 *
  	 */
  var customFunc: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Data will be initially filtered accordingly, directly after dataBind()
  	 *
  	 */
  var defaultFields: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * An "SQL-like' encoded expressions string. Takes precedence over "expressions". Example: col2 > 100; col2 LIKE %test%
  	 *
  	 */
  var exprString: js.UndefOr[String] = js.undefined
  /**
  	 * A list of expression objects, containing the following key-value pairs: fieldName, expression (search string), condition , and logic (AND/OR)
  	 *
  	 */
  var expressions: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Url key that will be encoded in the request if remote filtering is performed. Default value of null implies OData-style URL encoding. Please see http://www.odata.org/developers/protocols/uri-conventions for details
  	 *
  	 */
  var filterExprUrlKey: js.UndefOr[String] = js.undefined
  /**
  	 * Url key that will be encoded in the request, specifying if the filtering logic will be AND or OR
  	 *
  	 */
  var filterLogicUrlKey: js.UndefOr[String] = js.undefined
  /**
  	 * Filtering type.
  	 *
  	 * Valid values:
  	 * "remote" Parameters will be encoded and it's up to the backend to interpred them from the response.
  	 * "local" The data will be filtered automatically client-side
  	 */
  var `type`: js.UndefOr[String] = js.undefined
}

object DataSourceSettingsFiltering {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for DataSourceSettingsFiltering
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    applyToAllData: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    customConditions: js.Any = null,
    customFunc: js.Any = null,
    defaultFields: js.Array[_] = null,
    exprString: String = null,
    expressions: js.Array[_] = null,
    filterExprUrlKey: String = null,
    filterLogicUrlKey: String = null,
    `type`: String = null
  ): DataSourceSettingsFiltering = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(applyToAllData)) __obj.updateDynamic("applyToAllData")(applyToAllData.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (customConditions != null) __obj.updateDynamic("customConditions")(customConditions.asInstanceOf[js.Any])
    if (customFunc != null) __obj.updateDynamic("customFunc")(customFunc.asInstanceOf[js.Any])
    if (defaultFields != null) __obj.updateDynamic("defaultFields")(defaultFields.asInstanceOf[js.Any])
    if (exprString != null) __obj.updateDynamic("exprString")(exprString.asInstanceOf[js.Any])
    if (expressions != null) __obj.updateDynamic("expressions")(expressions.asInstanceOf[js.Any])
    if (filterExprUrlKey != null) __obj.updateDynamic("filterExprUrlKey")(filterExprUrlKey.asInstanceOf[js.Any])
    if (filterLogicUrlKey != null) __obj.updateDynamic("filterLogicUrlKey")(filterLogicUrlKey.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSettingsFiltering]
  }
}

