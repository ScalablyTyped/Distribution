package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "StringWriter")
@js.native
class StringWriter () extends StObject {
  def this(eol: String) = this()
  
  var _depth: js.Any = js.native
  
  var _eol: js.Any = js.native
  
  var _indents: js.Any = js.native
  
  var _newLine: js.Any = js.native
  
  var _text: js.Any = js.native
  
  def dedent(): Unit = js.native
  
  var flushNewLine: js.Any = js.native
  
  def indent(): Unit = js.native
  
  def size: Double = js.native
  
  def write(): Unit = js.native
  def write(text: String): Unit = js.native
  
  def writeln(): Unit = js.native
  def writeln(text: String): Unit = js.native
}
