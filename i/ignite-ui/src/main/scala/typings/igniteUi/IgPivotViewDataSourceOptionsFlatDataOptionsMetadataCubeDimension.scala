package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * A caption for the dimension.
    */
  var caption: js.UndefOr[String] = js.undefined
  /**
    * An array of hierarchy metadata objects.
    */
  var hierarchies: js.UndefOr[
    js.Array[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie]
  ] = js.undefined
  /**
    * Optional="false" A unique name for the dimension.
    */
  var name: js.UndefOr[String] = js.undefined
}

object IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    caption: String = null,
    hierarchies: js.Array[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimensionHierarchie] = null,
    name: String = null
  ): IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (hierarchies != null) __obj.updateDynamic("hierarchies")(hierarchies.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension]
  }
}

