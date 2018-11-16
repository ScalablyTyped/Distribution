package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "ButNotSymbol")
@js.native
class ButNotSymbol protected ()
  extends LexicalSymbolBase[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(left: LexicalSymbol) = this()
  def this(left: LexicalSymbol, butKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(left: LexicalSymbol, butKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], notKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(left: LexicalSymbol, butKeyword: js.UndefOr[scala.Nothing], notKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(left: LexicalSymbol, butKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], notKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], right: LexicalSymbol) = this()
  def this(left: LexicalSymbol, butKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], notKeyword: js.UndefOr[scala.Nothing], right: LexicalSymbol) = this()
  def this(left: LexicalSymbol, butKeyword: js.UndefOr[scala.Nothing], notKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], right: LexicalSymbol) = this()
  def this(left: LexicalSymbol, butKeyword: js.UndefOr[scala.Nothing], notKeyword: js.UndefOr[scala.Nothing], right: LexicalSymbol) = this()
  val butKeyword: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  val left: LexicalSymbol = js.native
  val notKeyword: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  val right: js.UndefOr[LexicalSymbol] = js.native
  def update(left: LexicalSymbol): ButNotSymbol = js.native
  def update(left: LexicalSymbol, right: LexicalSymbol): ButNotSymbol = js.native
}

