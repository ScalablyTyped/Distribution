package typings.marked

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.marked.mod.Lexer_
import typings.marked.mod.MarkedOptions
import typings.marked.mod.Rules
import typings.marked.mod.TokensList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassLexer
  extends Instantiable0[Lexer_]
     with Instantiable1[/* options */ MarkedOptions, Lexer_] {
  var rules: Rules = js.native
  def lex(src: TokensList): TokensList = js.native
  def lex(src: TokensList, options: MarkedOptions): TokensList = js.native
}

