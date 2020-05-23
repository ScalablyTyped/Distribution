package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDataSourceSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Type of the data source.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object FunctionDataSourceSettings {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, `type`: String = null): FunctionDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDataSourceSettings]
  }
}

