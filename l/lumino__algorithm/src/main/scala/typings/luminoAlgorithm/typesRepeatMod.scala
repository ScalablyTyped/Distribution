package typings.luminoAlgorithm

import typings.luminoAlgorithm.typesIterMod.IIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepeatMod {
  
  @JSImport("@lumino/algorithm/types/repeat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lumino/algorithm/types/repeat", "RepeatIterator")
  @js.native
  open class RepeatIterator[T] protected ()
    extends StObject
       with IIterator[T] {
    /**
      * Construct a new repeat iterator.
      *
      * @param value - The value to repeat.
      *
      * @param count - The number of times to repeat the value.
      */
    def this(value: T, count: Double) = this()
    
    /* private */ var _count: Any = js.native
    
    /* private */ var _value: Any = js.native
    
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
  
  inline def once[T](value: T): IIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(value.asInstanceOf[js.Any]).asInstanceOf[IIterator[T]]
  
  inline def repeat[T](value: T, count: Double): IIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(value.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IIterator[T]]
}
