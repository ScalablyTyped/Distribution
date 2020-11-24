package typings.konva.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KonvaNodeEvent extends js.Object
@JSImport("konva/types/types", "KonvaNodeEvent")
@js.native
object KonvaNodeEvent extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KonvaNodeEvent with String] = js.native
  
  @js.native
  sealed trait click extends KonvaNodeEvent
  /* "click" */ @js.native
  object click extends TopLevel[click with String]
  
  @js.native
  sealed trait contextmenu extends KonvaNodeEvent
  /* "contextmenu" */ @js.native
  object contextmenu extends TopLevel[contextmenu with String]
  
  @js.native
  sealed trait dblclick extends KonvaNodeEvent
  /* "dblclick" */ @js.native
  object dblclick extends TopLevel[dblclick with String]
  
  @js.native
  sealed trait dbltap extends KonvaNodeEvent
  /* "dbltap" */ @js.native
  object dbltap extends TopLevel[dbltap with String]
  
  @js.native
  sealed trait dragend extends KonvaNodeEvent
  /* "dragend" */ @js.native
  object dragend extends TopLevel[dragend with String]
  
  @js.native
  sealed trait dragmove extends KonvaNodeEvent
  /* "dragmove" */ @js.native
  object dragmove extends TopLevel[dragmove with String]
  
  @js.native
  sealed trait dragstart extends KonvaNodeEvent
  /* "dragstart" */ @js.native
  object dragstart extends TopLevel[dragstart with String]
  
  @js.native
  sealed trait mousedown extends KonvaNodeEvent
  /* "mousedown" */ @js.native
  object mousedown extends TopLevel[mousedown with String]
  
  @js.native
  sealed trait mouseenter extends KonvaNodeEvent
  /* "mouseenter" */ @js.native
  object mouseenter extends TopLevel[mouseenter with String]
  
  @js.native
  sealed trait mouseleave extends KonvaNodeEvent
  /* "mouseleave" */ @js.native
  object mouseleave extends TopLevel[mouseleave with String]
  
  @js.native
  sealed trait mousemove extends KonvaNodeEvent
  /* "mousemove" */ @js.native
  object mousemove extends TopLevel[mousemove with String]
  
  @js.native
  sealed trait mouseout extends KonvaNodeEvent
  /* "mouseout" */ @js.native
  object mouseout extends TopLevel[mouseout with String]
  
  @js.native
  sealed trait mouseover extends KonvaNodeEvent
  /* "mouseover" */ @js.native
  object mouseover extends TopLevel[mouseover with String]
  
  @js.native
  sealed trait mouseup extends KonvaNodeEvent
  /* "mouseup" */ @js.native
  object mouseup extends TopLevel[mouseup with String]
  
  @js.native
  sealed trait tap extends KonvaNodeEvent
  /* "tap" */ @js.native
  object tap extends TopLevel[tap with String]
  
  @js.native
  sealed trait touchend extends KonvaNodeEvent
  /* "touchend" */ @js.native
  object touchend extends TopLevel[touchend with String]
  
  @js.native
  sealed trait touchmove extends KonvaNodeEvent
  /* "touchmove" */ @js.native
  object touchmove extends TopLevel[touchmove with String]
  
  @js.native
  sealed trait touchstart extends KonvaNodeEvent
  /* "touchstart" */ @js.native
  object touchstart extends TopLevel[touchstart with String]
  
  @js.native
  sealed trait wheel extends KonvaNodeEvent
  /* "wheel" */ @js.native
  object wheel extends TopLevel[wheel with String]
}
