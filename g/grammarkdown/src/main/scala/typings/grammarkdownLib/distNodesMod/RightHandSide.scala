package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "RightHandSide")
@js.native
class RightHandSide ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(constraints: Constraints) = this()
  def this(constraints: Constraints, head: SymbolSpan) = this()
  def this(constraints: js.UndefOr[scala.Nothing], head: SymbolSpan) = this()
  def this(constraints: Constraints, head: SymbolSpan, reference: LinkReference) = this()
  def this(constraints: Constraints, head: js.UndefOr[scala.Nothing], reference: LinkReference) = this()
  def this(constraints: js.UndefOr[scala.Nothing], head: SymbolSpan, reference: LinkReference) = this()
  def this(constraints: js.UndefOr[scala.Nothing], head: js.UndefOr[scala.Nothing], reference: LinkReference) = this()
  val constraints: js.UndefOr[Constraints] = js.native
  val head: js.UndefOr[SymbolSpan] = js.native
  val reference: js.UndefOr[LinkReference] = js.native
  def update(): RightHandSide = js.native
  def update(constraints: Constraints): RightHandSide = js.native
  def update(constraints: Constraints, head: SymbolSpan): RightHandSide = js.native
  def update(constraints: Constraints, head: SymbolSpan, reference: LinkReference): RightHandSide = js.native
  def update(constraints: Constraints, head: js.UndefOr[scala.Nothing], reference: LinkReference): RightHandSide = js.native
  def update(constraints: js.UndefOr[scala.Nothing], head: SymbolSpan): RightHandSide = js.native
  def update(constraints: js.UndefOr[scala.Nothing], head: SymbolSpan, reference: LinkReference): RightHandSide = js.native
  def update(constraints: js.UndefOr[scala.Nothing], head: js.UndefOr[scala.Nothing], reference: LinkReference): RightHandSide = js.native
}

