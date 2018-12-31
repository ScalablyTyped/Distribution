package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapTypeId extends js.Object

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
  
  val HYBRID: HYBRID with java.lang.String = js.native
  val ROADMAP: ROADMAP with java.lang.String = js.native
  val SATELLITE: SATELLITE with java.lang.String = js.native
  val TERRAIN: TERRAIN with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.MapTypeId with java.lang.String] = js.native
}

