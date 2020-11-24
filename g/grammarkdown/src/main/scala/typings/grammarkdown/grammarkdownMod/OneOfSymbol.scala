package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownMod.SyntaxKind.OfKeyword
import typings.grammarkdown.grammarkdownMod.SyntaxKind.OneKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "OneOfSymbol")
@js.native
class OneOfSymbol protected ()
  extends Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind.OneOfSymbol] {
  def this(oneKeyword: Token[OneKeyword]) = this()
  def this(oneKeyword: Token[OneKeyword], ofKeyword: Token[OfKeyword]) = this()
  def this(
    oneKeyword: Token[OneKeyword],
    ofKeyword: js.UndefOr[scala.Nothing],
    symbols: js.Array[LexicalSymbol]
  ) = this()
  def this(oneKeyword: Token[OneKeyword], ofKeyword: Token[OfKeyword], symbols: js.Array[LexicalSymbol]) = this()
  
  val ofKeyword: js.UndefOr[Token[OfKeyword]] = js.native
  
  val oneKeyword: Token[OneKeyword] = js.native
  
  val symbols: js.UndefOr[js.Array[LexicalSymbol]] = js.native
  
  def update(): OneOfSymbol = js.native
  def update(symbols: js.Array[LexicalSymbol]): OneOfSymbol = js.native
}
