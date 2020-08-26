package typings.graphql.astMod

import typings.graphql.anon.Column
import typings.graphql.tokenKindMod.TokenKindEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/ast", "Token")
@js.native
class Token protected () extends js.Object {
  def this(kind: TokenKindEnum, start: Double, end: Double, line: Double, column: Double) = this()
  def this(kind: TokenKindEnum, start: Double, end: Double, line: Double, column: Double, prev: Token) = this()
  def this(
    kind: TokenKindEnum,
    start: Double,
    end: Double,
    line: Double,
    column: Double,
    prev: Null,
    value: String
  ) = this()
  def this(
    kind: TokenKindEnum,
    start: Double,
    end: Double,
    line: Double,
    column: Double,
    prev: Token,
    value: String
  ) = this()
  /**
    * The 1-indexed column number at which this Token begins.
    */
  val column: Double = js.native
  /**
    * The character offset at which this Node ends.
    */
  val end: Double = js.native
  /**
    * The kind of Token.
    */
  val kind: TokenKindEnum = js.native
  /**
    * The 1-indexed line number on which this Token appears.
    */
  val line: Double = js.native
  val next: Token | Null = js.native
  /**
    * Tokens exist as nodes in a double-linked-list amongst all tokens
    * including ignored tokens. <SOF> is always the first node and <EOF>
    * the last.
    */
  val prev: Token | Null = js.native
  /**
    * The character offset at which this Node begins.
    */
  val start: Double = js.native
  /**
    * For non-punctuation tokens, represents the interpreted value of the token.
    */
  val value: js.UndefOr[String] = js.native
  def toJSON(): Column = js.native
}

