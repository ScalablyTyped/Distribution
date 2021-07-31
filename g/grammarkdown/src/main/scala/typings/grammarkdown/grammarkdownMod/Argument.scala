package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Argument")
@js.native
class Argument ()
  extends StObject
     with Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind.Argument] {
  def this(operatorToken: Token[ArgumentOperatorKind]) = this()
  def this(operatorToken: Unit, name: Identifier) = this()
  def this(operatorToken: Token[ArgumentOperatorKind], name: Identifier) = this()
  
  /* CompleteClass */
  var end: Double = js.native
  
  val name: js.UndefOr[Identifier] = js.native
  
  val operatorToken: js.UndefOr[Token[ArgumentOperatorKind]] = js.native
  
  /* CompleteClass */
  var pos: Double = js.native
  
  def update(): Argument = js.native
  def update(name: Identifier): Argument = js.native
}
