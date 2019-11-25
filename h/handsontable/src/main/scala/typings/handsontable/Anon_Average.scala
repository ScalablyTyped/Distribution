package typings.handsontable

import typings.handsontable.handsontableStrings.average
import typings.handsontable.handsontableStrings.count
import typings.handsontable.handsontableStrings.max
import typings.handsontable.handsontableStrings.min
import typings.handsontable.handsontableStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Average extends js.Object {
  var `type`: sum | min | max | count | average
}

object Anon_Average {
  @scala.inline
  def apply(`type`: sum | min | max | count | average): Anon_Average = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Average]
  }
}

