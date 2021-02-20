package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSettingsFiltering
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * If the type of paging/sorting/filtering is local and applyToAllData is true, filtering will be performed on the whole data source that's present locally, otherwise only on the current dataView. if type is remote, this setting doesn't have any effect.
    *
    */
  var applyToAllData: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables or disables case sensitive filtering on the data. Works only for local filtering
    *
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /**
    * An object containing custom defined filtering conditions as objects.
    *
    */
  var customConditions: js.UndefOr[js.Any] = js.native
  
  /**
    * Can point to either a string or a function object. The parameters that are passed are 1) the data array to be filtered, 2) the filtering expression definitions. Should return an array of the filtered data
    *
    */
  var customFunc: js.UndefOr[js.Any] = js.native
  
  /**
    * Data will be initially filtered accordingly, directly after dataBind()
    *
    */
  var defaultFields: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * An "SQL-like' encoded expressions string. Takes precedence over "expressions". Example: col2 > 100; col2 LIKE %test%
    *
    */
  var exprString: js.UndefOr[String] = js.native
  
  /**
    * A list of expression objects, containing the following key-value pairs: fieldName, expression (search string), condition , and logic (AND/OR)
    *
    */
  var expressions: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Url key that will be encoded in the request if remote filtering is performed. Default value of null implies OData-style URL encoding. Please see http://www.odata.org/developers/protocols/uri-conventions for details
    *
    */
  var filterExprUrlKey: js.UndefOr[String] = js.native
  
  /**
    * Url key that will be encoded in the request, specifying if the filtering logic will be AND or OR
    *
    */
  var filterLogicUrlKey: js.UndefOr[String] = js.native
  
  /**
    * Filtering type.
    *
    * Valid values:
    * "remote" Parameters will be encoded and it's up to the backend to interpred them from the response.
    * "local" The data will be filtered automatically client-side
    */
  var `type`: js.UndefOr[String] = js.native
}
object DataSourceSettingsFiltering {
  
  @scala.inline
  def apply(): DataSourceSettingsFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsFiltering]
  }
  
  @scala.inline
  implicit class DataSourceSettingsFilteringMutableBuilder[Self <: DataSourceSettingsFiltering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyToAllData(value: Boolean): Self = StObject.set(x, "applyToAllData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyToAllDataUndefined: Self = StObject.set(x, "applyToAllData", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setCustomConditions(value: js.Any): Self = StObject.set(x, "customConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomConditionsUndefined: Self = StObject.set(x, "customConditions", js.undefined)
    
    @scala.inline
    def setCustomFunc(value: js.Any): Self = StObject.set(x, "customFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFuncUndefined: Self = StObject.set(x, "customFunc", js.undefined)
    
    @scala.inline
    def setDefaultFields(value: js.Array[_]): Self = StObject.set(x, "defaultFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFieldsUndefined: Self = StObject.set(x, "defaultFields", js.undefined)
    
    @scala.inline
    def setDefaultFieldsVarargs(value: js.Any*): Self = StObject.set(x, "defaultFields", js.Array(value :_*))
    
    @scala.inline
    def setExprString(value: String): Self = StObject.set(x, "exprString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprStringUndefined: Self = StObject.set(x, "exprString", js.undefined)
    
    @scala.inline
    def setExpressions(value: js.Array[_]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    @scala.inline
    def setExpressionsVarargs(value: js.Any*): Self = StObject.set(x, "expressions", js.Array(value :_*))
    
    @scala.inline
    def setFilterExprUrlKey(value: String): Self = StObject.set(x, "filterExprUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterExprUrlKeyUndefined: Self = StObject.set(x, "filterExprUrlKey", js.undefined)
    
    @scala.inline
    def setFilterLogicUrlKey(value: String): Self = StObject.set(x, "filterLogicUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterLogicUrlKeyUndefined: Self = StObject.set(x, "filterLogicUrlKey", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
