package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "Set")
@js.native
object SetNs extends js.Object {
  def fromKeys(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): immutableLib.immutableMod.Set[java.lang.String] = js.native
  /**
    * `Set.fromKeys()` creates a new immutable Set containing the keys from
    * this Collection or JavaScript Object.
    */
  def fromKeys[T](iter: immutableLib.immutableMod.Collection[T, _]): immutableLib.immutableMod.Set[T] = js.native
  /**
    * `Set.intersect()` creates a new immutable Set that is the intersection of
    * a collection of other sets.
    *
    * ```js
    * const { Set } = require('immutable')
    * const intersected = Set.intersect([
    *   Set([ 'a', 'b', 'c' ])
    *   Set([ 'c', 'a', 't' ])
    * ])
    * // Set [ "a", "c"" ]
    * ```
    */
  def intersect[T](sets: stdLib.Iterable[stdLib.Iterable[T]]): immutableLib.immutableMod.Set[T] = js.native
  /**
    * True if the provided value is a Set
    */
  def isSet(maybeSet: js.Any): /* is immutable.immutable.Set<any> */ scala.Boolean = js.native
  /**
    * Creates a new Set containing `values`.
    */
  def of[T](values: T*): immutableLib.immutableMod.Set[T] = js.native
  /**
    * `Set.union()` creates a new immutable Set that is the union of a
    * collection of other sets.
    *
    * ```js
    * const { Set } = require('immutable')
    * const unioned = Set.union([
    *   Set([ 'a', 'b', 'c' ])
    *   Set([ 'c', 'a', 't' ])
    * ])
    * // Set [ "a", "b", "c", "t"" ]
    * ```
    */
  def union[T](sets: stdLib.Iterable[stdLib.Iterable[T]]): immutableLib.immutableMod.Set[T] = js.native
}

