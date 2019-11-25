package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure
  extends /**
	 * Option for OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Optional="false" An aggregator function called when each cell is evaluated.
  	 *                                 Returns a value for the cell. If the returned value is null, no cell will be created in for the data source result.
  	 */
  var aggregator: js.UndefOr[js.Function] = js.undefined
  /**
  	 * A caption for the measure.
  	 */
  var caption: js.UndefOr[String] = js.undefined
  /**
  	 * The path used when displaying the measure in the user interface. Nested folders are indicated by a backslash (\).
  	 */
  var displayFolder: js.UndefOr[String] = js.undefined
  /**
  	 * Optional="false" A unique name for the measure.
  	 */
  var name: js.UndefOr[String] = js.undefined
}

object OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    aggregator: js.Function = null,
    caption: String = null,
    displayFolder: String = null,
    name: String = null
  ): OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (aggregator != null) __obj.updateDynamic("aggregator")(aggregator.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (displayFolder != null) __obj.updateDynamic("displayFolder")(displayFolder.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure]
  }
}

