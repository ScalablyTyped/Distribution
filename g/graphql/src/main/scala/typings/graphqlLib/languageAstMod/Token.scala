package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /**
    * The 1-indexed column number at which this Token begins.
    */
  val column: scala.Double
  /**
    * The character offset at which this Node ends.
    */
  val end: scala.Double
  /**
    * The kind of Token.
    */
  val kind: graphqlLib.languageLexerMod.TokenKindEnum
  /**
    * The 1-indexed line number on which this Token appears.
    */
  val line: scala.Double
  val next: Token | scala.Null
  /**
    * Tokens exist as nodes in a double-linked-list amongst all tokens
    * including ignored tokens. <SOF> is always the first node and <EOF>
    * the last.
    */
  val prev: Token | scala.Null
  /**
    * The character offset at which this Node begins.
    */
  val start: scala.Double
  /**
    * For non-punctuation tokens, represents the interpreted value of the token.
    */
  val value: js.UndefOr[java.lang.String]
}

