package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapFlatDataSourceOptionsMetadata
  extends /**
	 * Option for OlapFlatDataSourceOptionsMetadata
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Optional="false" Metadata used for the creation of the cube.
  	 */
  var cube: js.UndefOr[OlapFlatDataSourceOptionsMetadataCube] = js.undefined
}

object OlapFlatDataSourceOptionsMetadata {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapFlatDataSourceOptionsMetadata
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    cube: OlapFlatDataSourceOptionsMetadataCube = null
  ): OlapFlatDataSourceOptionsMetadata = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cube != null) __obj.updateDynamic("cube")(cube.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadata]
  }
}

