package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.ImageMapTypeOptions
import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.ImageMapType")
@js.native
class ImageMapType protected ()
  extends typings.googlemaps.google.maps.ImageMapType {
  def this(opts: ImageMapTypeOptions) = this()
  /* CompleteClass */
  override def getTile(tileCoord: typings.googlemaps.google.maps.Point, zoom: Double, ownerDocument: Document): Element = js.native
  /* CompleteClass */
  override def releaseTile(tile: Element): Unit = js.native
}

