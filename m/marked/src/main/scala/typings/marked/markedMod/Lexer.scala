package typings.marked.markedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "Lexer")
@js.native
class Lexer () extends js.Object {
  def this(options: MarkedOptions) = this()
  def lex(src: String): TokensList = js.native
  def token(src: String, top: Boolean): TokensList = js.native
}

/* static members */
@JSImport("marked", "Lexer")
@js.native
object Lexer extends js.Object {
  var rules: Rules = js.native
  def lex(src: TokensList): TokensList = js.native
  def lex(src: TokensList, options: MarkedOptions): TokensList = js.native
}

