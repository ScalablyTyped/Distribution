package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TreeHierarchicalDataSourceSettingsTreeDS
  extends /**
	 * Option for TreeHierarchicalDataSourceSettingsTreeDS
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Property name of the array of child data in a hierarchical data source.
  	 */
  var childDataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies a custom function to be called when requesting data to the server - usually when expanding/collapsing record. If set the function should return the encoded URL. It takes as parameters: data record(type: object), expand - (type: bool).
  	 *
  	 */
  var customEncodeUrlFunc: js.UndefOr[js.Function] = js.undefined
  /**
  	 * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
  	 */
  var dataLevelKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies a remote URL as a data source, from which data will be retrieved using an AJAX call ($.ajax)
  	 */
  var dataSourceUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies if data is loaded on demand from a remote server. Default is false.
  	 */
  var enableRemoteLoadOnDemand: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
  	 */
  var expandedKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Configure datasource filtering settings.
  	 */
  var filtering: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSFiltering] = js.undefined
  /**
  	 * Unique identifier used in a self-referencing flat data source. Used with primaryKey to create a relationship among flat data sources.
  	 */
  var foreignKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the depth down to which the tree grid would be expanded upon initial render. To expand all rows set value to -1. Default is -1.
  	 */
  var initialExpandDepth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * If set to TRUE it is expected that the source of data is normalized and transformed(has set dataLevel and expansion state). The source of data is used as flatDataView. Usually used when the paging is remote and paging mode is allLevels, or features are remote(and the processing of the returned result should be made on the server)
  	 *
  	 */
  var initialFlatDataView: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Configure datasource paging settings.
  	 */
  var paging: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSPaging] = js.undefined
  /**
  	 * If true save expansion states in internal list and send it to the server. Applying to one of the main constraint of the REST architecture  Stateless Interactions - client specific data(like expansion states) should NOT be stored on the server
  	 *
  	 */
  var persistExpansionStates: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * *** IMPORTANT DEPRECATED *** Use the dataLevelKey option instead.
  	 * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
  	 */
  var propertyDataLevel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * *** IMPORTANT DEPRECATED *** Use the expandedKey option instead.
  	 * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
  	 */
  var propertyExpanded: js.UndefOr[java.lang.String] = js.undefined
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

