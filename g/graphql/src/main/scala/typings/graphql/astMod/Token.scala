package typings.graphql.astMod

import typings.graphql.tokenKindMod.TokenKindEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /**
    * The 1-indexed column number at which this Token begins.
    */
  val column: Double
  /**
    * The character offset at which this Node ends.
    */
  val end: Double
  /**
    * The kind of Token.
    */
  val kind: TokenKindEnum
  /**
    * The 1-indexed line number on which this Token appears.
    */
  val line: Double
  val next: Token | Null
  /**
    * Tokens exist as nodes in a double-linked-list amongst all tokens
    * including ignored tokens. <SOF> is always the first node and <EOF>
    * the last.
    */
  val prev: Token | Null
  /**
    * The character offset at which this Node begins.
    */
  val start: Double
  /**
    * For non-punctuation tokens, represents the interpreted value of the token.
    */
  val value: js.UndefOr[String] = js.undefined
}

object Token {
  @scala.inline
  def apply(
    column: Double,
    end: Double,
    kind: TokenKindEnum,
    line: Double,
    start: Double,
    next: Token = null,
    prev: Token = null,
    value: String = null
  ): Token = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

