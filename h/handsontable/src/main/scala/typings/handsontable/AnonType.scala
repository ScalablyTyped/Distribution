package typings.handsontable

import typings.handsontable.handsontableStrings.average
import typings.handsontable.handsontableStrings.count
import typings.handsontable.handsontableStrings.max
import typings.handsontable.handsontableStrings.min
import typings.handsontable.handsontableStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: sum | min | max | count | average
}

object AnonType {
  @scala.inline
  def apply(`type`: sum | min | max | count | average): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

