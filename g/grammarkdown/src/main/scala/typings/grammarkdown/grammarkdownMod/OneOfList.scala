package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownMod.SyntaxKind.OfKeyword
import typings.grammarkdown.grammarkdownMod.SyntaxKind.OneKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "OneOfList")
@js.native
class OneOfList protected ()
  extends StObject
     with Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind.OneOfList] {
  def this(oneKeyword: Token[OneKeyword], ofKeyword: Unit, indented: Boolean) = this()
  def this(oneKeyword: Token[OneKeyword], ofKeyword: Token[OfKeyword], indented: Boolean) = this()
  def this(oneKeyword: Token[OneKeyword], ofKeyword: Unit, indented: Boolean, terminals: js.Array[Terminal]) = this()
  def this(
    oneKeyword: Token[OneKeyword],
    ofKeyword: Token[OfKeyword],
    indented: Boolean,
    terminals: js.Array[Terminal]
  ) = this()
  
  /* CompleteClass */
  var end: Double = js.native
  
  val indented: Boolean = js.native
  
  val ofKeyword: js.UndefOr[Token[OfKeyword]] = js.native
  
  val oneKeyword: Token[OneKeyword] = js.native
  
  /* CompleteClass */
  var pos: Double = js.native
  
  val terminals: js.UndefOr[js.Array[Terminal]] = js.native
  
  def update(): OneOfList = js.native
  def update(terminals: js.Array[Terminal]): OneOfList = js.native
}
