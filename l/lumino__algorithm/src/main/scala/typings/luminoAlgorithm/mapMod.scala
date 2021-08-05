package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("@lumino/algorithm/types/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lumino/algorithm/types/map", "MapIterator")
  @js.native
  class MapIterator[T, U] protected ()
    extends StObject
       with IIterator[U] {
    /**
      * Construct a new map iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param fn - The mapping function to invoke for each value.
      */
    def this(source: IIterator[T], fn: js.Function2[/* value */ T, /* index */ Double, U]) = this()
    
    /* private */ var _fn: js.Any = js.native
    
    /* private */ var _index: js.Any = js.native
    
    /* private */ var _source: js.Any = js.native
    
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
    override def iter(): IIterator[U] = js.native
    
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
    override def next(): js.UndefOr[U] = js.native
  }
  
  inline def map[T, U](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, U]): IIterator[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[IIterator[U]]
}
