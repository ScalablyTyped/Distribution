package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension
  extends /**
	 * Option for OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A caption for the measures dimension.
  	 *                             The default value is "Measures".
  	 */
  var caption: js.UndefOr[String] = js.undefined
  /**
  	 * An array of measure metadata objects.
  	 */
  var measures: js.UndefOr[js.Array[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure]] = js.undefined
  /**
  	 * A unique name for the measures dimension.
  	 *                             The default value is "Measures". This name is used to create the names of dimensions using the following pattern:
  	 *                             [<measuresDimensionMetadata.name>].[<measureMetadata.name>]
  	 */
  var name: js.UndefOr[String] = js.undefined
}

object OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    caption: String = null,
    measures: js.Array[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure] = null,
    name: String = null
  ): OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension]
  }
}

