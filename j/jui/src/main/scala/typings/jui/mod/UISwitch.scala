package typings.jui.mod

import typings.jui.anon.Checked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UISwitch extends js.Object {
  
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Checked): this.type = js.native
  
  def getValue(): Boolean = js.native
  
  def setValue(value: Boolean): Unit = js.native
  
  def toggle(): Unit = js.native
}
