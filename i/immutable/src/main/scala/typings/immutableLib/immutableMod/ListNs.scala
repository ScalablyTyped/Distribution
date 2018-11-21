package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "List")
@js.native
object ListNs extends js.Object {
  /**
       * True if the provided value is a List
       */
  def isList(maybeList: js.Any): scala.Boolean = js.native
  /**
       * Creates a new List containing `values`.
       */
  def of[T](values: T*): immutableLib.immutableMod.List[T] = js.native
}

