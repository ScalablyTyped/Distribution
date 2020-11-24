package typings.humanDate.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("human-date", "prettyPrint")
@js.native
object prettyPrint extends js.Object {
  
  def apply(arg: String): String = js.native
  def apply(arg: String, options: PrettyPrintOptions): String = js.native
  def apply(arg: Double): String = js.native
  def apply(arg: Double, options: PrettyPrintOptions): String = js.native
  def apply(arg: Date): String = js.native
  def apply(arg: Date, options: PrettyPrintOptions): String = js.native
}
