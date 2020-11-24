package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SyntaxKind.OfKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.OneKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "OneOfSymbol")
@js.native
class OneOfSymbol protected ()
  extends Node[typings.grammarkdown.tokensMod.SyntaxKind.OneOfSymbol]
     with _LexicalSymbol {
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
