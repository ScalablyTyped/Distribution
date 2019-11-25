package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlTableDataSourceSettings
  extends /**
	 * Option for HtmlTableDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Type of the data source.
  	 */
  var `type`: js.UndefOr[String] = js.undefined
}

object HtmlTableDataSourceSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for HtmlTableDataSourceSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    `type`: String = null
  ): HtmlTableDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlTableDataSourceSettings]
  }
}

