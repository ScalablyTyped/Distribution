package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure
  extends /**
	 * Option for IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Optional="false" An aggregator function called when each cell is evaluated.
  	 * Returns a value for the cell. If the returned value is null, no cell will be created in for the data source result.
  	 */
  var aggregator: js.UndefOr[js.Function] = js.undefined
  /**
  	 * A caption for the measure.
  	 */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The path used when displaying the measure in the user interface. Nested folders are indicated by a backslash (\).
  	 */
  var displayFolder: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Optional="false" A unique name for the measure.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    aggregator: js.Function = null,
    caption: java.lang.String = null,
    displayFolder: java.lang.String = null,
    name: java.lang.String = null
  ): IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (aggregator != null) __obj.updateDynamic("aggregator")(aggregator)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (displayFolder != null) __obj.updateDynamic("displayFolder")(displayFolder)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure]
  }
}

