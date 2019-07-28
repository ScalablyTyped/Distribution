package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapFlatDataSourceOptionsMetadataCube
  extends /**
	 * Option for OlapFlatDataSourceOptionsMetadataCube
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A caption for the cube.
  	 */
  var caption: js.UndefOr[String] = js.undefined
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
  var name: js.UndefOr[String] = js.undefined
}

object OlapFlatDataSourceOptionsMetadataCube {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapFlatDataSourceOptionsMetadataCube
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    caption: String = null,
    dimensions: js.Array[OlapFlatDataSourceOptionsMetadataCubeDimension] = null,
    measuresDimension: OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension = null,
    name: String = null
  ): OlapFlatDataSourceOptionsMetadataCube = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (measuresDimension != null) __obj.updateDynamic("measuresDimension")(measuresDimension)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCube]
  }
}

