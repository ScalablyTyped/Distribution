package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeHierarchicalDataSourceSettingsTreeDS
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Property name of the array of child data in a hierarchical data source.
    */
  var childDataKey: js.UndefOr[String] = js.native
  
  /**
    * Specifies a custom function to be called when requesting data to the server - usually when expanding/collapsing record. If set the function should return the encoded URL. It takes as parameters: data record(type: object), expand - (type: bool).
    *
    */
  var customEncodeUrlFunc: js.UndefOr[js.Function] = js.native
  
  /**
    * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
    */
  var dataLevelKey: js.UndefOr[String] = js.native
  
  /**
    * Specifies a remote URL as a data source, from which data will be retrieved using an AJAX call ($.ajax)
    */
  var dataSourceUrl: js.UndefOr[String] = js.native
  
  /**
    * Specifies if data is loaded on demand from a remote server. Default is false.
    */
  var enableRemoteLoadOnDemand: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
    */
  var expandedKey: js.UndefOr[String] = js.native
  
  /**
    * Configure datasource filtering settings.
    */
  var filtering: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSFiltering] = js.native
  
  /**
    * Unique identifier used in a self-referencing flat data source. Used with primaryKey to create a relationship among flat data sources.
    */
  var foreignKey: js.UndefOr[String] = js.native
  
  /**
    * Specifies the depth down to which the tree grid would be expanded upon initial render. To expand all rows set value to -1. Default is -1.
    */
  var initialExpandDepth: js.UndefOr[Double] = js.native
  
  /**
    * If set to TRUE it is expected that the source of data is normalized and transformed(has set dataLevel and expansion state). The source of data is used as flatDataView. Usually used when the paging is remote and paging mode is allLevels, or features are remote(and the processing of the returned result should be made on the server)
    *
    */
  var initialFlatDataView: js.UndefOr[Boolean] = js.native
  
  /**
    * Configure datasource paging settings.
    */
  var paging: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSPaging] = js.native
  
  /**
    * If true save expansion states in internal list and send it to the server. Applying to one of the main constraint of the REST architecture  Stateless Interactions - client specific data(like expansion states) should NOT be stored on the server
    *
    */
  var persistExpansionStates: js.UndefOr[Boolean] = js.native
  
  /**
    * *** IMPORTANT DEPRECATED *** Use the dataLevelKey option instead.
    * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
    */
  var propertyDataLevel: js.UndefOr[String] = js.native
  
  /**
    * *** IMPORTANT DEPRECATED *** Use the expandedKey option instead.
    * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
    */
  var propertyExpanded: js.UndefOr[String] = js.native
  
  /**
    * Specifies a custom function to be called when the remote request for data has finished.
    */
  var requestDataCallback: js.UndefOr[js.Function] = js.native
  
  /**
    * Specifies a custom function to be called when the remote request for data has finished with an error.
    */
  var requestDataErrorCallback: js.UndefOr[js.Function] = js.native
  
  /**
    * Specifies a custom function to be called when the remote request for data has finished successfully.
    */
  var requestDataSuccessCallback: js.UndefOr[js.Function] = js.native
  
  /**
    * Configure datasource sorting settings.
    */
  var sorting: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSSorting] = js.native
}
object TreeHierarchicalDataSourceSettingsTreeDS {
  
  @scala.inline
  def apply(): TreeHierarchicalDataSourceSettingsTreeDS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDS]
  }
  
  @scala.inline
  implicit class TreeHierarchicalDataSourceSettingsTreeDSOps[Self <: TreeHierarchicalDataSourceSettingsTreeDS] (val x: Self) extends AnyVal {
    
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
    def setChildDataKey(value: String): Self = this.set("childDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildDataKey: Self = this.set("childDataKey", js.undefined)
    
    @scala.inline
    def setCustomEncodeUrlFunc(value: js.Function): Self = this.set("customEncodeUrlFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEncodeUrlFunc: Self = this.set("customEncodeUrlFunc", js.undefined)
    
    @scala.inline
    def setDataLevelKey(value: String): Self = this.set("dataLevelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLevelKey: Self = this.set("dataLevelKey", js.undefined)
    
    @scala.inline
    def setDataSourceUrl(value: String): Self = this.set("dataSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceUrl: Self = this.set("dataSourceUrl", js.undefined)
    
    @scala.inline
    def setEnableRemoteLoadOnDemand(value: Boolean): Self = this.set("enableRemoteLoadOnDemand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRemoteLoadOnDemand: Self = this.set("enableRemoteLoadOnDemand", js.undefined)
    
    @scala.inline
    def setExpandedKey(value: String): Self = this.set("expandedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedKey: Self = this.set("expandedKey", js.undefined)
    
    @scala.inline
    def setFiltering(value: TreeHierarchicalDataSourceSettingsTreeDSFiltering): Self = this.set("filtering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiltering: Self = this.set("filtering", js.undefined)
    
    @scala.inline
    def setForeignKey(value: String): Self = this.set("foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeignKey: Self = this.set("foreignKey", js.undefined)
    
    @scala.inline
    def setInitialExpandDepth(value: Double): Self = this.set("initialExpandDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialExpandDepth: Self = this.set("initialExpandDepth", js.undefined)
    
    @scala.inline
    def setInitialFlatDataView(value: Boolean): Self = this.set("initialFlatDataView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialFlatDataView: Self = this.set("initialFlatDataView", js.undefined)
    
    @scala.inline
    def setPaging(value: TreeHierarchicalDataSourceSettingsTreeDSPaging): Self = this.set("paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    
    @scala.inline
    def setPersistExpansionStates(value: Boolean): Self = this.set("persistExpansionStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistExpansionStates: Self = this.set("persistExpansionStates", js.undefined)
    
    @scala.inline
    def setPropertyDataLevel(value: String): Self = this.set("propertyDataLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyDataLevel: Self = this.set("propertyDataLevel", js.undefined)
    
    @scala.inline
    def setPropertyExpanded(value: String): Self = this.set("propertyExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyExpanded: Self = this.set("propertyExpanded", js.undefined)
    
    @scala.inline
    def setRequestDataCallback(value: js.Function): Self = this.set("requestDataCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestDataCallback: Self = this.set("requestDataCallback", js.undefined)
    
    @scala.inline
    def setRequestDataErrorCallback(value: js.Function): Self = this.set("requestDataErrorCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestDataErrorCallback: Self = this.set("requestDataErrorCallback", js.undefined)
    
    @scala.inline
    def setRequestDataSuccessCallback(value: js.Function): Self = this.set("requestDataSuccessCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestDataSuccessCallback: Self = this.set("requestDataSuccessCallback", js.undefined)
    
    @scala.inline
    def setSorting(value: TreeHierarchicalDataSourceSettingsTreeDSSorting): Self = this.set("sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
  }
}
