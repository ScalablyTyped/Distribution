package typings.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jss", "SheetsRegistry")
@js.native
class SheetsRegistry () extends js.Object {
  
  def add[RuleName /* <: String | Double | js.Symbol */](sheet: StyleSheet[RuleName]): Unit = js.native
  
  val index: Double = js.native
  
  var registry: js.Array[StyleSheet[String | Double | js.Symbol]] = js.native
  
  def remove[RuleName /* <: String | Double | js.Symbol */](sheet: StyleSheet[RuleName]): Unit = js.native
  
  def reset(): Unit = js.native
  
  def toString(options: ToCssOptions): String = js.native
}
