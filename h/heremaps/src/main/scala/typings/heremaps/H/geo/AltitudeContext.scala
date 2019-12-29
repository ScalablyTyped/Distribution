package typings.heremaps.H.geo

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AltitudeContext with Double] = js.native
  /* 1 */ @js.native
  object GL extends TopLevel[GL with Double]
  
  /* 2 */ @js.native
  object OL extends TopLevel[OL with Double]
  
  /* 4 */ @js.native
  object SB extends TopLevel[SB with Double]
  
  /* 3 */ @js.native
  object SL extends TopLevel[SL with Double]
  
  /* 5 */ @js.native
  object WE extends TopLevel[WE with Double]
  
  /* 6 */ @js.native
  object WG extends TopLevel[WG with Double]
  
  /* 0 */ @js.native
  object undefined extends TopLevel[undefined with Double]
  
}

