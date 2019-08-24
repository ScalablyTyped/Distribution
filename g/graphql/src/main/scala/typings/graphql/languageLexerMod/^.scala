package typings.graphql.languageLexerMod

import typings.graphql.languageAstMod.Token
import typings.graphql.languageSourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/lexer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createLexer[TOptions](source: Source, options: TOptions): Lexer[TOptions] = js.native
  def isPunctuatorToken(token: Token): Boolean = js.native
}

