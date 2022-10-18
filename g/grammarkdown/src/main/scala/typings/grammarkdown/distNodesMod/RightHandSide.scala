package typings.grammarkdown.distNodesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "RightHandSide")
@js.native
open class RightHandSide ()
  extends ProductionBodyBase[typings.grammarkdown.distTokensMod.SyntaxKind.RightHandSide]
     with ProductionBody {
  def this(constraints: Constraints) = this()
  def this(constraints: Unit, head: SymbolSpan) = this()
  def this(constraints: Constraints, head: SymbolSpan) = this()
  def this(constraints: Unit, head: Unit, reference: LinkReference) = this()
  def this(constraints: Unit, head: SymbolSpan, reference: LinkReference) = this()
  def this(constraints: Constraints, head: Unit, reference: LinkReference) = this()
  def this(constraints: Constraints, head: SymbolSpan, reference: LinkReference) = this()
  
  val constraints: js.UndefOr[Constraints] = js.native
  
  val head: js.UndefOr[SymbolSpan] = js.native
  
  val reference: js.UndefOr[LinkReference] = js.native
  
  def update(): RightHandSide = js.native
  def update(constraints: Unit, head: Unit, reference: LinkReference): RightHandSide = js.native
  def update(constraints: Unit, head: SymbolSpan): RightHandSide = js.native
  def update(constraints: Unit, head: SymbolSpan, reference: LinkReference): RightHandSide = js.native
  def update(constraints: Constraints): RightHandSide = js.native
  def update(constraints: Constraints, head: Unit, reference: LinkReference): RightHandSide = js.native
  def update(constraints: Constraints, head: SymbolSpan): RightHandSide = js.native
  def update(constraints: Constraints, head: SymbolSpan, reference: LinkReference): RightHandSide = js.native
}
