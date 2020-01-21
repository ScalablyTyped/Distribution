package typings.leafletPolylinemeasure.mod.Control_

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.leaflet.mod.ControlPosition
import typings.leaflet.mod.Map_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineMeasure
  extends typings.leaflet.mod.Control_
     with Instantiable0[js.Any]
     with Instantiable1[/* options */ PolylineMeasureOptions, js.Any] {
  /* InferMemberOverrides */
  override def addTo(map: Map_): this.type = js.native
  /* InferMemberOverrides */
  override def getContainer(): js.UndefOr[HTMLElement] = js.native
  /* InferMemberOverrides */
  override def getPosition(): ControlPosition = js.native
  /* InferMemberOverrides */
  override def remove(): this.type = js.native
  /* InferMemberOverrides */
  override def setPosition(position: ControlPosition): this.type = js.native
}

