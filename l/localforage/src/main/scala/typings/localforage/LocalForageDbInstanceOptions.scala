package typings.localforage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalForageDbInstanceOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var storeName: js.UndefOr[String] = js.undefined
}

object LocalForageDbInstanceOptions {
  @scala.inline
  def apply(name: String = null, storeName: String = null): LocalForageDbInstanceOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (storeName != null) __obj.updateDynamic("storeName")(storeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalForageDbInstanceOptions]
  }
}

