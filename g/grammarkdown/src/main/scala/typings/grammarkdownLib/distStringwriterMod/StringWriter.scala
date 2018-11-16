package typings
package grammarkdownLib.distStringwriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/stringwriter", "StringWriter")
@js.native
class StringWriter () extends js.Object {
  def this(eol: java.lang.String) = this()
  var _depth: js.Any = js.native
  var _eol: js.Any = js.native
  var _indents: js.Any = js.native
  var _newLine: js.Any = js.native
  var _text: js.Any = js.native
  var flushNewLine: js.Any = js.native
  val size: scala.Double = js.native
  def dedent(): scala.Unit = js.native
  def indent(): scala.Unit = js.native
  def write(): scala.Unit = js.native
  def write(text: java.lang.String): scala.Unit = js.native
  def writeln(): scala.Unit = js.native
  def writeln(text: java.lang.String): scala.Unit = js.native
}

