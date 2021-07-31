package typings.googlemaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray Maps JavaScript API}
  */
@JSGlobal("google.maps.MVCArray")
@js.native
/**
  * A mutable MVC Array.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/event#MVCArray.constructor Maps JavaScript API}
  */
class MVCArray[T] ()
  extends StObject
     with typings.googlemaps.google.maps.MVCArray[T] {
  def this(array: js.Array[T]) = this()
}
