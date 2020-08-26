package typings.katex.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("katex", "ParseError")
@js.native
class ParseError protected () extends Error {
  def this(message: String, lexer: js.Any, position: Double) = this()
  var position: Double = js.native
}

