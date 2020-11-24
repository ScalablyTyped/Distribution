package typings.grammarkdown.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "UsageWriter")
@js.native
class UsageWriter protected () extends js.Object {
  def this(margin: Double, padding: Double) = this()
  
  var fit: js.Any = js.native
  
  var margin: js.Any = js.native
  
  var padding: js.Any = js.native
  
  var remainder: js.Any = js.native
  
  def writeOption(): Unit = js.native
  def writeOption(left: js.UndefOr[scala.Nothing], right: String): Unit = js.native
  def writeOption(left: String): Unit = js.native
  def writeOption(left: String, right: String): Unit = js.native
  
  def writeln(): Unit = js.native
  def writeln(text: String): Unit = js.native
}
