package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "SymbolSet")
@js.native
class SymbolSet protected ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(openBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], elements: js.Array[SymbolSpan]) = this()
  def this(openBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], elements: js.Array[SymbolSpan], closeBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], elements: js.UndefOr[scala.Nothing], closeBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  val closeBraceToken: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  val elements: js.UndefOr[js.Array[SymbolSpan]] = js.native
  val openBraceToken: Token[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
  def update(): SymbolSet = js.native
  def update(elements: js.Array[SymbolSpan]): SymbolSet = js.native
}

