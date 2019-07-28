package typings.handsontable

import typings.handsontable.handsontableMod.underscoreHandsontableNs.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Col extends js.Object {
  var col: Double
  var dateFormat: js.UndefOr[String] = js.undefined
  var instance: Core
  var row: Double
  var `type`: String
  var visualCol: Double
  var visualRow: Double
}

object Anon_Col {
  @scala.inline
  def apply(
    col: Double,
    instance: Core,
    row: Double,
    `type`: String,
    visualCol: Double,
    visualRow: Double,
    dateFormat: String = null
  ): Anon_Col = {
    val __obj = js.Dynamic.literal(col = col, instance = instance, row = row, visualCol = visualCol, visualRow = visualRow)
    __obj.updateDynamic("type")(`type`)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    __obj.asInstanceOf[Anon_Col]
  }
}

