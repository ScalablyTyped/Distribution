package typings.googlemaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifiers for common MapTypes. Specify these by value, or by using the
  * constant's name. For example, 'satellite' or
  * google.maps.MapTypeId.SATELLITE.
  */
@JSGlobal("google.maps.MapTypeId")
@js.native
object MapTypeId extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googlemaps.google.maps.MapTypeId with String] = js.native
  
  /* "hybrid" */ val HYBRID: typings.googlemaps.google.maps.MapTypeId.HYBRID with String = js.native
  
  /* "roadmap" */ val ROADMAP: typings.googlemaps.google.maps.MapTypeId.ROADMAP with String = js.native
  
  /* "satellite" */ val SATELLITE: typings.googlemaps.google.maps.MapTypeId.SATELLITE with String = js.native
  
  /* "terrain" */ val TERRAIN: typings.googlemaps.google.maps.MapTypeId.TERRAIN with String = js.native
}
