package typings
package lowdbLib.lowdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait lowdb extends js.Object {
  def apply[AdapterT /* <: AdapterSync[_] */](adapter: AdapterT): LowdbSync[
    /* import warning: ImportType.apply Failed type conversion: AdapterT[lowdb.ReferenceProperty] */ js.Any
  ] = js.native
}

