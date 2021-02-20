package typings.luminoAlgorithm

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iterMod {
  
  @JSImport("@lumino/algorithm/types/iter", "ArrayIterator")
  @js.native
  class ArrayIterator[T] protected () extends IIterator[T] {
    /**
      * Construct a new array iterator.
      *
      * @param source - The array-like object of interest.
      */
    def this(source: ArrayLike[T]) = this()
    
    var _index: js.Any = js.native
    
    var _source: js.Any = js.native
  }
  
  @JSImport("@lumino/algorithm/types/iter", "FnIterator")
  @js.native
  class FnIterator[T] protected () extends IIterator[T] {
    /**
      * Construct a new function iterator.
      *
      * @param fn - The iterator-like function of interest.
      */
    def this(fn: js.Function0[js.UndefOr[T]]) = this()
    
    var _fn: js.Any = js.native
  }
  
  @JSImport("@lumino/algorithm/types/iter", "ItemIterator")
  @js.native
  class ItemIterator[T] protected ()
    extends IIterator[js.Tuple2[String, T]] {
    /**
      * Construct a new item iterator.
      *
      * @param source - The object of interest.
      *
      * @param keys - The keys to iterate, if known.
      */
    def this(source: StringDictionary[T]) = this()
    def this(source: StringDictionary[T], keys: js.Array[String]) = this()
    
    var _index: js.Any = js.native
    
    var _keys: js.Any = js.native
    
    var _source: js.Any = js.native
  }
  
  @JSImport("@lumino/algorithm/types/iter", "KeyIterator")
  @js.native
  class KeyIterator protected () extends IIterator[String] {
    /**
      * Construct a new key iterator.
      *
      * @param source - The object of interest.
      *
      * @param keys - The keys to iterate, if known.
      */
    def this(source: StringDictionary[js.Any]) = this()
    def this(source: StringDictionary[js.Any], keys: js.Array[String]) = this()
    
    var _index: js.Any = js.native
    
    var _keys: js.Any = js.native
    
    var _source: js.Any = js.native
  }
  
  @JSImport("@lumino/algorithm/types/iter", "ValueIterator")
  @js.native
  class ValueIterator[T] protected () extends IIterator[T] {
    /**
      * Construct a new value iterator.
      *
      * @param source - The object of interest.
      *
      * @param keys - The keys to iterate, if known.
      */
    def this(source: StringDictionary[T]) = this()
    def this(source: StringDictionary[T], keys: js.Array[String]) = this()
    
    var _index: js.Any = js.native
    
    var _keys: js.Any = js.native
    
    var _source: js.Any = js.native
  }
  
  @JSImport("@lumino/algorithm/types/iter", "each")
  @js.native
  def each[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean | Unit]
  ): Unit = js.native
  
  @JSImport("@lumino/algorithm/types/iter", "every")
  @js.native
  def every[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = js.native
  
  @JSImport("@lumino/algorithm/types/iter", "iter")
  @js.native
  def iter[T](`object`: IterableOrArrayLike[T]): IIterator[T] = js.native
  
  @JSImport("@lumino/algorithm/types/iter", "iterFn")
  @js.native
  def iterFn[T](fn: js.Function0[js.UndefOr[T]]): IIterator[T] = js.native
  
  @JSImport("@lumino/algorithm/types/iter", "iterItems")
  @js.native
  def iterItems[T](`object`: StringDictionary[T]): IIterator[js.Tuple2[String, T]] = js.native
  
  @JSImport("@lumino/algorithm/types/iter", "iterKeys")
  @js.native
  def iterKeys[T](`object`: StringDictionary[T]): IIterator[String] = js.native
  
  @JSImport("@lumino/algorithm/types/iter", "iterValues")
  @js.native
  def iterValues[T](`object`: StringDictionary[T]): IIterator[T] = js.native
  
  @JSImport("@lumino/algorithm/types/iter", "some")
  @js.native
  def some[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = js.native
  
  @JSImport("@lumino/algorithm/types/iter", "toArray")
  @js.native
  def toArray[T](`object`: IterableOrArrayLike[T]): js.Array[T] = js.native
  
  @JSImport("@lumino/algorithm/types/iter", "toObject")
  @js.native
  def toObject[T](`object`: IterableOrArrayLike[js.Tuple2[String, T]]): StringDictionary[T] = js.native
  
  @js.native
  trait IIterable[T] extends StObject {
    
    /**
      * Get an iterator over the object's values.
      *
      * @returns An iterator which yields the object's values.
      *
      * #### Notes
      * Depending on the iterable, the returned iterator may or may not be
      * a new object. A collection or other container-like object should
      * typically return a new iterator, while an iterator itself should
      * normally return `this`.
      */
    def iter(): IIterator[T] = js.native
  }
  object IIterable {
    
    @scala.inline
    def apply[T](iter: () => IIterator[T]): IIterable[T] = {
      val __obj = js.Dynamic.literal(iter = js.Any.fromFunction0(iter))
      __obj.asInstanceOf[IIterable[T]]
    }
    
    @scala.inline
    implicit class IIterableMutableBuilder[Self <: IIterable[_], T] (val x: Self with IIterable[T]) extends AnyVal {
      
      @scala.inline
      def setIter(value: () => IIterator[T]): Self = StObject.set(x, "iter", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IIterator[T] extends IIterable[T] {
    
    /**
      * Get the next value from the iterator.
      *
      * @returns The next value from the iterator, or `undefined`.
      *
      * #### Notes
      * The `undefined` value is used to signal the end of iteration and
      * should therefore not be used as a value in a collection.
      *
      * The use of the `undefined` sentinel is an explicit design choice
      * which favors performance over purity. The ES6 iterator design of
      * returning a `{ value, done }` pair is suboptimal, as it requires
      * an object allocation on each iteration; and an `isDone()` method
      * would increase implementation and runtime complexity.
      */
    def next(): js.UndefOr[T] = js.native
  }
  object IIterator {
    
    @scala.inline
    def apply[T](iter: () => IIterator[T], next: () => js.UndefOr[T]): IIterator[T] = {
      val __obj = js.Dynamic.literal(iter = js.Any.fromFunction0(iter), next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[IIterator[T]]
    }
    
    @scala.inline
    implicit class IIteratorMutableBuilder[Self <: IIterator[_], T] (val x: Self with IIterator[T]) extends AnyVal {
      
      @scala.inline
      def setNext(value: () => js.UndefOr[T]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  type IterableOrArrayLike[T] = IIterable[T] | ArrayLike[T]
}
