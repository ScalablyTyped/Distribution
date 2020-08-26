package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SyntaxKind.ButKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.NotKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "ButNotSymbol")
@js.native
class ButNotSymbol protected ()
  extends Node[typings.grammarkdown.tokensMod.SyntaxKind.ButNotSymbol] {
  def this(left: LexicalSymbol) = this()
  def this(left: LexicalSymbol, butKeyword: Token[ButKeyword]) = this()
  def this(left: LexicalSymbol, butKeyword: js.UndefOr[scala.Nothing], notKeyword: Token[NotKeyword]) = this()
  def this(left: LexicalSymbol, butKeyword: Token[ButKeyword], notKeyword: Token[NotKeyword]) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: js.UndefOr[scala.Nothing],
    notKeyword: js.UndefOr[scala.Nothing],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: js.UndefOr[scala.Nothing],
    notKeyword: Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: Token[ButKeyword],
    notKeyword: js.UndefOr[scala.Nothing],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: Token[ButKeyword],
    notKeyword: Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
  val butKeyword: js.UndefOr[Token[ButKeyword]] = js.native
  val left: LexicalSymbol = js.native
  val notKeyword: js.UndefOr[Token[NotKeyword]] = js.native
  val right: js.UndefOr[LexicalSymbol] = js.native
  def update(left: LexicalSymbol): ButNotSymbol = js.native
  def update(left: LexicalSymbol, right: LexicalSymbol): ButNotSymbol = js.native
}

