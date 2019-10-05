package typings.graphql.graphqlMod

import typings.graphql.languageLexerMod.Lexer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "createLexer")
@js.native
object createLexer extends js.Object {
  def apply[TOptions](source: typings.graphql.languageSourceMod.Source, options: TOptions): Lexer[TOptions] = js.native
}

