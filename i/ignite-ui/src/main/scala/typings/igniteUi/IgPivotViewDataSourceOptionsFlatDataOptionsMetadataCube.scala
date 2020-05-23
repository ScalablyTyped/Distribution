package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * A caption for the cube.
    */
  var caption: js.UndefOr[String] = js.undefined
  /**
    * An array of dimension metadata objects.
    */
  var dimensions: js.UndefOr[js.Array[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension]] = js.undefined
  /**
    * An object providing information about the measures' root node.
    */
  var measuresDimension: js.UndefOr[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension] = js.undefined
  /**
    * Optional="false" A unique name for the cube.
    */
  var name: js.UndefOr[String] = js.undefined
}

object IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    caption: String = null,
    dimensions: js.Array[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension] = null,
    measuresDimension: IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension = null,
    name: String = null
  ): IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (measuresDimension != null) __obj.updateDynamic("measuresDimension")(measuresDimension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube]
  }
}

