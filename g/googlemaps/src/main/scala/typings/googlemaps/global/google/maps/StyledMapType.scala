package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.MapTypeStyle
import typings.googlemaps.google.maps.StyledMapTypeOptions
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.StyledMapType")
@js.native
class StyledMapType protected ()
  extends StObject
     with typings.googlemaps.google.maps.StyledMapType {
  def this(styles: js.Array[MapTypeStyle]) = this()
  def this(styles: js.Array[MapTypeStyle], options: StyledMapTypeOptions) = this()
  
  /* CompleteClass */
  override def getTile(tileCoord: typings.googlemaps.google.maps.Point, zoom: Double, ownerDocument: Document): Element = js.native
  
  /* CompleteClass */
  override def releaseTile(tile: Element): Unit = js.native
}
