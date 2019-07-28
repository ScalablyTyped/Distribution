package typings.luaparse.luaparseMod

import typings.luaparse.libAstMod.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  def end(segment: String): Chunk
  def lex(): Token
  def write(segment: String): Unit
}

object Parser {
  @scala.inline
  def apply(end: String => Chunk, lex: () => Token, write: String => Unit): Parser = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), lex = js.Any.fromFunction0(lex), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[Parser]
  }
}

