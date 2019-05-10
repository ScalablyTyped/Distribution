package typings
package lowdbLib.lowdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LowdbSync[SchemaT]
  extends LowdbBase[SchemaT]
     with lowdbLib.lowdbMod.lodashMod.ObjectChain[SchemaT] {
  var `_`: lodashLib.lodashMod.LoDashStatic = js.native
  def read(): this.type = js.native
  def write[T](returnValue: T): T with js.Promise[T] = js.native
}

