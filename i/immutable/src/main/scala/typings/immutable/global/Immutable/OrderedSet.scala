package typings.immutable.global.Immutable

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Immutable.OrderedSet")
@js.native
object OrderedSet extends js.Object {
  def apply(): typings.immutable.Immutable.OrderedSet[_] = js.native
  def apply[T](collection: Iterable[T]): typings.immutable.Immutable.OrderedSet[T] = js.native
  def fromKeys(obj: StringDictionary[js.Any]): typings.immutable.Immutable.OrderedSet[String] = js.native
  /**
    * `OrderedSet.fromKeys()` creates a new immutable OrderedSet containing
    * the keys from this Collection or JavaScript Object.
    */
  def fromKeys[T](iter: typings.immutable.Immutable.Collection[T, _]): typings.immutable.Immutable.OrderedSet[T] = js.native
  /**
    * True if the provided value is an OrderedSet.
    */
  def isOrderedSet(maybeOrderedSet: js.Any): Boolean = js.native
  /**
    * Creates a new OrderedSet containing `values`.
    */
  def of[T](values: T*): typings.immutable.Immutable.OrderedSet[T] = js.native
}

