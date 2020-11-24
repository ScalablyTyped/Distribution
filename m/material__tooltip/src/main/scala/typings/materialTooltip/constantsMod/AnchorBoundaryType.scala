package typings.materialTooltip.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnchorBoundaryType extends js.Object
/**
  * Enum for possible anchor boundary types. This determines the gap between the
  * bottom of the anchor and the tooltip element.
  * Bounded anchors have an identifiable boundary (e.g. buttons).
  * Unbounded anchors don't have a visually declared boundary (e.g. plain text).
  */
@JSImport("@material/tooltip/constants", "AnchorBoundaryType")
@js.native
object AnchorBoundaryType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnchorBoundaryType with Double] = js.native
  
  @js.native
  sealed trait BOUNDED extends AnchorBoundaryType
  /* 0 */ @js.native
  object BOUNDED extends TopLevel[BOUNDED with Double]
  
  @js.native
  sealed trait UNBOUNDED extends AnchorBoundaryType
  /* 1 */ @js.native
  object UNBOUNDED extends TopLevel[UNBOUNDED with Double]
}
