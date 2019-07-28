package typings.localforage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalForageDriverMethodsOptional extends js.Object {
  var dropInstance: js.UndefOr[LocalForageDropInstanceFn] = js.undefined
}

object LocalForageDriverMethodsOptional {
  @scala.inline
  def apply(dropInstance: LocalForageDropInstanceFn = null): LocalForageDriverMethodsOptional = {
    val __obj = js.Dynamic.literal()
    if (dropInstance != null) __obj.updateDynamic("dropInstance")(dropInstance)
    __obj.asInstanceOf[LocalForageDriverMethodsOptional]
  }
}

