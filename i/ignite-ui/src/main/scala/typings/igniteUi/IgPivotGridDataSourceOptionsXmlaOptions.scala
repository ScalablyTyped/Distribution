package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotGridDataSourceOptionsXmlaOptions
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * The catalog name.
    */
  var catalog: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cube in the data source.
    */
  var cube: js.UndefOr[String] = js.undefined
  
  /**
    * Additional properties sent with every discover request.
    * The object is treated as a key/value store where each property name is used as the key and the property value as the value.
    */
  var discoverProperties: js.UndefOr[Any] = js.undefined
  
  /**
    * Enables/disables caching of the XMLA result object.
    */
  var enableResultCache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional properties sent with every execute request.
    * The object is treated as a key/value store where each property name is used as the key and the property value as the value.
    */
  var executeProperties: js.UndefOr[Any] = js.undefined
  
  /**
    * Optional="true" a javascript object containing information about how the request to the xmla server should be processed
    */
  var mdxSettings: js.UndefOr[IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings] = js.undefined
  
  /**
    * The name of the measure group in the data source.
    */
  var measureGroup: js.UndefOr[String] = js.undefined
  
  /**
    * An object containing information about how the request to the XMLA server should be processed.
    */
  var requestOptions: js.UndefOr[IgPivotGridDataSourceOptionsXmlaOptionsRequestOptions] = js.undefined
  
  /**
    * Optional="false" The URL of the XMLA server.
    */
  var serverUrl: js.UndefOr[String] = js.undefined
}
object IgPivotGridDataSourceOptionsXmlaOptions {
  
  inline def apply(): IgPivotGridDataSourceOptionsXmlaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsXmlaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgPivotGridDataSourceOptionsXmlaOptions] (val x: Self) extends AnyVal {
    
    inline def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
    
    inline def setCube(value: String): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    inline def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
    
    inline def setDiscoverProperties(value: Any): Self = StObject.set(x, "discoverProperties", value.asInstanceOf[js.Any])
    
    inline def setDiscoverPropertiesUndefined: Self = StObject.set(x, "discoverProperties", js.undefined)
    
    inline def setEnableResultCache(value: Boolean): Self = StObject.set(x, "enableResultCache", value.asInstanceOf[js.Any])
    
    inline def setEnableResultCacheUndefined: Self = StObject.set(x, "enableResultCache", js.undefined)
    
    inline def setExecuteProperties(value: Any): Self = StObject.set(x, "executeProperties", value.asInstanceOf[js.Any])
    
    inline def setExecutePropertiesUndefined: Self = StObject.set(x, "executeProperties", js.undefined)
    
    inline def setMdxSettings(value: IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings): Self = StObject.set(x, "mdxSettings", value.asInstanceOf[js.Any])
    
    inline def setMdxSettingsUndefined: Self = StObject.set(x, "mdxSettings", js.undefined)
    
    inline def setMeasureGroup(value: String): Self = StObject.set(x, "measureGroup", value.asInstanceOf[js.Any])
    
    inline def setMeasureGroupUndefined: Self = StObject.set(x, "measureGroup", js.undefined)
    
    inline def setRequestOptions(value: IgPivotGridDataSourceOptionsXmlaOptionsRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
    
    inline def setServerUrlUndefined: Self = StObject.set(x, "serverUrl", js.undefined)
  }
}
