package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SyntaxKind.OfKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.OneKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "OneOfList")
@js.native
class OneOfList protected ()
  extends ProductionBodyBase[typings.grammarkdown.tokensMod.SyntaxKind.OneOfList]
     with ProductionBody {
  def this(oneKeyword: Token[OneKeyword], ofKeyword: js.UndefOr[scala.Nothing], indented: Boolean) = this()
  def this(oneKeyword: Token[OneKeyword], ofKeyword: Token[OfKeyword], indented: Boolean) = this()
  def this(
    oneKeyword: Token[OneKeyword],
    ofKeyword: js.UndefOr[scala.Nothing],
    indented: Boolean,
    terminals: js.Array[Terminal]
  ) = this()
  def this(
    oneKeyword: Token[OneKeyword],
    ofKeyword: Token[OfKeyword],
    indented: Boolean,
    terminals: js.Array[Terminal]
  ) = this()
  
  val indented: Boolean = js.native
  
  val ofKeyword: js.UndefOr[Token[OfKeyword]] = js.native
  
  val oneKeyword: Token[OneKeyword] = js.native
  
  val terminals: js.UndefOr[js.Array[Terminal]] = js.native
  
  def update(): OneOfList = js.native
  def update(terminals: js.Array[Terminal]): OneOfList = js.native
}
