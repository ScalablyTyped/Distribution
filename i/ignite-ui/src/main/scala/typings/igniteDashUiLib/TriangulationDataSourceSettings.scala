package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TriangulationDataSourceSettings
  extends /**
	 * Option for TriangulationDataSourceSettings
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Callback function to call when data binding is complete
  	 */
  var callback: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Object on which to invoke the callback function
  	 */
  var callee: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The unique identifier.
  	 */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A Uri specifying the location of the Itf file.
  	 */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The TriangulationSource which is typically created after importing the Itf from the Source Uri.
  	 */
  var triangulationSource: js.UndefOr[java.lang.String] = js.undefined
}

