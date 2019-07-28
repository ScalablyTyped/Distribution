package typings.grammarkdown.distStringwriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/stringwriter", "StringWriter")
@js.native
class StringWriter () extends js.Object {
  def this(eol: String) = this()
  var _depth: js.Any = js.native
  var _eol: js.Any = js.native
  var _indents: js.Any = js.native
  var _newLine: js.Any = js.native
  var _text: js.Any = js.native
  var flushNewLine: js.Any = js.native
  val size: Double = js.native
  def dedent(): Unit = js.native
  def indent(): Unit = js.native
  def write(): Unit = js.native
  def write(text: String): Unit = js.native
  def writeln(): Unit = js.native
  def writeln(text: String): Unit = js.native
}

