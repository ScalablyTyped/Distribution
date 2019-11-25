package typings.handsontable.handsontableMod.Handsontable.formulas

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Settings {
  @scala.inline
  def apply(variables: StringDictionary[js.Any] = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

