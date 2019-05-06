package typings
package atIonicStorageLib.atIonicStorageStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageConfig extends js.Object {
  var dbKey: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var driverOrder: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var storeName: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object StorageConfig {
  @scala.inline
  def apply(
    dbKey: java.lang.String = null,
    description: java.lang.String = null,
    driverOrder: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    storeName: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): StorageConfig = {
    val __obj = js.Dynamic.literal()
    if (dbKey != null) __obj.updateDynamic("dbKey")(dbKey)
    if (description != null) __obj.updateDynamic("description")(description)
    if (driverOrder != null) __obj.updateDynamic("driverOrder")(driverOrder)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (storeName != null) __obj.updateDynamic("storeName")(storeName)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageConfig]
  }
}

