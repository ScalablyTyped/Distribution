package typings.jupyterlabCompleter.widgetMod.Completer

import typings.jupyterlabCompleter.handlerMod.CompletionHandler.ICompletionItem
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The default implementation of an `IRenderer`.
  */
@JSImport("@jupyterlab/completer/lib/widget", "Completer.Renderer")
@js.native
class Renderer () extends IRenderer {
  
  /**
    * Attaches type and match nodes to base node.
    */
  var _constructNode: js.Any = js.native
  
  /**
    * Create base node with the value to be inserted
    */
  var _createBaseNode: js.Any = js.native
  
  /**
    * Create match node to highlight potential prefix match within result.
    */
  var _createMatchNode: js.Any = js.native
  
  /**
    * Create an item node from an ICompletionItem for a text completer menu.
    */
  @JSName("createCompletionItemNode")
  def createCompletionItemNode_MRenderer(item: ICompletionItem, orderedTypes: js.Array[String]): HTMLLIElement = js.native
}
