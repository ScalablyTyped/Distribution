package typings
package localforageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalForageOptions extends LocalForageDbInstanceOptions {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var driver: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object LocalForageOptions {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    driver: java.lang.String | js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    storeName: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): LocalForageOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (driver != null) __obj.updateDynamic("driver")(driver.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (storeName != null) __obj.updateDynamic("storeName")(storeName)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalForageOptions]
  }
}

