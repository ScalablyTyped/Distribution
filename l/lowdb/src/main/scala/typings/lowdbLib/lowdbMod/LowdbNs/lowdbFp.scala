package typings
package lowdbLib.lowdbMod.LowdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait lowdbFp extends js.Object {
  def apply[AdapterT /* <: AdapterAsync[_] */](adapter: AdapterT): js.Promise[
    LowdbFpAsync[
      /* import warning: ImportType.apply Failed type conversion: AdapterT[lowdb.ReferenceProperty] */ js.Any
    ]
  ] = js.native
}

