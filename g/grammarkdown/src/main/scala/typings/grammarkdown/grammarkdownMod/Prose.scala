package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownMod.SyntaxKind.GreaterThanToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Prose")
@js.native
class Prose protected ()
  extends LexicalSymbolBase[typings.grammarkdown.grammarkdownMod.SyntaxKind.Prose] {
  def this(greaterThanToken: Token[GreaterThanToken]) = this()
  def this(greaterThanToken: Token[GreaterThanToken], fragments: js.Array[ProseFragment]) = this()
  
  val fragments: js.UndefOr[js.Array[ProseFragment]] = js.native
  
  val greaterThanToken: Token[GreaterThanToken] = js.native
  
  def update(): Prose = js.native
  def update(fragments: js.Array[ProseFragment]): Prose = js.native
}
