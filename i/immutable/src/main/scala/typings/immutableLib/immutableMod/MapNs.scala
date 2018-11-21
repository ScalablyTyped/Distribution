package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "Map")
@js.native
object MapNs extends js.Object {
  /**
       * True if the provided value is a Map
       */
  def isMap(maybeMap: js.Any): scala.Boolean = js.native
  /**
       * Creates a new Map from alternating keys and values
       */
  def of(keyValues: js.Any*): immutableLib.immutableMod.Map[_, _] = js.native
}

