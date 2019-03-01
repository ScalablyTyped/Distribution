package typings
package localforageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalForageDbInstanceOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var storeName: js.UndefOr[java.lang.String] = js.undefined
}

object LocalForageDbInstanceOptions {
  @scala.inline
  def apply(name: java.lang.String = null, storeName: java.lang.String = null): LocalForageDbInstanceOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (storeName != null) __obj.updateDynamic("storeName")(storeName)
    __obj.asInstanceOf[LocalForageDbInstanceOptions]
  }
}

