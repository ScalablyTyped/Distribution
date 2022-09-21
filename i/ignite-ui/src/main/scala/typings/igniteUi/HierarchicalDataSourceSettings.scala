package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchicalDataSourceSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  var autogenerate: js.UndefOr[Boolean] = js.undefined
  
  var callback: js.UndefOr[Any] = js.undefined
  
  var callee: js.UndefOr[Any] = js.undefined
  
  var data: js.UndefOr[js.Array[Any]] = js.undefined
  
  var dataBinding: js.UndefOr[Any] = js.undefined
  
  var dataBound: js.UndefOr[Any] = js.undefined
  
  var dataSource: js.UndefOr[Any] = js.undefined
  
  var defaultChildrenDataProperty: js.UndefOr[String] = js.undefined
  
  var filtering: js.UndefOr[HierarchicalDataSourceSettingsFiltering] = js.undefined
  
  var initialDataBindDepth: js.UndefOr[Double] = js.undefined
  
  var localSchemaTransform: js.UndefOr[Boolean] = js.undefined
  
  var maxDataBindDepth: js.UndefOr[Double] = js.undefined
  
  var odata: js.UndefOr[Boolean] = js.undefined
  
  var paging: js.UndefOr[HierarchicalDataSourceSettingsPaging] = js.undefined
  
  var requestType: js.UndefOr[String] = js.undefined
  
  var responseContentType: js.UndefOr[Any] = js.undefined
  
  var responseDataType: js.UndefOr[Any] = js.undefined
  
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
  
  var urlParamsEncoded: js.UndefOr[Any] = js.undefined
  
  var urlParamsEncoding: js.UndefOr[Any] = js.undefined
}
object HierarchicalDataSourceSettings {
  
  inline def apply(): HierarchicalDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalDataSourceSettings]
  }
  
  extension [Self <: HierarchicalDataSourceSettings](x: Self) {
    
    inline def setAutogenerate(value: Boolean): Self = StObject.set(x, "autogenerate", value.asInstanceOf[js.Any])
    
    inline def setAutogenerateUndefined: Self = StObject.set(x, "autogenerate", js.undefined)
    
    inline def setCallback(value: Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCallee(value: Any): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setCalleeUndefined: Self = StObject.set(x, "callee", js.undefined)
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataBinding(value: Any): Self = StObject.set(x, "dataBinding", value.asInstanceOf[js.Any])
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: Any): Self = StObject.set(x, "dataBound", value.asInstanceOf[js.Any])
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDefaultChildrenDataProperty(value: String): Self = StObject.set(x, "defaultChildrenDataProperty", value.asInstanceOf[js.Any])
    
    inline def setDefaultChildrenDataPropertyUndefined: Self = StObject.set(x, "defaultChildrenDataProperty", js.undefined)
    
    inline def setFiltering(value: HierarchicalDataSourceSettingsFiltering): Self = StObject.set(x, "filtering", value.asInstanceOf[js.Any])
    
    inline def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
    
    inline def setInitialDataBindDepth(value: Double): Self = StObject.set(x, "initialDataBindDepth", value.asInstanceOf[js.Any])
    
    inline def setInitialDataBindDepthUndefined: Self = StObject.set(x, "initialDataBindDepth", js.undefined)
    
    inline def setLocalSchemaTransform(value: Boolean): Self = StObject.set(x, "localSchemaTransform", value.asInstanceOf[js.Any])
    
    inline def setLocalSchemaTransformUndefined: Self = StObject.set(x, "localSchemaTransform", js.undefined)
    
    inline def setMaxDataBindDepth(value: Double): Self = StObject.set(x, "maxDataBindDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxDataBindDepthUndefined: Self = StObject.set(x, "maxDataBindDepth", js.undefined)
    
    inline def setOdata(value: Boolean): Self = StObject.set(x, "odata", value.asInstanceOf[js.Any])
    
    inline def setOdataUndefined: Self = StObject.set(x, "odata", js.undefined)
    
    inline def setPaging(value: HierarchicalDataSourceSettingsPaging): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
    
    inline def setResponseContentType(value: Any): Self = StObject.set(x, "responseContentType", value.asInstanceOf[js.Any])
    
    inline def setResponseContentTypeUndefined: Self = StObject.set(x, "responseContentType", js.undefined)
    
    inline def setResponseDataType(value: Any): Self = StObject.set(x, "responseDataType", value.asInstanceOf[js.Any])
    
    inline def setResponseDataTypeUndefined: Self = StObject.set(x, "responseDataType", js.undefined)
    
    inline def setSchema(value: HierarchicalDataSourceSettingsSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSorting(value: HierarchicalDataSourceSettingsSorting): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrlParamsEncoded(value: Any): Self = StObject.set(x, "urlParamsEncoded", value.asInstanceOf[js.Any])
    
    inline def setUrlParamsEncodedUndefined: Self = StObject.set(x, "urlParamsEncoded", js.undefined)
    
    inline def setUrlParamsEncoding(value: Any): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
    
    inline def setUrlParamsEncodingUndefined: Self = StObject.set(x, "urlParamsEncoding", js.undefined)
  }
}
