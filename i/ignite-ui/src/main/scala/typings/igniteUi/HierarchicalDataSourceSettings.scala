package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchicalDataSourceSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var autogenerate: js.UndefOr[Boolean] = js.native
  
  var callback: js.UndefOr[js.Any] = js.native
  
  var callee: js.UndefOr[js.Any] = js.native
  
  var data: js.UndefOr[js.Array[_]] = js.native
  
  var dataBinding: js.UndefOr[js.Any] = js.native
  
  var dataBound: js.UndefOr[js.Any] = js.native
  
  var dataSource: js.UndefOr[js.Any] = js.native
  
  var defaultChildrenDataProperty: js.UndefOr[String] = js.native
  
  var filtering: js.UndefOr[HierarchicalDataSourceSettingsFiltering] = js.native
  
  var initialDataBindDepth: js.UndefOr[Double] = js.native
  
  var localSchemaTransform: js.UndefOr[Boolean] = js.native
  
  var maxDataBindDepth: js.UndefOr[Double] = js.native
  
  var odata: js.UndefOr[Boolean] = js.native
  
  var paging: js.UndefOr[HierarchicalDataSourceSettingsPaging] = js.native
  
  var requestType: js.UndefOr[String] = js.native
  
  var responseContentType: js.UndefOr[js.Any] = js.native
  
  var responseDataType: js.UndefOr[js.Any] = js.native
  
  /**
    * All of the rest - paging, sorting, filtering, can be defined in the layouts definition, which will "override" the parent defs
    * IMPORTANT:  if there is no paging, sorting or filtering, an instance of $.ig.DataSource won't be created for child row islands
    */
  var schema: js.UndefOr[HierarchicalDataSourceSettingsSchema] = js.native
  
  var sorting: js.UndefOr[HierarchicalDataSourceSettingsSorting] = js.native
  
  /**
    * Other options
    */
  var `type`: js.UndefOr[String] = js.native
  
  var urlParamsEncoded: js.UndefOr[js.Any] = js.native
  
  var urlParamsEncoding: js.UndefOr[js.Any] = js.native
}
object HierarchicalDataSourceSettings {
  
  @scala.inline
  def apply(): HierarchicalDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalDataSourceSettings]
  }
  
  @scala.inline
  implicit class HierarchicalDataSourceSettingsOps[Self <: HierarchicalDataSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutogenerate(value: Boolean): Self = this.set("autogenerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutogenerate: Self = this.set("autogenerate", js.undefined)
    
    @scala.inline
    def setCallback(value: js.Any): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCallee(value: js.Any): Self = this.set("callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallee: Self = this.set("callee", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataBinding(value: js.Any): Self = this.set("dataBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: js.Any): Self = this.set("dataBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDefaultChildrenDataProperty(value: String): Self = this.set("defaultChildrenDataProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultChildrenDataProperty: Self = this.set("defaultChildrenDataProperty", js.undefined)
    
    @scala.inline
    def setFiltering(value: HierarchicalDataSourceSettingsFiltering): Self = this.set("filtering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiltering: Self = this.set("filtering", js.undefined)
    
    @scala.inline
    def setInitialDataBindDepth(value: Double): Self = this.set("initialDataBindDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDataBindDepth: Self = this.set("initialDataBindDepth", js.undefined)
    
    @scala.inline
    def setLocalSchemaTransform(value: Boolean): Self = this.set("localSchemaTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalSchemaTransform: Self = this.set("localSchemaTransform", js.undefined)
    
    @scala.inline
    def setMaxDataBindDepth(value: Double): Self = this.set("maxDataBindDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDataBindDepth: Self = this.set("maxDataBindDepth", js.undefined)
    
    @scala.inline
    def setOdata(value: Boolean): Self = this.set("odata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOdata: Self = this.set("odata", js.undefined)
    
    @scala.inline
    def setPaging(value: HierarchicalDataSourceSettingsPaging): Self = this.set("paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    
    @scala.inline
    def setResponseContentType(value: js.Any): Self = this.set("responseContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseContentType: Self = this.set("responseContentType", js.undefined)
    
    @scala.inline
    def setResponseDataType(value: js.Any): Self = this.set("responseDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseDataType: Self = this.set("responseDataType", js.undefined)
    
    @scala.inline
    def setSchema(value: HierarchicalDataSourceSettingsSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSorting(value: HierarchicalDataSourceSettingsSorting): Self = this.set("sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrlParamsEncoded(value: js.Any): Self = this.set("urlParamsEncoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlParamsEncoded: Self = this.set("urlParamsEncoded", js.undefined)
    
    @scala.inline
    def setUrlParamsEncoding(value: js.Any): Self = this.set("urlParamsEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlParamsEncoding: Self = this.set("urlParamsEncoding", js.undefined)
  }
}
