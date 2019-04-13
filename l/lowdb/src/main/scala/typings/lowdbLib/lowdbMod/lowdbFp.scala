package typings
package lowdbLib.lowdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait lowdbFp extends js.Object {
  def apply[AdapterT /* <: AdapterSync[_] */](adapter: AdapterT): LowdbFpSync[
    /* import warning: ImportType.apply Failed type conversion: AdapterT[lowdb.ReferenceProperty] */ js.Any
  ] = js.native
}

