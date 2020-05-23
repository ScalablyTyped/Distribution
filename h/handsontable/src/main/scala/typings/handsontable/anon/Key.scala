package typings.handsontable.anon

import typings.handsontable.mod.Handsontable.plugins.FiltersPlugin.ConditionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: ConditionName
}

object Key {
  @scala.inline
  def apply(key: ConditionName): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

