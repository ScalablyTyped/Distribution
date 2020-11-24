package typings.listJs.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem extends js.Object {
  
  var elm: HTMLElement = js.native
  
  def hide(): Unit = js.native
  
  def matching(): Boolean = js.native
  
  def show(): Unit = js.native
  
  def values(): js.Object = js.native
  def values(newValues: js.Object): Unit = js.native
  
  def visible(): Boolean = js.native
}
