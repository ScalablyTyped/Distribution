package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZoomControlStyle extends js.Object

@JSGlobal("google.maps.ZoomControlStyle")
@js.native
object ZoomControlStyle extends js.Object {
  @js.native
  sealed trait DEFAULT extends ZoomControlStyle
  
  @js.native
  sealed trait LARGE extends ZoomControlStyle
  
  @js.native
  sealed trait SMALL extends ZoomControlStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ZoomControlStyle with Double] = js.native
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  /* 2 */ @js.native
  object LARGE extends TopLevel[LARGE with Double]
  
  /* 1 */ @js.native
  object SMALL extends TopLevel[SMALL with Double]
  
}

