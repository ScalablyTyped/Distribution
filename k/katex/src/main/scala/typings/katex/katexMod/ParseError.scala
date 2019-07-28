package typings.katex.katexMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("katex", "ParseError")
@js.native
class ParseError protected () extends Error {
  def this(message: String, lexer: js.Any, position: Double) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var position: Double = js.native
}

