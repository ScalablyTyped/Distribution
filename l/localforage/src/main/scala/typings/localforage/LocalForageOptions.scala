package typings.localforage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalForageOptions extends LocalForageDbInstanceOptions {
  var description: js.UndefOr[String] = js.undefined
  var driver: js.UndefOr[String | js.Array[String]] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object LocalForageOptions {
  @scala.inline
  def apply(
    description: String = null,
    driver: String | js.Array[String] = null,
    name: String = null,
    size: Int | Double = null,
    storeName: String = null,
    version: Int | Double = null
  ): LocalForageOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (driver != null) __obj.updateDynamic("driver")(driver.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (storeName != null) __obj.updateDynamic("storeName")(storeName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalForageOptions]
  }
}

