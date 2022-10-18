package typings.jupyterlabCompleter

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabCompleter.libHandlerMod.CompletionHandler.ICompletionItemsConnector
import typings.jupyterlabCompleter.libHandlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.libHandlerMod.CompletionHandler.IRequest
import typings.jupyterlabCompleter.libTokensMod.ICompletionManager.ICompletable
import typings.jupyterlabCompleter.libTokensMod.ICompletionManager.ICompletableAttributes
import typings.jupyterlabCompleter.libWidgetMod.Completer.IRenderer
import typings.jupyterlabStatedb.libInterfacesMod.IDataConnector
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  @js.native
  trait ICompletionManager extends StObject {
    
    /**
      * Register a completable object with the completion manager.
      *
      * @returns A completable object whose attributes can be updated as necessary.
      */
    def register(completable: ICompletable): ICompletableAttributes = js.native
    def register(completable: ICompletable, renderer: IRenderer): ICompletableAttributes = js.native
  }
  object ICompletionManager extends Shortcut {
    
    @JSImport("@jupyterlab/completer/lib/tokens", "ICompletionManager")
    @js.native
    val ^ : Token[ICompletionManager] = js.native
    
    /**
      * An interface for completer-compatible objects.
      */
    trait ICompletable
      extends StObject
         with ICompletableAttributes {
      
      /**
        * The parent of the completer; the completer resources dispose with parent.
        */
      val parent: Widget
    }
    object ICompletable {
      
      inline def apply(
        connector: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector,
        parent: Widget
      ): ICompletable = {
        val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], editor = null)
        __obj.asInstanceOf[ICompletable]
      }
      
      extension [Self <: ICompletable](x: Self) {
        
        inline def setParent(value: Widget): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The attributes of a completable object that can change and sync at runtime.
      */
    trait ICompletableAttributes extends StObject {
      
      /**
        * The data connector used to populate the completer.
        * Use the connector with ICompletionItemsReply for enhanced completions.
        */
      var connector: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector
      
      /**
        * The host editor for the completer.
        */
      var editor: IEditor | Null
    }
    object ICompletableAttributes {
      
      inline def apply(connector: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector): ICompletableAttributes = {
        val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], editor = null)
        __obj.asInstanceOf[ICompletableAttributes]
      }
      
      extension [Self <: ICompletableAttributes](x: Self) {
        
        inline def setConnector(value: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
        
        inline def setEditor(value: IEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
        
        inline def setEditorNull: Self = StObject.set(x, "editor", null)
      }
    }
    
    type _To = Token[ICompletionManager]
    
    /* This means you don't have to write `^`, but can instead just say `ICompletionManager.foo` */
    override def _to: Token[ICompletionManager] = ^
  }
}
