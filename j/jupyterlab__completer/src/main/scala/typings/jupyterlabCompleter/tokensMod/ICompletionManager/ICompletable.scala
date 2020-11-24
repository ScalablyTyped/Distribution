package typings.jupyterlabCompleter.tokensMod.ICompletionManager

import typings.jupyterlabCompleter.handlerMod.CompletionHandler.ICompletionItemsConnector
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for completer-compatible objects.
  */
@js.native
trait ICompletable extends ICompletableAttributes {
  
  /**
    * The parent of the completer; the completer resources dispose with parent.
    */
  val parent: Widget = js.native
}
object ICompletable {
  
  @scala.inline
  def apply(
    connector: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector,
    parent: Widget
  ): ICompletable = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompletable]
  }
  
  @scala.inline
  implicit class ICompletableOps[Self <: ICompletable] (val x: Self) extends AnyVal {
    
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
    def setParent(value: Widget): Self = this.set("parent", value.asInstanceOf[js.Any])
  }
}
