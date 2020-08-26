package typings.luminoAlgorithm.iterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

