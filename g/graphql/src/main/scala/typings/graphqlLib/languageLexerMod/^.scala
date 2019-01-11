package typings
package graphqlLib.languageLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/lexer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TokenKind: graphqlLib.languageLexerMod._TokenKind = js.native
  def createLexer[TOptions](source: graphqlLib.languageSourceMod.Source, options: TOptions): graphqlLib.languageLexerMod.Lexer[TOptions] = js.native
  def getTokenDesc(token: graphqlLib.languageAstMod.Token): java.lang.String = js.native
}

