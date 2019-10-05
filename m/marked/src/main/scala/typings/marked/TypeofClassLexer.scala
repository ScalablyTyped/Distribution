package typings.marked

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.marked.markedMod.Lexer
import typings.marked.markedMod.MarkedOptions
import typings.marked.markedMod.Rules
import typings.marked.markedMod.TokensList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassLexer
  extends Instantiable0[Lexer]
     with Instantiable1[/* options */ MarkedOptions, Lexer] {
  var rules: Rules = js.native
  def lex(src: TokensList): TokensList = js.native
  def lex(src: TokensList, options: MarkedOptions): TokensList = js.native
}

