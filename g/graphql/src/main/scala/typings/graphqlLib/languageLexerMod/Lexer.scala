package typings
package graphqlLib.languageLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lexer[TOptions] extends js.Object {
  /**
    * The previously focused non-ignored token.
    */
  var lastToken: graphqlLib.languageAstMod.Token
  /**
    * The (1-indexed) line containing the current token.
    */
  var line: scala.Double
  /**
    * The character offset at which the current line begins.
    */
  var lineStart: scala.Double
  var options: TOptions
  var source: graphqlLib.languageSourceMod.Source
  /**
    * The currently focused non-ignored token.
    */
  var token: graphqlLib.languageAstMod.Token
  /**
    * Advances the token stream to the next non-ignored token.
    */
  def advance(): graphqlLib.languageAstMod.Token
  /**
    * Looks ahead and returns the next non-ignored token, but does not change
    * the Lexer's state.
    */
  def lookahead(): graphqlLib.languageAstMod.Token
}

object Lexer {
  @scala.inline
  def apply[TOptions](
    advance: () => graphqlLib.languageAstMod.Token,
    lastToken: graphqlLib.languageAstMod.Token,
    line: scala.Double,
    lineStart: scala.Double,
    lookahead: () => graphqlLib.languageAstMod.Token,
    options: TOptions,
    source: graphqlLib.languageSourceMod.Source,
    token: graphqlLib.languageAstMod.Token
  ): Lexer[TOptions] = {
    val __obj = js.Dynamic.literal(advance = js.Any.fromFunction0(advance), lastToken = lastToken, line = line, lineStart = lineStart, lookahead = js.Any.fromFunction0(lookahead), options = options.asInstanceOf[js.Any], source = source, token = token)
  
    __obj.asInstanceOf[Lexer[TOptions]]
  }
}

