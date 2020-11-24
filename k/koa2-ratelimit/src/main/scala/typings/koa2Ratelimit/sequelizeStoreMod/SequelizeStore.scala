package typings.koa2Ratelimit.sequelizeStoreMod

import typings.koa2Ratelimit.anon.Counter
import typings.koa2Ratelimit.anon.RateLimitOptionskeystring
import typings.koa2Ratelimit.mod.RateLimitOptions
import typings.koa2Ratelimit.storeMod.Store
import typings.sequelize.mod.Model
import typings.sequelize.mod.Sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequelizeStore extends Store {
  
  var sequelize: Sequelize = js.native
  
  var table: (Model[_, _, _]) | Null = js.native
  
  var tableAbguseName: String = js.native
  
  var tableAbuses: (Model[_, _, _]) | Null = js.native
  
  var tableName: String = js.native
}
object SequelizeStore {
  
  @scala.inline
  def apply(
    decrement: (String, RateLimitOptions, Double) => js.Promise[Unit],
    incr: (String, RateLimitOptions, Double) => js.Promise[Counter],
    saveAbuse: RateLimitOptionskeystring => js.Promise[Unit] | Unit,
    sequelize: Sequelize,
    tableAbguseName: String,
    tableName: String
  ): SequelizeStore = {
    val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction3(decrement), incr = js.Any.fromFunction3(incr), saveAbuse = js.Any.fromFunction1(saveAbuse), sequelize = sequelize.asInstanceOf[js.Any], tableAbguseName = tableAbguseName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequelizeStore]
  }
  
  @scala.inline
  implicit class SequelizeStoreOps[Self <: SequelizeStore] (val x: Self) extends AnyVal {
    
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
    def setSequelize(value: Sequelize): Self = this.set("sequelize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableAbguseName(value: String): Self = this.set("tableAbguseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: Model[_, _, _]): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNull: Self = this.set("table", null)
    
    @scala.inline
    def setTableAbuses(value: Model[_, _, _]): Self = this.set("tableAbuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableAbusesNull: Self = this.set("tableAbuses", null)
  }
}
