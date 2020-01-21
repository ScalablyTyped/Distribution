package typings.ionicStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDbKey extends js.Object {
  var dbKey: String
  var driverOrder: js.Array[String]
  var name: String
  var storeName: String
}

object AnonDbKey {
  @scala.inline
  def apply(dbKey: String, driverOrder: js.Array[String], name: String, storeName: String): AnonDbKey = {
    val __obj = js.Dynamic.literal(dbKey = dbKey.asInstanceOf[js.Any], driverOrder = driverOrder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDbKey]
  }
}

