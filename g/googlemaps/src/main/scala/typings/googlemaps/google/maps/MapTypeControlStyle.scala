package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import typings.googlemaps.google.maps.MapTypeControlStyle.DEFAULT
import typings.googlemaps.google.maps.MapTypeControlStyle.DROPDOWN_MENU
import typings.googlemaps.google.maps.MapTypeControlStyle.HORIZONTAL_BAR
import typings.googlemaps.google.maps.MapTypeControlStyle.INSET
import typings.googlemaps.google.maps.MapTypeControlStyle.INSET_LARGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapTypeControlStyle extends js.Object

@JSGlobal("google.maps.MapTypeControlStyle")
@js.native
object MapTypeControlStyle extends js.Object {
  @js.native
  sealed trait DEFAULT extends MapTypeControlStyle
  
  @js.native
  sealed trait DROPDOWN_MENU extends MapTypeControlStyle
  
  @js.native
  sealed trait HORIZONTAL_BAR extends MapTypeControlStyle
  
  @js.native
  sealed trait INSET extends MapTypeControlStyle
  
  @js.native
  sealed trait INSET_LARGE extends MapTypeControlStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapTypeControlStyle with Double] = js.native
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  /* 2 */ @js.native
  object DROPDOWN_MENU extends TopLevel[DROPDOWN_MENU with Double]
  
  /* 1 */ @js.native
  object HORIZONTAL_BAR extends TopLevel[HORIZONTAL_BAR with Double]
  
  /* 3 */ @js.native
  object INSET extends TopLevel[INSET with Double]
  
  /* 4 */ @js.native
  object INSET_LARGE extends TopLevel[INSET_LARGE with Double]
  
}

