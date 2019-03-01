package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube
  extends /**
	 * Option for IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A caption for the cube.
  	 */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An array of dimension metadata objects.
  	 */
  var dimensions: js.UndefOr[js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension]] = js.undefined
  /**
  	 * An object providing information about the measures' root node.
  	 */
  var measuresDimension: js.UndefOr[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension] = js.undefined
  /**
  	 * Optional="false" A unique name for the cube.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    caption: java.lang.String = null,
    dimensions: js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension] = null,
    measuresDimension: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension = null,
    name: java.lang.String = null
  ): IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (measuresDimension != null) __obj.updateDynamic("measuresDimension")(measuresDimension)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube]
  }
}

