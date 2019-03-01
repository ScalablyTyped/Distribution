package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewDataSourceOptionsFlatDataOptionsMetadata
  extends /**
	 * Option for IgPivotViewDataSourceOptionsFlatDataOptionsMetadata
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Optional="false" Metadata used for the creation of the cube.
  	 */
  var cube: js.UndefOr[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube] = js.undefined
}

object IgPivotViewDataSourceOptionsFlatDataOptionsMetadata {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotViewDataSourceOptionsFlatDataOptionsMetadata
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    cube: IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube = null
  ): IgPivotViewDataSourceOptionsFlatDataOptionsMetadata = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cube != null) __obj.updateDynamic("cube")(cube)
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsFlatDataOptionsMetadata]
  }
}

