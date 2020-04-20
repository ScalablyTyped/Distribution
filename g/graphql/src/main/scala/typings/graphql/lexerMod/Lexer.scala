package typings.graphql.lexerMod

import typings.graphql.astMod.Token
import typings.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lexer[TOptions] extends js.Object {
  /**
    * The previously focused non-ignored token.
    */
  var lastToken: Token
  /**
    * The (1-indexed) line containing the current token.
    */
  var line: Double
  /**
    * The character offset at which the current line begins.
    */
  var lineStart: Double
  var options: TOptions
  var source: Source
  /**
    * The currently focused non-ignored token.
    */
  var token: Token
  /**
    * Advances the token stream to the next non-ignored token.
    */
  def advance(): Token
  /**
    * Looks ahead and returns the next non-ignored token, but does not change
    * the Lexer's state.
    */
  def lookahead(): Token
}

object Lexer {
  @scala.inline
  def apply[TOptions](
    advance: () => Token,
    lastToken: Token,
    line: Double,
    lineStart: Double,
    lookahead: () => Token,
    options: TOptions,
    source: Source,
    token: Token
  ): Lexer[TOptions] = {
    val __obj = js.Dynamic.literal(advance = js.Any.fromFunction0(advance), lastToken = lastToken.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], lookahead = js.Any.fromFunction0(lookahead), options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lexer[TOptions]]
  }
}

