package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnitSystem extends js.Object

@JSGlobal("google.maps.UnitSystem")
@js.native
object UnitSystem extends js.Object {
  @js.native
  sealed trait IMPERIAL extends UnitSystem
  
  @js.native
  sealed trait METRIC extends UnitSystem
  
}

