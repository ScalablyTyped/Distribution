package typings
package heremapsLib.HNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LayoutAlignment extends js.Object

/**
  * This enumeration holds the possible layout alignments for the UI elements.
  */
@JSGlobal("H.ui.LayoutAlignment")
@js.native
object LayoutAlignment extends js.Object {
  @js.native
  sealed trait BOTTOM_CENTER
    extends heremapsLib.HNs.uiNs.LayoutAlignment
  
  @js.native
  sealed trait BOTTOM_LEFT
    extends heremapsLib.HNs.uiNs.LayoutAlignment
  
  @js.native
  sealed trait BOTTOM_RIGHT
    extends heremapsLib.HNs.uiNs.LayoutAlignment
  
  @js.native
  sealed trait LEFT_BOTTOM
    extends heremapsLib.HNs.uiNs.LayoutAlignment
  
  @js.native
  sealed trait LEFT_MIDDLE
    extends heremapsLib.HNs.uiNs.LayoutAlignment
  
  @js.native
  sealed trait LEFT_TOP
    extends heremapsLib.HNs.uiNs.LayoutAlignment
  
  @js.native
  sealed trait RIGHT_BOTTOM
    extends heremapsLib.HNs.uiNs.LayoutAlignment
  
  @js.native
  sealed trait RIGHT_MIDDLE
    extends heremapsLib.HNs.uiNs.LayoutAlignment
  
  @js.native
  sealed trait RIGHT_TOP
    extends heremapsLib.HNs.uiNs.LayoutAlignment
  
  @js.native
  sealed trait TOP_CENTER
    extends heremapsLib.HNs.uiNs.LayoutAlignment
  
  @js.native
  sealed trait TOP_LEFT
    extends heremapsLib.HNs.uiNs.LayoutAlignment
  
  @js.native
  sealed trait TOP_RIGHT
    extends heremapsLib.HNs.uiNs.LayoutAlignment
  
  /* 10 */ val BOTTOM_CENTER: BOTTOM_CENTER with scala.Double = js.native
  /* 9 */ val BOTTOM_LEFT: BOTTOM_LEFT with scala.Double = js.native
  /* 11 */ val BOTTOM_RIGHT: BOTTOM_RIGHT with scala.Double = js.native
  /* 5 */ val LEFT_BOTTOM: LEFT_BOTTOM with scala.Double = js.native
  /* 4 */ val LEFT_MIDDLE: LEFT_MIDDLE with scala.Double = js.native
  /* 3 */ val LEFT_TOP: LEFT_TOP with scala.Double = js.native
  /* 8 */ val RIGHT_BOTTOM: RIGHT_BOTTOM with scala.Double = js.native
  /* 7 */ val RIGHT_MIDDLE: RIGHT_MIDDLE with scala.Double = js.native
  /* 6 */ val RIGHT_TOP: RIGHT_TOP with scala.Double = js.native
  /* 1 */ val TOP_CENTER: TOP_CENTER with scala.Double = js.native
  /* 0 */ val TOP_LEFT: TOP_LEFT with scala.Double = js.native
  /* 2 */ val TOP_RIGHT: TOP_RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heremapsLib.HNs.uiNs.LayoutAlignment with scala.Double] = js.native
}

