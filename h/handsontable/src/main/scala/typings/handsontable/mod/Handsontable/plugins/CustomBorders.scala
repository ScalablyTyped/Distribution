package typings.handsontable.mod.Handsontable.plugins

import typings.std.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomBorders extends Base {
  
  def clearBorders(selection: js.Array[Range | (js.Tuple4[Double, Double, Double, Double])]): Unit = js.native
  
  def getBorders(selection: js.Array[Range | (js.Tuple4[Double, Double, Double, Double])]): js.Array[js.Array[js.Object]] = js.native
  
  var savedBorderSettings: js.Array[_] = js.native
  
  def setBorders(selection: js.Array[Range | (js.Tuple4[Double, Double, Double, Double])], borderObject: js.Object): Unit = js.native
}
