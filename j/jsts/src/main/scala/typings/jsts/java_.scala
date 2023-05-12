package typings.jsts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object java_ {
  
  object utils {
    
    trait ArrayList[T]
      extends StObject
         with typings.jsts.java_.utils.List[T] {
      
      /**
        * Empties this list
        */
      def clear(): Unit
      
      /**
        * Increases the capacity of this list instance, if necessary,
        * to ensure that it can hold at least the number of elements specified by the capacity argument.
        *
        * @param capacity {integer} the desired capacity
        */
      def ensureCapacity(capacity: Double): Unit
      
      def sort(comparator: Comparator[T]): Unit
    }
    object ArrayList {
      
      inline def apply[T](
        add: T => Boolean,
        addAll: Collection[T] => Boolean,
        clear: () => Unit,
        ensureCapacity: Double => Unit,
        get: Double => T,
        isEmpty: () => Boolean,
        iterator: () => Iterator[T],
        remove: T => Boolean,
        set: (Double, T) => T,
        size: () => Double,
        sort: Comparator[T] => Unit,
        toArray: () => js.Array[T]
      ): ArrayList[T] = {
        val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), clear = js.Any.fromFunction0(clear), ensureCapacity = js.Any.fromFunction1(ensureCapacity), get = js.Any.fromFunction1(get), isEmpty = js.Any.fromFunction0(isEmpty), iterator = js.Any.fromFunction0(iterator), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), sort = js.Any.fromFunction1(sort), toArray = js.Any.fromFunction0(toArray))
        __obj.asInstanceOf[ArrayList[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ArrayList[?], T] (val x: Self & ArrayList[T]) extends AnyVal {
        
        inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
        
        inline def setEnsureCapacity(value: Double => Unit): Self = StObject.set(x, "ensureCapacity", js.Any.fromFunction1(value))
        
        inline def setSort(value: Comparator[T] => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
      }
    }
    
    trait Collection[T] extends StObject {
      
      /**
        * Ensures that this collection contains the specified element (optional
        * operation).
        * @param {T} e
        * @return {boolean}
        */
      def add(e: T): Boolean
      
      /**
        * Appends all of the elements in the specified collection to the end of this
        * list, in the order that they are returned by the specified collection's
        * iterator (optional operation).
        * @param {javascript.util.Collection} c
        * @return {boolean}
        */
      def addAll(c: Collection[T]): Boolean
      
      /**
        * Returns true if this collection contains no elements.
        * @return {boolean}
        */
      def isEmpty(): Boolean
      
      /**
        * Returns an iterator over the elements in this collection.
        * @return {javascript.util.Iterator}
        */
      def iterator(): Iterator[T]
      
      /**
        * Removes a single instance of the specified element from this collection if it
        * is present. (optional)
        * @param {Object} e
        * @return {boolean}
        */
      def remove(e: T): Boolean
      
      /**
        * Returns an iterator over the elements in this collection.
        * @return {number}
        */
      def size(): Double
      
      /**
        * Returns an array containing all of the elements in this collection.
        * @return {Array}
        */
      def toArray(): js.Array[T]
    }
    object Collection {
      
      inline def apply[T](
        add: T => Boolean,
        addAll: Collection[T] => Boolean,
        isEmpty: () => Boolean,
        iterator: () => Iterator[T],
        remove: T => Boolean,
        size: () => Double,
        toArray: () => js.Array[T]
      ): Collection[T] = {
        val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), isEmpty = js.Any.fromFunction0(isEmpty), iterator = js.Any.fromFunction0(iterator), remove = js.Any.fromFunction1(remove), size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray))
        __obj.asInstanceOf[Collection[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Collection[?], T] (val x: Self & Collection[T]) extends AnyVal {
        
        inline def setAdd(value: T => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
        
        inline def setAddAll(value: Collection[T] => Boolean): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
        
        inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
        
        inline def setIterator(value: () => Iterator[T]): Self = StObject.set(x, "iterator", js.Any.fromFunction0(value))
        
        inline def setRemove(value: T => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
        
        inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
        
        inline def setToArray(value: () => js.Array[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      }
    }
    
    trait Comparator[T] extends StObject {
      
      def compare(a: T, b: T): Double
    }
    object Comparator {
      
      inline def apply[T](compare: (T, T) => Double): Comparator[T] = {
        val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare))
        __obj.asInstanceOf[Comparator[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Comparator[?], T] (val x: Self & Comparator[T]) extends AnyVal {
        
        inline def setCompare(value: (T, T) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      }
    }
    
    type HashSet[T] = Set[T]
    
    trait Iterator[T] extends StObject {
      
      /**
        * Returns true if the iteration has more elements.
        * @return {boolean}
        */
      def hasNext(): Boolean
      
      /**
        * Returns the next element in the iteration.
        * @return {T}
        */
      def next(): T
      
      /**
        * Removes from the underlying collection the last element returned by the
        * iterator (optional operation).
        */
      def remove(): Unit
    }
    object Iterator {
      
      inline def apply[T](hasNext: () => Boolean, next: () => T, remove: () => Unit): Iterator[T] = {
        val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next), remove = js.Any.fromFunction0(remove))
        __obj.asInstanceOf[Iterator[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Iterator[?], T] (val x: Self & Iterator[T]) extends AnyVal {
        
        inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
        
        inline def setNext(value: () => T): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
        
        inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      }
    }
    
    trait List[T]
      extends StObject
         with Collection[T] {
      
      /**
        * Returns the element at the specified position in this list.
        * @param {number} index
        * @return {T}
        */
      def get(index: Double): T
      
      /**
        * Replaces the element at the specified position in this list with the
        * specified element (optional operation).
        * @param {number} index
        * @param {Object} e
        * @return {Object}
        */
      def set(index: Double, e: T): T
    }
    object List {
      
      inline def apply[T](
        add: T => Boolean,
        addAll: Collection[T] => Boolean,
        get: Double => T,
        isEmpty: () => Boolean,
        iterator: () => Iterator[T],
        remove: T => Boolean,
        set: (Double, T) => T,
        size: () => Double,
        toArray: () => js.Array[T]
      ): typings.jsts.java_.utils.List[T] = {
        val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), get = js.Any.fromFunction1(get), isEmpty = js.Any.fromFunction0(isEmpty), iterator = js.Any.fromFunction0(iterator), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray))
        __obj.asInstanceOf[typings.jsts.java_.utils.List[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.jsts.java_.utils.List[?], T] (val x: Self & typings.jsts.java_.utils.List[T]) extends AnyVal {
        
        inline def setGet(value: Double => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setSet(value: (Double, T) => T): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      }
    }
    
    trait Set[T]
      extends StObject
         with Collection[T] {
      
      /**
        * Returns true if this set contains the specified element. More formally,
        * returns true if and only if this set contains an element e such that (o==null ?
        * e==null : o.equals(e)).
        * @param {T} e
        * @return {boolean}
        */
      def contains(e: T): Boolean
    }
    object Set {
      
      inline def apply[T](
        add: T => Boolean,
        addAll: Collection[T] => Boolean,
        contains: T => Boolean,
        isEmpty: () => Boolean,
        iterator: () => Iterator[T],
        remove: T => Boolean,
        size: () => Double,
        toArray: () => js.Array[T]
      ): Set[T] = {
        val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), contains = js.Any.fromFunction1(contains), isEmpty = js.Any.fromFunction0(isEmpty), iterator = js.Any.fromFunction0(iterator), remove = js.Any.fromFunction1(remove), size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray))
        __obj.asInstanceOf[Set[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Set[?], T] (val x: Self & Set[T]) extends AnyVal {
        
        inline def setContains(value: T => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      }
    }
  }
}
