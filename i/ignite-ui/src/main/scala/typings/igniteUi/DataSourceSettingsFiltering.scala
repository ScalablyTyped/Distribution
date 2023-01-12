package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSettingsFiltering
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
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
  var customConditions: js.UndefOr[Any] = js.undefined
  
  /**
    * Can point to either a string or a function object. The parameters that are passed are 1) the data array to be filtered, 2) the filtering expression definitions. Should return an array of the filtered data
    *
    */
  var customFunc: js.UndefOr[Any] = js.undefined
  
  /**
    * Data will be initially filtered accordingly, directly after dataBind()
    *
    */
  var defaultFields: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * An "SQL-like' encoded expressions string. Takes precedence over "expressions". Example: col2 > 100; col2 LIKE %test%
    *
    */
  var exprString: js.UndefOr[String] = js.undefined
  
  /**
    * A list of expression objects, containing the following key-value pairs: fieldName, expression (search string), condition , and logic (AND/OR)
    *
    */
  var expressions: js.UndefOr[js.Array[Any]] = js.undefined
  
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
  
  inline def apply(): DataSourceSettingsFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsFiltering]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceSettingsFiltering] (val x: Self) extends AnyVal {
    
    inline def setApplyToAllData(value: Boolean): Self = StObject.set(x, "applyToAllData", value.asInstanceOf[js.Any])
    
    inline def setApplyToAllDataUndefined: Self = StObject.set(x, "applyToAllData", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setCustomConditions(value: Any): Self = StObject.set(x, "customConditions", value.asInstanceOf[js.Any])
    
    inline def setCustomConditionsUndefined: Self = StObject.set(x, "customConditions", js.undefined)
    
    inline def setCustomFunc(value: Any): Self = StObject.set(x, "customFunc", value.asInstanceOf[js.Any])
    
    inline def setCustomFuncUndefined: Self = StObject.set(x, "customFunc", js.undefined)
    
    inline def setDefaultFields(value: js.Array[Any]): Self = StObject.set(x, "defaultFields", value.asInstanceOf[js.Any])
    
    inline def setDefaultFieldsUndefined: Self = StObject.set(x, "defaultFields", js.undefined)
    
    inline def setDefaultFieldsVarargs(value: Any*): Self = StObject.set(x, "defaultFields", js.Array(value*))
    
    inline def setExprString(value: String): Self = StObject.set(x, "exprString", value.asInstanceOf[js.Any])
    
    inline def setExprStringUndefined: Self = StObject.set(x, "exprString", js.undefined)
    
    inline def setExpressions(value: js.Array[Any]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    inline def setExpressionsVarargs(value: Any*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setFilterExprUrlKey(value: String): Self = StObject.set(x, "filterExprUrlKey", value.asInstanceOf[js.Any])
    
    inline def setFilterExprUrlKeyUndefined: Self = StObject.set(x, "filterExprUrlKey", js.undefined)
    
    inline def setFilterLogicUrlKey(value: String): Self = StObject.set(x, "filterLogicUrlKey", value.asInstanceOf[js.Any])
    
    inline def setFilterLogicUrlKeyUndefined: Self = StObject.set(x, "filterLogicUrlKey", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
