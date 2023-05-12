package typings.jupyterYdoc

import typings.jupyterYdoc.libApiMod.DocumentChange
import typings.jupyterYdoc.libApiMod.ISharedDocument
import typings.jupyterYdoc.libYdocumentMod.YDocument.IOptions
import typings.luminoCoreutils.typesJsonMod.JSONObject
import typings.luminoSignaling.mod.ISignal
import typings.luminoSignaling.mod.Signal
import typings.yProtocols.awarenessMod.Awareness
import typings.yjs.mod.Doc
import typings.yjs.mod.Map
import typings.yjs.mod.UndoManager
import typings.yjs.mod.YMapEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libYdocumentMod {
  
  /* note: abstract class */ @JSImport("@jupyter/ydoc/lib/ydocument", "YDocument")
  @js.native
  open class YDocument[T /* <: DocumentChange */] ()
    extends StObject
       with ISharedDocument {
    def this(options: IOptions) = this()
    
    /* private */ var _awareness: Any = js.native
    
    /* protected */ var _changed: Signal[this.type, T] = js.native
    
    /* private */ var _disposed: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _undoManager: Any = js.native
    
    /* private */ var _ydoc: Any = js.native
    
    /* private */ var _ystate: Any = js.native
    
    /**
      * Shared awareness
      */
    def awareness: Awareness = js.native
    
    /**
      * The changed signal.
      */
    @JSName("changed")
    def changed_MYDocument: ISignal[this.type, T] = js.native
    
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
      * A signal emitted when the object is disposed.
      */
    /* CompleteClass */
    override val disposed: ISignal[this.type, Unit] = js.native
    /**
      * A signal emitted when the document is disposed.
      */
    @JSName("disposed")
    def disposed_MYDocument: ISignal[this.type, Unit] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Whether the document is disposed or not.
      */
    @JSName("isDisposed")
    def isDisposed_MYDocument: Boolean = js.native
    
    /**
      * Handle a change to the ystate.
      */
    /* protected */ def onStateChanged(event: YMapEvent[Any]): Unit = js.native
    
    /**
      * Document state
      */
    @JSName("state")
    def state_MYDocument: JSONObject = js.native
    
    /**
      * YJS document undo manager
      */
    def undoManager: UndoManager = js.native
    
    /**
      * YJS document.
      */
    def ydoc: Doc = js.native
    
    /**
      * Shared state
      */
    def ystate: Map[Any] = js.native
  }
  object YDocument {
    
    /**
      * YDocument constructor options
      */
    trait IOptions extends StObject {
      
      /**
        * The optional YJS document for YDocument.
        */
      var ydoc: js.UndefOr[Doc] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setYdoc(value: Doc): Self = StObject.set(x, "ydoc", value.asInstanceOf[js.Any])
        
        inline def setYdocUndefined: Self = StObject.set(x, "ydoc", js.undefined)
      }
    }
  }
}
