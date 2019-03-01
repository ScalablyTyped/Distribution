package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension
  extends /**
	 * Option for IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension
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
    js.Array[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie]
  ] = js.undefined
  /**
  	 * Optional="false" A unique name for the dimension.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    caption: java.lang.String = null,
    hierarchies: js.Array[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie] = null,
    name: java.lang.String = null
  ): IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (hierarchies != null) __obj.updateDynamic("hierarchies")(hierarchies)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension]
  }
}

