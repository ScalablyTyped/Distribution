package typings.luminoAlgorithm.iterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/lib/iter", "KeyIterator")
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

