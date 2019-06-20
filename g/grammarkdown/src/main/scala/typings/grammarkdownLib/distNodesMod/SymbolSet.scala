package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "SymbolSet")
@js.native
class SymbolSet protected ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind.SymbolSet] {
  def this(openBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBraceToken]) = this()
  def this(openBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBraceToken], elements: js.Array[SymbolSpan]) = this()
  def this(openBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBraceToken], elements: js.UndefOr[scala.Nothing], closeBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBraceToken]) = this()
  def this(openBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBraceToken], elements: js.Array[SymbolSpan], closeBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBraceToken]) = this()
  val closeBraceToken: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBraceToken]] = js.native
  val elements: js.UndefOr[js.Array[SymbolSpan]] = js.native
  val openBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBraceToken] = js.native
  def update(): SymbolSet = js.native
  def update(elements: js.Array[SymbolSpan]): SymbolSet = js.native
}

