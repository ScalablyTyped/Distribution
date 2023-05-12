package typings.jsts.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object java_ {
  
  object utils {
    
    @JSGlobal("java.utils.ArrayList")
    @js.native
    open class ArrayList[T] ()
      extends StObject
         with typings.jsts.java_.utils.ArrayList[T] {
      def this(c: typings.jsts.java_.utils.Collection[T]) = this()
      
      /**
        * Ensures that this collection contains the specified element (optional
        * operation).
        * @param {T} e
        * @return {boolean}
        */
      /* CompleteClass */
      override def add(e: T): Boolean = js.native
      
      /**
        * Appends all of the elements in the specified collection to the end of this
        * list, in the order that they are returned by the specified collection's
        * iterator (optional operation).
        * @param {javascript.util.Collection} c
        * @return {boolean}
        */
      /* CompleteClass */
      override def addAll(c: typings.jsts.java_.utils.Collection[T]): Boolean = js.native
      
      /**
        * Empties this list
        */
      /* CompleteClass */
      override def clear(): Unit = js.native
      
      /**
        * Increases the capacity of this list instance, if necessary,
        * to ensure that it can hold at least the number of elements specified by the capacity argument.
        *
        * @param capacity {integer} the desired capacity
        */
      /* CompleteClass */
      override def ensureCapacity(capacity: Double): Unit = js.native
      
      /**
        * Returns the element at the specified position in this list.
        * @param {number} index
        * @return {T}
        */
      /* CompleteClass */
      override def get(index: Double): T = js.native
      
      /**
        * Returns true if this collection contains no elements.
        * @return {boolean}
        */
      /* CompleteClass */
      override def isEmpty(): Boolean = js.native
      
      /**
        * Returns an iterator over the elements in this collection.
        * @return {javascript.util.Iterator}
        */
      /* CompleteClass */
      override def iterator(): typings.jsts.java_.utils.Iterator[T] = js.native
      
      /**
        * Removes a single instance of the specified element from this collection if it
        * is present. (optional)
        * @param {Object} e
        * @return {boolean}
        */
      /* CompleteClass */
      override def remove(e: T): Boolean = js.native
      
      /**
        * Replaces the element at the specified position in this list with the
        * specified element (optional operation).
        * @param {number} index
        * @param {Object} e
        * @return {Object}
        */
      /* CompleteClass */
      override def set(index: Double, e: T): T = js.native
      
      /**
        * Returns an iterator over the elements in this collection.
        * @return {number}
        */
      /* CompleteClass */
      override def size(): Double = js.native
      
      /* CompleteClass */
      override def sort(comparator: typings.jsts.java_.utils.Comparator[T]): Unit = js.native
      
      /**
        * Returns an array containing all of the elements in this collection.
        * @return {Array}
        */
      /* CompleteClass */
      override def toArray(): js.Array[T] = js.native
    }
    
    @JSGlobal("java.utils.Collection")
    @js.native
    open class Collection[T] ()
      extends StObject
         with typings.jsts.java_.utils.Collection[T] {
      
      /**
        * Ensures that this collection contains the specified element (optional
        * operation).
        * @param {T} e
        * @return {boolean}
        */
      /* CompleteClass */
      override def add(e: T): Boolean = js.native
      
      /**
        * Appends all of the elements in the specified collection to the end of this
        * list, in the order that they are returned by the specified collection's
        * iterator (optional operation).
        * @param {javascript.util.Collection} c
        * @return {boolean}
        */
      /* CompleteClass */
      override def addAll(c: typings.jsts.java_.utils.Collection[T]): Boolean = js.native
      
      /**
        * Returns true if this collection contains no elements.
        * @return {boolean}
        */
      /* CompleteClass */
      override def isEmpty(): Boolean = js.native
      
      /**
        * Returns an iterator over the elements in this collection.
        * @return {javascript.util.Iterator}
        */
      /* CompleteClass */
      override def iterator(): typings.jsts.java_.utils.Iterator[T] = js.native
      
      /**
        * Removes a single instance of the specified element from this collection if it
        * is present. (optional)
        * @param {Object} e
        * @return {boolean}
        */
      /* CompleteClass */
      override def remove(e: T): Boolean = js.native
      
      /**
        * Returns an iterator over the elements in this collection.
        * @return {number}
        */
      /* CompleteClass */
      override def size(): Double = js.native
      
      /**
        * Returns an array containing all of the elements in this collection.
        * @return {Array}
        */
      /* CompleteClass */
      override def toArray(): js.Array[T] = js.native
    }
    
    @JSGlobal("java.utils.Comparator")
    @js.native
    open class Comparator[T] ()
      extends StObject
         with typings.jsts.java_.utils.Comparator[T] {
      
      /* CompleteClass */
      override def compare(a: T, b: T): Double = js.native
    }
    
    @JSGlobal("java.utils.HashSet")
    @js.native
    open class HashSet[T] ()
      extends StObject
         with typings.jsts.java_.utils.Set[T] {
      def this(c: typings.jsts.java_.utils.Collection[T]) = this()
      
      /**
        * Ensures that this collection contains the specified element (optional
        * operation).
        * @param {T} e
        * @return {boolean}
        */
      /* CompleteClass */
      override def add(e: T): Boolean = js.native
      
      /**
        * Appends all of the elements in the specified collection to the end of this
        * list, in the order that they are returned by the specified collection's
        * iterator (optional operation).
        * @param {javascript.util.Collection} c
        * @return {boolean}
        */
      /* CompleteClass */
      override def addAll(c: typings.jsts.java_.utils.Collection[T]): Boolean = js.native
      
      /**
        * Returns true if this set contains the specified element. More formally,
        * returns true if and only if this set contains an element e such that (o==null ?
        * e==null : o.equals(e)).
        * @param {T} e
        * @return {boolean}
        */
      /* CompleteClass */
      override def contains(e: T): Boolean = js.native
      
      /**
        * Returns true if this collection contains no elements.
        * @return {boolean}
        */
      /* CompleteClass */
      override def isEmpty(): Boolean = js.native
      
      /**
        * Returns an iterator over the elements in this collection.
        * @return {javascript.util.Iterator}
        */
      /* CompleteClass */
      override def iterator(): typings.jsts.java_.utils.Iterator[T] = js.native
      
      /**
        * Removes a single instance of the specified element from this collection if it
        * is present. (optional)
        * @param {Object} e
        * @return {boolean}
        */
      /* CompleteClass */
      override def remove(e: T): Boolean = js.native
      
      /**
        * Returns an iterator over the elements in this collection.
        * @return {number}
        */
      /* CompleteClass */
      override def size(): Double = js.native
      
      /**
        * Returns an array containing all of the elements in this collection.
        * @return {Array}
        */
      /* CompleteClass */
      override def toArray(): js.Array[T] = js.native
    }
    
    @JSGlobal("java.utils.Iterator")
    @js.native
    open class Iterator[T] ()
      extends StObject
         with typings.jsts.java_.utils.Iterator[T] {
      
      /**
        * Returns true if the iteration has more elements.
        * @return {boolean}
        */
      /* CompleteClass */
      override def hasNext(): Boolean = js.native
      
      /**
        * Returns the next element in the iteration.
        * @return {T}
        */
      /* CompleteClass */
      override def next(): T = js.native
      
      /**
        * Removes from the underlying collection the last element returned by the
        * iterator (optional operation).
        */
      /* CompleteClass */
      override def remove(): Unit = js.native
    }
    
    @JSGlobal("java.utils.List")
    @js.native
    open class List[T] ()
      extends StObject
         with typings.jsts.java_.utils.List[T] {
      
      /**
        * Ensures that this collection contains the specified element (optional
        * operation).
        * @param {T} e
        * @return {boolean}
        */
      /* CompleteClass */
      override def add(e: T): Boolean = js.native
      
      /**
        * Appends all of the elements in the specified collection to the end of this
        * list, in the order that they are returned by the specified collection's
        * iterator (optional operation).
        * @param {javascript.util.Collection} c
        * @return {boolean}
        */
      /* CompleteClass */
      override def addAll(c: typings.jsts.java_.utils.Collection[T]): Boolean = js.native
      
      /**
        * Returns the element at the specified position in this list.
        * @param {number} index
        * @return {T}
        */
      /* CompleteClass */
      override def get(index: Double): T = js.native
      
      /**
        * Returns true if this collection contains no elements.
        * @return {boolean}
        */
      /* CompleteClass */
      override def isEmpty(): Boolean = js.native
      
      /**
        * Returns an iterator over the elements in this collection.
        * @return {javascript.util.Iterator}
        */
      /* CompleteClass */
      override def iterator(): typings.jsts.java_.utils.Iterator[T] = js.native
      
      /**
        * Removes a single instance of the specified element from this collection if it
        * is present. (optional)
        * @param {Object} e
        * @return {boolean}
        */
      /* CompleteClass */
      override def remove(e: T): Boolean = js.native
      
      /**
        * Replaces the element at the specified position in this list with the
        * specified element (optional operation).
        * @param {number} index
        * @param {Object} e
        * @return {Object}
        */
      /* CompleteClass */
      override def set(index: Double, e: T): T = js.native
      
      /**
        * Returns an iterator over the elements in this collection.
        * @return {number}
        */
      /* CompleteClass */
      override def size(): Double = js.native
      
      /**
        * Returns an array containing all of the elements in this collection.
        * @return {Array}
        */
      /* CompleteClass */
      override def toArray(): js.Array[T] = js.native
    }
    
    @JSGlobal("java.utils.Set")
    @js.native
    open class Set[T] ()
      extends StObject
         with typings.jsts.java_.utils.Set[T] {
      
      /**
        * Ensures that this collection contains the specified element (optional
        * operation).
        * @param {T} e
        * @return {boolean}
        */
      /* CompleteClass */
      override def add(e: T): Boolean = js.native
      
      /**
        * Appends all of the elements in the specified collection to the end of this
        * list, in the order that they are returned by the specified collection's
        * iterator (optional operation).
        * @param {javascript.util.Collection} c
        * @return {boolean}
        */
      /* CompleteClass */
      override def addAll(c: typings.jsts.java_.utils.Collection[T]): Boolean = js.native
      
      /**
        * Returns true if this set contains the specified element. More formally,
        * returns true if and only if this set contains an element e such that (o==null ?
        * e==null : o.equals(e)).
        * @param {T} e
        * @return {boolean}
        */
      /* CompleteClass */
      override def contains(e: T): Boolean = js.native
      
      /**
        * Returns true if this collection contains no elements.
        * @return {boolean}
        */
      /* CompleteClass */
      override def isEmpty(): Boolean = js.native
      
      /**
        * Returns an iterator over the elements in this collection.
        * @return {javascript.util.Iterator}
        */
      /* CompleteClass */
      override def iterator(): typings.jsts.java_.utils.Iterator[T] = js.native
      
      /**
        * Removes a single instance of the specified element from this collection if it
        * is present. (optional)
        * @param {Object} e
        * @return {boolean}
        */
      /* CompleteClass */
      override def remove(e: T): Boolean = js.native
      
      /**
        * Returns an iterator over the elements in this collection.
        * @return {number}
        */
      /* CompleteClass */
      override def size(): Double = js.native
      
      /**
        * Returns an array containing all of the elements in this collection.
        * @return {Array}
        */
      /* CompleteClass */
      override def toArray(): js.Array[T] = js.native
    }
  }
}
