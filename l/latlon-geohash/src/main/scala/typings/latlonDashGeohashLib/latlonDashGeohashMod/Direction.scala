package typings
package latlonDashGeohashLib.latlonDashGeohashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSImport("latlon-geohash", "Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait East
    extends latlonDashGeohashLib.latlonDashGeohashMod.Direction
  
  @js.native
  sealed trait North
    extends latlonDashGeohashLib.latlonDashGeohashMod.Direction
  
  @js.native
  sealed trait South
    extends latlonDashGeohashLib.latlonDashGeohashMod.Direction
  
  @js.native
  sealed trait West
    extends latlonDashGeohashLib.latlonDashGeohashMod.Direction
  
  /* "E" */ val East: East with java.lang.String = js.native
  /* "N" */ val North: North with java.lang.String = js.native
  /* "S" */ val South: South with java.lang.String = js.native
  /* "W" */ val West: West with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[latlonDashGeohashLib.latlonDashGeohashMod.Direction with java.lang.String] = js.native
}

