package typings.googlemaps.google.maps

import typings.std.Document_
import typings.std.Element
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
  var alt_StyledMapType: String = js.native
  @JSName("maxZoom")
  var maxZoom_StyledMapType: Double = js.native
  @JSName("minZoom")
  var minZoom_StyledMapType: Double = js.native
  @JSName("name")
  var name_StyledMapType: String = js.native
  @JSName("projection")
  var projection_StyledMapType: Projection = js.native
  @JSName("radius")
  var radius_StyledMapType: Double = js.native
  @JSName("tileSize")
  var tileSize_StyledMapType: Size = js.native
  /* CompleteClass */
  override def getTile(tileCoord: Point, zoom: Double, ownerDocument: Document_): Element = js.native
  /* CompleteClass */
  override def releaseTile(tile: Element): Unit = js.native
}

