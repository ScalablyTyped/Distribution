package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension
  extends /**
	 * Option for IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A caption for the dimension.
  	 */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An array of hierarchy metadata objects.
  	 */
  var hierarchies: js.UndefOr[
    js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie]
  ] = js.undefined
  /**
  	 * Optional="false" A unique name for the dimension.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    caption: java.lang.String = null,
    hierarchies: js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie] = null,
    name: java.lang.String = null
  ): IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (hierarchies != null) __obj.updateDynamic("hierarchies")(hierarchies)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension]
  }
}

