package typings.jupyterlabCompleter.widgetMod.Completer

import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for completer widget nodes.
  */
trait IRenderer extends js.Object {
  /**
    * Create an item node (an `li` element) for a text completer menu.
    */
  def createItemNode(item: IItem, typeMap: TypeMap, orderedTypes: js.Array[String]): HTMLLIElement
}

object IRenderer {
  @scala.inline
  def apply(createItemNode: (IItem, TypeMap, js.Array[String]) => HTMLLIElement): IRenderer = {
    val __obj = js.Dynamic.literal(createItemNode = js.Any.fromFunction3(createItemNode))
  
    __obj.asInstanceOf[IRenderer]
  }
}

