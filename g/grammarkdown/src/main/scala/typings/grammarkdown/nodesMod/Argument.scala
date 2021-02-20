package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.ArgumentOperatorKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Argument")
@js.native
class Argument ()
  extends Node[typings.grammarkdown.tokensMod.SyntaxKind.Argument] {
  def this(operatorToken: Token[ArgumentOperatorKind]) = this()
  def this(operatorToken: js.UndefOr[scala.Nothing], name: Identifier) = this()
  def this(operatorToken: Token[ArgumentOperatorKind], name: Identifier) = this()
  
  val name: js.UndefOr[Identifier] = js.native
  
  val operatorToken: js.UndefOr[Token[ArgumentOperatorKind]] = js.native
  
  def update(): Argument = js.native
  def update(name: Identifier): Argument = js.native
}
