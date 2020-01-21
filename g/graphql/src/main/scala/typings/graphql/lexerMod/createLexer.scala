package typings.graphql.lexerMod

import typings.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/lexer", "createLexer")
@js.native
object createLexer extends js.Object {
  def apply[TOptions](source: Source, options: TOptions): Lexer[TOptions] = js.native
}

