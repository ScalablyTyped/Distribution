package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgUploadFileExtensionIcons
  extends /**
	 * Option for IgUploadFileExtensionIcons
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Css classes which sets icon.
  	 */
  var css: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Default icons when the file extension is not found. It is taken only the first item which have def set to true, other are ignored.
  	 */
  var `def`: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Array of string for file extensions
  	 */
  var ext: js.UndefOr[js.Array[_]] = js.undefined
}

object IgUploadFileExtensionIcons {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgUploadFileExtensionIcons
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    css: java.lang.String = null,
    `def`: js.UndefOr[scala.Boolean] = js.undefined,
    ext: js.Array[_] = null
  ): IgUploadFileExtensionIcons = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (css != null) __obj.updateDynamic("css")(css)
    if (!js.isUndefined(`def`)) __obj.updateDynamic("def")(`def`)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    __obj.asInstanceOf[IgUploadFileExtensionIcons]
  }
}

