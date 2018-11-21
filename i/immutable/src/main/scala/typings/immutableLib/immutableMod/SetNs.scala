package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "Set")
@js.native
object SetNs extends js.Object {
  def fromKeys(obj: ScalablyTyped.runtime.StringDictionary[js.Any]): immutableLib.immutableMod.Set[java.lang.String] = js.native
  /**
       * `Set.fromKeys()` creates a new immutable Set containing the keys from
       * this Iterable or JavaScript Object.
       */
  def fromKeys[T](iter: immutableLib.immutableMod.Iterable[T, _]): immutableLib.immutableMod.Set[T] = js.native
  /**
       * True if the provided value is a Set
       */
  def isSet(maybeSet: js.Any): scala.Boolean = js.native
  /**
       * Creates a new Set containing `values`.
       */
  def of[T](values: T*): immutableLib.immutableMod.Set[T] = js.native
}

