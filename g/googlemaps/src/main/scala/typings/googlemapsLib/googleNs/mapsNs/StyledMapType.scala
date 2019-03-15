package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.StyledMapType")
@js.native
class StyledMapType protected ()
  extends MVCObject
     with MapType {
  def this(styles: js.Array[MapTypeStyle]) = this()
  def this(styles: js.Array[MapTypeStyle], options: StyledMapTypeOptions) = this()
  @JSName("alt")
  var alt_StyledMapType: java.lang.String = js.native
  @JSName("maxZoom")
  var maxZoom_StyledMapType: scala.Double = js.native
  @JSName("minZoom")
  var minZoom_StyledMapType: scala.Double = js.native
  @JSName("name")
  var name_StyledMapType: java.lang.String = js.native
  @JSName("projection")
  var projection_StyledMapType: Projection = js.native
  @JSName("radius")
  var radius_StyledMapType: scala.Double = js.native
  @JSName("tileSize")
  var tileSize_StyledMapType: Size = js.native
  /* CompleteClass */
  override def getTile(tileCoord: Point, zoom: scala.Double, ownerDocument: stdLib.Document): stdLib.Element = js.native
  /* CompleteClass */
  override def releaseTile(tile: stdLib.Element): scala.Unit = js.native
}

