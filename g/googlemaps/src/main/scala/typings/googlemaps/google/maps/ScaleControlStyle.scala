package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleControlStyle extends js.Object

@JSGlobal("google.maps.ScaleControlStyle")
@js.native
object ScaleControlStyle extends js.Object {
  @js.native
  sealed trait DEFAULT extends ScaleControlStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScaleControlStyle with Double] = js.native
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
}

