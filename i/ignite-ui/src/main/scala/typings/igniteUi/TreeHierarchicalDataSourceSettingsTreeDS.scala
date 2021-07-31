package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeHierarchicalDataSourceSettingsTreeDS
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Property name of the array of child data in a hierarchical data source.
    */
  var childDataKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a custom function to be called when requesting data to the server - usually when expanding/collapsing record. If set the function should return the encoded URL. It takes as parameters: data record(type: object), expand - (type: bool).
    *
    */
  var customEncodeUrlFunc: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
    */
  var dataLevelKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a remote URL as a data source, from which data will be retrieved using an AJAX call ($.ajax)
    */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if data is loaded on demand from a remote server. Default is false.
    */
  var enableRemoteLoadOnDemand: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
    */
  var expandedKey: js.UndefOr[String] = js.undefined
  
  /**
    * Configure datasource filtering settings.
    */
  var filtering: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSFiltering] = js.undefined
  
  /**
    * Unique identifier used in a self-referencing flat data source. Used with primaryKey to create a relationship among flat data sources.
    */
  var foreignKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the depth down to which the tree grid would be expanded upon initial render. To expand all rows set value to -1. Default is -1.
    */
  var initialExpandDepth: js.UndefOr[Double] = js.undefined
  
  /**
    * If set to TRUE it is expected that the source of data is normalized and transformed(has set dataLevel and expansion state). The source of data is used as flatDataView. Usually used when the paging is remote and paging mode is allLevels, or features are remote(and the processing of the returned result should be made on the server)
    *
    */
  var initialFlatDataView: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configure datasource paging settings.
    */
  var paging: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSPaging] = js.undefined
  
  /**
    * If true save expansion states in internal list and send it to the server. Applying to one of the main constraint of the REST architecture  Stateless Interactions - client specific data(like expansion states) should NOT be stored on the server
    *
    */
  var persistExpansionStates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *** IMPORTANT DEPRECATED *** Use the dataLevelKey option instead.
    * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
    */
  var propertyDataLevel: js.UndefOr[String] = js.undefined
  
  /**
    * *** IMPORTANT DEPRECATED *** Use the expandedKey option instead.
    * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
    */
  var propertyExpanded: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a custom function to be called when the remote request for data has finished.
    */
  var requestDataCallback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Specifies a custom function to be called when the remote request for data has finished with an error.
    */
  var requestDataErrorCallback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Specifies a custom function to be called when the remote request for data has finished successfully.
    */
  var requestDataSuccessCallback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Configure datasource sorting settings.
    */
  var sorting: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSSorting] = js.undefined
}
object TreeHierarchicalDataSourceSettingsTreeDS {
  
  @scala.inline
  def apply(): TreeHierarchicalDataSourceSettingsTreeDS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDS]
  }
  
  @scala.inline
  implicit class TreeHierarchicalDataSourceSettingsTreeDSMutableBuilder[Self <: TreeHierarchicalDataSourceSettingsTreeDS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildDataKey(value: String): Self = StObject.set(x, "childDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildDataKeyUndefined: Self = StObject.set(x, "childDataKey", js.undefined)
    
    @scala.inline
    def setCustomEncodeUrlFunc(value: js.Function): Self = StObject.set(x, "customEncodeUrlFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEncodeUrlFuncUndefined: Self = StObject.set(x, "customEncodeUrlFunc", js.undefined)
    
    @scala.inline
    def setDataLevelKey(value: String): Self = StObject.set(x, "dataLevelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLevelKeyUndefined: Self = StObject.set(x, "dataLevelKey", js.undefined)
    
    @scala.inline
    def setDataSourceUrl(value: String): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUrlUndefined: Self = StObject.set(x, "dataSourceUrl", js.undefined)
    
    @scala.inline
    def setEnableRemoteLoadOnDemand(value: Boolean): Self = StObject.set(x, "enableRemoteLoadOnDemand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRemoteLoadOnDemandUndefined: Self = StObject.set(x, "enableRemoteLoadOnDemand", js.undefined)
    
    @scala.inline
    def setExpandedKey(value: String): Self = StObject.set(x, "expandedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeyUndefined: Self = StObject.set(x, "expandedKey", js.undefined)
    
    @scala.inline
    def setFiltering(value: TreeHierarchicalDataSourceSettingsTreeDSFiltering): Self = StObject.set(x, "filtering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
    
    @scala.inline
    def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    
    @scala.inline
    def setInitialExpandDepth(value: Double): Self = StObject.set(x, "initialExpandDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialExpandDepthUndefined: Self = StObject.set(x, "initialExpandDepth", js.undefined)
    
    @scala.inline
    def setInitialFlatDataView(value: Boolean): Self = StObject.set(x, "initialFlatDataView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialFlatDataViewUndefined: Self = StObject.set(x, "initialFlatDataView", js.undefined)
    
    @scala.inline
    def setPaging(value: TreeHierarchicalDataSourceSettingsTreeDSPaging): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    @scala.inline
    def setPersistExpansionStates(value: Boolean): Self = StObject.set(x, "persistExpansionStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistExpansionStatesUndefined: Self = StObject.set(x, "persistExpansionStates", js.undefined)
    
    @scala.inline
    def setPropertyDataLevel(value: String): Self = StObject.set(x, "propertyDataLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDataLevelUndefined: Self = StObject.set(x, "propertyDataLevel", js.undefined)
    
    @scala.inline
    def setPropertyExpanded(value: String): Self = StObject.set(x, "propertyExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyExpandedUndefined: Self = StObject.set(x, "propertyExpanded", js.undefined)
    
    @scala.inline
    def setRequestDataCallback(value: js.Function): Self = StObject.set(x, "requestDataCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestDataCallbackUndefined: Self = StObject.set(x, "requestDataCallback", js.undefined)
    
    @scala.inline
    def setRequestDataErrorCallback(value: js.Function): Self = StObject.set(x, "requestDataErrorCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestDataErrorCallbackUndefined: Self = StObject.set(x, "requestDataErrorCallback", js.undefined)
    
    @scala.inline
    def setRequestDataSuccessCallback(value: js.Function): Self = StObject.set(x, "requestDataSuccessCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestDataSuccessCallbackUndefined: Self = StObject.set(x, "requestDataSuccessCallback", js.undefined)
    
    @scala.inline
    def setSorting(value: TreeHierarchicalDataSourceSettingsTreeDSSorting): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
  }
}
