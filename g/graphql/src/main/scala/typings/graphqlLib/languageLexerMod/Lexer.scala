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

