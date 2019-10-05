package typings.handsontable.handsontableMod.Handsontable.autoRowSize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var syncLimit: js.UndefOr[String | Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(syncLimit: String | Double = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (syncLimit != null) __obj.updateDynamic("syncLimit")(syncLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

