package typings.jupyterlabObservables

import typings.jupyterlabObservables.observablelistMod.IObservableList
import typings.jupyterlabObservables.observablelistMod.ObservableList
import typings.luminoCoreutils.jsonMod.JSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undoablelistMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabObservables.observablelistMod.IObservableList because Already inherited
  - typings.jupyterlabObservables.undoablelistMod.IObservableUndoableList because var conflicts: changed, isDisposed, length, `type`. Inlined canRedo, canUndo, beginCompoundOperation, beginCompoundOperation, endCompoundOperation, undo, redo, clearUndo */ @JSImport("@jupyterlab/observables/lib/undoablelist", "ObservableUndoableList")
  @js.native
  open class ObservableUndoableList[T] protected () extends ObservableList[T] {
    /**
      * Construct a new undoable observable list.
      */
    def this(serializer: ISerializer[T]) = this()
    
    /**
      * Copy a change as JSON.
      */
    /* private */ var _copyChange: Any = js.native
    
    /* private */ var _inCompound: Any = js.native
    
    /* private */ var _index: Any = js.native
    
    /* private */ var _isUndoable: Any = js.native
    
    /* private */ var _madeCompoundChange: Any = js.native
    
    /**
      * Handle a change in the list.
      */
    /* private */ var _onListChanged: Any = js.native
    
    /**
      * Redo a change event.
      */
    /* private */ var _redoChange: Any = js.native
    
    /* private */ var _serializer: Any = js.native
    
    /* private */ var _stack: Any = js.native
    
    /**
      * Undo a change event.
      */
    /* private */ var _undoChange: Any = js.native
    
    /**
      * Begin a compound operation.
      *
      * @param isUndoAble - Whether the operation is undoable.
      *   The default is `true`.
      */
    /**
      * Begin a compound operation.
      *
      * @param isUndoAble - Whether the operation is undoable.
      *   The default is `false`.
      */
    def beginCompoundOperation(): Unit = js.native
    def beginCompoundOperation(isUndoAble: Boolean): Unit = js.native
    
    /**
      * Whether the object can redo changes.
      */
    def canRedo: Boolean = js.native
    /**
      * Whether the object can redo changes.
      */
    @JSName("canRedo")
    val canRedo_FObservableUndoableList: Boolean = js.native
    
    /**
      * Whether the object can undo changes.
      */
    def canUndo: Boolean = js.native
    /**
      * Whether the object can undo changes.
      */
    @JSName("canUndo")
    val canUndo_FObservableUndoableList: Boolean = js.native
    
    /**
      * Clear the change stack.
      */
    def clearUndo(): Unit = js.native
    
    /**
      * End a compound operation.
      */
    def endCompoundOperation(): Unit = js.native
    
    /**
      * Redo an operation.
      */
    def redo(): Unit = js.native
    
    /**
      * Undo an operation.
      */
    def undo(): Unit = js.native
  }
  object ObservableUndoableList {
    
    /**
      * A default, identity serializer.
      */
    @JSImport("@jupyterlab/observables/lib/undoablelist", "ObservableUndoableList.IdentitySerializer")
    @js.native
    open class IdentitySerializer[T /* <: JSONValue */] ()
      extends StObject
         with ISerializer[T] {
      
      /**
        * Deserialize the object from JSON.
        */
      /* CompleteClass */
      override def fromJSON(value: JSONValue): T = js.native
      
      /**
        * Convert the object to JSON.
        */
      /* CompleteClass */
      override def toJSON(value: T): JSONValue = js.native
    }
  }
  
  @js.native
  trait IObservableUndoableList[T]
    extends StObject
       with IObservableList[T] {
    
    /**
      * Begin a compound operation.
      *
      * @param isUndoAble - Whether the operation is undoable.
      *   The default is `false`.
      */
    def beginCompoundOperation(): Unit = js.native
    def beginCompoundOperation(isUndoAble: Boolean): Unit = js.native
    
    /**
      * Whether the object can redo changes.
      */
    val canRedo: Boolean = js.native
    
    /**
      * Whether the object can undo changes.
      */
    val canUndo: Boolean = js.native
    
    /**
      * Clear the change stack.
      */
    def clearUndo(): Unit = js.native
    
    /**
      * End a compound operation.
      */
    def endCompoundOperation(): Unit = js.native
    
    /**
      * Redo an operation.
      */
    def redo(): Unit = js.native
    
    /**
      * Undo an operation.
      */
    def undo(): Unit = js.native
  }
  
  trait ISerializer[T] extends StObject {
    
    /**
      * Deserialize the object from JSON.
      */
    def fromJSON(value: JSONValue): T
    
    /**
      * Convert the object to JSON.
      */
    def toJSON(value: T): JSONValue
  }
  object ISerializer {
    
    inline def apply[T](fromJSON: JSONValue => T, toJSON: T => JSONValue): ISerializer[T] = {
      val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), toJSON = js.Any.fromFunction1(toJSON))
      __obj.asInstanceOf[ISerializer[T]]
    }
    
    extension [Self <: ISerializer[?], T](x: Self & ISerializer[T]) {
      
      inline def setFromJSON(value: JSONValue => T): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: T => JSONValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    }
  }
}
