package typings.heremaps.H.geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
