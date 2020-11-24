package typings.leafletLabel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleMarker extends js.Object {
  
  def bindLabel(content: String): CircleMarker = js.native
  def bindLabel(content: String, options: LabelOptions): CircleMarker = js.native
  
  def getLabel(): Label = js.native
  
  def hideLabel(): CircleMarker = js.native
  
  def setLabelNoHide(noHide: Boolean): Unit = js.native
  
  def showLabel(): CircleMarker = js.native
  
  def unbindLabel(): CircleMarker = js.native
  
  def updateLabelContent(content: String): Unit = js.native
}
