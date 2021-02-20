package typings.jupyterlabObservables

import typings.jupyterlabObservables.modeldbMod.IObservable
import typings.jupyterlabObservables.observablestringMod.IObservableString.IChangedArgs
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablestringMod {
  
  @JSImport("@jupyterlab/observables/lib/observablestring", "ObservableString")
  @js.native
  /**
    * Construct a new observable string.
    */
  class ObservableString () extends IObservableString {
    def this(initialText: String) = this()
    
    var _changed: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _text: js.Any = js.native
    
    /**
      * A signal emitted when the string has changed.
      */
    @JSName("changed")
    def changed_MObservableString: ISignal[this.type, IChangedArgs] = js.native
    
    /**
      * Test whether the string has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MObservableString: Boolean = js.native
    
    /**
      * Get the value of the string.
      */
    @JSName("text")
    def text_MObservableString: String = js.native
    
    /**
      * The type of the Observable.
      */
    @JSName("type")
    def type_MObservableString: typings.jupyterlabObservables.jupyterlabObservablesStrings.String = js.native
  }
  
  @js.native
  trait IObservableString extends IObservable {
    
    /**
      * A signal emitted when the string has changed.
      */
    val changed: ISignal[this.type, IChangedArgs] = js.native
    
    /**
      * Set the ObservableString to an empty string.
      */
    def clear(): Unit = js.native
    
    /**
      * Insert a substring.
      *
      * @param index - The starting index.
      *
      * @param text - The substring to insert.
      */
    def insert(index: Double, text: String): Unit = js.native
    
    /**
      * Remove a substring.
      *
      * @param start - The starting index.
      *
      * @param end - The ending index.
      */
    def remove(start: Double, end: Double): Unit = js.native
    
    /**
      * The value of the string.
      */
    var text: String = js.native
    
    /**
      * The type of the Observable.
      */
    @JSName("type")
    var type_IObservableString: typings.jupyterlabObservables.jupyterlabObservablesStrings.String = js.native
  }
  object IObservableString {
    
    @scala.inline
    def apply(
      changed: ISignal[IObservableString, IChangedArgs],
      clear: () => Unit,
      dispose: () => Unit,
      insert: (Double, String) => Unit,
      isDisposed: Boolean,
      remove: (Double, Double) => Unit,
      text: String,
      `type`: typings.jupyterlabObservables.jupyterlabObservablesStrings.String
    ): IObservableString = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), insert = js.Any.fromFunction2(insert), isDisposed = isDisposed.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
      
      @scala.inline
      def insert: typings.jupyterlabObservables.jupyterlabObservablesStrings.insert = "insert".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.insert]
      
      @scala.inline
      def remove: typings.jupyterlabObservables.jupyterlabObservablesStrings.remove = "remove".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.remove]
      
      @scala.inline
      def set: typings.jupyterlabObservables.jupyterlabObservablesStrings.set = "set".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.set]
    }
    
    /**
      * The changed args object which is emitted by an observable string.
      */
    @js.native
    trait IChangedArgs extends StObject {
      
      /**
        * The end index of the change.
        */
      var end: Double = js.native
      
      /**
        * The starting index of the change.
        */
      var start: Double = js.native
      
      /**
        * The type of change undergone by the list.
        */
      var `type`: ChangeType = js.native
      
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
      var value: String = js.native
    }
    object IChangedArgs {
      
      @scala.inline
      def apply(end: Double, start: Double, `type`: ChangeType, value: String): IChangedArgs = {
        val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IChangedArgs]
      }
      
      @scala.inline
      implicit class IChangedArgsMutableBuilder[Self <: IChangedArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: ChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class IObservableStringMutableBuilder[Self <: IObservableString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanged(value: ISignal[IObservableString, IChangedArgs]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInsert(value: (Double, String) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemove(value: (Double, Double) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: typings.jupyterlabObservables.jupyterlabObservablesStrings.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
