package typings.leafletDotPolylinemeasure.leafletMod.Control

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.leaflet.leafletMod.ControlPosition
import typings.leaflet.leafletMod.Map
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineMeasure
  extends typings.leaflet.leafletMod.Control
     with Instantiable0[js.Any]
     with Instantiable1[/* options */ PolylineMeasureOptions, js.Any] {
  /* InferMemberOverrides */
  override def addTo(map: Map): this.type = js.native
  /* InferMemberOverrides */
  override def getContainer(): js.UndefOr[HTMLElement] = js.native
  /* InferMemberOverrides */
  override def getPosition(): ControlPosition = js.native
  /* InferMemberOverrides */
  override def remove(): this.type = js.native
  /* InferMemberOverrides */
  override def setPosition(position: ControlPosition): this.type = js.native
}

