package typings.iobroker

import typings.iobroker.mod._Global_.ioBroker.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcl[T /* <: Object */] extends js.Object {
  var _id: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
  ] = js.undefined
  var acl: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['acl'] */ js.Any
  ] = js.undefined
}

object AnonAcl {
  @scala.inline
  def apply[T /* <: Object */](
    _id: /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any = null,
    acl: /* import warning: importer.ImportType#apply Failed type conversion: T['acl'] */ js.Any = null
  ): AnonAcl[T] = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcl[T]]
  }
}

