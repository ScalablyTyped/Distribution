package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata
  extends /**
	 * Option for IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Optional="false" Metadata used for the creation of the cube.
  	 */
  var cube: js.UndefOr[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube] = js.undefined
}

object IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    cube: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube = null
  ): IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cube != null) __obj.updateDynamic("cube")(cube)
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata]
  }
}

