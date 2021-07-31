package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.places._LocationBias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal which represents a circle.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#CircleLiteral Maps JavaScript API}
  */
trait CircleLiteral
  extends StObject
     with CircleOptions
     with _LocationBias
object CircleLiteral {
  
  @scala.inline
  def apply(): CircleLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleLiteral]
  }
}
