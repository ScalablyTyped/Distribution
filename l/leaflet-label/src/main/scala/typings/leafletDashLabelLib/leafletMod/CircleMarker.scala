package typings
package leafletDashLabelLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleMarker extends js.Object {
  def bindLabel(content: java.lang.String): leafletLib.leafletMod.CircleMarker[_] = js.native
  def bindLabel(content: java.lang.String, options: LabelOptions): leafletLib.leafletMod.CircleMarker[_] = js.native
  def getLabel(): Label = js.native
  def hideLabel(): leafletLib.leafletMod.CircleMarker[_] = js.native
  def setLabelNoHide(noHide: scala.Boolean): scala.Unit = js.native
  def showLabel(): leafletLib.leafletMod.CircleMarker[_] = js.native
  def unbindLabel(): leafletLib.leafletMod.CircleMarker[_] = js.native
  def updateLabelContent(content: java.lang.String): scala.Unit = js.native
}

