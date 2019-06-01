package typings
package luaparseLib.luaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  def end(segment: java.lang.String): luaparseLib.libAstMod.Chunk
  def lex(): Token
  def write(segment: java.lang.String): scala.Unit
}

object Parser {
  @scala.inline
  def apply(
    end: java.lang.String => luaparseLib.libAstMod.Chunk,
    lex: () => Token,
    write: java.lang.String => scala.Unit
  ): Parser = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), lex = js.Any.fromFunction0(lex), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[Parser]
  }
}

