package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapFlatDataSourceOptionsMetadataCubeDimension
  extends /**
	 * Option for OlapFlatDataSourceOptionsMetadataCubeDimension
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A caption for the dimension.
  	 */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An array of hierarchy metadata objects.
  	 */
  var hierarchies: js.UndefOr[js.Array[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie]] = js.undefined
  /**
  	 * Optional="false" A unique name for the dimension.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object OlapFlatDataSourceOptionsMetadataCubeDimension {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapFlatDataSourceOptionsMetadataCubeDimension
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    caption: java.lang.String = null,
    hierarchies: js.Array[OlapFlatDataSourceOptionsMetadataCubeDimensionHierarchie] = null,
    name: java.lang.String = null
  ): OlapFlatDataSourceOptionsMetadataCubeDimension = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (hierarchies != null) __obj.updateDynamic("hierarchies")(hierarchies)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCubeDimension]
  }
}

