package typings.marked.markedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "Lexer")
@js.native
class Lexer () extends js.Object {
  def this(options: MarkedOptions) = this()
  var options: MarkedOptions = js.native
  var rules: Rules = js.native
  var tokens: TokensList = js.native
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

@JSImport("marked", "lexer")
@js.native
object lexer extends js.Object {
  /**
    * @param src String of markdown source to be compiled
    * @param options Hash of options
    */
  def apply(src: String): TokensList = js.native
  def apply(src: String, options: MarkedOptions): TokensList = js.native
}

