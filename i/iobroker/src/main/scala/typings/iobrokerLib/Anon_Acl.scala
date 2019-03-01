package typings
package iobrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acl[T /* <: iobrokerLib.iobrokerMod.Global.ioBrokerNs.Object */] extends js.Object {
  var _id: /* import warning: ImportType.apply Failed type conversion: T['_id'] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T['_id'] */ js.Any] = js.undefined
  var acl: /* import warning: ImportType.apply Failed type conversion: T['acl'] */ js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T['acl'] */ js.Any] = js.undefined
}

object Anon_Acl {
  @scala.inline
  def apply[T /* <: iobrokerLib.iobrokerMod.Global.ioBrokerNs.Object */](
    _id: /* import warning: ImportType.apply Failed type conversion: T['_id'] */ js.Any = null,
    acl: /* import warning: ImportType.apply Failed type conversion: T['acl'] */ js.Any = null
  ): Anon_Acl[T] = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (acl != null) __obj.updateDynamic("acl")(acl)
    __obj.asInstanceOf[Anon_Acl[T]]
  }
}

