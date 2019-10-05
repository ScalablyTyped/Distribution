package typings.localforage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalForageDriverMethodsOptional extends js.Object {
  var dropInstance: js.UndefOr[LocalForageDropInstanceFn] = js.undefined
}

object LocalForageDriverMethodsOptional {
  @scala.inline
  def apply(
    dropInstance: (/* dbInstanceOptions */ js.UndefOr[LocalForageDbInstanceOptions], /* callback */ js.UndefOr[js.Function1[/* err */ js.Any, Unit]]) => js.Promise[Unit] = null
  ): LocalForageDriverMethodsOptional = {
    val __obj = js.Dynamic.literal()
    if (dropInstance != null) __obj.updateDynamic("dropInstance")(js.Any.fromFunction2(dropInstance))
    __obj.asInstanceOf[LocalForageDriverMethodsOptional]
  }
}

