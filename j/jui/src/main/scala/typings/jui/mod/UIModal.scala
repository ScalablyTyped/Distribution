package typings.jui.mod

import typings.jui.anon.AutoHide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIModal extends js.Object {
  
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: AutoHide): this.type = js.native
  
  def hide(): Unit = js.native
  
  def resize(): Unit = js.native
  
  def show(): Unit = js.native
}
