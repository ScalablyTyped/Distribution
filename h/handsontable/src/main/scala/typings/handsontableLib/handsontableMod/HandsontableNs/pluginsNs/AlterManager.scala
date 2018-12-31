package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterManager extends js.Object {
  var dataProvider: DataProvider
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core
  var matrix: Matrix
  var sheet: Sheet
  def destroy(): scala.Unit
  def prepareAlter(action: java.lang.String, args: js.Any): scala.Unit
  def triggerAlter(action: java.lang.String, args: js.Any): scala.Unit
}

