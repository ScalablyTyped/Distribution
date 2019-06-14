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
  
  /* 1 */ val GL: GL with scala.Double = js.native
  /* 2 */ val OL: OL with scala.Double = js.native
  /* 4 */ val SB: SB with scala.Double = js.native
  /* 3 */ val SL: SL with scala.Double = js.native
  /* 5 */ val WE: WE with scala.Double = js.native
  /* 6 */ val WG: WG with scala.Double = js.native
  /* 0 */ val undefined: undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heremapsLib.HNs.geoNs.AltitudeContext with scala.Double] = js.native
}

