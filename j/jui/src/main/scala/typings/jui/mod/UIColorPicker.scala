package typings.jui.mod

import typings.jui.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIColorPicker extends js.Object {
  
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Color): this.type = js.native
  
  def getColor(`type`: String): String | js.Object = js.native
  
  def setColor(value: String): Unit = js.native
  def setColor(value: js.Object): Unit = js.native
}
