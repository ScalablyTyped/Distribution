package typings.leafletLabel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path extends js.Object {
  
  def bindLabel(content: String): Path = js.native
  def bindLabel(content: String, options: LabelOptions): Path = js.native
  
  def unbindLabel(): Path = js.native
  
  def updateLabelContent(content: String): Unit = js.native
}
