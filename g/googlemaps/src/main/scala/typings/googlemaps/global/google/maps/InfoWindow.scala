package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.InfoWindowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An overlay that looks like a bubble and is often connected to a marker.
  * This class extends MVCObject.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow Maps JavaScript API}
  */
@JSGlobal("google.maps.InfoWindow")
@js.native
/**
  * Creates an info window with the given options. An {@link InfoWindow} can be placed on a map at a particular
  * position or above a marker, depending on what is specified in the options. Unless auto-pan is disabled, an
  * {@link InfoWindow} will pan the map to make itself visible when it is opened. After constructing an
  * {@link InfoWindow}, you must call open to display it on the map. The user can click the close button on the
  * {@link InfoWindow} to remove it from the map, or the developer can call {@link close}() for the same effect.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/info-window#InfoWindow.constructor Maps JavaScript API}
  */
class InfoWindow ()
  extends typings.googlemaps.google.maps.InfoWindow {
  def this(opts: InfoWindowOptions) = this()
}

