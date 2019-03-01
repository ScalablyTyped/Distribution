package typings
package handsontableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Col extends js.Object {
  var col: scala.Double
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  var instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core
  var row: scala.Double
  var `type`: java.lang.String
  var visualCol: scala.Double
  var visualRow: scala.Double
}

object Anon_Col {
  @scala.inline
  def apply(
    col: scala.Double,
    instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    row: scala.Double,
    `type`: java.lang.String,
    visualCol: scala.Double,
    visualRow: scala.Double,
    dateFormat: java.lang.String = null
  ): Anon_Col = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("col")(col)
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("row")(row)
    __obj.updateDynamic("visualCol")(visualCol)
    __obj.updateDynamic("visualRow")(visualRow)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    __obj.asInstanceOf[Anon_Col]
  }
}

