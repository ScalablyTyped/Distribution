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
  @JSName("alt")
  var alt_ImageMapType: java.lang.String = js.native
  @JSName("maxZoom")
  var maxZoom_ImageMapType: scala.Double = js.native
  @JSName("minZoom")
  var minZoom_ImageMapType: scala.Double = js.native
  @JSName("name")
  var name_ImageMapType: java.lang.String = js.native
  @JSName("projection")
  var projection_ImageMapType: Projection = js.native
  @JSName("radius")
  var radius_ImageMapType: scala.Double = js.native
  @JSName("tileSize")
  var tileSize_ImageMapType: Size = js.native
  def getOpacity(): scala.Double = js.native
  /* CompleteClass */
  override def getTile(tileCoord: Point, zoom: scala.Double, ownerDocument: stdLib.Document): stdLib.Element = js.native
  /* CompleteClass */
  override def releaseTile(tile: stdLib.Element): scala.Unit = js.native
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
}

