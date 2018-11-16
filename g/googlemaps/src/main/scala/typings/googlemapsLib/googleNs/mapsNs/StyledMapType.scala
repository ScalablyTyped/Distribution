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
  /* CompleteClass */
  override def getTile(tileCoord: Point, zoom: scala.Double, ownerDocument: stdLib.Document): stdLib.Element = js.native
  /* CompleteClass */
  override def releaseTile(tile: stdLib.Element): scala.Unit = js.native
}

