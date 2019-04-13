package typings
package markedLib.markedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "Lexer")
@js.native
class Lexer () extends js.Object {
  def this(options: MarkedOptions) = this()
  def lex(src: java.lang.String): TokensList = js.native
  def token(src: java.lang.String, top: scala.Boolean): TokensList = js.native
}

/* static members */
@JSImport("marked", "Lexer")
@js.native
object Lexer extends js.Object {
  var rules: markedLib.markedMod.Rules = js.native
  def lex(src: markedLib.markedMod.TokensList): markedLib.markedMod.TokensList = js.native
  def lex(src: markedLib.markedMod.TokensList, options: markedLib.markedMod.MarkedOptions): markedLib.markedMod.TokensList = js.native
}

