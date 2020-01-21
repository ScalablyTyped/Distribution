package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MashupDataSourceMashupSettings
  extends /**
	 * Option for MashupDataSourceMashupSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * An array of $.ig.DataSource instances holding the disperse data.
  	 */
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Indicates whether to ignore records that have no corresponding data in all of the provided data sources.
  	 */
  var ignorePartialRecords: js.UndefOr[Boolean] = js.undefined
}

object MashupDataSourceMashupSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for MashupDataSourceMashupSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    dataSource: js.Array[_] = null,
    ignorePartialRecords: js.UndefOr[Boolean] = js.undefined
  ): MashupDataSourceMashupSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePartialRecords)) __obj.updateDynamic("ignorePartialRecords")(ignorePartialRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[MashupDataSourceMashupSettings]
  }
}

