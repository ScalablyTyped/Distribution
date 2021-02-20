package typings.jupyterlabObservables

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabObservables.jupyterlabObservablesStrings.Map
import typings.jupyterlabObservables.modeldbMod.IObservable
import typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs
import typings.jupyterlabObservables.observablemapMod.ObservableMap.IOptions
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablemapMod {
  
  @JSImport("@jupyterlab/observables/lib/observablemap", "ObservableMap")
  @js.native
  /**
    * Construct a new observable map.
    */
  class ObservableMap[T] () extends IObservableMap[T] {
    def this(options: IOptions[T]) = this()
    
    var _changed: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _itemCmp: js.Any = js.native
    
    var _map: js.Any = js.native
    
    /**
      * A signal emitted when the map has changed.
      */
    @JSName("changed")
    def changed_MObservableMap: ISignal[this.type, IChangedArgs[T]] = js.native
    
    /**
      * Whether this map has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MObservableMap: Boolean = js.native
    
    /**
      * The number of key-value pairs in the map.
      */
    @JSName("size")
    def size_MObservableMap: Double = js.native
    
    /**
      * The type of the Observable.
      */
    @JSName("type")
    def type_MObservableMap: Map = js.native
  }
  object ObservableMap {
    
    /**
      * The options used to initialize an observable map.
      */
    @js.native
    trait IOptions[T] extends StObject {
      
      /**
        * The item comparison function for change detection on `set`.
        *
        * If not given, strict `===` equality will be used.
        */
      var itemCmp: js.UndefOr[js.Function2[/* first */ T, /* second */ T, Boolean]] = js.native
      
      /**
        * An optional initial set of values.
        */
      var values: js.UndefOr[StringDictionary[T]] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply[T](): IOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions[_], T] (val x: Self with IOptions[T]) extends AnyVal {
        
        @scala.inline
        def setItemCmp(value: (/* first */ T, /* second */ T) => Boolean): Self = StObject.set(x, "itemCmp", js.Any.fromFunction2(value))
        
        @scala.inline
        def setItemCmpUndefined: Self = StObject.set(x, "itemCmp", js.undefined)
        
        @scala.inline
        def setValues(value: StringDictionary[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      }
    }
  }
  
  @js.native
  trait IObservableMap[T] extends IObservable {
    
    /**
      * A signal emitted when the map has changed.
      */
    val changed: ISignal[this.type, IChangedArgs[T]] = js.native
    
    /**
      * Set the ObservableMap to an empty map.
      */
    def clear(): Unit = js.native
    
    /**
      * Remove a key from the map
      *
      * @param key - the key to remove.
      *
      * @returns the value of the given key,
      *   or undefined if that does not exist.
      */
    def delete(key: String): js.UndefOr[T] = js.native
    
    /**
      * Get a value for a given key.
      *
      * @param key - the key.
      *
      * @returns the value for that key.
      */
    def get(key: String): js.UndefOr[T] = js.native
    
    /**
      * Check whether the map has a key.
      *
      * @param key - the key to check.
      *
      * @returns `true` if the map has the key, `false` otherwise.
      */
    def has(key: String): Boolean = js.native
    
    /**
      * Get a list of the keys in the map.
      *
      * @returns - a list of keys.
      */
    def keys(): js.Array[String] = js.native
    
    /**
      * Set a key-value pair in the map
      *
      * @param key - The key to set.
      *
      * @param value - The value for the key.
      *
      * @returns the old value for the key, or undefined
      *   if that did not exist.
      */
    def set(key: String, value: T): js.UndefOr[T] = js.native
    
    /**
      * The number of key-value pairs in the map.
      */
    val size: Double = js.native
    
    /**
      * The type of the Observable.
      */
    @JSName("type")
    var type_IObservableMap: Map = js.native
    
    /**
      * Get a list of the values in the map.
      *
      * @returns - a list of values.
      */
    def values(): js.Array[T] = js.native
  }
  object IObservableMap {
    
    @scala.inline
    def apply[T](
      changed: ISignal[IObservableMap[T], IChangedArgs[T]],
      clear: () => Unit,
      delete: String => js.UndefOr[T],
      dispose: () => Unit,
      get: String => js.UndefOr[T],
      has: String => Boolean,
      isDisposed: Boolean,
      keys: () => js.Array[String],
      set: (String, T) => js.UndefOr[T],
      size: Double,
      `type`: Map,
      values: () => js.Array[T]
    ): IObservableMap[T] = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObservableMap[T]]
    }
    
    /**
      * The change types which occur on an observable map.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabObservables.jupyterlabObservablesStrings.add
      - typings.jupyterlabObservables.jupyterlabObservablesStrings.remove
      - typings.jupyterlabObservables.jupyterlabObservablesStrings.change
    */
    trait ChangeType extends StObject
    object ChangeType {
      
      @scala.inline
      def add: typings.jupyterlabObservables.jupyterlabObservablesStrings.add = "add".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.add]
      
      @scala.inline
      def change: typings.jupyterlabObservables.jupyterlabObservablesStrings.change = "change".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.change]
      
      @scala.inline
      def remove: typings.jupyterlabObservables.jupyterlabObservablesStrings.remove = "remove".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.remove]
    }
    
    /**
      * The changed args object which is emitted by an observable map.
      */
    @js.native
    trait IChangedArgs[T] extends StObject {
      
      /**
        * The key of the change.
        */
      var key: String = js.native
      
      /**
        * The new value of the change.
        */
      var newValue: js.UndefOr[T] = js.native
      
      /**
        * The old value of the change.
        */
      var oldValue: js.UndefOr[T] = js.native
      
      /**
        * The type of change undergone by the map.
        */
      var `type`: ChangeType = js.native
    }
    object IChangedArgs {
      
      @scala.inline
      def apply[T](key: String, `type`: ChangeType): IChangedArgs[T] = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IChangedArgs[T]]
      }
      
      @scala.inline
      implicit class IChangedArgsMutableBuilder[Self <: IChangedArgs[_], T] (val x: Self with IChangedArgs[T]) extends AnyVal {
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
        
        @scala.inline
        def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
        
        @scala.inline
        def setType(value: ChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class IObservableMapMutableBuilder[Self <: IObservableMap[_], T] (val x: Self with IObservableMap[T]) extends AnyVal {
      
      @scala.inline
      def setChanged(value: ISignal[IObservableMap[T], IChangedArgs[T]]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDelete(value: String => js.UndefOr[T]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: String => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeys(value: () => js.Array[String]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: (String, T) => js.UndefOr[T]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Map): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: () => js.Array[T]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
}
