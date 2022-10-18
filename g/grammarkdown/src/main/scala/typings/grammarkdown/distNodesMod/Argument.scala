package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.ArgumentOperatorKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Argument")
@js.native
open class Argument ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.Argument] {
  def this(operatorToken: Token[ArgumentOperatorKind]) = this()
  def this(operatorToken: Unit, name: Identifier) = this()
  def this(operatorToken: Token[ArgumentOperatorKind], name: Identifier) = this()
  
  val name: js.UndefOr[Identifier] = js.native
  
  val operatorToken: js.UndefOr[Token[ArgumentOperatorKind]] = js.native
  
  def update(): Argument = js.native
  def update(name: Identifier): Argument = js.native
}
