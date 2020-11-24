package typings.jupyterlabCompleter.tokensMod.ICompletionManager

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.ICompletionItemsConnector
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The attributes of a completable object that can change and sync at runtime.
  */
@js.native
trait ICompletableAttributes extends js.Object {
  
  /**
    * The data connector used to populate the completer.
    * Use the connector with ICompletionItemsReply for enhanced completions.
    */
  var connector: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector = js.native
  
  /**
    * The host editor for the completer.
    */
  var editor: IEditor | Null = js.native
}
object ICompletableAttributes {
  
  @scala.inline
  def apply(connector: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector): ICompletableAttributes = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompletableAttributes]
  }
  
  @scala.inline
  implicit class ICompletableAttributesOps[Self <: ICompletableAttributes] (val x: Self) extends AnyVal {
    
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
    def setConnector(value: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector): Self = this.set("connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: IEditor): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorNull: Self = this.set("editor", null)
  }
}
