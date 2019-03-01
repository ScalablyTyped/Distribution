package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "OrderedSet")
@js.native
object OrderedSetNs extends js.Object {
  def fromKeys(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): immutableLib.immutableMod.OrderedSet[java.lang.String] = js.native
  /**
    * `OrderedSet.fromKeys()` creates a new immutable OrderedSet containing
    * the keys from this Collection or JavaScript Object.
    */
  def fromKeys[T](iter: immutableLib.immutableMod.Collection[T, _]): immutableLib.immutableMod.OrderedSet[T] = js.native
  /**
    * True if the provided value is an OrderedSet.
    */
  def isOrderedSet(maybeOrderedSet: js.Any): scala.Boolean = js.native
  /**
    * Creates a new OrderedSet containing `values`.
    */
  def of[T](values: T*): immutableLib.immutableMod.OrderedSet[T] = js.native
}

