package typings.ionicStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbKey extends js.Object {
  var dbKey: String = js.native
  var driverOrder: js.Array[String] = js.native
  var name: String = js.native
  var storeName: String = js.native
}

object DbKey {
  @scala.inline
  def apply(dbKey: String, driverOrder: js.Array[String], name: String, storeName: String): DbKey = {
    val __obj = js.Dynamic.literal(dbKey = dbKey.asInstanceOf[js.Any], driverOrder = driverOrder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbKey]
  }
  @scala.inline
  implicit class DbKeyOps[Self <: DbKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDbKey(value: String): Self = this.set("dbKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDriverOrderVarargs(value: String*): Self = this.set("driverOrder", js.Array(value :_*))
    @scala.inline
    def setDriverOrder(value: js.Array[String]): Self = this.set("driverOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoreName(value: String): Self = this.set("storeName", value.asInstanceOf[js.Any])
  }
  
}

