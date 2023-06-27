package typings.jupyterlabObservables

import typings.jupyterlabObservables.libObservablelistMod.IObservableList.IChangedArgs
import typings.jupyterlabObservables.libObservablelistMod.ObservableList.IOptions
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObservablelistMod {
  
  @JSImport("@jupyterlab/observables/lib/observablelist", "ObservableList")
  @js.native
  /**
    * Construct a new observable map.
    */
  open class ObservableList[T] ()
    extends StObject
       with IObservableList[T] {
    def this(options: IOptions[T]) = this()
    
    /* private */ var _array: Any = js.native
    
    /* private */ var _changed: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _itemCmp: Any = js.native
    
    /**
      * A signal emitted when the list has changed.
      */
    @JSName("changed")
    def changed_MObservableList: ISignal[this.type, IChangedArgs[T]] = js.native
    
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
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the list has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MObservableList: Boolean = js.native
    
    /**
      * Create an iterator over the values in the list.
      *
      * @returns A new iterator starting at the front of the list.
      *
      * #### Complexity
      * Constant.
      *
      * #### Iterator Validity
      * No changes.
      */
    @JSName(js.Symbol.iterator)
    var iterator_ObservableList: js.Function0[IterableIterator[T]] = js.native
    
    /**
      * The length of the list.
      */
    @JSName("length")
    def length_MObservableList: Double = js.native
    
    /**
      * The type of this object.
      */
    @JSName("type")
    def type_MObservableList: typings.jupyterlabObservables.jupyterlabObservablesStrings.List = js.native
  }
  object ObservableList {
    
    /**
      * The options used to initialize an observable map.
      */
    trait IOptions[T] extends StObject {
      
      /**
        * The item comparison function for change detection on `set`.
        *
        * If not given, strict `===` equality will be used.
        */
      var itemCmp: js.UndefOr[js.Function2[/* first */ T, /* second */ T, Boolean]] = js.undefined
      
      /**
        * An optional initial set of values.
        */
      var values: js.UndefOr[js.Iterable[T]] = js.undefined
    }
    object IOptions {
      
      inline def apply[T](): IOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions[?], T] (val x: Self & IOptions[T]) extends AnyVal {
        
        inline def setItemCmp(value: (/* first */ T, /* second */ T) => Boolean): Self = StObject.set(x, "itemCmp", js.Any.fromFunction2(value))
        
        inline def setItemCmpUndefined: Self = StObject.set(x, "itemCmp", js.undefined)
        
        inline def setValues(value: js.Iterable[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      }
    }
  }
  
  @js.native
  trait IObservableList[T]
    extends StObject
       with IDisposable
       with Iterable[T] {
    
    /**
      * A signal emitted when the list has changed.
      */
    val changed: ISignal[this.type, IChangedArgs[T]] = js.native
    
    /**
      * Remove all values from the list.
      *
      * #### Complexity
      * Linear.
      *
      * #### Iterator Validity
      * All current iterators are invalidated.
      */
    def clear(): Unit = js.native
    
    /**
      * Get the value at the specified index.
      *
      * @param index - The positive integer index of interest.
      *
      * @returns The value at the specified index.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral or out of range.
      */
    def get(index: Double): T = js.native
    
    /**
      * Insert a value into the list at a specific index.
      *
      * @param index - The index at which to insert the value.
      *
      * @param value - The value to set at the specified index.
      *
      * #### Complexity
      * Linear.
      *
      * #### Iterator Validity
      * No changes.
      *
      * #### Notes
      * The `index` will be clamped to the bounds of the list.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral.
      */
    def insert(index: Double, value: T): Unit = js.native
    
    /**
      * Insert a set of items into the list at the specified index.
      *
      * @param index - The index at which to insert the values.
      *
      * @param values - The values to insert at the specified index.
      *
      * #### Complexity.
      * Linear.
      *
      * #### Iterator Validity
      * No changes.
      *
      * #### Notes
      * The `index` will be clamped to the bounds of the list.
      *
      * #### Undefined Behavior.
      * An `index` which is non-integral.
      */
    def insertAll(index: Double, values: js.Iterable[T]): Unit = js.native
    
    /**
      * The length of the list.
      *
      * #### Notes
      * This is a read-only property.
      */
    var length: Double = js.native
    
    /**
      * Move a value from one index to another.
      *
      * @parm fromIndex - The index of the element to move.
      *
      * @param toIndex - The index to move the element to.
      *
      * #### Complexity
      * Constant.
      *
      * #### Iterator Validity
      * Iterators pointing at the lesser of the `fromIndex` and the `toIndex`
      * and beyond are invalidated.
      *
      * #### Undefined Behavior
      * A `fromIndex` or a `toIndex` which is non-integral.
      */
    def move(fromIndex: Double, toIndex: Double): Unit = js.native
    
    /**
      * Add a value to the back of the list.
      *
      * @param value - The value to add to the back of the list.
      *
      * @returns The new length of the list.
      *
      * #### Complexity
      * Constant.
      *
      * #### Iterator Validity
      * No changes.
      */
    def push(value: T): Double = js.native
    
    /**
      * Push a set of values to the back of the list.
      *
      * @param values - An iterable set of values to add.
      *
      * @returns The new length of the list.
      *
      * #### Complexity
      * Linear.
      *
      * #### Iterator Validity
      * No changes.
      */
    def pushAll(values: js.Iterable[T]): Double = js.native
    
    /**
      * Remove and return the value at a specific index.
      *
      * @param index - The index of the value of interest.
      *
      * @returns The value at the specified index, or `undefined` if the
      *   index is out of range.
      *
      * #### Complexity
      * Constant.
      *
      * #### Iterator Validity
      * Iterators pointing at the removed value and beyond are invalidated.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral.
      */
    def remove(index: Double): js.UndefOr[T] = js.native
    
    /**
      * Remove a range of items from the list.
      *
      * @param startIndex - The start index of the range to remove (inclusive).
      *
      * @param endIndex - The end index of the range to remove (exclusive).
      *
      * @returns The new length of the list.
      *
      * #### Complexity
      * Linear.
      *
      * #### Iterator Validity
      * Iterators pointing to the first removed value and beyond are invalid.
      *
      * #### Undefined Behavior
      * A `startIndex` or `endIndex` which is non-integral.
      */
    def removeRange(startIndex: Double, endIndex: Double): Double = js.native
    
    /**
      * Remove the first occurrence of a value from the list.
      *
      * @param value - The value of interest.
      *
      * @returns The index of the removed value, or `-1` if the value
      *   is not contained in the list.
      *
      * #### Complexity
      * Linear.
      *
      * #### Iterator Validity
      * Iterators pointing at the removed value and beyond are invalidated.
      */
    def removeValue(value: T): Double = js.native
    
    /**
      * Set the value at the specified index.
      *
      * @param index - The positive integer index of interest.
      *
      * @param value - The value to set at the specified index.
      *
      * #### Complexity
      * Constant.
      *
      * #### Iterator Validity
      * No changes.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral or out of range.
      */
    def set(index: Double, value: T): Unit = js.native
    
    /**
      * The type of this object.
      */
    val `type`: typings.jupyterlabObservables.jupyterlabObservablesStrings.List = js.native
  }
  object IObservableList {
    
    /**
      * The change types which occur on an observable list.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabObservables.jupyterlabObservablesStrings.add
      - typings.jupyterlabObservables.jupyterlabObservablesStrings.move
      - typings.jupyterlabObservables.jupyterlabObservablesStrings.remove
      - typings.jupyterlabObservables.jupyterlabObservablesStrings.set
    */
    trait ChangeType extends StObject
    object ChangeType {
      
      inline def add: typings.jupyterlabObservables.jupyterlabObservablesStrings.add = "add".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.add]
      
      inline def move: typings.jupyterlabObservables.jupyterlabObservablesStrings.move = "move".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.move]
      
      inline def remove: typings.jupyterlabObservables.jupyterlabObservablesStrings.remove = "remove".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.remove]
      
      inline def set: typings.jupyterlabObservables.jupyterlabObservablesStrings.set = "set".asInstanceOf[typings.jupyterlabObservables.jupyterlabObservablesStrings.set]
    }
    
    /**
      * The changed args object which is emitted by an observable list.
      */
    trait IChangedArgs[T] extends StObject {
      
      /**
        * The new index associated with the change.
        */
      var newIndex: Double
      
      /**
        * The new values associated with the change.
        *
        * #### Notes
        * The values will be contiguous starting at the `newIndex`.
        */
      var newValues: js.Array[T]
      
      /**
        * The old index associated with the change.
        */
      var oldIndex: Double
      
      /**
        * The old values associated with the change.
        *
        * #### Notes
        * The values will be contiguous starting at the `oldIndex`.
        */
      var oldValues: js.Array[T]
      
      /**
        * The type of change undergone by the vector.
        */
      var `type`: ChangeType
    }
    object IChangedArgs {
      
      inline def apply[T](
        newIndex: Double,
        newValues: js.Array[T],
        oldIndex: Double,
        oldValues: js.Array[T],
        `type`: ChangeType
      ): IChangedArgs[T] = {
        val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], newValues = newValues.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldValues = oldValues.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IChangedArgs[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IChangedArgs[?], T] (val x: Self & IChangedArgs[T]) extends AnyVal {
        
        inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
        
        inline def setNewValues(value: js.Array[T]): Self = StObject.set(x, "newValues", value.asInstanceOf[js.Any])
        
        inline def setNewValuesVarargs(value: T*): Self = StObject.set(x, "newValues", js.Array(value*))
        
        inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
        
        inline def setOldValues(value: js.Array[T]): Self = StObject.set(x, "oldValues", value.asInstanceOf[js.Any])
        
        inline def setOldValuesVarargs(value: T*): Self = StObject.set(x, "oldValues", js.Array(value*))
        
        inline def setType(value: ChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
}
