package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OlapXmlaDataSourceOptions
  extends /**
	 * Option for OlapXmlaDataSourceOptions
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * The catalog name.
  	 */
  var catalog: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A list of hierarchy names separated by comma (,). These will be the hierarchies in the columns of the data source.
  	 */
  var columns: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The name of the cube in the data source.
  	 */
  var cube: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Additional properties sent with every discover request.
  	 *             The object is treated as a key/value store where each property name is used as the key and the property value as the value.
  	 */
  var discoverProperties: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Enables/disables caching of the XMLA result object.
  	 */
  var enableResultCache: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Additional properties sent with every execute request.
  	 *             The object is treated as a key/value store where each property name is used as the key and the property value as the value.
  	 */
  var executeProperties: js.UndefOr[js.Any] = js.undefined
  /**
  	 * A list of hierarchy names separated by comma (,). These will be hierarchies in the filters of the data source.
  	 */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies if the data is to be served by a XMLA remote provider.
  	 */
  var isRemote: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Optional="true" a javascript object containing information about how the request to the xmla server should be processed
  	 */
  var mdxSettings: js.UndefOr[OlapXmlaDataSourceOptionsMdxSettings] = js.undefined
  /**
  	 * The name of the measure group in the data source.
  	 */
  var measureGroup: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A list of measure names separated by comma (,). These will be the measures of the data source.
  	 */
  var measures: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An object containing information about how the request to the XMLA server should be processed.
  	 */
  var requestOptions: js.UndefOr[OlapXmlaDataSourceOptionsRequestOptions] = js.undefined
  /**
  	 * A list of hierarchy names separated by comma (,). These will be the hierarchies in the rows of the data source.
  	 */
  var rows: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Optional="false" The URL of the XMLA server.
  	 */
  var serverUrl: js.UndefOr[java.lang.String] = js.undefined
}

