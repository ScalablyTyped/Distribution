package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.MapOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map Maps JavaScript API} */
@JSGlobal("google.maps.Map")
@js.native
class Map[E /* <: Element */] protected ()
  extends typings.googlemaps.google.maps.Map[E] {
  /**
    * Creates a new map inside of the given HTML container, which is typically a DIV element.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map.constructor Maps JavaScript API}
    */
  def this(mapDiv: E) = this()
  def this(mapDiv: E, opts: MapOptions) = this()
}
