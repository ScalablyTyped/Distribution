package typings.heremaps.H.ui

import org.scalablytyped.runtime.TopLevel
import typings.heremaps.H.ui.LayoutAlignment.BOTTOM_CENTER
import typings.heremaps.H.ui.LayoutAlignment.BOTTOM_LEFT
import typings.heremaps.H.ui.LayoutAlignment.BOTTOM_RIGHT
import typings.heremaps.H.ui.LayoutAlignment.LEFT_BOTTOM
import typings.heremaps.H.ui.LayoutAlignment.LEFT_MIDDLE
import typings.heremaps.H.ui.LayoutAlignment.LEFT_TOP
import typings.heremaps.H.ui.LayoutAlignment.RIGHT_BOTTOM
import typings.heremaps.H.ui.LayoutAlignment.RIGHT_MIDDLE
import typings.heremaps.H.ui.LayoutAlignment.RIGHT_TOP
import typings.heremaps.H.ui.LayoutAlignment.TOP_CENTER
import typings.heremaps.H.ui.LayoutAlignment.TOP_LEFT
import typings.heremaps.H.ui.LayoutAlignment.TOP_RIGHT
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
  sealed trait BOTTOM_CENTER extends LayoutAlignment
  
  @js.native
  sealed trait BOTTOM_LEFT extends LayoutAlignment
  
  @js.native
  sealed trait BOTTOM_RIGHT extends LayoutAlignment
  
  @js.native
  sealed trait LEFT_BOTTOM extends LayoutAlignment
  
  @js.native
  sealed trait LEFT_MIDDLE extends LayoutAlignment
  
  @js.native
  sealed trait LEFT_TOP extends LayoutAlignment
  
  @js.native
  sealed trait RIGHT_BOTTOM extends LayoutAlignment
  
  @js.native
  sealed trait RIGHT_MIDDLE extends LayoutAlignment
  
  @js.native
  sealed trait RIGHT_TOP extends LayoutAlignment
  
  @js.native
  sealed trait TOP_CENTER extends LayoutAlignment
  
  @js.native
  sealed trait TOP_LEFT extends LayoutAlignment
  
  @js.native
  sealed trait TOP_RIGHT extends LayoutAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LayoutAlignment with Double] = js.native
  /* 10 */ @js.native
  object BOTTOM_CENTER extends TopLevel[BOTTOM_CENTER with Double]
  
  /* 9 */ @js.native
  object BOTTOM_LEFT extends TopLevel[BOTTOM_LEFT with Double]
  
  /* 11 */ @js.native
  object BOTTOM_RIGHT extends TopLevel[BOTTOM_RIGHT with Double]
  
  /* 5 */ @js.native
  object LEFT_BOTTOM extends TopLevel[LEFT_BOTTOM with Double]
  
  /* 4 */ @js.native
  object LEFT_MIDDLE extends TopLevel[LEFT_MIDDLE with Double]
  
  /* 3 */ @js.native
  object LEFT_TOP extends TopLevel[LEFT_TOP with Double]
  
  /* 8 */ @js.native
  object RIGHT_BOTTOM extends TopLevel[RIGHT_BOTTOM with Double]
  
  /* 7 */ @js.native
  object RIGHT_MIDDLE extends TopLevel[RIGHT_MIDDLE with Double]
  
  /* 6 */ @js.native
  object RIGHT_TOP extends TopLevel[RIGHT_TOP with Double]
  
  /* 1 */ @js.native
  object TOP_CENTER extends TopLevel[TOP_CENTER with Double]
  
  /* 0 */ @js.native
  object TOP_LEFT extends TopLevel[TOP_LEFT with Double]
  
  /* 2 */ @js.native
  object TOP_RIGHT extends TopLevel[TOP_RIGHT with Double]
  
}

