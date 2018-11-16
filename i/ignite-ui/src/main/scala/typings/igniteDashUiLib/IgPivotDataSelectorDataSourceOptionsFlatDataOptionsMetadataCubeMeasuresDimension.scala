package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension
  extends /**
	 * Option for IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A caption for the measures dimension.
  	 * The default value is "Measures".
  	 */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An array of measure metadata objects.
  	 */
  var measures: js.UndefOr[
    js.Array[
      IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure
    ]
  ] = js.undefined
  /**
  	 * A unique name for the measures dimension.
  	 * The default value is "Measures". This name is used to create the names of dimensions using the following pattern:
  	 * [<measuresDimensionMetadata.name>].[<measureMetadata.name>]
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

