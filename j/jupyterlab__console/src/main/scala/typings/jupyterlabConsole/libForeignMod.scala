package typings.jupyterlabConsole

import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext
import typings.jupyterlabCells.mod.CodeCell
import typings.jupyterlabConsole.libForeignMod.ForeignHandler.IOptions
import typings.jupyterlabConsole.libForeignMod.ForeignHandler.IReceiver
import typings.jupyterlabServices.libKernelMessagesMod.IIOPubMessage
import typings.jupyterlabServices.libKernelMessagesMod.IOPubMessageType
import typings.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libForeignMod {
  
  @JSImport("@jupyterlab/console/lib/foreign", "ForeignHandler")
  @js.native
  open class ForeignHandler protected ()
    extends StObject
       with IDisposable {
    /**
      * Construct a new foreign message handler.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _enabled: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /**
      * Create a new code cell for an input originated from a foreign session.
      */
    /* private */ var _newCell: Any = js.native
    
    /* private */ var _parent: Any = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Set whether the handler is able to inject foreign cells into a console.
      */
    def enabled: Boolean = js.native
    def enabled_=(value: Boolean): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
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
    trait IOptions extends StObject {
      
      /**
        * The parent into which the handler will inject code cells.
        */
      var parent: IReceiver
      
      /**
        * The client session used by the foreign handler.
        */
      var sessionContext: ISessionContext
    }
    object IOptions {
      
      inline def apply(parent: IReceiver, sessionContext: ISessionContext): IOptions = {
        val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], sessionContext = sessionContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setParent(value: IReceiver): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setSessionContext(value: ISessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A receiver of newly created foreign cells.
      */
    trait IReceiver extends StObject {
      
      /**
        * Add a newly created cell.
        */
      def addCell(cell: CodeCell, msgId: String): Unit
      
      /**
        * Create a cell.
        */
      def createCodeCell(): CodeCell
      
      /**
        * Get a cell associated with a message id.
        */
      def getCell(msgId: String): js.UndefOr[CodeCell]
      
      /**
        * Trigger a rendering update on the receiver.
        */
      def update(): Unit
    }
    object IReceiver {
      
      inline def apply(
        addCell: (CodeCell, String) => Unit,
        createCodeCell: () => CodeCell,
        getCell: String => js.UndefOr[CodeCell],
        update: () => Unit
      ): IReceiver = {
        val __obj = js.Dynamic.literal(addCell = js.Any.fromFunction2(addCell), createCodeCell = js.Any.fromFunction0(createCodeCell), getCell = js.Any.fromFunction1(getCell), update = js.Any.fromFunction0(update))
        __obj.asInstanceOf[IReceiver]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IReceiver] (val x: Self) extends AnyVal {
        
        inline def setAddCell(value: (CodeCell, String) => Unit): Self = StObject.set(x, "addCell", js.Any.fromFunction2(value))
        
        inline def setCreateCodeCell(value: () => CodeCell): Self = StObject.set(x, "createCodeCell", js.Any.fromFunction0(value))
        
        inline def setGetCell(value: String => js.UndefOr[CodeCell]): Self = StObject.set(x, "getCell", js.Any.fromFunction1(value))
        
        inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      }
    }
  }
}
