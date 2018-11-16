package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OlapFlatDataSourceOptionsMetadataCube
  extends /**
	 * Option for OlapFlatDataSourceOptionsMetadataCube
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A caption for the cube.
  	 */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An array of dimension metadata objects.
  	 */
  var dimensions: js.UndefOr[js.Array[OlapFlatDataSourceOptionsMetadataCubeDimension]] = js.undefined
  /**
  	 * An object providing information about the measures' root node.
  	 */
  var measuresDimension: js.UndefOr[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension] = js.undefined
  /**
  	 * Optional="false" A unique name for the cube.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

