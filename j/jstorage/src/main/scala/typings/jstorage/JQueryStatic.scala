package typings.jstorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var jStorage: JStorageStatic
}

object JQueryStatic {
  @scala.inline
  def apply(jStorage: JStorageStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(jStorage = jStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
}

