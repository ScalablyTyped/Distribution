package typings.lowdb.lowdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait lowdb extends js.Object {
  def apply[AdapterT /* <: AdapterAsync[_] */](adapter: AdapterT): js.Promise[
    LowdbAsync[
      /* import warning: importer.ImportType#apply Failed type conversion: AdapterT[lowdb.lowdb.ReferenceProperty] */ js.Any
    ]
  ] = js.native
}

