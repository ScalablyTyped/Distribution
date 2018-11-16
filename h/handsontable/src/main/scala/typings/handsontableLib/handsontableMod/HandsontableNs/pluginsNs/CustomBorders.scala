package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomBorders extends Base {
  var savedBorderSettings: js.Array[_] = js.native
  def clearBorders(
    selection: js.Array[
      (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | stdLib.Range
    ]
  ): scala.Unit = js.native
  def getBorders(
    selection: js.Array[
      (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | stdLib.Range
    ]
  ): js.Array[js.Array[js.Object]] = js.native
  def setBorders(
    selection: js.Array[
      (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | stdLib.Range
    ],
    borderObject: js.Object
  ): scala.Unit = js.native
}

