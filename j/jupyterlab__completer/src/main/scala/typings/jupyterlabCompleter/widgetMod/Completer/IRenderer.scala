package typings.jupyterlabCompleter.widgetMod.Completer

import typings.jupyterlabCompleter.handlerMod.CompletionHandler.ICompletionItem
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A renderer for completer widget nodes.
  */
@js.native
trait IRenderer extends js.Object {
  
  /**
    * Create an item node (an `li` element)  from a ICompletionItem
    * for a text completer menu.
    */
  var createCompletionItemNode: js.UndefOr[
    js.Function2[/* item */ ICompletionItem, /* orderedTypes */ js.Array[String], HTMLLIElement]
  ] = js.native
  
  /**
    * Create an item node (an `li` element) for a text completer menu.
    */
  def createItemNode(item: IItem, typeMap: TypeMap, orderedTypes: js.Array[String]): HTMLLIElement = js.native
}
object IRenderer {
  
  @scala.inline
  def apply(createItemNode: (IItem, TypeMap, js.Array[String]) => HTMLLIElement): IRenderer = {
    val __obj = js.Dynamic.literal(createItemNode = js.Any.fromFunction3(createItemNode))
    __obj.asInstanceOf[IRenderer]
  }
  
  @scala.inline
  implicit class IRendererOps[Self <: IRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateItemNode(value: (IItem, TypeMap, js.Array[String]) => HTMLLIElement): Self = this.set("createItemNode", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateCompletionItemNode(value: (/* item */ ICompletionItem, /* orderedTypes */ js.Array[String]) => HTMLLIElement): Self = this.set("createCompletionItemNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreateCompletionItemNode: Self = this.set("createCompletionItemNode", js.undefined)
  }
}
