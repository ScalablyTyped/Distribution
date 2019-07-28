package typings.googlemaps.googleNs.mapsNs

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
  sealed trait HYBRID extends MapTypeId
  
  /** This map type displays a normal street map. */
  @js.native
  sealed trait ROADMAP extends MapTypeId
  
  /** This map type displays satellite images. */
  @js.native
  sealed trait SATELLITE extends MapTypeId
  
  /**
    This map type displays maps with physical features such as terrain and
    vegetation.
    */
  @js.native
  sealed trait TERRAIN extends MapTypeId
  
  /* 0 */ val HYBRID: typings.googlemaps.googleNs.mapsNs.MapTypeId.HYBRID with Double = js.native
  /* 1 */ val ROADMAP: typings.googlemaps.googleNs.mapsNs.MapTypeId.ROADMAP with Double = js.native
  /* 2 */ val SATELLITE: typings.googlemaps.googleNs.mapsNs.MapTypeId.SATELLITE with Double = js.native
  /* 3 */ val TERRAIN: typings.googlemaps.googleNs.mapsNs.MapTypeId.TERRAIN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapTypeId with Double] = js.native
}

