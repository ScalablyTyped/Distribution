package typings.leafletDashLabel.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleMarker extends js.Object {
  def bindLabel(content: String): typings.leaflet.leafletMod.CircleMarker[_] = js.native
  def bindLabel(content: String, options: LabelOptions): typings.leaflet.leafletMod.CircleMarker[_] = js.native
  def getLabel(): Label = js.native
  def hideLabel(): typings.leaflet.leafletMod.CircleMarker[_] = js.native
  def setLabelNoHide(noHide: Boolean): Unit = js.native
  def showLabel(): typings.leaflet.leafletMod.CircleMarker[_] = js.native
  def unbindLabel(): typings.leaflet.leafletMod.CircleMarker[_] = js.native
  def updateLabelContent(content: String): Unit = js.native
}

