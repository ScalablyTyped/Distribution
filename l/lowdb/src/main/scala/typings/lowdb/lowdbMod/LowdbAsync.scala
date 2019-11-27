package typings.lowdb.lowdbMod

import typings.lodash.lodashMod.LoDashStatic
import typings.lowdb.lowdbMod.lodashMod.ObjectChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LowdbAsync[SchemaT]
  extends LowdbBase[SchemaT]
     with ObjectChain[SchemaT] {
  var `_`: LoDashStatic = js.native
  def read(): js.Promise[this.type] = js.native
  def write[T](returnValue: T): T with js.Promise[T] = js.native
}

