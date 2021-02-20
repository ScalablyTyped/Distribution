package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotViewDataSourceOptionsXmlaOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * The catalog name.
    */
  var catalog: js.UndefOr[String] = js.native
  
  /**
    * The name of the cube in the data source.
    */
  var cube: js.UndefOr[String] = js.native
  
  /**
    * Additional properties sent with every discover request.
    * The object is treated as a key/value store where each property name is used as the key and the property value as the value.
    */
  var discoverProperties: js.UndefOr[js.Any] = js.native
  
  /**
    * Enables/disables caching of the XMLA result object.
    */
  var enableResultCache: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional properties sent with every execute request.
    * The object is treated as a key/value store where each property name is used as the key and the property value as the value.
    */
  var executeProperties: js.UndefOr[js.Any] = js.native
  
  /**
    * Optional="true" a javascript object containing information about how the request to the xmla server should be processed
    */
  var mdxSettings: js.UndefOr[IgPivotViewDataSourceOptionsXmlaOptionsMdxSettings] = js.native
  
  /**
    * The name of the measure group in the data source.
    */
  var measureGroup: js.UndefOr[String] = js.native
  
  /**
    * An object containing information about how the request to the XMLA server should be processed.
    */
  var requestOptions: js.UndefOr[IgPivotViewDataSourceOptionsXmlaOptionsRequestOptions] = js.native
  
  /**
    * Optional="false" The URL of the XMLA server.
    */
  var serverUrl: js.UndefOr[String] = js.native
}
object IgPivotViewDataSourceOptionsXmlaOptions {
  
  @scala.inline
  def apply(): IgPivotViewDataSourceOptionsXmlaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsXmlaOptions]
  }
  
  @scala.inline
  implicit class IgPivotViewDataSourceOptionsXmlaOptionsMutableBuilder[Self <: IgPivotViewDataSourceOptionsXmlaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
    
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
    def setMdxSettings(value: IgPivotViewDataSourceOptionsXmlaOptionsMdxSettings): Self = StObject.set(x, "mdxSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMdxSettingsUndefined: Self = StObject.set(x, "mdxSettings", js.undefined)
    
    @scala.inline
    def setMeasureGroup(value: String): Self = StObject.set(x, "measureGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureGroupUndefined: Self = StObject.set(x, "measureGroup", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: IgPivotViewDataSourceOptionsXmlaOptionsRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    @scala.inline
    def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUrlUndefined: Self = StObject.set(x, "serverUrl", js.undefined)
  }
}
