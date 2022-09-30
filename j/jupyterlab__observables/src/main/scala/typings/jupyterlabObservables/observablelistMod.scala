package typings.jupyterlabObservables

import typings.jupyterlabObservables.observablelistMod.IObservableList.IChangedArgs
import typings.jupyterlabObservables.observablelistMod.ObservableList.IOptions
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablelistMod {
  
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
    /* CompleteClass */
    override val changed: ISignal[this.type, IChangedArgs[T]] = js.native
    /**
      * A signal emitted when the list has changed.
      */
    @JSName("changed")
    def changed_MObservableList: ISignal[this.type, IChangedArgs[T]] = js.native
    
    /**
      * Remove all values from the list.
      *
      * #### Complexity
      * Linear.
      *
      * #### Iterator Validity
      * All current iterators are invalidated.
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
      * Get the value at the specified index.
      *
      * @param index - The positive integer index of interest.
      *
      * @returns The value at the specified index.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral or out of range.
      */
    /* CompleteClass */
    override def get(index: Double): T = js.native
    
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
    /* CompleteClass */
    override def insert(index: Double, value: T): Unit = js.native
    
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
    /* CompleteClass */
    override def insertAll(index: Double, values: IterableOrArrayLike[T]): Unit = js.native
    
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
    /* CompleteClass */
    override def iter(): IIterator[T] = js.native
    
    /**
      * The length of the list.
      *
      * #### Notes
      * This is a read-only property.
      */
    /* CompleteClass */
    var length: Double = js.native
    /**
      * The length of the list.
      */
    @JSName("length")
    def length_MObservableList: Double = js.native
    
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
    /* CompleteClass */
    override def move(fromIndex: Double, toIndex: Double): Unit = js.native
    
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
    /* CompleteClass */
    override def push(value: T): Double = js.native
    
    /**
      * Push a set of values to the back of the list.
      *
      * @param values - An iterable or array-like set of values to add.
      *
      * @returns The new length of the list.
      *
      * #### Complexity
      * Linear.
      *
      * #### Iterator Validity
      * No changes.
      */
    /* CompleteClass */
    override def pushAll(values: IterableOrArrayLike[T]): Double = js.native
    
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
    /* CompleteClass */
    override def remove(index: Double): js.UndefOr[T] = js.native
    
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
    /* CompleteClass */
    override def removeRange(startIndex: Double, endIndex: Double): Double = js.native
    
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
    /* CompleteClass */
    override def removeValue(value: T): Double = js.native
    
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
    /* CompleteClass */
    override def set(index: Double, value: T): Unit = js.native
    
    /**
      * The type of this object.
      */
    /* CompleteClass */
    override val `type`: typings.jupyterlabObservables.jupyterlabObservablesStrings.List = js.native
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
      var values: js.UndefOr[IterableOrArrayLike[T]] = js.undefined
    }
    object IOptions {
      
      inline def apply[T](): IOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions[T]]
      }
      
      extension [Self <: IOptions[?], T](x: Self & IOptions[T]) {
        
        inline def setItemCmp(value: (/* first */ T, /* second */ T) => Boolean): Self = StObject.set(x, "itemCmp", js.Any.fromFunction2(value))
        
        inline def setItemCmpUndefined: Self = StObject.set(x, "itemCmp", js.undefined)
        
        inline def setValues(value: IterableOrArrayLike[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      }
    }
  }
  
  trait IObservableList[T]
    extends StObject
       with IDisposable {
    
    /**
      * A signal emitted when the list has changed.
      */
    val changed: ISignal[this.type, IChangedArgs[T]]
    
    /**
      * Remove all values from the list.
      *
      * #### Complexity
      * Linear.
      *
      * #### Iterator Validity
      * All current iterators are invalidated.
      */
    def clear(): Unit
    
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
    def get(index: Double): T
    
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
    def insert(index: Double, value: T): Unit
    
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
    def insertAll(index: Double, values: IterableOrArrayLike[T]): Unit
    
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
    def iter(): IIterator[T]
    
    /**
      * The length of the list.
      *
      * #### Notes
      * This is a read-only property.
      */
    var length: Double
    
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
    def move(fromIndex: Double, toIndex: Double): Unit
    
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
    def push(value: T): Double
    
    /**
      * Push a set of values to the back of the list.
      *
      * @param values - An iterable or array-like set of values to add.
      *
      * @returns The new length of the list.
      *
      * #### Complexity
      * Linear.
      *
      * #### Iterator Validity
      * No changes.
      */
    def pushAll(values: IterableOrArrayLike[T]): Double
    
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
    def remove(index: Double): js.UndefOr[T]
    
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
    def removeRange(startIndex: Double, endIndex: Double): Double
    
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
    def removeValue(value: T): Double
    
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
    def set(index: Double, value: T): Unit
    
    /**
      * The type of this object.
      */
    val `type`: typings.jupyterlabObservables.jupyterlabObservablesStrings.List
  }
  object IObservableList {
    
    inline def apply[T](
      changed: ISignal[IObservableList[T], IChangedArgs[T]],
      clear: () => Unit,
      dispose: () => Unit,
      get: Double => T,
      insert: (Double, T) => Unit,
      insertAll: (Double, IterableOrArrayLike[T]) => Unit,
      isDisposed: Boolean,
      iter: () => IIterator[T],
      length: Double,
      move: (Double, Double) => Unit,
      push: T => Double,
      pushAll: IterableOrArrayLike[T] => Double,
      remove: Double => js.UndefOr[T],
      removeRange: (Double, Double) => Double,
      removeValue: T => Double,
      set: (Double, T) => Unit
    ): IObservableList[T] = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction2(insert), insertAll = js.Any.fromFunction2(insertAll), isDisposed = isDisposed.asInstanceOf[js.Any], iter = js.Any.fromFunction0(iter), length = length.asInstanceOf[js.Any], move = js.Any.fromFunction2(move), push = js.Any.fromFunction1(push), pushAll = js.Any.fromFunction1(pushAll), remove = js.Any.fromFunction1(remove), removeRange = js.Any.fromFunction2(removeRange), removeValue = js.Any.fromFunction1(removeValue), set = js.Any.fromFunction2(set))
      __obj.updateDynamic("type")("List")
      __obj.asInstanceOf[IObservableList[T]]
    }
    
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
      
      extension [Self <: IChangedArgs[?], T](x: Self & IChangedArgs[T]) {
        
        inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
        
        inline def setNewValues(value: js.Array[T]): Self = StObject.set(x, "newValues", value.asInstanceOf[js.Any])
        
        inline def setNewValuesVarargs(value: T*): Self = StObject.set(x, "newValues", js.Array(value*))
        
        inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
        
        inline def setOldValues(value: js.Array[T]): Self = StObject.set(x, "oldValues", value.asInstanceOf[js.Any])
        
        inline def setOldValuesVarargs(value: T*): Self = StObject.set(x, "oldValues", js.Array(value*))
        
        inline def setType(value: ChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: IObservableList[?], T](x: Self & IObservableList[T]) {
      
      inline def setChanged(value: ISignal[IObservableList[T], IChangedArgs[T]]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: Double => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setInsert(value: (Double, T) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      inline def setInsertAll(value: (Double, IterableOrArrayLike[T]) => Unit): Self = StObject.set(x, "insertAll", js.Any.fromFunction2(value))
      
      inline def setIter(value: () => IIterator[T]): Self = StObject.set(x, "iter", js.Any.fromFunction0(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMove(value: (Double, Double) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction2(value))
      
      inline def setPush(value: T => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setPushAll(value: IterableOrArrayLike[T] => Double): Self = StObject.set(x, "pushAll", js.Any.fromFunction1(value))
      
      inline def setRemove(value: Double => js.UndefOr[T]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveRange(value: (Double, Double) => Double): Self = StObject.set(x, "removeRange", js.Any.fromFunction2(value))
      
      inline def setRemoveValue(value: T => Double): Self = StObject.set(x, "removeValue", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Double, T) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setType(value: typings.jupyterlabObservables.jupyterlabObservablesStrings.List): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
