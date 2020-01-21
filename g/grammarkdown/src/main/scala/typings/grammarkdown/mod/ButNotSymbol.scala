package typings.grammarkdown.mod

import typings.grammarkdown.nodesMod.LexicalSymbol
import typings.grammarkdown.tokensMod.SyntaxKind.ButKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.NotKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ButNotSymbol")
@js.native
class ButNotSymbol protected ()
  extends typings.grammarkdown.nodesMod.ButNotSymbol {
  def this(left: LexicalSymbol) = this()
  def this(left: LexicalSymbol, butKeyword: typings.grammarkdown.nodesMod.Token[ButKeyword]) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: js.UndefOr[scala.Nothing],
    notKeyword: typings.grammarkdown.nodesMod.Token[NotKeyword]
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typings.grammarkdown.nodesMod.Token[ButKeyword],
    notKeyword: typings.grammarkdown.nodesMod.Token[NotKeyword]
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: js.UndefOr[scala.Nothing],
    notKeyword: js.UndefOr[scala.Nothing],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: js.UndefOr[scala.Nothing],
    notKeyword: typings.grammarkdown.nodesMod.Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typings.grammarkdown.nodesMod.Token[ButKeyword],
    notKeyword: js.UndefOr[scala.Nothing],
    right: LexicalSymbol
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typings.grammarkdown.nodesMod.Token[ButKeyword],
    notKeyword: typings.grammarkdown.nodesMod.Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
}

