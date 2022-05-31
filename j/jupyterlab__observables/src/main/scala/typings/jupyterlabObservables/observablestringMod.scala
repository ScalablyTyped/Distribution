package typings.jupyterlabObservables

import typings.jupyterlabObservables.modeldbMod.IObservable
import typings.jupyterlabObservables.modeldbMod.ObservableType
import typings.jupyterlabObservables.observablestringMod.IObservableString.IChangedArgs
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablestringMod {
  
  @JSImport("@jupyterlab/observables/lib/observablestring", "ObservableString")
  @js.native
  /**
    * Construct a new observable string.
    */
  class ObservableString ()
    extends StObject
       with IObservableString {
    def this(initialText: String) = this()
    
    /* private */ var _changed: js.Any = js.native
    
    /* private */ var _isDisposed: js.Any = js.native
    
    /* private */ var _text: js.Any = js.native
    
    /**
      * A signal emitted when the string has changed.
      */
    /* CompleteClass */
    override val changed: ISignal[this.type, IChangedArgs] = js.native
    /**
      * A signal emitted when the string has changed.
      */
    @JSName("changed")
    def changed_MObservableString: ISignal[this.type, IChangedArgs] = js.native
    
    /**
      * Set the ObservableString to an empty string.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
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
      * Insert a substring.
      *
      * @param index - The starting index.
      *
      * @param text - The substring to insert.
      */
    /* CompleteClass */
    override def insert(index: Double, text: String): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the string has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MObservableString: Boolean = js.native
    
    /**
      * Remove a substring.
      *
      * @param start - The starting index.
      *
      * @param end - The ending index.
      */
    /* CompleteClass */
    override def remove(start: Double, end: Double): Unit = js.native
    
    /**
      * The value of the string.
      */
    /* CompleteClass */
    var text: String = js.native
    /**
      * Get the value of the string.
      */
    @JSName("text")
    def text_MObservableString: String = js.native
    
    /**
      * The type of this object.
      */
    /* CompleteClass */
    override val `type`: ObservableType = js.native
    /**
      * The type of the Observable.
      */
    /* CompleteClass */
    @JSName("type")
    var type_IObservableString: typings.jupyterlabObservables.jupyterlabObservablesStrings.String = js.native
    /**
      * The type of the Observable.
      */
    @JSName("type")
    def type_MObservableString: typings.jupyterlabObservables.jupyterlabObservablesStrings.String = js.native
  }
  
  trait IObservableString
    extends StObject
       with IObservable {
    
    /**
      * A signal emitted when the string has changed.
      */
    val changed: ISignal[this.type, IChangedArgs]
    
    /**
      * Set the ObservableString to an empty string.
      */
    def clear(): Unit
    
    /**
      * Insert a substring.
      *
      * @param index - The starting index.
      *
      * @param text - The substring to insert.
      */
    def insert(index: Double, text: String): Unit
    
    /**
      * Remove a substring.
      *
      * @param start - The starting index.
      *
      * @param end - The ending index.
      */
    def remove(start: Double, end: Double): Unit
    
    /**
      * The value of the string.
      */
    var text: String
    
    /**
      * The type of the Observable.
      */
    @JSName("type")
    var type_IObservableString: typings.jupyterlabObservables.jupyterlabObservablesStrings.String
  }
  object IObservableString {
    
    inline def apply(
      changed: ISignal[IObservableString, IChangedArgs],
      clear: () => Unit,
      dispose: () => Unit,
      insert: (Double, String) => Unit,
      isDisposed: Boolean,
      remove: (Double, Double) => Unit,
      text: String
    ): IObservableString = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), insert = js.Any.fromFunction2(insert), isDisposed = isDisposed.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("String")
      __obj.asInstanceOf[IObservableString]
    }
    
    /**
      * The change types which occur on an observable string.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabObservables.jupyterlabObservablesStrings.insert
      - typings.jupyterlabObservables.jupyterlabObservablesStrings.remove
      - typings.jupyterlabObservables.jupyterlabObservablesStrings.set
    */
    trait ChangeType extends StObject
    object ChangeType {
      
      inline def insert: typings.jupyterlabObservables.jupyterlabObservablesStrings.insert = "insert".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.insert]
      
      inline def remove: typings.jupyterlabObservables.jupyterlabObservablesStrings.remove = "remove".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.remove]
      
      inline def set: typings.jupyterlabObservables.jupyterlabObservablesStrings.set = "set".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.set]
    }
    
    /**
      * The changed args object which is emitted by an observable string.
      */
    trait IChangedArgs extends StObject {
      
      /**
        * The end index of the change.
        */
      var end: Double
      
      /**
        * The starting index of the change.
        */
      var start: Double
      
      /**
        * The type of change undergone by the list.
        */
      var `type`: ChangeType
      
      /**
        * The value of the change.
        *
        * ### Notes
        * If `ChangeType` is `set`, then
        * this is the new value of the string.
        *
        * If `ChangeType` is `insert` this is
        * the value of the inserted string.
        *
        * If `ChangeType` is remove this is the
        * value of the removed substring.
        */
      var value: String
    }
    object IChangedArgs {
      
      inline def apply(end: Double, start: Double, `type`: ChangeType, value: String): IChangedArgs = {
        val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IChangedArgs]
      }
      
      extension [Self <: IChangedArgs](x: Self) {
        
        inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setType(value: ChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: IObservableString](x: Self) {
      
      inline def setChanged(value: ISignal[IObservableString, IChangedArgs]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setInsert(value: (Double, String) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      inline def setRemove(value: (Double, Double) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.jupyterlabObservables.jupyterlabObservablesStrings.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
