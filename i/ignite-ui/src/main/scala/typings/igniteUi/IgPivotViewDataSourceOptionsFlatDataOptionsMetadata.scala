package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewDataSourceOptionsFlatDataOptionsMetadata
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Optional="false" Metadata used for the creation of the cube.
    */
  var cube: js.UndefOr[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube] = js.undefined
}

object IgPivotViewDataSourceOptionsFlatDataOptionsMetadata {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    cube: IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube = null
  ): IgPivotViewDataSourceOptionsFlatDataOptionsMetadata = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cube != null) __obj.updateDynamic("cube")(cube.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsFlatDataOptionsMetadata]
  }
}

