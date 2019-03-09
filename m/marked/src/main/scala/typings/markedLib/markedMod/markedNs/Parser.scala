package typings
package markedLib.markedMod.markedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  def next(): Token
  def parse(src: TokensList): java.lang.String
  def parseText(): java.lang.String
  def peek(): Token | scala.Double
  def tok(): java.lang.String
}

object Parser {
  @scala.inline
  def apply(
    next: js.Function0[Token],
    parse: js.Function1[TokensList, java.lang.String],
    parseText: js.Function0[java.lang.String],
    peek: js.Function0[Token | scala.Double],
    tok: js.Function0[java.lang.String]
  ): Parser = {
    val __obj = js.Dynamic.literal(next = next, parse = parse, parseText = parseText, peek = peek, tok = tok)
  
    __obj.asInstanceOf[Parser]
  }
}

