package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.OfKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.OneKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "OneOfList")
@js.native
open class OneOfList protected ()
  extends ProductionBodyBase[typings.grammarkdown.distTokensMod.SyntaxKind.OneOfList]
     with ProductionBody {
  def this(oneKeyword: Token[OneKeyword], ofKeyword: Unit, indented: Boolean) = this()
  def this(oneKeyword: Token[OneKeyword], ofKeyword: Token[OfKeyword], indented: Boolean) = this()
  def this(
    oneKeyword: Token[OneKeyword],
    ofKeyword: Unit,
    indented: Boolean,
    terminals: js.Array[TerminalLiteral]
  ) = this()
  def this(
    oneKeyword: Token[OneKeyword],
    ofKeyword: Token[OfKeyword],
    indented: Boolean,
    terminals: js.Array[TerminalLiteral]
  ) = this()
  
  val indented: Boolean = js.native
  
  val ofKeyword: js.UndefOr[Token[OfKeyword]] = js.native
  
  val oneKeyword: Token[OneKeyword] = js.native
  
  val terminals: js.UndefOr[js.Array[TerminalLiteral]] = js.native
  
  def update(): OneOfList = js.native
  def update(terminals: js.Array[TerminalLiteral]): OneOfList = js.native
}
