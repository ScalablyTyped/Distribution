package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgComboGrouping
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies the sort order - ascending or descending.
    *
    *
    * Valid values:
    * "asc"
    * "desc"
    */
  var dir: js.UndefOr[String] = js.undefined
  /**
    * Gets/Sets name of column by which the records will be grouped. Setting this option enables the grouping.
    *
    */
  var key: js.UndefOr[String] = js.undefined
}

object IgComboGrouping {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    dir: String = null,
    key: String = null
  ): IgComboGrouping = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgComboGrouping]
  }
}

