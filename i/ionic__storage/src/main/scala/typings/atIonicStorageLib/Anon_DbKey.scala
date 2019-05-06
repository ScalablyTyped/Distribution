package typings
package atIonicStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DbKey extends js.Object {
  var dbKey: java.lang.String
  var driverOrder: js.Array[java.lang.String]
  var name: java.lang.String
  var storeName: java.lang.String
}

object Anon_DbKey {
  @scala.inline
  def apply(
    dbKey: java.lang.String,
    driverOrder: js.Array[java.lang.String],
    name: java.lang.String,
    storeName: java.lang.String
  ): Anon_DbKey = {
    val __obj = js.Dynamic.literal(dbKey = dbKey, driverOrder = driverOrder, name = name, storeName = storeName)
  
    __obj.asInstanceOf[Anon_DbKey]
  }
}

