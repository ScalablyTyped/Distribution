package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /** This map type displays a transparent layer of major streets on satellite images. */
  @js.native
  sealed trait HYBRID extends MapTypeId
  
  /** This map type displays a normal street map. */
  @js.native
  sealed trait ROADMAP extends MapTypeId
  
  /** This map type displays satellite images. */
  @js.native
  sealed trait SATELLITE extends MapTypeId
  
  /** This map type displays maps with physical features such as terrain and vegetation. */
  @js.native
  sealed trait TERRAIN extends MapTypeId
}
