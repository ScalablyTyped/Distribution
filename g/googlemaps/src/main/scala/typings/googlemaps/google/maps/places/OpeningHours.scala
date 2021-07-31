package typings.googlemaps.google.maps.places

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO rename to PlaceOpeningHours https://developers.google.com/maps/documentation/javascript/reference/places-service#PlaceOpeningHours
@js.native
trait OpeningHours extends StObject {
  
  def isOpen(): Boolean = js.native
  def isOpen(date: Date): Boolean = js.native
  
  /**
    * @deprecated open_now is deprecated as of November 2019 and will be turned off in November 2020.
    *      Use the PlaceOpeningHours.isOpen function from a PlacesService.getDetails result instead.
    */
  var open_now: Boolean = js.native
  
  var periods: js.Array[OpeningPeriod] = js.native
  
  var weekday_text: js.Array[String] = js.native
}
