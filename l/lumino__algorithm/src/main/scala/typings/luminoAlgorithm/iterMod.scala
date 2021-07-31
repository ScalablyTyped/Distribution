package typings.luminoAlgorithm

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iterMod {
  
  @JSImport("@lumino/algorithm/types/iter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lumino/algorithm/types/iter", "ArrayIterator")
  @js.native
  class ArrayIterator[T] protected ()
    extends StObject
       with IIterator[T] {
    /**
      * Construct a new array iterator.
      *
      * @param source - The array-like object of interest.
      */
    def this(source: ArrayLike[T]) = this()
    
    var _index: js.Any = js.native
    
    var _source: js.Any = js.native
    
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
    /* CompleteClass */
    override def iter(): IIterator[T] = js.native
    
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
    /* CompleteClass */
    override def next(): js.UndefOr[T] = js.native
  }
  
  @JSImport("@lumino/algorithm/types/iter", "FnIterator")
  @js.native
  class FnIterator[T] protected ()
    extends StObject
       with IIterator[T] {
    /**
      * Construct a new function iterator.
      *
      * @param fn - The iterator-like function of interest.
      */
    def this(fn: js.Function0[js.UndefOr[T]]) = this()
    
    var _fn: js.Any = js.native
    
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
    /* CompleteClass */
    override def iter(): IIterator[T] = js.native
    
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
    /* CompleteClass */
    override def next(): js.UndefOr[T] = js.native
  }
  
  @JSImport("@lumino/algorithm/types/iter", "ItemIterator")
  @js.native
  class ItemIterator[T] protected ()
    extends StObject
       with IIterator[js.Tuple2[String, T]] {
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
    /* CompleteClass */
    override def iter(): IIterator[js.Tuple2[String, T]] = js.native
    
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
    /* CompleteClass */
    override def next(): js.UndefOr[js.Tuple2[String, T]] = js.native
  }
  
  @JSImport("@lumino/algorithm/types/iter", "KeyIterator")
  @js.native
  class KeyIterator protected ()
    extends StObject
       with IIterator[String] {
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
    /* CompleteClass */
    override def iter(): IIterator[String] = js.native
    
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
    /* CompleteClass */
    override def next(): js.UndefOr[String] = js.native
  }
  
  @JSImport("@lumino/algorithm/types/iter", "ValueIterator")
  @js.native
  class ValueIterator[T] protected ()
    extends StObject
       with IIterator[T] {
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
    /* CompleteClass */
    override def iter(): IIterator[T] = js.native
    
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
    /* CompleteClass */
    override def next(): js.UndefOr[T] = js.native
  }
  
  @scala.inline
  def each[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean | Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def every[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def iter[T](`object`: IterableOrArrayLike[T]): IIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("iter")(`object`.asInstanceOf[js.Any]).asInstanceOf[IIterator[T]]
  
  @scala.inline
  def iterFn[T](fn: js.Function0[js.UndefOr[T]]): IIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterFn")(fn.asInstanceOf[js.Any]).asInstanceOf[IIterator[T]]
  
  @scala.inline
  def iterItems[T](`object`: StringDictionary[T]): IIterator[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterItems")(`object`.asInstanceOf[js.Any]).asInstanceOf[IIterator[js.Tuple2[String, T]]]
  
  @scala.inline
  def iterKeys[T](`object`: StringDictionary[T]): IIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterKeys")(`object`.asInstanceOf[js.Any]).asInstanceOf[IIterator[String]]
  
  @scala.inline
  def iterValues[T](`object`: StringDictionary[T]): IIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterValues")(`object`.asInstanceOf[js.Any]).asInstanceOf[IIterator[T]]
  
  @scala.inline
  def some[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def toArray[T](`object`: IterableOrArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def toObject[T](`object`: IterableOrArrayLike[js.Tuple2[String, T]]): StringDictionary[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[T]]
  
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
    def iter(): IIterator[T]
  }
  object IIterable {
    
    @scala.inline
    def apply[T](iter: () => IIterator[T]): IIterable[T] = {
      val __obj = js.Dynamic.literal(iter = js.Any.fromFunction0(iter))
      __obj.asInstanceOf[IIterable[T]]
    }
    
    @scala.inline
    implicit class IIterableMutableBuilder[Self <: IIterable[?], T] (val x: Self & IIterable[T]) extends AnyVal {
      
      @scala.inline
      def setIter(value: () => IIterator[T]): Self = StObject.set(x, "iter", js.Any.fromFunction0(value))
    }
  }
  
  trait IIterator[T]
    extends StObject
       with IIterable[T] {
    
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
    def next(): js.UndefOr[T]
  }
  object IIterator {
    
    @scala.inline
    def apply[T](iter: () => IIterator[T], next: () => js.UndefOr[T]): IIterator[T] = {
      val __obj = js.Dynamic.literal(iter = js.Any.fromFunction0(iter), next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[IIterator[T]]
    }
    
    @scala.inline
    implicit class IIteratorMutableBuilder[Self <: IIterator[?], T] (val x: Self & IIterator[T]) extends AnyVal {
      
      @scala.inline
      def setNext(value: () => js.UndefOr[T]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  type IterableOrArrayLike[T] = IIterable[T] | ArrayLike[T]
}
