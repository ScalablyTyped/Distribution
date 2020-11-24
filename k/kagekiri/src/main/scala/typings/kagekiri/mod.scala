package typings.kagekiri

import typings.std.HTMLElement
import typings.std.Node
import typings.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kagekiri", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def querySelector(selector: String): HTMLElement | Null = js.native
  def querySelector(selector: String, context: Node): HTMLElement | Null = js.native
  
  def querySelectorAll(selector: String): NodeList = js.native
  def querySelectorAll(selector: String, context: Node): NodeList = js.native
}
