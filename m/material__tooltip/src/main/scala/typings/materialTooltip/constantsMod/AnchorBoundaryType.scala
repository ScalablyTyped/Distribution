package typings.materialTooltip.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnchorBoundaryType extends StObject
/**
  * Enum for possible anchor boundary types. This determines the gap between the
  * bottom of the anchor and the tooltip element.
  * Bounded anchors have an identifiable boundary (e.g. buttons).
  * Unbounded anchors don't have a visually declared boundary (e.g. plain text).
  */
@JSImport("@material/tooltip/constants", "AnchorBoundaryType")
@js.native
object AnchorBoundaryType extends StObject {
  
  @js.native
  sealed trait BOUNDED
    extends StObject
       with AnchorBoundaryType
  
  @js.native
  sealed trait UNBOUNDED
    extends StObject
       with AnchorBoundaryType
}
