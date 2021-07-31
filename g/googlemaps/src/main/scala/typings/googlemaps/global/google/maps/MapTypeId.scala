package typings.googlemaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def apply(value: String): js.UndefOr[typings.googlemaps.google.maps.MapTypeId & String] = js.native
  
  /* "hybrid" */ val HYBRID: typings.googlemaps.google.maps.MapTypeId.HYBRID & String = js.native
  
  /* "roadmap" */ val ROADMAP: typings.googlemaps.google.maps.MapTypeId.ROADMAP & String = js.native
  
  /* "satellite" */ val SATELLITE: typings.googlemaps.google.maps.MapTypeId.SATELLITE & String = js.native
  
  /* "terrain" */ val TERRAIN: typings.googlemaps.google.maps.MapTypeId.TERRAIN & String = js.native
}
