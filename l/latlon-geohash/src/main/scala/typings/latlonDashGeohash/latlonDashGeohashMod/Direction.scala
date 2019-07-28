package typings.latlonDashGeohash.latlonDashGeohashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSImport("latlon-geohash", "Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait East extends Direction
  
  @js.native
  sealed trait North extends Direction
  
  @js.native
  sealed trait South extends Direction
  
  @js.native
  sealed trait West extends Direction
  
  /* "E" */ val East: typings.latlonDashGeohash.latlonDashGeohashMod.Direction.East with String = js.native
  /* "N" */ val North: typings.latlonDashGeohash.latlonDashGeohashMod.Direction.North with String = js.native
  /* "S" */ val South: typings.latlonDashGeohash.latlonDashGeohashMod.Direction.South with String = js.native
  /* "W" */ val West: typings.latlonDashGeohash.latlonDashGeohashMod.Direction.West with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Direction with String] = js.native
}

