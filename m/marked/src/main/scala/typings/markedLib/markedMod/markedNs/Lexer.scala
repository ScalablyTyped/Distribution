package typings
package markedLib.markedMod.markedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lexer extends js.Object {
  var rules: Rules
  var tokens: TokensList
  def lex(src: java.lang.String): TokensList
}

object Lexer {
  @scala.inline
  def apply(lex: java.lang.String => TokensList, rules: Rules, tokens: TokensList): Lexer = {
    val __obj = js.Dynamic.literal(lex = js.Any.fromFunction1(lex), rules = rules, tokens = tokens)
  
    __obj.asInstanceOf[Lexer]
  }
}

