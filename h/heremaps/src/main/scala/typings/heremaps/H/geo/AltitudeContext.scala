package typings.heremaps.H.geo

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
  sealed trait GL extends AltitudeContext
  
  /** Obstruction level */
  @js.native
  sealed trait OL extends AltitudeContext
  
  /** Sea bed level */
  @js.native
  sealed trait SB extends AltitudeContext
  
  /** Mean sea level */
  @js.native
  sealed trait SL extends AltitudeContext
  
  /** WGS84 ellipsoid */
  @js.native
  sealed trait WE extends AltitudeContext
  
  /** WGS84 geoid */
  @js.native
  sealed trait WG extends AltitudeContext
  
  /** Ground level */
  @js.native
  sealed trait undefined extends AltitudeContext
  
  /* 1 */ val GL: typings.heremaps.H.geo.AltitudeContext.GL with Double = js.native
  /* 2 */ val OL: typings.heremaps.H.geo.AltitudeContext.OL with Double = js.native
  /* 4 */ val SB: typings.heremaps.H.geo.AltitudeContext.SB with Double = js.native
  /* 3 */ val SL: typings.heremaps.H.geo.AltitudeContext.SL with Double = js.native
  /* 5 */ val WE: typings.heremaps.H.geo.AltitudeContext.WE with Double = js.native
  /* 6 */ val WG: typings.heremaps.H.geo.AltitudeContext.WG with Double = js.native
  /* 0 */ val undefined: typings.heremaps.H.geo.AltitudeContext.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AltitudeContext with Double] = js.native
}

