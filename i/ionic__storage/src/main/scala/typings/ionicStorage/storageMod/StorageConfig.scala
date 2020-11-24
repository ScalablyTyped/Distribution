package typings.ionicStorage.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageConfig extends js.Object {
  
  var dbKey: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var driverOrder: js.UndefOr[js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var storeName: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object StorageConfig {
  
  @scala.inline
  def apply(): StorageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageConfig]
  }
  
  @scala.inline
  implicit class StorageConfigOps[Self <: StorageConfig] (val x: Self) extends AnyVal {
    
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
    def deleteDbKey: Self = this.set("dbKey", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDriverOrderVarargs(value: String*): Self = this.set("driverOrder", js.Array(value :_*))
    
    @scala.inline
    def setDriverOrder(value: js.Array[String]): Self = this.set("driverOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriverOrder: Self = this.set("driverOrder", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStoreName(value: String): Self = this.set("storeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreName: Self = this.set("storeName", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
