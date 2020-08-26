package typings.graphql

import typings.graphql.astMod.Token
import typings.graphql.sourceMod.Source
import typings.graphql.tokenKindMod.TokenKindEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/lexer", JSImport.Namespace)
@js.native
object lexerMod extends js.Object {
  @js.native
  class Lexer protected () extends js.Object {
    def this(source: Source) = this()
    /**
      * The previously focused non-ignored token.
      */
    var lastToken: Token = js.native
    /**
      * The (1-indexed) line containing the current token.
      */
    var line: Double = js.native
    /**
      * The character offset at which the current line begins.
      */
    var lineStart: Double = js.native
    var source: Source = js.native
    /**
      * The currently focused non-ignored token.
      */
    var token: Token = js.native
    /**
      * Advances the token stream to the next non-ignored token.
      */
    def advance(): Token = js.native
    /**
      * Looks ahead and returns the next non-ignored token, but does not change
      * the state of Lexer.
      */
    def lookahead(): Token = js.native
  }
  
  def isPunctuatorToken(token: Token): Boolean = js.native
  def isPunctuatorTokenKind(kind: TokenKindEnum): Boolean = js.native
}

