package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlTableDataSourceSettings
  extends /**
	 * Option for HtmlTableDataSourceSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Type of the data source.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object HtmlTableDataSourceSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for HtmlTableDataSourceSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `type`: java.lang.String = null
  ): HtmlTableDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HtmlTableDataSourceSettings]
  }
}

