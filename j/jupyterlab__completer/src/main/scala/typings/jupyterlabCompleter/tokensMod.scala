package typings.jupyterlabCompleter

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.ICompletionItemsConnector
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typings.jupyterlabCompleter.tokensMod.ICompletionManager.ICompletable
import typings.jupyterlabCompleter.tokensMod.ICompletionManager.ICompletableAttributes
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @js.native
  trait ICompletionManager extends StObject {
    
    /**
      * Register a completable object with the completion manager.
      *
      * @returns A completable object whose attributes can be updated as necessary.
      */
    def register(completable: ICompletable): ICompletableAttributes = js.native
  }
  object ICompletionManager extends Shortcut {
    
    @scala.inline
    def apply(register: ICompletable => ICompletableAttributes): ICompletionManager = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
      __obj.asInstanceOf[ICompletionManager]
    }
    
    @JSImport("@jupyterlab/completer/lib/tokens", "ICompletionManager")
    @js.native
    val ^ : Token[ICompletionManager] = js.native
    
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
      implicit class ICompletableMutableBuilder[Self <: ICompletable] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setParent(value: Widget): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The attributes of a completable object that can change and sync at runtime.
      */
    @js.native
    trait ICompletableAttributes extends StObject {
      
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
      implicit class ICompletableAttributesMutableBuilder[Self <: ICompletableAttributes] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnector(value: (IDataConnector[IReply, Unit, IRequest, String]) | ICompletionItemsConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditor(value: IEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditorNull: Self = StObject.set(x, "editor", null)
      }
    }
    
    @scala.inline
    implicit class ICompletionManagerMutableBuilder[Self <: ICompletionManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegister(value: ICompletable => ICompletableAttributes): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    }
    
    type _To = Token[ICompletionManager]
    
    /* This means you don't have to write `^`, but can instead just say `ICompletionManager.foo` */
    override def _to: Token[ICompletionManager] = ^
  }
}
