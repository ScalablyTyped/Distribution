package typings.koa2Ratelimit.sequelizeStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequelizeStoreOptions extends js.Object {
  
  var tableAbuseName: String = js.native
  
  var tableName: String = js.native
}
object SequelizeStoreOptions {
  
  @scala.inline
  def apply(tableAbuseName: String, tableName: String): SequelizeStoreOptions = {
    val __obj = js.Dynamic.literal(tableAbuseName = tableAbuseName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequelizeStoreOptions]
  }
  
  @scala.inline
  implicit class SequelizeStoreOptionsOps[Self <: SequelizeStoreOptions] (val x: Self) extends AnyVal {
    
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
    def setTableAbuseName(value: String): Self = this.set("tableAbuseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
  }
}
