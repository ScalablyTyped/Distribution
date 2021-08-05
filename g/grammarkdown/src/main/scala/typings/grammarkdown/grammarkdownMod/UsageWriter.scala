package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "UsageWriter")
@js.native
class UsageWriter protected () extends StObject {
  def this(margin: Double, padding: Double) = this()
  
  /* private */ var fit: js.Any = js.native
  
  /* private */ var margin: js.Any = js.native
  
  /* private */ var padding: js.Any = js.native
  
  /* private */ var remainder: js.Any = js.native
  
  def writeOption(): Unit = js.native
  def writeOption(left: String): Unit = js.native
  def writeOption(left: String, right: String): Unit = js.native
  def writeOption(left: Unit, right: String): Unit = js.native
  
  def writeln(): Unit = js.native
  def writeln(text: String): Unit = js.native
}
