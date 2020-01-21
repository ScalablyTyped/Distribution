package typings.graphql.mod

import typings.graphql.lexerMod.Lexer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "createLexer")
@js.native
object createLexer extends js.Object {
  def apply[TOptions](source: typings.graphql.sourceMod.Source, options: TOptions): Lexer[TOptions] = js.native
}

