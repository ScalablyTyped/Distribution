package typings.handsontable

import typings.handsontable.mod.Handsontable.plugins.FiltersPlugin.ConditionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: ConditionName
}

object AnonKey {
  @scala.inline
  def apply(key: ConditionName): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

