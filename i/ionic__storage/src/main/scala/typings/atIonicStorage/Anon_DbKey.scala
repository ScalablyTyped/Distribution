package typings.atIonicStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DbKey extends js.Object {
  var dbKey: String
  var driverOrder: js.Array[String]
  var name: String
  var storeName: String
}

object Anon_DbKey {
  @scala.inline
  def apply(dbKey: String, driverOrder: js.Array[String], name: String, storeName: String): Anon_DbKey = {
    val __obj = js.Dynamic.literal(dbKey = dbKey.asInstanceOf[js.Any], driverOrder = driverOrder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DbKey]
  }
}

