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
    next: () => Token,
    parse: TokensList => java.lang.String,
    parseText: () => java.lang.String,
    peek: () => Token | scala.Double,
    tok: () => java.lang.String
  ): Parser = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), parse = js.Any.fromFunction1(parse), parseText = js.Any.fromFunction0(parseText), peek = js.Any.fromFunction0(peek), tok = js.Any.fromFunction0(tok))
  
    __obj.asInstanceOf[Parser]
  }
}

