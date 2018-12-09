package typings
package lowdbLib.lowdbMod.LowdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait lowdb extends js.Object {
  def apply[AdapterT /* <: AdapterAsync[_] */](adapter: AdapterT): js.Promise[
    LowdbAsync[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(AdapterT))),List()),Left(TsIdentSimple(ReferenceProperty))) */js.Any
    ]
  ] = js.native
}

