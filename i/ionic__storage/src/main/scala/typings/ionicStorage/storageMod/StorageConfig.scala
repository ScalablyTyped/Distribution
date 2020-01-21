package typings.ionicStorage.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageConfig extends js.Object {
  var dbKey: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var driverOrder: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var storeName: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object StorageConfig {
  @scala.inline
  def apply(
    dbKey: String = null,
    description: String = null,
    driverOrder: js.Array[String] = null,
    name: String = null,
    size: Int | Double = null,
    storeName: String = null,
    version: Int | Double = null
  ): StorageConfig = {
    val __obj = js.Dynamic.literal()
    if (dbKey != null) __obj.updateDynamic("dbKey")(dbKey.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (driverOrder != null) __obj.updateDynamic("driverOrder")(driverOrder.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (storeName != null) __obj.updateDynamic("storeName")(storeName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageConfig]
  }
}

