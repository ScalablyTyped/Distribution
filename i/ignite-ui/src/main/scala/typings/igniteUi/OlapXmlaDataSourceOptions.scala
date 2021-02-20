package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapXmlaDataSourceOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * The catalog name.
    */
  var catalog: js.UndefOr[String] = js.native
  
  /**
    * A list of hierarchy names separated by comma (,). These will be the hierarchies in the columns of the data source.
    */
  var columns: js.UndefOr[String] = js.native
  
  /**
    * The name of the cube in the data source.
    */
  var cube: js.UndefOr[String] = js.native
  
  /**
    * Additional properties sent with every discover request.
    *             The object is treated as a key/value store where each property name is used as the key and the property value as the value.
    */
  var discoverProperties: js.UndefOr[js.Any] = js.native
  
  /**
    * Enables/disables caching of the XMLA result object.
    */
  var enableResultCache: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional properties sent with every execute request.
    *             The object is treated as a key/value store where each property name is used as the key and the property value as the value.
    */
  var executeProperties: js.UndefOr[js.Any] = js.native
  
  /**
    * A list of hierarchy names separated by comma (,). These will be hierarchies in the filters of the data source.
    */
  var filters: js.UndefOr[String] = js.native
  
  /**
    * Specifies if the data is to be served by a XMLA remote provider.
    */
  var isRemote: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional="true" a javascript object containing information about how the request to the xmla server should be processed
    */
  var mdxSettings: js.UndefOr[OlapXmlaDataSourceOptionsMdxSettings] = js.native
  
  /**
    * The name of the measure group in the data source.
    */
  var measureGroup: js.UndefOr[String] = js.native
  
  /**
    * A list of measure names separated by comma (,). These will be the measures of the data source.
    */
  var measures: js.UndefOr[String] = js.native
  
  /**
    * An object containing information about how the request to the XMLA server should be processed.
    */
  var requestOptions: js.UndefOr[OlapXmlaDataSourceOptionsRequestOptions] = js.native
  
  /**
    * A list of hierarchy names separated by comma (,). These will be the hierarchies in the rows of the data source.
    */
  var rows: js.UndefOr[String] = js.native
  
  /**
    * Optional="false" The URL of the XMLA server.
    */
  var serverUrl: js.UndefOr[String] = js.native
}
object OlapXmlaDataSourceOptions {
  
  @scala.inline
  def apply(): OlapXmlaDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapXmlaDataSourceOptions]
  }
  
  @scala.inline
  implicit class OlapXmlaDataSourceOptionsMutableBuilder[Self <: OlapXmlaDataSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
    
    @scala.inline
    def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setCube(value: String): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
    
    @scala.inline
    def setDiscoverProperties(value: js.Any): Self = StObject.set(x, "discoverProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoverPropertiesUndefined: Self = StObject.set(x, "discoverProperties", js.undefined)
    
    @scala.inline
    def setEnableResultCache(value: Boolean): Self = StObject.set(x, "enableResultCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableResultCacheUndefined: Self = StObject.set(x, "enableResultCache", js.undefined)
    
    @scala.inline
    def setExecuteProperties(value: js.Any): Self = StObject.set(x, "executeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutePropertiesUndefined: Self = StObject.set(x, "executeProperties", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setIsRemote(value: Boolean): Self = StObject.set(x, "isRemote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRemoteUndefined: Self = StObject.set(x, "isRemote", js.undefined)
    
    @scala.inline
    def setMdxSettings(value: OlapXmlaDataSourceOptionsMdxSettings): Self = StObject.set(x, "mdxSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMdxSettingsUndefined: Self = StObject.set(x, "mdxSettings", js.undefined)
    
    @scala.inline
    def setMeasureGroup(value: String): Self = StObject.set(x, "measureGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureGroupUndefined: Self = StObject.set(x, "measureGroup", js.undefined)
    
    @scala.inline
    def setMeasures(value: String): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: OlapXmlaDataSourceOptionsRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    @scala.inline
    def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUrlUndefined: Self = StObject.set(x, "serverUrl", js.undefined)
  }
}
