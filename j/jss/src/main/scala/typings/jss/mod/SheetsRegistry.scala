package typings.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jss", "SheetsRegistry")
@js.native
class SheetsRegistry () extends js.Object {
  val index: Double = js.native
  def add[RuleName /* <: String | Double | js.Symbol */](sheet: StyleSheet[RuleName]): Unit = js.native
  def remove[RuleName /* <: String | Double | js.Symbol */](sheet: StyleSheet[RuleName]): Unit = js.native
  def reset(): Unit = js.native
  def toString(options: ToCssOptions): String = js.native
}

