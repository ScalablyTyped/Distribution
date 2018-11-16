package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.ImageMapType")
@js.native
class ImageMapType protected ()
  extends MVCObject
     with MapType {
  def this(opts: ImageMapTypeOptions) = this()
  def getOpacity(): scala.Double = js.native
  /* CompleteClass */
  override def getTile(tileCoord: Point, zoom: scala.Double, ownerDocument: stdLib.Document): stdLib.Element = js.native
  /* CompleteClass */
  override def releaseTile(tile: stdLib.Element): scala.Unit = js.native
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
}

