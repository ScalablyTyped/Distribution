package typings.leafletDashLabel.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Marker extends js.Object {
  def bindLabel(content: String): Marker = js.native
  def bindLabel(content: String, options: LabelOptions): Marker = js.native
  def getLabel(): Label = js.native
  def hideLabel(): Marker = js.native
  def setLabelNoHide(noHide: Boolean): Unit = js.native
  def setOpacity(opacity: Double, labelHasSemiTransparency: Boolean): Unit = js.native
  def showLabel(): Marker = js.native
  def unbindLabel(): Marker = js.native
  def updateLabelContent(content: String): Unit = js.native
}

