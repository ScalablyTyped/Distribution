package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapTypeId extends js.Object

/**
  * Identifiers for common MapTypes. Specify these by value, or by using the
  * constant's name. For example, 'satellite' or
  * google.maps.MapTypeId.SATELLITE.
  */
@JSGlobal("google.maps.MapTypeId")
@js.native
object MapTypeId extends js.Object {
  /**
    This map type displays a transparent layer of major streets on satellite
    images.
    */
  @js.native
  sealed trait HYBRID
    extends googlemapsLib.googleNs.mapsNs.MapTypeId
  
  /** This map type displays a normal street map. */
  @js.native
  sealed trait ROADMAP
    extends googlemapsLib.googleNs.mapsNs.MapTypeId
  
  /** This map type displays satellite images. */
  @js.native
  sealed trait SATELLITE
    extends googlemapsLib.googleNs.mapsNs.MapTypeId
  
  /**
    This map type displays maps with physical features such as terrain and
    vegetation.
    */
  @js.native
  sealed trait TERRAIN
    extends googlemapsLib.googleNs.mapsNs.MapTypeId
  
  /* 0 */ val HYBRID: HYBRID with scala.Double = js.native
  /* 1 */ val ROADMAP: ROADMAP with scala.Double = js.native
  /* 2 */ val SATELLITE: SATELLITE with scala.Double = js.native
  /* 3 */ val TERRAIN: TERRAIN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.MapTypeId with scala.Double] = js.native
}

