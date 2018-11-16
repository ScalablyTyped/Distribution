package typings
package heremapsLib.HNs.geoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AltitudeContext extends js.Object

/**
         * Contexts for altitudes to specify the contextual origin of an altitude's value
         */
@JSGlobal("H.geo.AltitudeContext")
@js.native
object AltitudeContext extends js.Object {
  /** Ground level */
  @js.native
  sealed trait GL
    extends heremapsLib.HNs.geoNs.AltitudeContext
  
  /** Obstruction level */
  @js.native
  sealed trait OL
    extends heremapsLib.HNs.geoNs.AltitudeContext
  
  /** Sea bed level */
  @js.native
  sealed trait SB
    extends heremapsLib.HNs.geoNs.AltitudeContext
  
  /** Mean sea level */
  @js.native
  sealed trait SL
    extends heremapsLib.HNs.geoNs.AltitudeContext
  
  /** WGS84 ellipsoid */
  @js.native
  sealed trait WE
    extends heremapsLib.HNs.geoNs.AltitudeContext
  
  /** WGS84 geoid */
  @js.native
  sealed trait WG
    extends heremapsLib.HNs.geoNs.AltitudeContext
  
  /** Ground level */
  @js.native
  sealed trait undefined
    extends heremapsLib.HNs.geoNs.AltitudeContext
  
  val GL: GL with java.lang.String = js.native
  val OL: OL with java.lang.String = js.native
  val SB: SB with java.lang.String = js.native
  val SL: SL with java.lang.String = js.native
  val WE: WE with java.lang.String = js.native
  val WG: WG with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[heremapsLib.HNs.geoNs.AltitudeContext with java.lang.String] = js.native
}

