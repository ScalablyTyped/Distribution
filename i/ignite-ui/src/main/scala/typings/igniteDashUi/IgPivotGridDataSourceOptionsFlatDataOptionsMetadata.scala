package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadata
  extends /**
	 * Option for IgPivotGridDataSourceOptionsFlatDataOptionsMetadata
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Optional="false" Metadata used for the creation of the cube.
  	 */
  var cube: js.UndefOr[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube] = js.undefined
}

object IgPivotGridDataSourceOptionsFlatDataOptionsMetadata {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotGridDataSourceOptionsFlatDataOptionsMetadata
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    cube: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube = null
  ): IgPivotGridDataSourceOptionsFlatDataOptionsMetadata = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cube != null) __obj.updateDynamic("cube")(cube)
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptionsMetadata]
  }
}

