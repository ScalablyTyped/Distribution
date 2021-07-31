package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.ImageMapTypeOptions
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.ImageMapType")
@js.native
class ImageMapType protected ()
  extends StObject
     with typings.googlemaps.google.maps.ImageMapType {
  def this(opts: ImageMapTypeOptions) = this()
  
  /* CompleteClass */
  override def getTile(tileCoord: typings.googlemaps.google.maps.Point, zoom: Double, ownerDocument: Document): Element = js.native
  
  /* CompleteClass */
  override def releaseTile(tile: Element): Unit = js.native
}
