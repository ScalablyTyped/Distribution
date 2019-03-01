package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDataSourceSettings
  extends /**
	 * Option for FunctionDataSourceSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Type of the data source.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object FunctionDataSourceSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for FunctionDataSourceSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `type`: java.lang.String = null
  ): FunctionDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FunctionDataSourceSettings]
  }
}

