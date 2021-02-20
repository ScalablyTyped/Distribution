package typings.kagekiri

import typings.std.HTMLElement
import typings.std.Node
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kagekiri", "querySelector")
  @js.native
  def querySelector(selector: String): HTMLElement | Null = js.native
  @JSImport("kagekiri", "querySelector")
  @js.native
  def querySelector(selector: String, context: Node): HTMLElement | Null = js.native
  
  @JSImport("kagekiri", "querySelectorAll")
  @js.native
  def querySelectorAll(selector: String): NodeList = js.native
  @JSImport("kagekiri", "querySelectorAll")
  @js.native
  def querySelectorAll(selector: String, context: Node): NodeList = js.native
}
