package typings.jupyterlabConsole

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabCells.mod.CodeCell
import typings.jupyterlabConsole.foreignMod.ForeignHandler.IOptions
import typings.jupyterlabConsole.foreignMod.ForeignHandler.IReceiver
import typings.jupyterlabServices.messagesMod.IIOPubMessage
import typings.jupyterlabServices.messagesMod.IOPubMessageType
import typings.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foreignMod {
  
  @JSImport("@jupyterlab/console/lib/foreign", "ForeignHandler")
  @js.native
  class ForeignHandler protected () extends IDisposable {
    /**
      * Construct a new foreign message handler.
      */
    def this(options: IOptions) = this()
    
    var _enabled: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    /**
      * Create a new code cell for an input originated from a foreign session.
      */
    var _newCell: js.Any = js.native
    
    var _parent: js.Any = js.native
    
    /**
      * Set whether the handler is able to inject foreign cells into a console.
      */
    def enabled: Boolean = js.native
    def enabled_=(value: Boolean): Unit = js.native
    
    /**
      * Test whether the handler is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MForeignHandler: Boolean = js.native
    
    /**
      * Handler IOPub messages.
      *
      * @returns `true` if the message resulted in a new cell injection or a
      * previously injected cell being updated and `false` for all other messages.
      */
    /* protected */ def onIOPubMessage(sender: ISessionContext, msg: IIOPubMessage[IOPubMessageType]): Boolean = js.native
    
    /**
      * The foreign handler's parent receiver.
      */
    def parent: IReceiver = js.native
    
    /**
      * The client session used by the foreign handler.
      */
    val sessionContext: ISessionContext = js.native
  }
  object ForeignHandler {
    
    /**
      * The instantiation options for a foreign handler.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The parent into which the handler will inject code cells.
        */
      var parent: IReceiver = js.native
      
      /**
        * The client session used by the foreign handler.
        */
      var sessionContext: ISessionContext = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(parent: IReceiver, sessionContext: ISessionContext): IOptions = {
        val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], sessionContext = sessionContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setParent(value: IReceiver): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionContext(value: ISessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A receiver of newly created foreign cells.
      */
    @js.native
    trait IReceiver extends StObject {
      
      /**
        * Add a newly created cell.
        */
      def addCell(cell: CodeCell, msgId: String): Unit = js.native
      
      /**
        * Create a cell.
        */
      def createCodeCell(): CodeCell = js.native
      
      /**
        * Get a cell associated with a message id.
        */
      def getCell(msgId: String): js.UndefOr[CodeCell] = js.native
      
      /**
        * Trigger a rendering update on the receiver.
        */
      def update(): Unit = js.native
    }
    object IReceiver {
      
      @scala.inline
      def apply(
        addCell: (CodeCell, String) => Unit,
        createCodeCell: () => CodeCell,
        getCell: String => js.UndefOr[CodeCell],
        update: () => Unit
      ): IReceiver = {
        val __obj = js.Dynamic.literal(addCell = js.Any.fromFunction2(addCell), createCodeCell = js.Any.fromFunction0(createCodeCell), getCell = js.Any.fromFunction1(getCell), update = js.Any.fromFunction0(update))
        __obj.asInstanceOf[IReceiver]
      }
      
      @scala.inline
      implicit class IReceiverMutableBuilder[Self <: IReceiver] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddCell(value: (CodeCell, String) => Unit): Self = StObject.set(x, "addCell", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCreateCodeCell(value: () => CodeCell): Self = StObject.set(x, "createCodeCell", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetCell(value: String => js.UndefOr[CodeCell]): Self = StObject.set(x, "getCell", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      }
    }
  }
}
