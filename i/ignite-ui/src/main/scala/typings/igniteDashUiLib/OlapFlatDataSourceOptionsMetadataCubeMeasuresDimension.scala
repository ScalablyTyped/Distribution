package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension
  extends /**
	 * Option for OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A caption for the measures dimension.
  	 *                             The default value is "Measures".
  	 */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An array of measure metadata objects.
  	 */
  var measures: js.UndefOr[js.Array[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure]] = js.undefined
  /**
  	 * A unique name for the measures dimension.
  	 *                             The default value is "Measures". This name is used to create the names of dimensions using the following pattern:
  	 *                             [<measuresDimensionMetadata.name>].[<measureMetadata.name>]
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    caption: java.lang.String = null,
    measures: js.Array[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure] = null,
    name: java.lang.String = null
  ): OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (measures != null) __obj.updateDynamic("measures")(measures)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension]
  }
}

