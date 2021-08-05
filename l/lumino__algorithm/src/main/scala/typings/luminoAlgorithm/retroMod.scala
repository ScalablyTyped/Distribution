package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retroMod {
  
  @JSImport("@lumino/algorithm/types/retro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lumino/algorithm/types/retro", "RetroArrayIterator")
  @js.native
  class RetroArrayIterator[T] protected ()
    extends StObject
       with IIterator[T] {
    /**
      * Construct a new retro iterator.
      *
      * @param source - The array-like object of interest.
      */
    def this(source: ArrayLike[T]) = this()
    
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
  
  inline def retro[T](`object`: RetroableOrArrayLike[T]): IIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retro")(`object`.asInstanceOf[js.Any]).asInstanceOf[IIterator[T]]
  
  trait IRetroable[T] extends StObject {
    
    /**
      * Get a reverse iterator over the object's values.
      *
      * @returns An iterator which yields the object's values in reverse.
      */
    def retro(): IIterator[T]
  }
  object IRetroable {
    
    inline def apply[T](retro: () => IIterator[T]): IRetroable[T] = {
      val __obj = js.Dynamic.literal(retro = js.Any.fromFunction0(retro))
      __obj.asInstanceOf[IRetroable[T]]
    }
    
    extension [Self <: IRetroable[?], T](x: Self & IRetroable[T]) {
      
      inline def setRetro(value: () => IIterator[T]): Self = StObject.set(x, "retro", js.Any.fromFunction0(value))
    }
  }
  
  type RetroableOrArrayLike[T] = IRetroable[T] | ArrayLike[T]
}
