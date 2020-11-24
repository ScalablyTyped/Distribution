package typings.luaparse.mod

import typings.luaparse.astMod.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser extends js.Object {
  
  def end(segment: String): Chunk = js.native
  
  def lex(): Token = js.native
  
  def write(segment: String): Unit = js.native
}
object Parser {
  
  @scala.inline
  def apply(end: String => Chunk, lex: () => Token, write: String => Unit): Parser = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), lex = js.Any.fromFunction0(lex), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Parser]
  }
  
  @scala.inline
  implicit class ParserOps[Self <: Parser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnd(value: String => Chunk): Self = this.set("end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLex(value: () => Token): Self = this.set("lex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWrite(value: String => Unit): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
