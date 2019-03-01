package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgBrowseButton
  extends /**
	 * Option for igBrowseButton
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var autoselect: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * M.H. 13 Feb 2014 Fix for bug #164347: Move input  from document body to the upload container
  	 */
  var container: js.UndefOr[js.Any] = js.undefined
  var multipleFiles: js.UndefOr[scala.Boolean] = js.undefined
}

object IgBrowseButton {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igBrowseButton
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    autoselect: js.UndefOr[scala.Boolean] = js.undefined,
    container: js.Any = null,
    multipleFiles: js.UndefOr[scala.Boolean] = js.undefined
  ): IgBrowseButton = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autoselect)) __obj.updateDynamic("autoselect")(autoselect)
    if (container != null) __obj.updateDynamic("container")(container)
    if (!js.isUndefined(multipleFiles)) __obj.updateDynamic("multipleFiles")(multipleFiles)
    __obj.asInstanceOf[IgBrowseButton]
  }
}

