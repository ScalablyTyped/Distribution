package typings.kagekiri

import typings.std.HTMLElement
import typings.std.Node
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kagekiri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def querySelector(selector: String): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("querySelector")(selector.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  @scala.inline
  def querySelector(selector: String, context: Node): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelector")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  @scala.inline
  def querySelectorAll(selector: String): NodeList = ^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAll")(selector.asInstanceOf[js.Any]).asInstanceOf[NodeList]
  @scala.inline
  def querySelectorAll(selector: String, context: Node): NodeList = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAll")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[NodeList]
}
