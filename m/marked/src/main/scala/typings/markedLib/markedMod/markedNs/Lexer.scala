package typings
package markedLib.markedMod.markedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lexer extends js.Object {
  def lex(src: java.lang.String): TokensList
  def token(src: java.lang.String, top: scala.Boolean): TokensList
}

object Lexer {
  @scala.inline
  def apply(lex: java.lang.String => TokensList, token: (java.lang.String, scala.Boolean) => TokensList): Lexer = {
    val __obj = js.Dynamic.literal(lex = js.Any.fromFunction1(lex), token = js.Any.fromFunction2(token))
  
    __obj.asInstanceOf[Lexer]
  }
}

