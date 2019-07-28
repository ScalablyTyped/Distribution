package typings.immutable.immutableMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "OrderedSet")
@js.native
object OrderedSetNs extends js.Object {
  def fromKeys(obj: StringDictionary[js.Any]): OrderedSet[String] = js.native
  /**
    * `OrderedSet.fromKeys()` creates a new immutable OrderedSet containing
    * the keys from this Collection or JavaScript Object.
    */
  def fromKeys[T](iter: Collection[T, _]): OrderedSet[T] = js.native
  /**
    * True if the provided value is an OrderedSet.
    */
  def isOrderedSet(maybeOrderedSet: js.Any): Boolean = js.native
  /**
    * Creates a new OrderedSet containing `values`.
    */
  def of[T](values: T*): OrderedSet[T] = js.native
}

