package typings.graphql.mod

import typings.graphql.tokenKindMod.TokenKindEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "Token")
@js.native
class Token protected ()
  extends typings.graphql.languageMod.Token {
  def this(kind: TokenKindEnum, start: Double, end: Double, line: Double, column: Double) = this()
  def this(
    kind: TokenKindEnum,
    start: Double,
    end: Double,
    line: Double,
    column: Double,
    prev: typings.graphql.astMod.Token
  ) = this()
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
    prev: typings.graphql.astMod.Token,
    value: String
  ) = this()
}

